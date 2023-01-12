package typings.googleCloudCommon.buildSrcUtilMod

import typings.teenyRequest.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MakeRequestConfig extends StObject {
  
  /**
    * Automatically retry requests if the response is related to rate limits or
    * certain intermittent server errors. We will exponentially backoff
    * subsequent requests by default. (default: true)
    */
  var autoRetry: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Maximum number of automatic retries attempted before returning the error.
    * (default: 3)
    */
  var maxRetries: js.UndefOr[Double] = js.undefined
  
  var retries: js.UndefOr[Double] = js.undefined
  
  var retryOptions: js.UndefOr[RetryOptions] = js.undefined
  
  var shouldRetryFn: js.UndefOr[js.Function1[/* response */ js.UndefOr[Response[Any]], Boolean]] = js.undefined
  
  var stream: js.UndefOr[Duplexify] = js.undefined
}
object MakeRequestConfig {
  
  inline def apply(): MakeRequestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MakeRequestConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MakeRequestConfig] (val x: Self) extends AnyVal {
    
    inline def setAutoRetry(value: Boolean): Self = StObject.set(x, "autoRetry", value.asInstanceOf[js.Any])
    
    inline def setAutoRetryUndefined: Self = StObject.set(x, "autoRetry", js.undefined)
    
    inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    
    inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
    
    inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
    
    inline def setRetryOptions(value: RetryOptions): Self = StObject.set(x, "retryOptions", value.asInstanceOf[js.Any])
    
    inline def setRetryOptionsUndefined: Self = StObject.set(x, "retryOptions", js.undefined)
    
    inline def setShouldRetryFn(value: /* response */ js.UndefOr[Response[Any]] => Boolean): Self = StObject.set(x, "shouldRetryFn", js.Any.fromFunction1(value))
    
    inline def setShouldRetryFnUndefined: Self = StObject.set(x, "shouldRetryFn", js.undefined)
    
    inline def setStream(value: Duplexify): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
