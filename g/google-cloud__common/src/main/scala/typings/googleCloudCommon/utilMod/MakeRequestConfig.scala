package typings.googleCloudCommon.utilMod

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
  
  var shouldRetryFn: js.UndefOr[js.Function1[/* response */ js.UndefOr[Response[js.Any]], Boolean]] = js.undefined
  
  var stream: js.UndefOr[Duplexify] = js.undefined
}
object MakeRequestConfig {
  
  @scala.inline
  def apply(): MakeRequestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MakeRequestConfig]
  }
  
  @scala.inline
  implicit class MakeRequestConfigMutableBuilder[Self <: MakeRequestConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoRetry(value: Boolean): Self = StObject.set(x, "autoRetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRetryUndefined: Self = StObject.set(x, "autoRetry", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    
    @scala.inline
    def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
    
    @scala.inline
    def setShouldRetryFn(value: /* response */ js.UndefOr[Response[js.Any]] => Boolean): Self = StObject.set(x, "shouldRetryFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShouldRetryFnUndefined: Self = StObject.set(x, "shouldRetryFn", js.undefined)
    
    @scala.inline
    def setStream(value: Duplexify): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
