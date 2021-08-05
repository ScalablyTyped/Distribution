package typings.googleCloudKms.mod

import typings.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GAX {
  
  /** https://googleapis.github.io/gax-nodejs/global.html#BackoffSettings */
  trait BackoffSettings extends StObject {
    
    var initialRetryDelayMillis: Double
    
    var initialRpcTimeoutMillis: Double
    
    var maxRetryDelayMillis: Double
    
    var maxRpcTimeoutMillis: Double
    
    var retryDelayMultiplier: Double
    
    var totalTimeoutMillis: Double
  }
  object BackoffSettings {
    
    inline def apply(
      initialRetryDelayMillis: Double,
      initialRpcTimeoutMillis: Double,
      maxRetryDelayMillis: Double,
      maxRpcTimeoutMillis: Double,
      retryDelayMultiplier: Double,
      totalTimeoutMillis: Double
    ): BackoffSettings = {
      val __obj = js.Dynamic.literal(initialRetryDelayMillis = initialRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis = initialRpcTimeoutMillis.asInstanceOf[js.Any], maxRetryDelayMillis = maxRetryDelayMillis.asInstanceOf[js.Any], maxRpcTimeoutMillis = maxRpcTimeoutMillis.asInstanceOf[js.Any], retryDelayMultiplier = retryDelayMultiplier.asInstanceOf[js.Any], totalTimeoutMillis = totalTimeoutMillis.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackoffSettings]
    }
    
    extension [Self <: BackoffSettings](x: Self) {
      
      inline def setInitialRetryDelayMillis(value: Double): Self = StObject.set(x, "initialRetryDelayMillis", value.asInstanceOf[js.Any])
      
      inline def setInitialRpcTimeoutMillis(value: Double): Self = StObject.set(x, "initialRpcTimeoutMillis", value.asInstanceOf[js.Any])
      
      inline def setMaxRetryDelayMillis(value: Double): Self = StObject.set(x, "maxRetryDelayMillis", value.asInstanceOf[js.Any])
      
      inline def setMaxRpcTimeoutMillis(value: Double): Self = StObject.set(x, "maxRpcTimeoutMillis", value.asInstanceOf[js.Any])
      
      inline def setRetryDelayMultiplier(value: Double): Self = StObject.set(x, "retryDelayMultiplier", value.asInstanceOf[js.Any])
      
      inline def setTotalTimeoutMillis(value: Double): Self = StObject.set(x, "totalTimeoutMillis", value.asInstanceOf[js.Any])
    }
  }
  
  /** https://googleapis.github.io/gax-nodejs/global.html#CallOptions */
  trait CallOptions extends StObject {
    
    var autoPaginate: js.UndefOr[Boolean] = js.undefined
    
    var isBundling: js.UndefOr[Boolean] = js.undefined
    
    var longrunning: js.UndefOr[BackoffSettings] = js.undefined
    
    var pageToken: js.UndefOr[js.Object] = js.undefined
    
    var promise: js.UndefOr[PromiseConstructor] = js.undefined
    
    var retry: js.UndefOr[RetryOptions] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object CallOptions {
    
    inline def apply(): CallOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallOptions]
    }
    
    extension [Self <: CallOptions](x: Self) {
      
      inline def setAutoPaginate(value: Boolean): Self = StObject.set(x, "autoPaginate", value.asInstanceOf[js.Any])
      
      inline def setAutoPaginateUndefined: Self = StObject.set(x, "autoPaginate", js.undefined)
      
      inline def setIsBundling(value: Boolean): Self = StObject.set(x, "isBundling", value.asInstanceOf[js.Any])
      
      inline def setIsBundlingUndefined: Self = StObject.set(x, "isBundling", js.undefined)
      
      inline def setLongrunning(value: BackoffSettings): Self = StObject.set(x, "longrunning", value.asInstanceOf[js.Any])
      
      inline def setLongrunningUndefined: Self = StObject.set(x, "longrunning", js.undefined)
      
      inline def setPageToken(value: js.Object): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setPromise(value: PromiseConstructor): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
      
      inline def setRetry(value: RetryOptions): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /** https://googleapis.github.io/gax-nodejs/global.html#RetryOptions */
  trait RetryOptions extends StObject {
    
    var backoffSettings: BackoffSettings
    
    var retryCodes: js.Array[String]
  }
  object RetryOptions {
    
    inline def apply(backoffSettings: BackoffSettings, retryCodes: js.Array[String]): RetryOptions = {
      val __obj = js.Dynamic.literal(backoffSettings = backoffSettings.asInstanceOf[js.Any], retryCodes = retryCodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[RetryOptions]
    }
    
    extension [Self <: RetryOptions](x: Self) {
      
      inline def setBackoffSettings(value: BackoffSettings): Self = StObject.set(x, "backoffSettings", value.asInstanceOf[js.Any])
      
      inline def setRetryCodes(value: js.Array[String]): Self = StObject.set(x, "retryCodes", value.asInstanceOf[js.Any])
      
      inline def setRetryCodesVarargs(value: String*): Self = StObject.set(x, "retryCodes", js.Array(value :_*))
    }
  }
}
