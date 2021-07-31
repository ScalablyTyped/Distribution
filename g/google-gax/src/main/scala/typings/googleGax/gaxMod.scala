package typings.googleGax

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.bundleExecutorMod.BundleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gaxMod {
  
  @JSImport("google-gax/build/src/gax", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("google-gax/build/src/gax", "CallSettings")
  @js.native
  /**
    * @param {Object} settings - An object containing parameters of this settings.
    * @param {number} settings.timeout - The client-side timeout for API calls.
    *   This parameter is ignored for retrying calls.
    * @param {RetryOptions} settings.retry - The configuration for retrying upon
    *   transient error. If set to null, this call will not retry.
    * @param {boolean} settings.autoPaginate - If there is no `pageDescriptor`,
    *   this attrbute has no meaning. Otherwise, determines whether a page
    * streamed response should make the page structure transparent to the user by
    *   flattening the repeated field in the returned generator.
    * @param {number} settings.pageToken - If there is no `pageDescriptor`,
    *   this attribute has no meaning. Otherwise, determines the page token used
    * in the page streaming request.
    * @param {Object} settings.otherArgs - Additional arguments to be passed to
    *   the API calls.
    *
    * @constructor
    */
  class CallSettings () extends StObject {
    def this(settings: CallOptions) = this()
    
    var apiName: js.UndefOr[String] = js.native
    
    var autoPaginate: js.UndefOr[Boolean] = js.native
    
    var bundleOptions: js.UndefOr[BundleOptions | Null] = js.native
    
    var isBundling: Boolean = js.native
    
    var longrunning: js.UndefOr[BackoffSettings] = js.native
    
    var maxResults: js.UndefOr[Double] = js.native
    
    /**
      * Returns a new CallSettings merged from this and a CallOptions object.
      *
      * @param {CallOptions} options - an instance whose values override
      *   those in this object. If null, ``merge`` returns a copy of this
      *   object
      * @return {CallSettings} The merged CallSettings instance.
      */
    def merge(): CallSettings = js.native
    def merge(options: CallOptions): CallSettings = js.native
    
    var otherArgs: StringDictionary[js.Any] = js.native
    
    var pageSize: js.UndefOr[Double] = js.native
    
    var pageToken: js.UndefOr[String] = js.native
    
    var retry: js.UndefOr[RetryOptions | Null] = js.native
    
    var retryRequestOptions: js.UndefOr[RetryRequestOptions] = js.native
    
    var timeout: Double = js.native
  }
  
  @JSImport("google-gax/build/src/gax", "RetryOptions")
  @js.native
  class RetryOptions protected () extends StObject {
    def this(retryCodes: js.Array[Double], backoffSettings: BackoffSettings) = this()
    
    var backoffSettings: BackoffSettings = js.native
    
    var retryCodes: js.Array[Double] = js.native
  }
  
  @scala.inline
  def constructSettings(
    serviceName: String,
    clientConfig: ClientConfig,
    configOverrides: ClientConfig,
    retryNames: js.Object
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("constructSettings")(serviceName.asInstanceOf[js.Any], clientConfig.asInstanceOf[js.Any], configOverrides.asInstanceOf[js.Any], retryNames.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def constructSettings(
    serviceName: String,
    clientConfig: ClientConfig,
    configOverrides: ClientConfig,
    retryNames: js.Object,
    otherArgs: js.Object
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("constructSettings")(serviceName.asInstanceOf[js.Any], clientConfig.asInstanceOf[js.Any], configOverrides.asInstanceOf[js.Any], retryNames.asInstanceOf[js.Any], otherArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def createBackoffSettings(initialRetryDelayMillis: Double, retryDelayMultiplier: Double, maxRetryDelayMillis: Double): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]
  @scala.inline
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Double
  ): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]
  @scala.inline
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Double,
    rpcTimeoutMultiplier: Double
  ): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]
  @scala.inline
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Double,
    rpcTimeoutMultiplier: Double,
    maxRpcTimeoutMillis: Double
  ): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]
  @scala.inline
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Double,
    rpcTimeoutMultiplier: Double,
    maxRpcTimeoutMillis: Double,
    totalTimeoutMillis: Double
  ): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], totalTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]
  @scala.inline
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Double,
    rpcTimeoutMultiplier: Double,
    maxRpcTimeoutMillis: Null,
    totalTimeoutMillis: Double
  ): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], totalTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]
  @scala.inline
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Double,
    rpcTimeoutMultiplier: Null,
    maxRpcTimeoutMillis: Double
  ): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]
  @scala.inline
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Double,
    rpcTimeoutMultiplier: Null,
    maxRpcTimeoutMillis: Double,
    totalTimeoutMillis: Double
  ): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], totalTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]
  @scala.inline
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Double,
    rpcTimeoutMultiplier: Null,
    maxRpcTimeoutMillis: Null,
    totalTimeoutMillis: Double
  ): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], totalTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]
  @scala.inline
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Null,
    rpcTimeoutMultiplier: Double
  ): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]
  @scala.inline
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Null,
    rpcTimeoutMultiplier: Double,
    maxRpcTimeoutMillis: Double
  ): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]
  @scala.inline
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Null,
    rpcTimeoutMultiplier: Double,
    maxRpcTimeoutMillis: Double,
    totalTimeoutMillis: Double
  ): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], totalTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]
  @scala.inline
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Null,
    rpcTimeoutMultiplier: Double,
    maxRpcTimeoutMillis: Null,
    totalTimeoutMillis: Double
  ): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], totalTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]
  @scala.inline
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Null,
    rpcTimeoutMultiplier: Null,
    maxRpcTimeoutMillis: Double
  ): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]
  @scala.inline
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Null,
    rpcTimeoutMultiplier: Null,
    maxRpcTimeoutMillis: Double,
    totalTimeoutMillis: Double
  ): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], totalTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]
  @scala.inline
  def createBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Null,
    rpcTimeoutMultiplier: Null,
    maxRpcTimeoutMillis: Null,
    totalTimeoutMillis: Double
  ): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], totalTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]
  
  @scala.inline
  def createBundleOptions(options: BundlingConfig): BundleOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("createBundleOptions")(options.asInstanceOf[js.Any]).asInstanceOf[BundleOptions]
  
  @scala.inline
  def createDefaultBackoffSettings(): BackoffSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultBackoffSettings")().asInstanceOf[BackoffSettings]
  
  @scala.inline
  def createMaxRetriesBackoffSettings(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Double,
    rpcTimeoutMultiplier: Double,
    maxRpcTimeoutMillis: Double,
    maxRetries: Double
  ): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createMaxRetriesBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], maxRetries.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]
  
  @scala.inline
  def createRetryOptions(retryCodes: js.Array[Double], backoffSettings: BackoffSettings): RetryOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("createRetryOptions")(retryCodes.asInstanceOf[js.Any], backoffSettings.asInstanceOf[js.Any])).asInstanceOf[RetryOptions]
  
  trait BackoffSettings extends StObject {
    
    var initialRetryDelayMillis: Double
    
    var initialRpcTimeoutMillis: js.UndefOr[Double | Null] = js.undefined
    
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    var maxRetryDelayMillis: Double
    
    var maxRpcTimeoutMillis: js.UndefOr[Double | Null] = js.undefined
    
    var retryDelayMultiplier: Double
    
    var rpcTimeoutMultiplier: js.UndefOr[Double | Null] = js.undefined
    
    var totalTimeoutMillis: js.UndefOr[Double | Null] = js.undefined
  }
  object BackoffSettings {
    
    @scala.inline
    def apply(initialRetryDelayMillis: Double, maxRetryDelayMillis: Double, retryDelayMultiplier: Double): BackoffSettings = {
      val __obj = js.Dynamic.literal(initialRetryDelayMillis = initialRetryDelayMillis.asInstanceOf[js.Any], maxRetryDelayMillis = maxRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier = retryDelayMultiplier.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackoffSettings]
    }
    
    @scala.inline
    implicit class BackoffSettingsMutableBuilder[Self <: BackoffSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialRetryDelayMillis(value: Double): Self = StObject.set(x, "initialRetryDelayMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialRpcTimeoutMillis(value: Double): Self = StObject.set(x, "initialRpcTimeoutMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialRpcTimeoutMillisNull: Self = StObject.set(x, "initialRpcTimeoutMillis", null)
      
      @scala.inline
      def setInitialRpcTimeoutMillisUndefined: Self = StObject.set(x, "initialRpcTimeoutMillis", js.undefined)
      
      @scala.inline
      def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      @scala.inline
      def setMaxRetryDelayMillis(value: Double): Self = StObject.set(x, "maxRetryDelayMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRpcTimeoutMillis(value: Double): Self = StObject.set(x, "maxRpcTimeoutMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRpcTimeoutMillisNull: Self = StObject.set(x, "maxRpcTimeoutMillis", null)
      
      @scala.inline
      def setMaxRpcTimeoutMillisUndefined: Self = StObject.set(x, "maxRpcTimeoutMillis", js.undefined)
      
      @scala.inline
      def setRetryDelayMultiplier(value: Double): Self = StObject.set(x, "retryDelayMultiplier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRpcTimeoutMultiplier(value: Double): Self = StObject.set(x, "rpcTimeoutMultiplier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRpcTimeoutMultiplierNull: Self = StObject.set(x, "rpcTimeoutMultiplier", null)
      
      @scala.inline
      def setRpcTimeoutMultiplierUndefined: Self = StObject.set(x, "rpcTimeoutMultiplier", js.undefined)
      
      @scala.inline
      def setTotalTimeoutMillis(value: Double): Self = StObject.set(x, "totalTimeoutMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalTimeoutMillisNull: Self = StObject.set(x, "totalTimeoutMillis", null)
      
      @scala.inline
      def setTotalTimeoutMillisUndefined: Self = StObject.set(x, "totalTimeoutMillis", js.undefined)
    }
  }
  
  trait BundlingConfig extends StObject {
    
    var delay_threshold_millis: js.UndefOr[Double] = js.undefined
    
    var element_count_limit: Double
    
    var element_count_threshold: Double
    
    var request_byte_limit: js.UndefOr[Double] = js.undefined
    
    var request_byte_threshold: js.UndefOr[Double] = js.undefined
  }
  object BundlingConfig {
    
    @scala.inline
    def apply(element_count_limit: Double, element_count_threshold: Double): BundlingConfig = {
      val __obj = js.Dynamic.literal(element_count_limit = element_count_limit.asInstanceOf[js.Any], element_count_threshold = element_count_threshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[BundlingConfig]
    }
    
    @scala.inline
    implicit class BundlingConfigMutableBuilder[Self <: BundlingConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay_threshold_millis(value: Double): Self = StObject.set(x, "delay_threshold_millis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelay_threshold_millisUndefined: Self = StObject.set(x, "delay_threshold_millis", js.undefined)
      
      @scala.inline
      def setElement_count_limit(value: Double): Self = StObject.set(x, "element_count_limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElement_count_threshold(value: Double): Self = StObject.set(x, "element_count_threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest_byte_limit(value: Double): Self = StObject.set(x, "request_byte_limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest_byte_limitUndefined: Self = StObject.set(x, "request_byte_limit", js.undefined)
      
      @scala.inline
      def setRequest_byte_threshold(value: Double): Self = StObject.set(x, "request_byte_threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest_byte_thresholdUndefined: Self = StObject.set(x, "request_byte_threshold", js.undefined)
    }
  }
  
  trait CallOptions extends StObject {
    
    var apiName: js.UndefOr[String] = js.undefined
    
    var autoPaginate: js.UndefOr[Boolean] = js.undefined
    
    var bundleOptions: js.UndefOr[BundleOptions | Null] = js.undefined
    
    var isBundling: js.UndefOr[Boolean] = js.undefined
    
    var longrunning: js.UndefOr[BackoffSettings] = js.undefined
    
    var maxResults: js.UndefOr[Double] = js.undefined
    
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    var otherArgs: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var retry: js.UndefOr[RetryOptions | Null] = js.undefined
    
    var retryRequestOptions: js.UndefOr[RetryRequestOptions] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
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
      def setApiName(value: String): Self = StObject.set(x, "apiName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiNameUndefined: Self = StObject.set(x, "apiName", js.undefined)
      
      @scala.inline
      def setAutoPaginate(value: Boolean): Self = StObject.set(x, "autoPaginate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoPaginateUndefined: Self = StObject.set(x, "autoPaginate", js.undefined)
      
      @scala.inline
      def setBundleOptions(value: BundleOptions): Self = StObject.set(x, "bundleOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBundleOptionsNull: Self = StObject.set(x, "bundleOptions", null)
      
      @scala.inline
      def setBundleOptionsUndefined: Self = StObject.set(x, "bundleOptions", js.undefined)
      
      @scala.inline
      def setIsBundling(value: Boolean): Self = StObject.set(x, "isBundling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBundlingUndefined: Self = StObject.set(x, "isBundling", js.undefined)
      
      @scala.inline
      def setLongrunning(value: BackoffSettings): Self = StObject.set(x, "longrunning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongrunningUndefined: Self = StObject.set(x, "longrunning", js.undefined)
      
      @scala.inline
      def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      @scala.inline
      def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      @scala.inline
      def setOtherArgs(value: StringDictionary[js.Any]): Self = StObject.set(x, "otherArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherArgsUndefined: Self = StObject.set(x, "otherArgs", js.undefined)
      
      @scala.inline
      def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      @scala.inline
      def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      @scala.inline
      def setRetry(value: RetryOptions): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryNull: Self = StObject.set(x, "retry", null)
      
      @scala.inline
      def setRetryRequestOptions(value: RetryRequestOptions): Self = StObject.set(x, "retryRequestOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryRequestOptionsUndefined: Self = StObject.set(x, "retryRequestOptions", js.undefined)
      
      @scala.inline
      def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait ClientConfig extends StObject {
    
    var interfaces: js.UndefOr[StringDictionary[ServiceConfig]] = js.undefined
  }
  object ClientConfig {
    
    @scala.inline
    def apply(): ClientConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientConfig]
    }
    
    @scala.inline
    implicit class ClientConfigMutableBuilder[Self <: ClientConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInterfaces(value: StringDictionary[ServiceConfig]): Self = StObject.set(x, "interfaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterfacesUndefined: Self = StObject.set(x, "interfaces", js.undefined)
    }
  }
  
  trait MethodConfig extends StObject {
    
    var bundling: js.UndefOr[BundlingConfig | Null] = js.undefined
    
    var retry_codes_name: js.UndefOr[String] = js.undefined
    
    var retry_params_name: js.UndefOr[String] = js.undefined
    
    var timeout_millis: js.UndefOr[Double] = js.undefined
  }
  object MethodConfig {
    
    @scala.inline
    def apply(): MethodConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MethodConfig]
    }
    
    @scala.inline
    implicit class MethodConfigMutableBuilder[Self <: MethodConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBundling(value: BundlingConfig): Self = StObject.set(x, "bundling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBundlingNull: Self = StObject.set(x, "bundling", null)
      
      @scala.inline
      def setBundlingUndefined: Self = StObject.set(x, "bundling", js.undefined)
      
      @scala.inline
      def setRetry_codes_name(value: String): Self = StObject.set(x, "retry_codes_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetry_codes_nameUndefined: Self = StObject.set(x, "retry_codes_name", js.undefined)
      
      @scala.inline
      def setRetry_params_name(value: String): Self = StObject.set(x, "retry_params_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetry_params_nameUndefined: Self = StObject.set(x, "retry_params_name", js.undefined)
      
      @scala.inline
      def setTimeout_millis(value: Double): Self = StObject.set(x, "timeout_millis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout_millisUndefined: Self = StObject.set(x, "timeout_millis", js.undefined)
    }
  }
  
  trait RetryParamsConfig extends StObject {
    
    var initial_retry_delay_millis: Double
    
    var initial_rpc_timeout_millis: Double
    
    var max_retry_delay_millis: Double
    
    var max_rpc_timeout_millis: Double
    
    var retry_delay_multiplier: Double
    
    var rpc_timeout_multiplier: Double
    
    var total_timeout_millis: Double
  }
  object RetryParamsConfig {
    
    @scala.inline
    def apply(
      initial_retry_delay_millis: Double,
      initial_rpc_timeout_millis: Double,
      max_retry_delay_millis: Double,
      max_rpc_timeout_millis: Double,
      retry_delay_multiplier: Double,
      rpc_timeout_multiplier: Double,
      total_timeout_millis: Double
    ): RetryParamsConfig = {
      val __obj = js.Dynamic.literal(initial_retry_delay_millis = initial_retry_delay_millis.asInstanceOf[js.Any], initial_rpc_timeout_millis = initial_rpc_timeout_millis.asInstanceOf[js.Any], max_retry_delay_millis = max_retry_delay_millis.asInstanceOf[js.Any], max_rpc_timeout_millis = max_rpc_timeout_millis.asInstanceOf[js.Any], retry_delay_multiplier = retry_delay_multiplier.asInstanceOf[js.Any], rpc_timeout_multiplier = rpc_timeout_multiplier.asInstanceOf[js.Any], total_timeout_millis = total_timeout_millis.asInstanceOf[js.Any])
      __obj.asInstanceOf[RetryParamsConfig]
    }
    
    @scala.inline
    implicit class RetryParamsConfigMutableBuilder[Self <: RetryParamsConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitial_retry_delay_millis(value: Double): Self = StObject.set(x, "initial_retry_delay_millis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitial_rpc_timeout_millis(value: Double): Self = StObject.set(x, "initial_rpc_timeout_millis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_retry_delay_millis(value: Double): Self = StObject.set(x, "max_retry_delay_millis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_rpc_timeout_millis(value: Double): Self = StObject.set(x, "max_rpc_timeout_millis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetry_delay_multiplier(value: Double): Self = StObject.set(x, "retry_delay_multiplier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRpc_timeout_multiplier(value: Double): Self = StObject.set(x, "rpc_timeout_multiplier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_timeout_millis(value: Double): Self = StObject.set(x, "total_timeout_millis", value.asInstanceOf[js.Any])
    }
  }
  
  trait RetryRequestOptions extends StObject {
    
    var currentRetryAttempt: js.UndefOr[Double] = js.undefined
    
    var noResponseRetries: js.UndefOr[Double] = js.undefined
    
    var objectMode: js.UndefOr[Boolean] = js.undefined
    
    var request: js.UndefOr[js.Any] = js.undefined
    
    var retries: js.UndefOr[Double] = js.undefined
    
    var shouldRetryFn: js.UndefOr[js.Function0[Boolean]] = js.undefined
  }
  object RetryRequestOptions {
    
    @scala.inline
    def apply(): RetryRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RetryRequestOptions]
    }
    
    @scala.inline
    implicit class RetryRequestOptionsMutableBuilder[Self <: RetryRequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentRetryAttempt(value: Double): Self = StObject.set(x, "currentRetryAttempt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentRetryAttemptUndefined: Self = StObject.set(x, "currentRetryAttempt", js.undefined)
      
      @scala.inline
      def setNoResponseRetries(value: Double): Self = StObject.set(x, "noResponseRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoResponseRetriesUndefined: Self = StObject.set(x, "noResponseRetries", js.undefined)
      
      @scala.inline
      def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      
      @scala.inline
      def setRequest(value: js.Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      @scala.inline
      def setShouldRetryFn(value: () => Boolean): Self = StObject.set(x, "shouldRetryFn", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShouldRetryFnUndefined: Self = StObject.set(x, "shouldRetryFn", js.undefined)
    }
  }
  
  trait ServiceConfig extends StObject {
    
    var methods: StringDictionary[MethodConfig | Null]
    
    var retry_codes: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
    
    var retry_params: js.UndefOr[StringDictionary[RetryParamsConfig]] = js.undefined
  }
  object ServiceConfig {
    
    @scala.inline
    def apply(methods: StringDictionary[MethodConfig | Null]): ServiceConfig = {
      val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceConfig]
    }
    
    @scala.inline
    implicit class ServiceConfigMutableBuilder[Self <: ServiceConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethods(value: StringDictionary[MethodConfig | Null]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetry_codes(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "retry_codes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetry_codesUndefined: Self = StObject.set(x, "retry_codes", js.undefined)
      
      @scala.inline
      def setRetry_params(value: StringDictionary[RetryParamsConfig]): Self = StObject.set(x, "retry_params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetry_paramsUndefined: Self = StObject.set(x, "retry_params", js.undefined)
    }
  }
}
