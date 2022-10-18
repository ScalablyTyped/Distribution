package typings.googleCloudStorage.buildSrcNodejsCommonUtilMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetryOptions extends StObject {
  
  var autoRetry: js.UndefOr[Boolean] = js.undefined
  
  var maxRetries: js.UndefOr[Double] = js.undefined
  
  var maxRetryDelay: js.UndefOr[Double] = js.undefined
  
  var retryDelayMultiplier: js.UndefOr[Double] = js.undefined
  
  var retryableErrorFn: js.UndefOr[js.Function1[/* err */ ApiError, Boolean]] = js.undefined
  
  var totalTimeout: js.UndefOr[Double] = js.undefined
}
object RetryOptions {
  
  inline def apply(): RetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryOptions]
  }
  
  extension [Self <: RetryOptions](x: Self) {
    
    inline def setAutoRetry(value: Boolean): Self = StObject.set(x, "autoRetry", value.asInstanceOf[js.Any])
    
    inline def setAutoRetryUndefined: Self = StObject.set(x, "autoRetry", js.undefined)
    
    inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    
    inline def setMaxRetryDelay(value: Double): Self = StObject.set(x, "maxRetryDelay", value.asInstanceOf[js.Any])
    
    inline def setMaxRetryDelayUndefined: Self = StObject.set(x, "maxRetryDelay", js.undefined)
    
    inline def setRetryDelayMultiplier(value: Double): Self = StObject.set(x, "retryDelayMultiplier", value.asInstanceOf[js.Any])
    
    inline def setRetryDelayMultiplierUndefined: Self = StObject.set(x, "retryDelayMultiplier", js.undefined)
    
    inline def setRetryableErrorFn(value: /* err */ ApiError => Boolean): Self = StObject.set(x, "retryableErrorFn", js.Any.fromFunction1(value))
    
    inline def setRetryableErrorFnUndefined: Self = StObject.set(x, "retryableErrorFn", js.undefined)
    
    inline def setTotalTimeout(value: Double): Self = StObject.set(x, "totalTimeout", value.asInstanceOf[js.Any])
    
    inline def setTotalTimeoutUndefined: Self = StObject.set(x, "totalTimeout", js.undefined)
  }
}
