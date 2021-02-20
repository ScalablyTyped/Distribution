package typings.fineUploader.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetryOptions extends StObject {
  
  /**
    * The number of seconds to wait between auto retry attempts
    *
    * @default `5`
    */
  var autoAttemptDelay: js.UndefOr[Double] = js.native
  
  /**
    * Enable or disable retrying uploads that receive any error response
    *
    * @default `false`
    */
  var enableAuto: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum number of times to attempt to retry a failed upload
    *
    * @default `3`
    */
  var maxAutoAttempts: js.UndefOr[Double] = js.native
  
  /**
    * This property will be looked for in the server response and, if found and `true`, will indicate that no more retries should be attempted for this item
    *
    * @default `'preventRetry'`
    */
  var preventRetryResponseProperty: js.UndefOr[String] = js.native
}
object RetryOptions {
  
  @scala.inline
  def apply(): RetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryOptions]
  }
  
  @scala.inline
  implicit class RetryOptionsMutableBuilder[Self <: RetryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoAttemptDelay(value: Double): Self = StObject.set(x, "autoAttemptDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoAttemptDelayUndefined: Self = StObject.set(x, "autoAttemptDelay", js.undefined)
    
    @scala.inline
    def setEnableAuto(value: Boolean): Self = StObject.set(x, "enableAuto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAutoUndefined: Self = StObject.set(x, "enableAuto", js.undefined)
    
    @scala.inline
    def setMaxAutoAttempts(value: Double): Self = StObject.set(x, "maxAutoAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAutoAttemptsUndefined: Self = StObject.set(x, "maxAutoAttempts", js.undefined)
    
    @scala.inline
    def setPreventRetryResponseProperty(value: String): Self = StObject.set(x, "preventRetryResponseProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventRetryResponsePropertyUndefined: Self = StObject.set(x, "preventRetryResponseProperty", js.undefined)
  }
}
