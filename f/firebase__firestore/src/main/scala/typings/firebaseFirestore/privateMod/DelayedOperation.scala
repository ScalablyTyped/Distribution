package typings.firebaseFirestore.privateMod

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an operation scheduled to be run in the future on an AsyncQueue.
  *
  * It is created via DelayedOperation.createAndSchedule().
  *
  * Supports cancellation (via cancel()) and early execution (via skipDelay()).
  *
  * Note: We implement `PromiseLike` instead of `Promise`, as the `Promise` type
  * in newer versions of TypeScript defines `finally`, which is not available in
  * IE.
  */
@js.native
trait DelayedOperation[T /* <: Any */]
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
