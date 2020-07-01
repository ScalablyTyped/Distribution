package typings.firebaseFirestore.asyncQueueMod

import typings.std.PromiseLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/util/async_queue", "DelayedOperation")
@js.native
class DelayedOperation[T /* <: js.Any */] protected () extends PromiseLike[T] {
  val asyncQueue: js.Any = js.native
  var clearTimeout: js.Any = js.native
  val deferred: js.Any = js.native
  var handleDelayElapsed: js.Any = js.native
  val op: js.Any = js.native
  val removalCallback: js.Any = js.native
  /**
    * Starts the timer. This is called immediately after construction by
    * createAndSchedule().
    */
  var start: js.Any = js.native
  val targetTimeMs: Double = js.native
  var timerHandle: js.Any = js.native
  val timerId: TimerId = js.native
  /**
    * Cancels the operation if it hasn't already been executed or canceled. The
    * promise will be rejected.
    *
    * As long as the operation has not yet been run, calling cancel() provides a
    * guarantee that the operation will not be run.
    */
  def cancel(): Unit = js.native
  def cancel(reason: String): Unit = js.native
  /**
    * Queues the operation to run immediately (if it hasn't already been run or
    * canceled).
    */
  def skipDelay(): Unit = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/packages/firestore/src/util/async_queue", "DelayedOperation")
@js.native
object DelayedOperation extends js.Object {
  /**
    * Creates and returns a DelayedOperation that has been scheduled to be
    * executed on the provided asyncQueue after the provided delayMs.
    *
    * @param asyncQueue The queue to schedule the operation on.
    * @param id A Timer ID identifying the type of operation this is.
    * @param delayMs The delay (ms) before the operation should be scheduled.
    * @param op The operation to run.
    * @param removalCallback A callback to be called synchronously once the
    *   operation is executed or canceled, notifying the AsyncQueue to remove it
    *   from its delayedOperations list.
    *   PORTING NOTE: This exists to prevent making removeDelayedOperation() and
    *   the DelayedOperation class public.
    */
  def createAndSchedule[R /* <: js.Any */](
    asyncQueue: AsyncQueue,
    timerId: TimerId,
    delayMs: Double,
    op: js.Function0[js.Promise[R]],
    removalCallback: js.Function1[/* op */ DelayedOperation[R], Unit]
  ): DelayedOperation[R] = js.native
}

