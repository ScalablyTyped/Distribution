package typings.firebaseFirestore

import typings.firebaseFirestore.distLiteFirestoreSrcUtilAsyncQueueMod.AsyncQueue
import typings.firebaseFirestore.distLiteFirestoreSrcUtilAsyncQueueMod.TimerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcRemoteBackoffMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/remote/backoff", "ExponentialBackoff")
  @js.native
  open class ExponentialBackoff protected () extends StObject {
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
    initialDelayMs: Unit,
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
    backoffFactor: Unit,
      /**
      * The maximum base delay after which no further backoff is performed.
      * Note that jitter will still be applied, so the actual delay could be as
      * much as 1.5*maxDelayMs.
      */
    maxDelayMs: Double
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
    initialDelayMs: Unit,
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
    initialDelayMs: Unit,
      /**
      * The multiplier to use to determine the extended base delay after each
      * attempt.
      */
    backoffFactor: Unit,
      /**
      * The maximum base delay after which no further backoff is performed.
      * Note that jitter will still be applied, so the actual delay could be as
      * much as 1.5*maxDelayMs.
      */
    maxDelayMs: Double
    ) = this()
    
    /**
      * Returns a promise that resolves after currentDelayMs, and increases the
      * delay for any subsequent attempts. If there was a pending backoff operation
      * already, it will be canceled.
      */
    def backoffAndRun(op: js.Function0[js.Promise[Unit]]): Unit = js.native
    
    /**
      * The multiplier to use to determine the extended base delay after each
      * attempt.
      */
    /* private */ val backoffFactor: Any = js.native
    
    def cancel(): Unit = js.native
    
    /* private */ var currentBaseMs: Any = js.native
    
    /**
      * The initial delay (used as the base delay on the first retry attempt).
      * Note that jitter will still be applied, so the actual delay could be as
      * little as 0.5*initialDelayMs.
      */
    /* private */ val initialDelayMs: Any = js.native
    
    /** Returns a random value in the range [-currentBaseMs/2, currentBaseMs/2] */
    /* private */ var jitterDelayMs: Any = js.native
    
    /** The last backoff attempt, as epoch milliseconds. */
    /* private */ var lastAttemptTime: Any = js.native
    
    /**
      * The maximum base delay after which no further backoff is performed.
      * Note that jitter will still be applied, so the actual delay could be as
      * much as 1.5*maxDelayMs.
      */
    /* private */ val maxDelayMs: Any = js.native
    
    /**
      * The AsyncQueue to run backoff operations on.
      */
    /* private */ val queue: Any = js.native
    
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
    
    def skipBackoff(): Unit = js.native
    
    /**
      * The ID to use when scheduling backoff operations on the AsyncQueue.
      */
    /* private */ val timerId: Any = js.native
    
    /* private */ var timerPromise: Any = js.native
  }
}
