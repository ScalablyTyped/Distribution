package typings.exponentialBackoff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOptionsMod {
  
  @JSImport("exponential-backoff/dist/options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSanitizedOptions(options: BackoffOptions): IBackOffOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getSanitizedOptions")(options.asInstanceOf[js.Any]).asInstanceOf[IBackOffOptions]
  
  /* Inlined std.Partial<exponential-backoff.exponential-backoff/dist/options.IBackOffOptions> */
  trait BackoffOptions extends StObject {
    
    var delayFirstAttempt: js.UndefOr[Boolean] = js.undefined
    
    var jitter: js.UndefOr[JitterType] = js.undefined
    
    var maxDelay: js.UndefOr[Double] = js.undefined
    
    var numOfAttempts: js.UndefOr[Double] = js.undefined
    
    var retry: js.UndefOr[
        js.Function2[/* e */ Any, /* attemptNumber */ Double, Boolean | js.Promise[Boolean]]
      ] = js.undefined
    
    var startingDelay: js.UndefOr[Double] = js.undefined
    
    var timeMultiple: js.UndefOr[Double] = js.undefined
  }
  object BackoffOptions {
    
    inline def apply(): BackoffOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackoffOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BackoffOptions] (val x: Self) extends AnyVal {
      
      inline def setDelayFirstAttempt(value: Boolean): Self = StObject.set(x, "delayFirstAttempt", value.asInstanceOf[js.Any])
      
      inline def setDelayFirstAttemptUndefined: Self = StObject.set(x, "delayFirstAttempt", js.undefined)
      
      inline def setJitter(value: JitterType): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
      
      inline def setJitterUndefined: Self = StObject.set(x, "jitter", js.undefined)
      
      inline def setMaxDelay(value: Double): Self = StObject.set(x, "maxDelay", value.asInstanceOf[js.Any])
      
      inline def setMaxDelayUndefined: Self = StObject.set(x, "maxDelay", js.undefined)
      
      inline def setNumOfAttempts(value: Double): Self = StObject.set(x, "numOfAttempts", value.asInstanceOf[js.Any])
      
      inline def setNumOfAttemptsUndefined: Self = StObject.set(x, "numOfAttempts", js.undefined)
      
      inline def setRetry(value: (/* e */ Any, /* attemptNumber */ Double) => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "retry", js.Any.fromFunction2(value))
      
      inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      inline def setStartingDelay(value: Double): Self = StObject.set(x, "startingDelay", value.asInstanceOf[js.Any])
      
      inline def setStartingDelayUndefined: Self = StObject.set(x, "startingDelay", js.undefined)
      
      inline def setTimeMultiple(value: Double): Self = StObject.set(x, "timeMultiple", value.asInstanceOf[js.Any])
      
      inline def setTimeMultipleUndefined: Self = StObject.set(x, "timeMultiple", js.undefined)
    }
  }
  
  trait IBackOffOptions extends StObject {
    
    var delayFirstAttempt: Boolean
    
    var jitter: JitterType
    
    var maxDelay: Double
    
    var numOfAttempts: Double
    
    def retry(e: Any, attemptNumber: Double): Boolean | js.Promise[Boolean]
    
    var startingDelay: Double
    
    var timeMultiple: Double
  }
  object IBackOffOptions {
    
    inline def apply(
      delayFirstAttempt: Boolean,
      jitter: JitterType,
      maxDelay: Double,
      numOfAttempts: Double,
      retry: (Any, Double) => Boolean | js.Promise[Boolean],
      startingDelay: Double,
      timeMultiple: Double
    ): IBackOffOptions = {
      val __obj = js.Dynamic.literal(delayFirstAttempt = delayFirstAttempt.asInstanceOf[js.Any], jitter = jitter.asInstanceOf[js.Any], maxDelay = maxDelay.asInstanceOf[js.Any], numOfAttempts = numOfAttempts.asInstanceOf[js.Any], retry = js.Any.fromFunction2(retry), startingDelay = startingDelay.asInstanceOf[js.Any], timeMultiple = timeMultiple.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBackOffOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBackOffOptions] (val x: Self) extends AnyVal {
      
      inline def setDelayFirstAttempt(value: Boolean): Self = StObject.set(x, "delayFirstAttempt", value.asInstanceOf[js.Any])
      
      inline def setJitter(value: JitterType): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
      
      inline def setMaxDelay(value: Double): Self = StObject.set(x, "maxDelay", value.asInstanceOf[js.Any])
      
      inline def setNumOfAttempts(value: Double): Self = StObject.set(x, "numOfAttempts", value.asInstanceOf[js.Any])
      
      inline def setRetry(value: (Any, Double) => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "retry", js.Any.fromFunction2(value))
      
      inline def setStartingDelay(value: Double): Self = StObject.set(x, "startingDelay", value.asInstanceOf[js.Any])
      
      inline def setTimeMultiple(value: Double): Self = StObject.set(x, "timeMultiple", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.exponentialBackoff.exponentialBackoffStrings.none
    - typings.exponentialBackoff.exponentialBackoffStrings.full
  */
  trait JitterType extends StObject
  object JitterType {
    
    inline def full: typings.exponentialBackoff.exponentialBackoffStrings.full = "full".asInstanceOf[typings.exponentialBackoff.exponentialBackoffStrings.full]
    
    inline def none: typings.exponentialBackoff.exponentialBackoffStrings.none = "none".asInstanceOf[typings.exponentialBackoff.exponentialBackoffStrings.none]
  }
}
