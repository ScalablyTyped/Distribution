package typings.firebaseFirestore.asyncQueueMod

import typings.firebaseFirestore.promiseMod.CancelablePromise
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/util/async_queue", "AsyncQueue")
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

