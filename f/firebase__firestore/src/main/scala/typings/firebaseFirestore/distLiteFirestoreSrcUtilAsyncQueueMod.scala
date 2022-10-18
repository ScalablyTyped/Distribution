package typings.firebaseFirestore

import typings.firebaseFirestore.distLiteFirestoreSrcUtilErrorMod.FirestoreError
import typings.firebaseFirestore.firebaseFirestoreStrings.all
import typings.firebaseFirestore.firebaseFirestoreStrings.async_queue_retry
import typings.firebaseFirestore.firebaseFirestoreStrings.client_metadata_refresh
import typings.firebaseFirestore.firebaseFirestoreStrings.health_check_timeout
import typings.firebaseFirestore.firebaseFirestoreStrings.index_backfill
import typings.firebaseFirestore.firebaseFirestoreStrings.listen_stream_connection_backoff
import typings.firebaseFirestore.firebaseFirestoreStrings.listen_stream_idle
import typings.firebaseFirestore.firebaseFirestoreStrings.lru_garbage_collection
import typings.firebaseFirestore.firebaseFirestoreStrings.online_state_timeout
import typings.firebaseFirestore.firebaseFirestoreStrings.transaction_retry
import typings.firebaseFirestore.firebaseFirestoreStrings.write_stream_connection_backoff
import typings.firebaseFirestore.firebaseFirestoreStrings.write_stream_idle
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcUtilAsyncQueueMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/util/async_queue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/util/async_queue", "DelayedOperation")
  @js.native
  /* private */ open class DelayedOperation[T /* <: Any */] ()
    extends StObject
       with PromiseLike[T] {
    
    /* private */ val asyncQueue: Any = js.native
    
    /**
      * Cancels the operation if it hasn't already been executed or canceled. The
      * promise will be rejected.
      *
      * As long as the operation has not yet been run, calling cancel() provides a
      * guarantee that the operation will not be run.
      */
    def cancel(): Unit = js.native
    def cancel(reason: String): Unit = js.native
    
    /* private */ var clearTimeout: Any = js.native
    
    /* private */ val deferred: Any = js.native
    
    /* private */ var handleDelayElapsed: Any = js.native
    
    /* private */ val op: Any = js.native
    
    /* private */ val removalCallback: Any = js.native
    
    /**
      * Queues the operation to run immediately (if it hasn't already been run or
      * canceled).
      */
    def skipDelay(): Unit = js.native
    
    /**
      * Starts the timer. This is called immediately after construction by
      * createAndSchedule().
      */
    /* private */ var start: Any = js.native
    
    val targetTimeMs: Double = js.native
    
    /* private */ var timerHandle: Any = js.native
    
    val timerId: TimerId = js.native
  }
  /* static members */
  object DelayedOperation {
    
    @JSImport("@firebase/firestore/dist/lite/firestore/src/util/async_queue", "DelayedOperation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a DelayedOperation that has been scheduled to be
      * executed on the provided asyncQueue after the provided delayMs.
      *
      * @param asyncQueue - The queue to schedule the operation on.
      * @param id - A Timer ID identifying the type of operation this is.
      * @param delayMs - The delay (ms) before the operation should be scheduled.
      * @param op - The operation to run.
      * @param removalCallback - A callback to be called synchronously once the
      *   operation is executed or canceled, notifying the AsyncQueue to remove it
      *   from its delayedOperations list.
      *   PORTING NOTE: This exists to prevent making removeDelayedOperation() and
      *   the DelayedOperation class public.
      */
    inline def createAndSchedule[R /* <: Any */](
      asyncQueue: AsyncQueue,
      timerId: TimerId,
      delayMs: Double,
      op: js.Function0[js.Promise[R]],
      removalCallback: js.Function1[/* op */ DelayedOperation[R], Unit]
    ): DelayedOperation[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAndSchedule")(asyncQueue.asInstanceOf[js.Any], timerId.asInstanceOf[js.Any], delayMs.asInstanceOf[js.Any], op.asInstanceOf[js.Any], removalCallback.asInstanceOf[js.Any])).asInstanceOf[DelayedOperation[R]]
  }
  
  inline def wrapInUserErrorIfRecoverable(e: js.Error, msg: String): FirestoreError = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapInUserErrorIfRecoverable")(e.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[FirestoreError]
  
  @js.native
  trait AsyncQueue extends StObject {
    
    /**
      * Adds a new operation to the queue. Returns a promise that will be resolved
      * when the promise returned by the new operation is (with its value).
      */
    def enqueue[T /* <: Any */](op: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
    
    /**
      * Schedules an operation to be queued on the AsyncQueue once the specified
      * `delayMs` has elapsed. The returned DelayedOperation can be used to cancel
      * or fast-forward the operation prior to its running.
      */
    def enqueueAfterDelay[T /* <: Any */](timerId: TimerId, delayMs: Double, op: js.Function0[js.Promise[T]]): DelayedOperation[T] = js.native
    
    /**
      * Adds a new operation to the queue without waiting for it to complete (i.e.
      * we ignore the Promise result).
      */
    def enqueueAndForget[T /* <: Any */](op: js.Function0[js.Promise[T]]): Unit = js.native
    
    /**
      * Regardless if the queue has initialized shutdown, adds a new operation to the
      * queue without waiting for it to complete (i.e. we ignore the Promise result).
      */
    def enqueueAndForgetEvenWhileRestricted[T /* <: Any */](op: js.Function0[js.Promise[T]]): Unit = js.native
    
    /**
      * Enqueue a retryable operation.
      *
      * A retryable operation is rescheduled with backoff if it fails with a
      * IndexedDbTransactionError (the error type used by SimpleDb). All
      * retryable operations are executed in order and only run if all prior
      * operations were retried successfully.
      */
    def enqueueRetryable(op: js.Function0[js.Promise[Unit]]): Unit = js.native
    
    /**
      * Initialize the shutdown of this queue. Once this method is called, the
      * only possible way to request running an operation is through
      * `enqueueEvenWhileRestricted()`.
      *
      * @param purgeExistingTasks Whether already enqueued tasked should be
      * rejected (unless enqueued wih `enqueueEvenWhileRestricted()`). Defaults
      * to false.
      */
    def enterRestrictedMode(): Unit = js.native
    def enterRestrictedMode(purgeExistingTasks: Boolean): Unit = js.native
    
    val isShuttingDown: Boolean = js.native
    
    /**
      * Verifies there's an operation currently in-progress on the AsyncQueue.
      * Unfortunately we can't verify that the running code is in the promise chain
      * of that operation, so this isn't a foolproof check, but it should be enough
      * to catch some bugs.
      */
    def verifyOperationInProgress(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreStrings.all
    - typings.firebaseFirestore.firebaseFirestoreStrings.listen_stream_idle
    - typings.firebaseFirestore.firebaseFirestoreStrings.listen_stream_connection_backoff
    - typings.firebaseFirestore.firebaseFirestoreStrings.write_stream_idle
    - typings.firebaseFirestore.firebaseFirestoreStrings.write_stream_connection_backoff
    - typings.firebaseFirestore.firebaseFirestoreStrings.health_check_timeout
    - typings.firebaseFirestore.firebaseFirestoreStrings.online_state_timeout
    - typings.firebaseFirestore.firebaseFirestoreStrings.client_metadata_refresh
    - typings.firebaseFirestore.firebaseFirestoreStrings.lru_garbage_collection
    - typings.firebaseFirestore.firebaseFirestoreStrings.transaction_retry
    - typings.firebaseFirestore.firebaseFirestoreStrings.async_queue_retry
    - typings.firebaseFirestore.firebaseFirestoreStrings.index_backfill
  */
  trait TimerId extends StObject
  object TimerId {
    
    /** All can be used with runDelayedOperationsEarly() to run all timers. */
    inline def All: all = "all".asInstanceOf[all]
    
    /**
      * A timer used to retry operations scheduled via retryable AsyncQueue
      * operations.
      */
    inline def AsyncQueueRetry: async_queue_retry = "async_queue_retry".asInstanceOf[async_queue_retry]
    
    /**
      * A timer used to update the client metadata in IndexedDb, which is used
      * to determine the primary leaseholder.
      */
    inline def ClientMetadataRefresh: client_metadata_refresh = "client_metadata_refresh".asInstanceOf[client_metadata_refresh]
    
    inline def HealthCheckTimeout: health_check_timeout = "health_check_timeout".asInstanceOf[health_check_timeout]
    
    /**
      *  A timer used to periodically attempt index backfill.
      */
    inline def IndexBackfill: index_backfill = "index_backfill".asInstanceOf[index_backfill]
    
    inline def ListenStreamConnectionBackoff: listen_stream_connection_backoff = "listen_stream_connection_backoff".asInstanceOf[listen_stream_connection_backoff]
    
    /**
      * The following 5 timers are used in persistent_stream.ts for the listen and
      * write streams. The "Idle" timer is used to close the stream due to
      * inactivity. The "ConnectionBackoff" timer is used to restart a stream once
      * the appropriate backoff delay has elapsed. The health check is used to mark
      * a stream healthy if it has not received an error during its initial setup.
      */
    inline def ListenStreamIdle: listen_stream_idle = "listen_stream_idle".asInstanceOf[listen_stream_idle]
    
    /** A timer used to periodically attempt LRU Garbage collection */
    inline def LruGarbageCollection: lru_garbage_collection = "lru_garbage_collection".asInstanceOf[lru_garbage_collection]
    
    /**
      * A timer used in online_state_tracker.ts to transition from
      * OnlineState.Unknown to Offline after a set timeout, rather than waiting
      * indefinitely for success or failure.
      */
    inline def OnlineStateTimeout: online_state_timeout = "online_state_timeout".asInstanceOf[online_state_timeout]
    
    /**
      * A timer used to retry transactions. Since there can be multiple concurrent
      * transactions, multiple of these may be in the queue at a given time.
      */
    inline def TransactionRetry: transaction_retry = "transaction_retry".asInstanceOf[transaction_retry]
    
    inline def WriteStreamConnectionBackoff: write_stream_connection_backoff = "write_stream_connection_backoff".asInstanceOf[write_stream_connection_backoff]
    
    inline def WriteStreamIdle: write_stream_idle = "write_stream_idle".asInstanceOf[write_stream_idle]
  }
}
