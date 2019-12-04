package typings.atFirebaseFirestore

import typings.atFirebaseFirestore.distSrcUtilAsyncUnderscoreQueueMod.TimerId
import typings.atFirebaseFirestore.distSrcUtilPromiseMod.CancelablePromise
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/util/async_queue", JSImport.Namespace)
@js.native
object distSrcUtilAsyncUnderscoreQueueMod extends js.Object {
  @js.native
  class AsyncQueue () extends js.Object {
    var _isShuttingDown: js.Any = js.native
    var delayedOperations: js.Any = js.native
    /**
      * Regardless if the queue has initialized shutdown, adds a new operation to the
      * queue.
      */
    var enqueueEvenAfterShutdown: js.Any = js.native
    var enqueueInternal: js.Any = js.native
    var failure: Error | Null = js.native
    var operationInProgress: js.Any = js.native
    /** Called once a DelayedOperation is run or canceled. */
    var removeDelayedOperation: js.Any = js.native
    var tail: js.Any = js.native
    var timerIdsToSkip: js.Any = js.native
    var verifyNotFailed: js.Any = js.native
    /**
      * For Tests: Determine if a delayed operation with a particular TimerId
      * exists.
      */
    def containsDelayedOperation(timerId: TimerId): Boolean = js.native
    /**
      * Waits until all currently queued tasks are finished executing. Delayed
      * operations are not run.
      */
    def drain(): js.Promise[Unit] = js.native
    /**
      * Adds a new operation to the queue. Returns a promise that will be resolved
      * when the promise returned by the new operation is (with its value).
      */
    def enqueue[T /* <: js.Any */](op: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
    /**
      * Schedules an operation to be queued on the AsyncQueue once the specified
      * `delayMs` has elapsed. The returned CancelablePromise can be used to cancel
      * the operation prior to its running.
      */
    def enqueueAfterDelay[T /* <: js.Any */](timerId: TimerId, delayMs: Double, op: js.Function0[js.Promise[T]]): CancelablePromise[T] = js.native
    /**
      * Adds a new operation to the queue without waiting for it to complete (i.e.
      * we ignore the Promise result).
      */
    def enqueueAndForget[T /* <: js.Any */](op: js.Function0[js.Promise[T]]): Unit = js.native
    /**
      * Regardless if the queue has initialized shutdown, adds a new operation to the
      * queue without waiting for it to complete (i.e. we ignore the Promise result).
      */
    def enqueueAndForgetEvenAfterShutdown[T /* <: js.Any */](op: js.Function0[js.Promise[T]]): Unit = js.native
    /**
      * Adds a new operation to the queue and initialize the shut down of this queue.
      * Returns a promise that will be resolved when the promise returned by the new
      * operation is (with its value).
      * Once this method is called, the only possible way to request running an operation
      * is through `enqueueAndForgetEvenAfterShutdown`.
      */
    def enqueueAndInitiateShutdown(op: js.Function0[js.Promise[Unit]]): js.Promise[Unit] = js.native
    def isShuttingDown(): Boolean = js.native
    /**
      * For Tests: Runs some or all delayed operations early.
      *
      * @param lastTimerId Delayed operations up to and including this TimerId will
      *  be drained. Throws if no such operation exists. Pass TimerId.All to run
      *  all delayed operations.
      * @returns a Promise that resolves once all operations have been run.
      */
    def runDelayedOperationsEarly(lastTimerId: TimerId): js.Promise[Unit] = js.native
    /**
      * For Tests: Skip all subsequent delays for a timer id.
      */
    def skipDelaysForTimerId(timerId: TimerId): Unit = js.native
    /**
      * Verifies there's an operation currently in-progress on the AsyncQueue.
      * Unfortunately we can't verify that the running code is in the promise chain
      * of that operation, so this isn't a foolproof check, but it should be enough
      * to catch some bugs.
      */
    def verifyOperationInProgress(): Unit = js.native
  }
  
  @js.native
  sealed trait TimerId extends js.Object
  
  @js.native
  object TimerId extends js.Object {
    /** All can be used with runDelayedOperationsEarly() to run all timers. */
    @js.native
    sealed trait All extends TimerId
    
    /**
      * A timer used to update the client metadata in IndexedDb, which is used
      * to determine the primary leaseholder.
      */
    @js.native
    sealed trait ClientMetadataRefresh extends TimerId
    
    @js.native
    sealed trait ListenStreamConnectionBackoff extends TimerId
    
    /**
      * The following 4 timers are used in persistent_stream.ts for the listen and
      * write streams. The "Idle" timer is used to close the stream due to
      * inactivity. The "ConnectionBackoff" timer is used to restart a stream once
      * the appropriate backoff delay has elapsed.
      */
    @js.native
    sealed trait ListenStreamIdle extends TimerId
    
    /** A timer used to periodically attempt LRU Garbage collection */
    @js.native
    sealed trait LruGarbageCollection extends TimerId
    
    /**
      * A timer used in online_state_tracker.ts to transition from
      * OnlineState.Unknown to Offline after a set timeout, rather than waiting
      * indefinitely for success or failure.
      */
    @js.native
    sealed trait OnlineStateTimeout extends TimerId
    
    /**
      * A timer used to retry transactions. Since there can be multiple concurrent
      * transactions, multiple of these may be in the queue at a given time.
      */
    @js.native
    sealed trait RetryTransaction extends TimerId
    
    @js.native
    sealed trait WriteStreamConnectionBackoff extends TimerId
    
    @js.native
    sealed trait WriteStreamIdle extends TimerId
    
    /* "all" */ val All: typings.atFirebaseFirestore.distSrcUtilAsyncUnderscoreQueueMod.TimerId.All with String = js.native
    /* "client_metadata_refresh" */ val ClientMetadataRefresh: typings.atFirebaseFirestore.distSrcUtilAsyncUnderscoreQueueMod.TimerId.ClientMetadataRefresh with String = js.native
    /* "listen_stream_connection_backoff" */ val ListenStreamConnectionBackoff: typings.atFirebaseFirestore.distSrcUtilAsyncUnderscoreQueueMod.TimerId.ListenStreamConnectionBackoff with String = js.native
    /* "listen_stream_idle" */ val ListenStreamIdle: typings.atFirebaseFirestore.distSrcUtilAsyncUnderscoreQueueMod.TimerId.ListenStreamIdle with String = js.native
    /* "lru_garbage_collection" */ val LruGarbageCollection: typings.atFirebaseFirestore.distSrcUtilAsyncUnderscoreQueueMod.TimerId.LruGarbageCollection with String = js.native
    /* "online_state_timeout" */ val OnlineStateTimeout: typings.atFirebaseFirestore.distSrcUtilAsyncUnderscoreQueueMod.TimerId.OnlineStateTimeout with String = js.native
    /* "retry_transaction" */ val RetryTransaction: typings.atFirebaseFirestore.distSrcUtilAsyncUnderscoreQueueMod.TimerId.RetryTransaction with String = js.native
    /* "write_stream_connection_backoff" */ val WriteStreamConnectionBackoff: typings.atFirebaseFirestore.distSrcUtilAsyncUnderscoreQueueMod.TimerId.WriteStreamConnectionBackoff with String = js.native
    /* "write_stream_idle" */ val WriteStreamIdle: typings.atFirebaseFirestore.distSrcUtilAsyncUnderscoreQueueMod.TimerId.WriteStreamIdle with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TimerId with String] = js.native
  }
  
}

