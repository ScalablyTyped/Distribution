package typings.firebaseFirestore

import typings.firebaseFirestore.firestoreSrcApiCredentialsMod.EmptyAuthCredentialsProvider
import typings.firebaseFirestore.firestoreSrcCoreSnapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.firestoreSrcRemotePersistentStreamMod.PersistentListenStream
import typings.firebaseFirestore.firestoreSrcRemotePersistentStreamMod.PersistentWriteStream
import typings.firebaseFirestore.firestoreSrcRemotePersistentStreamMod.WatchStreamListener
import typings.firebaseFirestore.firestoreSrcRemotePersistentStreamMod.WriteStreamListener
import typings.firebaseFirestore.firestoreSrcRemoteWatchChangeMod.DocumentWatchChange
import typings.firebaseFirestore.firestoreSrcRemoteWatchChangeMod.ExistenceFilterChange
import typings.firebaseFirestore.firestoreSrcRemoteWatchChangeMod.WatchTargetChange
import typings.firebaseFirestore.firestoreSrcUtilAsyncQueueImplMod.AsyncQueueImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remoteStreamDottestMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/integration/remote/stream.test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withTestWatchStream(
    fn: js.Function2[
      /* watchStream */ PersistentListenStream, 
      /* streamListener */ StreamStatusListener, 
      js.Promise[Unit]
    ]
  ): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTestWatchStream")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def withTestWriteStream(
    fn: js.Function3[
      /* writeStream */ PersistentWriteStream, 
      /* streamListener */ StreamStatusListener, 
      /* queue */ AsyncQueueImpl, 
      js.Promise[Unit]
    ]
  ): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTestWriteStream")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def withTestWriteStream(
    fn: js.Function3[
      /* writeStream */ PersistentWriteStream, 
      /* streamListener */ StreamStatusListener, 
      /* queue */ AsyncQueueImpl, 
      js.Promise[Unit]
    ],
    credentialsProvider: EmptyAuthCredentialsProvider
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTestWriteStream")(fn.asInstanceOf[js.Any], credentialsProvider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * StreamEventType combines the events that can be observed by the
    * WatchStreamListener and WriteStreamListener.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreStrings.handshakeComplete
    - typings.firebaseFirestore.firebaseFirestoreStrings.mutationResult
    - typings.firebaseFirestore.firebaseFirestoreStrings.watchChange
    - typings.firebaseFirestore.firebaseFirestoreStrings.open
    - typings.firebaseFirestore.firebaseFirestoreStrings.close
  */
  trait StreamEventType extends StObject
  object StreamEventType {
    
    inline def close: typings.firebaseFirestore.firebaseFirestoreStrings.close = "close".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.close]
    
    inline def handshakeComplete: typings.firebaseFirestore.firebaseFirestoreStrings.handshakeComplete = "handshakeComplete".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.handshakeComplete]
    
    inline def mutationResult: typings.firebaseFirestore.firebaseFirestoreStrings.mutationResult = "mutationResult".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.mutationResult]
    
    inline def open: typings.firebaseFirestore.firebaseFirestoreStrings.open = "open".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.open]
    
    inline def watchChange: typings.firebaseFirestore.firebaseFirestoreStrings.watchChange = "watchChange".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.watchChange]
  }
  
  @js.native
  trait StreamStatusListener
    extends StObject
       with WatchStreamListener
       with WriteStreamListener {
    
    /**
      * Returns a Promise that resolves when the next callback fires. Resolves the
      * returned Promise immediately if there is already an unprocessed callback.
      *
      * This method asserts that the observed callback type matches
      * `expectedCallback`.
      */
    def awaitCallback(expectedCallback: StreamEventType): js.Promise[Unit] = js.native
    
    def onWatchChange(watchChange: DocumentWatchChange, snapshot: SnapshotVersion): js.Promise[Unit] = js.native
    def onWatchChange(watchChange: ExistenceFilterChange, snapshot: SnapshotVersion): js.Promise[Unit] = js.native
    def onWatchChange(watchChange: WatchTargetChange, snapshot: SnapshotVersion): js.Promise[Unit] = js.native
    
    /* private */ var pendingCallbacks: Any = js.native
    
    /* private */ var pendingPromises: Any = js.native
    
    /* private */ var resolvePending: Any = js.native
    
    /**
      * Verifies that we did not encounter any unexpected callbacks.
      */
    def verifyNoPendingCallbacks(): Unit = js.native
  }
}
