package typings.firebaseFirestore

import typings.firebaseFirestore.firestoreSrcRemoteConnectionMod.Connection
import typings.firebaseFirestore.firestoreSrcRemoteConnectionMod.Stream
import typings.firebaseFirestore.firestoreSrcRemoteSerializerMod.JsonProtoSerializer
import typings.firebaseFirestore.srcApiCredentialsMod.CredentialsProvider
import typings.firebaseFirestore.srcApiCredentialsMod.Token
import typings.firebaseFirestore.srcAuthUserMod.User
import typings.firebaseFirestore.srcCoreSnapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.srcCoreTypesMod.TargetId
import typings.firebaseFirestore.srcLocalTargetDataMod.TargetData
import typings.firebaseFirestore.srcModelMutationMod.Mutation
import typings.firebaseFirestore.srcModelMutationMod.MutationResult
import typings.firebaseFirestore.srcProtosFirestoreProtoApiMod.ListenRequest
import typings.firebaseFirestore.srcProtosFirestoreProtoApiMod.ListenResponse
import typings.firebaseFirestore.srcProtosFirestoreProtoApiMod.WriteResponse
import typings.firebaseFirestore.srcRemoteBackoffMod.ExponentialBackoff
import typings.firebaseFirestore.srcRemoteWatchChangeMod.WatchChange
import typings.firebaseFirestore.srcUtilAsyncQueueMod.AsyncQueue
import typings.firebaseFirestore.srcUtilAsyncQueueMod.TimerId
import typings.firebaseFirestore.srcUtilErrorMod.FirestoreError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRemotePersistentStreamMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/remote/persistent_stream", "PersistentListenStream")
  @js.native
  open class PersistentListenStream protected () extends PersistentStream[ListenRequest, ListenResponse, WatchStreamListener] {
    def this(
      queue: AsyncQueue,
      connection: Connection,
      authCredentials: CredentialsProvider[User],
      appCheckCredentials: CredentialsProvider[String],
      serializer: JsonProtoSerializer,
      listener: WatchStreamListener
    ) = this()
    
    /* private */ var serializer: Any = js.native
    
    /**
      * Unregisters interest in the results of the target associated with the
      * given targetId.
      */
    def unwatch(targetId: TargetId): Unit = js.native
    
    /**
      * Registers interest in the results of the given target. If the target
      * includes a resumeToken it will be included in the request. Results that
      * affect the target will be streamed back as WatchChange messages that
      * reference the targetId.
      */
    def watch(targetData: TargetData): Unit = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/remote/persistent_stream", "PersistentStream")
  @js.native
  abstract class PersistentStream[SendType, ReceiveType, ListenerType /* <: PersistentStreamListener */] protected () extends StObject {
    def this(
      queue: AsyncQueue,
      connectionTimerId: TimerId,
      idleTimerId: TimerId,
      healthTimerId: TimerId,
      connection: Connection,
      authCredentialsProvider: CredentialsProvider[User],
      appCheckCredentialsProvider: CredentialsProvider[String],
      listener: ListenerType
    ) = this()
    
    /* private */ var appCheckCredentialsProvider: Any = js.native
    
    /* private */ var auth: Any = js.native
    
    /* private */ var authCredentialsProvider: Any = js.native
    
    /* protected */ var backoff: ExponentialBackoff = js.native
    
    /** Cancels the health check delayed operation. */
    /* private */ var cancelHealthCheck: Any = js.native
    
    /** Marks the stream as active again. */
    /* private */ var cancelIdleCheck: Any = js.native
    
    /**
      * Closes the stream and cleans up as necessary:
      *
      * * closes the underlying GRPC stream;
      * * calls the onClose handler with the given 'error';
      * * sets internal stream state to 'finalState';
      * * adjusts the backoff timer based on the error
      *
      * A new stream can be opened by calling start().
      *
      * @param finalState - the intended state of the stream after closing.
      * @param error - the error the connection was closed with.
      */
    /* private */ var close: Any = js.native
    
    /**
      * A close count that's incremented every time the stream is closed; used by
      * getCloseGuardedDispatcher() to invalidate callbacks that happen after
      * close.
      */
    /* private */ var closeCount: Any = js.native
    
    /* protected */ var connection: Connection = js.native
    
    /**
      * Returns a "dispatcher" function that dispatches operations onto the
      * AsyncQueue but only runs them if closeCount remains unchanged. This allows
      * us to turn auth / stream callbacks into no-ops if the stream is closed /
      * re-opened, etc.
      */
    /* private */ var getCloseGuardedDispatcher: Any = js.native
    
    /** Called by the idle timer when the stream should close due to inactivity. */
    /* private */ var handleIdleCloseTimer: Any = js.native
    
    def handleStreamClose(): js.Promise[Unit] = js.native
    def handleStreamClose(error: FirestoreError): js.Promise[Unit] = js.native
    
    /* private */ var healthCheck: Any = js.native
    
    /* private */ var healthTimerId: Any = js.native
    
    /* private */ var idleTimer: Any = js.native
    
    /* private */ var idleTimerId: Any = js.native
    
    /**
      * After an error the stream will usually back off on the next attempt to
      * start it. If the error warrants an immediate restart of the stream, the
      * sender can use this to indicate that the receiver should not back off.
      *
      * Each error will call the onClose() listener. That function can decide to
      * inhibit backoff if required.
      */
    def inhibitBackoff(): Unit = js.native
    
    /**
      * Returns true if the underlying RPC is open (the onOpen() listener has been
      * called) and the stream is ready for outbound requests.
      */
    def isOpen(): Boolean = js.native
    
    /**
      * Returns true if start() has been called and no error has occurred. True
      * indicates the stream is open or in the process of opening (which
      * encompasses respecting backoff, getting auth tokens, and starting the
      * actual RPC). Use isOpen() to determine if the stream is open and ready for
      * outbound requests.
      */
    def isStarted(): Boolean = js.native
    
    /* protected */ var listener: ListenerType = js.native
    
    /**
      * Marks this stream as idle. If no further actions are performed on the
      * stream for one minute, the stream will automatically close itself and
      * notify the stream's onClose() handler with Status.OK. The stream will then
      * be in a !isStarted() state, requiring the caller to start the stream again
      * before further use.
      *
      * Only streams that are in state 'Open' can be marked idle, as all other
      * states imply pending network operations.
      */
    def markIdle(): Unit = js.native
    
    /**
      * Called after the stream has received a message. The function will be
      * called on the right queue and must return a Promise.
      * @param message - The message received from the stream.
      */
    /* protected */ def onMessage(message: ReceiveType): js.Promise[Unit] = js.native
    
    /* private */ var performBackoff: Any = js.native
    
    /* private */ var queue: Any = js.native
    
    /** Sends a message to the underlying stream. */
    /* protected */ def sendRequest(msg: SendType): Unit = js.native
    
    /**
      * Starts the RPC. Only allowed if isStarted() returns false. The stream is
      * not immediately ready for use: onOpen() will be invoked when the RPC is
      * ready for outbound requests, at which point isOpen() will return true.
      *
      * When start returns, isStarted() will return true.
      */
    def start(): Unit = js.native
    
    /**
      * Used by subclasses to start the concrete RPC and return the underlying
      * connection stream.
      */
    /* protected */ def startRpc(): Stream[SendType, ReceiveType] = js.native
    /* protected */ def startRpc(authToken: Null, appCheckToken: Token): Stream[SendType, ReceiveType] = js.native
    /* protected */ def startRpc(authToken: Token): Stream[SendType, ReceiveType] = js.native
    /* protected */ def startRpc(authToken: Token, appCheckToken: Token): Stream[SendType, ReceiveType] = js.native
    
    /* private */ var startStream: Any = js.native
    
    /* private */ var state: Any = js.native
    
    /**
      * Stops the RPC. This call is idempotent and allowed regardless of the
      * current isStarted() state.
      *
      * When stop returns, isStarted() and isOpen() will both return false.
      */
    def stop(): js.Promise[Unit] = js.native
    
    /* private */ var stream: Any = js.native
    
    /**
      * Can be overridden to perform additional cleanup before the stream is closed.
      * Calling super.tearDown() is not required.
      */
    /* protected */ def tearDown(): Unit = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/remote/persistent_stream", "PersistentWriteStream")
  @js.native
  open class PersistentWriteStream protected ()
    extends PersistentStream[
          typings.firebaseFirestore.srcProtosFirestoreProtoApiMod.WriteRequest, 
          WriteResponse, 
          WriteStreamListener
        ] {
    def this(
      queue: AsyncQueue,
      connection: Connection,
      authCredentials: CredentialsProvider[User],
      appCheckCredentials: CredentialsProvider[String],
      serializer: JsonProtoSerializer,
      listener: WriteStreamListener
    ) = this()
    
    /**
      * Tracks whether or not a handshake has been successfully exchanged and
      * the stream is ready to accept mutations.
      */
    def handshakeComplete: Boolean = js.native
    
    /* private */ var handshakeComplete_ : Any = js.native
    
    /**
      * The last received stream token from the server, used to acknowledge which
      * responses the client has processed. Stream tokens are opaque checkpoint
      * markers whose only real value is their inclusion in the next request.
      *
      * PersistentWriteStream manages propagating this value from responses to the
      * next request.
      */
    /* private */ var lastStreamToken: Any = js.native
    
    /* private */ var serializer: Any = js.native
    
    /**
      * Sends an initial streamToken to the server, performing the handshake
      * required to make the StreamingWrite RPC work. Subsequent
      * calls should wait until onHandshakeComplete was called.
      */
    def writeHandshake(): Unit = js.native
    
    /** Sends a group of mutations to the Firestore backend to apply. */
    def writeMutations(mutations: js.Array[Mutation]): Unit = js.native
  }
  
  @js.native
  trait PersistentStreamListener extends StObject {
    
    /**
      * Called after the stream has closed. If there was an error, the
      * FirestoreError will be set.
      */
    def onClose(): js.Promise[Unit] = js.native
    def onClose(err: FirestoreError): js.Promise[Unit] = js.native
    
    /**
      * Called after the stream was established and can accept outgoing
      * messages
      */
    def onOpen(): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait WatchStreamListener
    extends StObject
       with PersistentStreamListener {
    
    /**
      * Called on a watchChange. The snapshot parameter will be MIN if the watch
      * change did not have a snapshot associated with it.
      */
    def onWatchChange(watchChange: WatchChange, snapshot: SnapshotVersion): js.Promise[Unit] = js.native
  }
  
  trait WriteRequest
    extends StObject
       with typings.firebaseFirestore.srcProtosFirestoreProtoApiMod.firestoreV1ApiClientInterfaces.WriteRequest {
    
    var database: js.UndefOr[String] = js.undefined
  }
  object WriteRequest {
    
    inline def apply(): WriteRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriteRequest]
    }
    
    extension [Self <: WriteRequest](x: Self) {
      
      inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    }
  }
  
  @js.native
  trait WriteStreamListener
    extends StObject
       with PersistentStreamListener {
    
    /**
      * Called by the PersistentWriteStream upon a successful handshake response
      * from the server, which is the receiver's cue to send any pending writes.
      */
    def onHandshakeComplete(): js.Promise[Unit] = js.native
    
    /**
      * Called by the PersistentWriteStream upon receiving a StreamingWriteResponse
      * from the server that contains a mutation result.
      */
    def onMutationResult(commitVersion: SnapshotVersion, results: js.Array[MutationResult]): js.Promise[Unit] = js.native
  }
}
