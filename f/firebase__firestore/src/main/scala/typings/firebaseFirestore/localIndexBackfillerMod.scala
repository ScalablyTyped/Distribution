package typings.firebaseFirestore

import typings.firebaseFirestore.localLocalStoreMod.LocalStore
import typings.firebaseFirestore.localPersistenceMod.Persistence
import typings.firebaseFirestore.localPersistenceMod.Scheduler
import typings.firebaseFirestore.utilAsyncQueueMod.AsyncQueue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localIndexBackfillerMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/index_backfiller", "IndexBackfiller")
  @js.native
  open class IndexBackfiller protected () extends StObject {
    def this(
      /**
      * LocalStore provides access to IndexManager and LocalDocumentView.
      * These properties will update when the user changes. Consequently,
      * making a local copy of IndexManager and LocalDocumentView will require
      * updates over time. The simpler solution is to rely on LocalStore to have
      * an up-to-date references to IndexManager and LocalDocumentStore.
      */
    localStore: LocalStore,
      persistence: Persistence
    ) = this()
    
    def backfill(): js.Promise[Double] = js.native
    def backfill(maxDocumentsToProcess: Double): js.Promise[Double] = js.native
    
    /** Returns the next offset based on the provided documents. */
    /* private */ var getNewOffset: Any = js.native
    
    /**
      * LocalStore provides access to IndexManager and LocalDocumentView.
      * These properties will update when the user changes. Consequently,
      * making a local copy of IndexManager and LocalDocumentView will require
      * updates over time. The simpler solution is to rely on LocalStore to have
      * an up-to-date references to IndexManager and LocalDocumentStore.
      */
    /* private */ val localStore: Any = js.native
    
    /* private */ val persistence: Any = js.native
    
    /**
      * Writes entries for the provided collection group. Returns the number of documents processed.
      */
    /* private */ var writeEntriesForCollectionGroup: Any = js.native
    
    /** Writes index entries until the cap is reached. Returns the number of documents processed. */
    /* private */ var writeIndexEntries: Any = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/index_backfiller", "IndexBackfillerScheduler")
  @js.native
  open class IndexBackfillerScheduler protected ()
    extends StObject
       with Scheduler {
    def this(asyncQueue: AsyncQueue, backfiller: IndexBackfiller) = this()
    
    /* private */ val asyncQueue: Any = js.native
    
    /* private */ val backfiller: Any = js.native
    
    /* private */ var schedule: Any = js.native
    
    /* CompleteClass */
    override def start(): Unit = js.native
    
    /* CompleteClass */
    override val started: Boolean = js.native
    @JSName("started")
    def started_MIndexBackfillerScheduler: Boolean = js.native
    
    /* CompleteClass */
    override def stop(): Unit = js.native
    
    /* private */ var task: Any = js.native
  }
}
