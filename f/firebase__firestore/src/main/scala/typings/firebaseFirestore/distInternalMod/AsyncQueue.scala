package typings.firebaseFirestore.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
