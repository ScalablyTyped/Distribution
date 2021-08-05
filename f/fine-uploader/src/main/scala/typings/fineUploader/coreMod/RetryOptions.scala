package typings.fineUploader.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetryOptions extends StObject {
  
  /**
    * The number of seconds to wait between auto retry attempts
    *
    * @default `5`
    */
  var autoAttemptDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * Enable or disable retrying uploads that receive any error response
    *
    * @default `false`
    */
  var enableAuto: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of times to attempt to retry a failed upload
    *
    * @default `3`
    */
  var maxAutoAttempts: js.UndefOr[Double] = js.undefined
  
  /**
    * This property will be looked for in the server response and, if found and `true`, will indicate that no more retries should be attempted for this item
    *
    * @default `'preventRetry'`
    */
  var preventRetryResponseProperty: js.UndefOr[String] = js.undefined
}
object RetryOptions {
  
  inline def apply(): RetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryOptions]
  }
  
  extension [Self <: RetryOptions](x: Self) {
    
    inline def setAutoAttemptDelay(value: Double): Self = StObject.set(x, "autoAttemptDelay", value.asInstanceOf[js.Any])
    
    inline def setAutoAttemptDelayUndefined: Self = StObject.set(x, "autoAttemptDelay", js.undefined)
    
    inline def setEnableAuto(value: Boolean): Self = StObject.set(x, "enableAuto", value.asInstanceOf[js.Any])
    
    inline def setEnableAutoUndefined: Self = StObject.set(x, "enableAuto", js.undefined)
    
    inline def setMaxAutoAttempts(value: Double): Self = StObject.set(x, "maxAutoAttempts", value.asInstanceOf[js.Any])
    
    inline def setMaxAutoAttemptsUndefined: Self = StObject.set(x, "maxAutoAttempts", js.undefined)
    
    inline def setPreventRetryResponseProperty(value: String): Self = StObject.set(x, "preventRetryResponseProperty", value.asInstanceOf[js.Any])
    
    inline def setPreventRetryResponsePropertyUndefined: Self = StObject.set(x, "preventRetryResponseProperty", js.undefined)
  }
}
