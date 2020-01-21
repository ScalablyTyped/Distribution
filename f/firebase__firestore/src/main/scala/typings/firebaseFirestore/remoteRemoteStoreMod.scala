package typings.firebaseFirestore

import typings.firebaseFirestore.coreTransactionMod.Transaction
import typings.firebaseFirestore.coreTypesMod.OnlineState
import typings.firebaseFirestore.coreTypesMod.TargetId
import typings.firebaseFirestore.localLocalStoreMod.LocalStore
import typings.firebaseFirestore.localTargetDataMod.TargetData
import typings.firebaseFirestore.modelCollectionsMod.DocumentKeySet_
import typings.firebaseFirestore.remoteConnectivityMonitorMod.ConnectivityMonitor
import typings.firebaseFirestore.remoteDatastoreMod.Datastore
import typings.firebaseFirestore.remoteRemoteSyncerMod.RemoteSyncer
import typings.firebaseFirestore.remoteWatchChangeMod.TargetMetadataProvider
import typings.firebaseFirestore.utilAsyncQueueMod.AsyncQueue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/remote/remote_store", JSImport.Namespace)
@js.native
object remoteRemoteStoreMod extends js.Object {
  @js.native
  class RemoteStore protected () extends TargetMetadataProvider {
    def this(
      /**
      * The local store, used to fill the write pipeline with outbound mutations.
      */
    localStore: LocalStore,
      /** The client-side proxy for interacting with the backend. */
    datastore: Datastore,
      asyncQueue: AsyncQueue,
      onlineStateHandler: js.Function1[/* onlineState */ OnlineState, Unit],
      connectivityMonitor: ConnectivityMonitor
    ) = this()
    /**
      * Queues additional writes to be sent to the write stream, sending them
      * immediately if the write stream is established.
      */
    var addToWritePipeline: js.Any = js.native
    /**
      * Returns true if we can add to the write pipeline (i.e. the network is
      * enabled and the write pipeline is not full).
      */
    var canAddToWritePipeline: js.Any = js.native
    var cleanUpWatchStreamState: js.Any = js.native
    var connectivityMonitor: js.Any = js.native
    /** The client-side proxy for interacting with the backend. */
    var datastore: js.Any = js.native
    var disableNetworkInternal: js.Any = js.native
    var handleHandshakeError: js.Any = js.native
    /** Handles an error on a target */
    var handleTargetError: js.Any = js.native
    var handleWriteError: js.Any = js.native
    var isPrimary: js.Any = js.native
    /**
      * A mapping of watched targets that the client cares about tracking and the
      * user has explicitly called a 'listen' for this target.
      *
      * These targets may or may not have been sent to or acknowledged by the
      * server. On re-establishing the listen stream, these targets should be sent
      * to the server. The targets removed with unlistens are removed eagerly
      * without waiting for confirmation from the listen stream.
      */
    var listenTargets: js.Any = js.native
    /**
      * The local store, used to fill the write pipeline with outbound mutations.
      */
    var localStore: js.Any = js.native
    /**
      * Set to true by enableNetwork() and false by disableNetwork() and indicates
      * the user-preferred network state.
      */
    var networkEnabled: js.Any = js.native
    var onMutationResult: js.Any = js.native
    var onWatchStreamChange: js.Any = js.native
    var onWatchStreamClose: js.Any = js.native
    var onWatchStreamOpen: js.Any = js.native
    var onWriteHandshakeComplete: js.Any = js.native
    var onWriteStreamClose: js.Any = js.native
    var onWriteStreamOpen: js.Any = js.native
    var onlineStateTracker: js.Any = js.native
    /**
      * Takes a batch of changes from the Datastore, repackages them as a
      * RemoteEvent, and passes that on to the listener, which is typically the
      * SyncEngine.
      */
    var raiseWatchSnapshot: js.Any = js.native
    var restartNetwork: js.Any = js.native
    /**
      * We need to increment the expected number of pending responses we're due
      * from watch so we wait for the removal on the server before we process any
      * messages from this target.
      */
    var sendUnwatchRequest: js.Any = js.native
    /**
      * We need to increment the the expected number of pending responses we're due
      * from watch so we wait for the ack to process any messages from this target.
      */
    var sendWatchRequest: js.Any = js.native
    /**
      * Returns whether the watch stream should be started because it's necessary
      * and has not yet been started.
      */
    var shouldStartWatchStream: js.Any = js.native
    var shouldStartWriteStream: js.Any = js.native
    var startWatchStream: js.Any = js.native
    var startWriteStream: js.Any = js.native
    /**
      * SyncEngine to notify of watch and write events. This must be set
      * immediately after construction.
      */
    var syncEngine: RemoteSyncer = js.native
    var watchChangeAggregator: js.Any = js.native
    var watchStream: js.Any = js.native
    /**
      * A list of up to MAX_PENDING_WRITES writes that we have fetched from the
      * LocalStore via fillWritePipeline() and have or will send to the write
      * stream.
      *
      * Whenever writePipeline.length > 0 the RemoteStore will attempt to start or
      * restart the write stream. When the stream is established the writes in the
      * pipeline will be sent in order.
      *
      * Writes remain in writePipeline until they are acknowledged by the backend
      * and thus will automatically be re-sent if the stream is interrupted /
      * restarted before they're acknowledged.
      *
      * Write responses from the backend are linked to their originating request
      * purely based on order, and so we can just shift() writes from the front of
      * the writePipeline as we receive responses.
      */
    var writePipeline: js.Any = js.native
    var writeStream: js.Any = js.native
    /**
      * Toggles the network state when the client gains or loses its primary lease.
      */
    def applyPrimaryState(isPrimary: Boolean): js.Promise[Unit] = js.native
    def canUseNetwork(): Boolean = js.native
    def createTransaction(): Transaction = js.native
    /**
      * Temporarily disables the network. The network can be re-enabled using
      * enableNetwork().
      */
    def disableNetwork(): js.Promise[Unit] = js.native
    /** Re-enables the network. Idempotent. */
    def enableNetwork(): js.Promise[Unit] = js.native
    /**
      * Attempts to fill our write pipeline with writes from the LocalStore.
      *
      * Called internally to bootstrap or refill the write pipeline and by
      * SyncEngine whenever there are new mutations to process.
      *
      * Starts the write stream if necessary.
      */
    def fillWritePipeline(): js.Promise[Unit] = js.native
    /**
      * Returns the set of remote document keys for the given target ID as of the
      * last raised snapshot.
      */
    /* CompleteClass */
    override def getRemoteKeysForTarget(targetId: TargetId): DocumentKeySet_ = js.native
    /**
      * Returns the TargetData for an active target ID or 'null' if this target
      * has become inactive
      */
    /* CompleteClass */
    override def getTargetDataForTarget(targetId: TargetId): TargetData | Null = js.native
    def handleCredentialChange(): js.Promise[Unit] = js.native
    /**
      * Starts new listen for the given target. Uses resume token if provided. It
      * is a no-op if the target of given `TargetData` is already being listened to.
      */
    def listen(targetData: TargetData): Unit = js.native
    def outstandingWrites(): Double = js.native
    def shutdown(): js.Promise[Unit] = js.native
    /**
      * Starts up the remote store, creating streams, restoring state from
      * LocalStore, etc.
      */
    def start(): js.Promise[Unit] = js.native
    /**
      * Removes the listen from server. It is a no-op if the given target id is
      * not being listened to.
      */
    def unlisten(targetId: TargetId): Unit = js.native
  }
  
}

