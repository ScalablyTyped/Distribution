package typings.firebaseFirestore

import typings.firebaseFirestore.asyncQueueMod.AsyncQueue
import typings.firebaseFirestore.asyncQueueMod.TimerId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/remote/backoff", JSImport.Namespace)
@js.native
object backoffMod extends js.Object {
  @js.native
  class ExponentialBackoff protected () extends js.Object {
    def this(
      /**
      * The AsyncQueue to run backoff operations on.
      */
    queue: AsyncQueue,
      /**
      * The ID to use when scheduling backoff operations on the AsyncQueue.
      */
    timerId: TimerId
    ) = this()
    def this(
      /**
      * The AsyncQueue to run backoff operations on.
      */
    queue: AsyncQueue,
      /**
      * The ID to use when scheduling backoff operations on the AsyncQueue.
      */
    timerId: TimerId,
      /**
      * The initial delay (used as the base delay on the first retry attempt).
      * Note that jitter will still be applied, so the actual delay could be as
      * little as 0.5*initialDelayMs.
      */
    initialDelayMs: Double
    ) = this()
    def this(
      /**
      * The AsyncQueue to run backoff operations on.
      */
    queue: AsyncQueue,
      /**
      * The ID to use when scheduling backoff operations on the AsyncQueue.
      */
    timerId: TimerId,
      /**
      * The initial delay (used as the base delay on the first retry attempt).
      * Note that jitter will still be applied, so the actual delay could be as
      * little as 0.5*initialDelayMs.
      */
    initialDelayMs: Double,
      /**
      * The multiplier to use to determine the extended base delay after each
      * attempt.
      */
    backoffFactor: Double
    ) = this()
    def this(
      /**
      * The AsyncQueue to run backoff operations on.
      */
    queue: AsyncQueue,
      /**
      * The ID to use when scheduling backoff operations on the AsyncQueue.
      */
    timerId: TimerId,
      /**
      * The initial delay (used as the base delay on the first retry attempt).
      * Note that jitter will still be applied, so the actual delay could be as
      * little as 0.5*initialDelayMs.
      */
    initialDelayMs: Double,
      /**
      * The multiplier to use to determine the extended base delay after each
      * attempt.
      */
    backoffFactor: Double,
      /**
      * The maximum base delay after which no further backoff is performed.
      * Note that jitter will still be applied, so the actual delay could be as
      * much as 1.5*maxDelayMs.
      */
    maxDelayMs: Double
    ) = this()
    /**
      * The multiplier to use to determine the extended base delay after each
      * attempt.
      */
    val backoffFactor: js.Any = js.native
    var currentBaseMs: js.Any = js.native
    /**
      * The initial delay (used as the base delay on the first retry attempt).
      * Note that jitter will still be applied, so the actual delay could be as
      * little as 0.5*initialDelayMs.
      */
    val initialDelayMs: js.Any = js.native
    /** Returns a random value in the range [-currentBaseMs/2, currentBaseMs/2] */
    var jitterDelayMs: js.Any = js.native
    /** The last backoff attempt, as epoch milliseconds. */
    var lastAttemptTime: js.Any = js.native
    /**
      * The maximum base delay after which no further backoff is performed.
      * Note that jitter will still be applied, so the actual delay could be as
      * much as 1.5*maxDelayMs.
      */
    val maxDelayMs: js.Any = js.native
    /**
      * The AsyncQueue to run backoff operations on.
      */
    val queue: js.Any = js.native
    /**
      * The ID to use when scheduling backoff operations on the AsyncQueue.
      */
    val timerId: js.Any = js.native
    var timerPromise: js.Any = js.native
    /**
      * Returns a promise that resolves after currentDelayMs, and increases the
      * delay for any subsequent attempts. If there was a pending backoff operation
      * already, it will be canceled.
      */
    def backoffAndRun(op: js.Function0[js.Promise[Unit]]): Unit = js.native
    def cancel(): Unit = js.native
    /**
      * Resets the backoff delay.
      *
      * The very next backoffAndWait() will have no delay. If it is called again
      * (i.e. due to an error), initialDelayMs (plus jitter) will be used, and
      * subsequent ones will increase according to the backoffFactor.
      */
    def reset(): Unit = js.native
    /**
      * Resets the backoff delay to the maximum delay (e.g. for use after a
      * RESOURCE_EXHAUSTED error).
      */
    def resetToMax(): Unit = js.native
  }
  
}

