package typings.firebaseAnalytics

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAnalyticsTypes.mod.DynamicConfig
import typings.firebaseAnalyticsTypes.mod.MinimalDynamicConfig
import typings.firebaseAnalyticsTypes.mod.ThrottleMetadata
import typings.firebaseAppTypes.mod.FirebaseApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getConfigMod {
  
  @JSImport("@firebase/analytics/dist/src/get-config", "AnalyticsAbortSignal")
  @js.native
  class AnalyticsAbortSignal () extends StObject {
    
    def abort(): Unit = js.native
    
    def addEventListener(listener: js.Function0[Unit]): Unit = js.native
    
    var listeners: js.Array[js.Function0[Unit]] = js.native
  }
  
  @JSImport("@firebase/analytics/dist/src/get-config", "LONG_RETRY_FACTOR")
  @js.native
  val LONG_RETRY_FACTOR: /* 30 */ Double = js.native
  
  @JSImport("@firebase/analytics/dist/src/get-config", "fetchDynamicConfig")
  @js.native
  def fetchDynamicConfig(appFields: AppFields): js.Promise[DynamicConfig] = js.native
  
  @JSImport("@firebase/analytics/dist/src/get-config", "fetchDynamicConfigWithRetry")
  @js.native
  def fetchDynamicConfigWithRetry(app: FirebaseApp): js.Promise[DynamicConfig | MinimalDynamicConfig] = js.native
  @JSImport("@firebase/analytics/dist/src/get-config", "fetchDynamicConfigWithRetry")
  @js.native
  def fetchDynamicConfigWithRetry(app: FirebaseApp, retryData: js.UndefOr[scala.Nothing], timeoutMillis: Double): js.Promise[DynamicConfig | MinimalDynamicConfig] = js.native
  @JSImport("@firebase/analytics/dist/src/get-config", "fetchDynamicConfigWithRetry")
  @js.native
  def fetchDynamicConfigWithRetry(app: FirebaseApp, retryData: RetryData): js.Promise[DynamicConfig | MinimalDynamicConfig] = js.native
  @JSImport("@firebase/analytics/dist/src/get-config", "fetchDynamicConfigWithRetry")
  @js.native
  def fetchDynamicConfigWithRetry(app: FirebaseApp, retryData: RetryData, timeoutMillis: Double): js.Promise[DynamicConfig | MinimalDynamicConfig] = js.native
  
  @js.native
  trait AppFields extends StObject {
    
    var apiKey: String = js.native
    
    var appId: String = js.native
    
    var measurementId: js.UndefOr[String] = js.native
  }
  object AppFields {
    
    @scala.inline
    def apply(apiKey: String, appId: String): AppFields = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppFields]
    }
    
    @scala.inline
    implicit class AppFieldsMutableBuilder[Self <: AppFields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeasurementId(value: String): Self = StObject.set(x, "measurementId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeasurementIdUndefined: Self = StObject.set(x, "measurementId", js.undefined)
    }
  }
  
  /**
    * Stubbable retry data storage class.
    */
  @js.native
  trait RetryData extends StObject {
    
    def deleteThrottleMetadata(appId: String): Unit = js.native
    
    def getThrottleMetadata(appId: String): ThrottleMetadata = js.native
    
    var intervalMillis: Double = js.native
    
    def setThrottleMetadata(appId: String, metadata: ThrottleMetadata): Unit = js.native
    
    var throttleMetadata: StringDictionary[ThrottleMetadata] = js.native
  }
  object RetryData {
    
    @scala.inline
    def apply(
      deleteThrottleMetadata: String => Unit,
      getThrottleMetadata: String => ThrottleMetadata,
      intervalMillis: Double,
      setThrottleMetadata: (String, ThrottleMetadata) => Unit,
      throttleMetadata: StringDictionary[ThrottleMetadata]
    ): RetryData = {
      val __obj = js.Dynamic.literal(deleteThrottleMetadata = js.Any.fromFunction1(deleteThrottleMetadata), getThrottleMetadata = js.Any.fromFunction1(getThrottleMetadata), intervalMillis = intervalMillis.asInstanceOf[js.Any], setThrottleMetadata = js.Any.fromFunction2(setThrottleMetadata), throttleMetadata = throttleMetadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[RetryData]
    }
    
    @scala.inline
    implicit class RetryDataMutableBuilder[Self <: RetryData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeleteThrottleMetadata(value: String => Unit): Self = StObject.set(x, "deleteThrottleMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetThrottleMetadata(value: String => ThrottleMetadata): Self = StObject.set(x, "getThrottleMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIntervalMillis(value: Double): Self = StObject.set(x, "intervalMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetThrottleMetadata(value: (String, ThrottleMetadata) => Unit): Self = StObject.set(x, "setThrottleMetadata", js.Any.fromFunction2(value))
      
      @scala.inline
      def setThrottleMetadata(value: StringDictionary[ThrottleMetadata]): Self = StObject.set(x, "throttleMetadata", value.asInstanceOf[js.Any])
    }
  }
}
