package typings.googleCloudKms.mod

import typings.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GAX {
  
  /** https://googleapis.github.io/gax-nodejs/global.html#BackoffSettings */
  @js.native
  trait BackoffSettings extends StObject {
    
    var initialRetryDelayMillis: Double = js.native
    
    var initialRpcTimeoutMillis: Double = js.native
    
    var maxRetryDelayMillis: Double = js.native
    
    var maxRpcTimeoutMillis: Double = js.native
    
    var retryDelayMultiplier: Double = js.native
    
    var totalTimeoutMillis: Double = js.native
  }
  object BackoffSettings {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class BackoffSettingsMutableBuilder[Self <: BackoffSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialRetryDelayMillis(value: Double): Self = StObject.set(x, "initialRetryDelayMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialRpcTimeoutMillis(value: Double): Self = StObject.set(x, "initialRpcTimeoutMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetryDelayMillis(value: Double): Self = StObject.set(x, "maxRetryDelayMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRpcTimeoutMillis(value: Double): Self = StObject.set(x, "maxRpcTimeoutMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryDelayMultiplier(value: Double): Self = StObject.set(x, "retryDelayMultiplier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalTimeoutMillis(value: Double): Self = StObject.set(x, "totalTimeoutMillis", value.asInstanceOf[js.Any])
    }
  }
  
  /** https://googleapis.github.io/gax-nodejs/global.html#CallOptions */
  @js.native
  trait CallOptions extends StObject {
    
    var autoPaginate: js.UndefOr[Boolean] = js.native
    
    var isBundling: js.UndefOr[Boolean] = js.native
    
    var longrunning: js.UndefOr[BackoffSettings] = js.native
    
    var pageToken: js.UndefOr[js.Object] = js.native
    
    var promise: js.UndefOr[PromiseConstructor] = js.native
    
    var retry: js.UndefOr[RetryOptions] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object CallOptions {
    
    @scala.inline
    def apply(): CallOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallOptions]
    }
    
    @scala.inline
    implicit class CallOptionsMutableBuilder[Self <: CallOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoPaginate(value: Boolean): Self = StObject.set(x, "autoPaginate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoPaginateUndefined: Self = StObject.set(x, "autoPaginate", js.undefined)
      
      @scala.inline
      def setIsBundling(value: Boolean): Self = StObject.set(x, "isBundling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBundlingUndefined: Self = StObject.set(x, "isBundling", js.undefined)
      
      @scala.inline
      def setLongrunning(value: BackoffSettings): Self = StObject.set(x, "longrunning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongrunningUndefined: Self = StObject.set(x, "longrunning", js.undefined)
      
      @scala.inline
      def setPageToken(value: js.Object): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      @scala.inline
      def setPromise(value: PromiseConstructor): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
      
      @scala.inline
      def setRetry(value: RetryOptions): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /** https://googleapis.github.io/gax-nodejs/global.html#RetryOptions */
  @js.native
  trait RetryOptions extends StObject {
    
    var backoffSettings: BackoffSettings = js.native
    
    var retryCodes: js.Array[String] = js.native
  }
  object RetryOptions {
    
    @scala.inline
    def apply(backoffSettings: BackoffSettings, retryCodes: js.Array[String]): RetryOptions = {
      val __obj = js.Dynamic.literal(backoffSettings = backoffSettings.asInstanceOf[js.Any], retryCodes = retryCodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[RetryOptions]
    }
    
    @scala.inline
    implicit class RetryOptionsMutableBuilder[Self <: RetryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackoffSettings(value: BackoffSettings): Self = StObject.set(x, "backoffSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryCodes(value: js.Array[String]): Self = StObject.set(x, "retryCodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryCodesVarargs(value: String*): Self = StObject.set(x, "retryCodes", js.Array(value :_*))
    }
  }
}
