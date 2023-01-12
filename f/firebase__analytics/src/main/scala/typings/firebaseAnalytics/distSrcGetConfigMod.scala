package typings.firebaseAnalytics

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAnalytics.distSrcTypesMod.DynamicConfig
import typings.firebaseAnalytics.distSrcTypesMod.MinimalDynamicConfig
import typings.firebaseAnalytics.distSrcTypesMod.ThrottleMetadata
import typings.firebaseApp.mod.FirebaseApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGetConfigMod {
  
  @JSImport("@firebase/analytics/dist/src/get-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/analytics/dist/src/get-config", "AnalyticsAbortSignal")
  @js.native
  open class AnalyticsAbortSignal () extends StObject {
    
    def abort(): Unit = js.native
    
    def addEventListener(listener: js.Function0[Unit]): Unit = js.native
    
    var listeners: js.Array[js.Function0[Unit]] = js.native
  }
  
  @JSImport("@firebase/analytics/dist/src/get-config", "LONG_RETRY_FACTOR")
  @js.native
  val LONG_RETRY_FACTOR: /* 30 */ Double = js.native
  
  inline def fetchDynamicConfig(appFields: AppFields): js.Promise[DynamicConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchDynamicConfig")(appFields.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DynamicConfig]]
  
  inline def fetchDynamicConfigWithRetry(app: FirebaseApp): js.Promise[DynamicConfig | MinimalDynamicConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchDynamicConfigWithRetry")(app.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DynamicConfig | MinimalDynamicConfig]]
  inline def fetchDynamicConfigWithRetry(app: FirebaseApp, retryData: Unit, timeoutMillis: Double): js.Promise[DynamicConfig | MinimalDynamicConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchDynamicConfigWithRetry")(app.asInstanceOf[js.Any], retryData.asInstanceOf[js.Any], timeoutMillis.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DynamicConfig | MinimalDynamicConfig]]
  inline def fetchDynamicConfigWithRetry(app: FirebaseApp, retryData: RetryData): js.Promise[DynamicConfig | MinimalDynamicConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchDynamicConfigWithRetry")(app.asInstanceOf[js.Any], retryData.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DynamicConfig | MinimalDynamicConfig]]
  inline def fetchDynamicConfigWithRetry(app: FirebaseApp, retryData: RetryData, timeoutMillis: Double): js.Promise[DynamicConfig | MinimalDynamicConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchDynamicConfigWithRetry")(app.asInstanceOf[js.Any], retryData.asInstanceOf[js.Any], timeoutMillis.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DynamicConfig | MinimalDynamicConfig]]
  
  trait AppFields extends StObject {
    
    var apiKey: String
    
    var appId: String
    
    var measurementId: js.UndefOr[String] = js.undefined
  }
  object AppFields {
    
    inline def apply(apiKey: String, appId: String): AppFields = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppFields]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppFields] (val x: Self) extends AnyVal {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setMeasurementId(value: String): Self = StObject.set(x, "measurementId", value.asInstanceOf[js.Any])
      
      inline def setMeasurementIdUndefined: Self = StObject.set(x, "measurementId", js.undefined)
    }
  }
  
  /**
    * Stubbable retry data storage class.
    */
  trait RetryData extends StObject {
    
    def deleteThrottleMetadata(appId: String): Unit
    
    def getThrottleMetadata(appId: String): ThrottleMetadata
    
    var intervalMillis: Double
    
    def setThrottleMetadata(appId: String, metadata: ThrottleMetadata): Unit
    
    var throttleMetadata: StringDictionary[ThrottleMetadata]
  }
  object RetryData {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: RetryData] (val x: Self) extends AnyVal {
      
      inline def setDeleteThrottleMetadata(value: String => Unit): Self = StObject.set(x, "deleteThrottleMetadata", js.Any.fromFunction1(value))
      
      inline def setGetThrottleMetadata(value: String => ThrottleMetadata): Self = StObject.set(x, "getThrottleMetadata", js.Any.fromFunction1(value))
      
      inline def setIntervalMillis(value: Double): Self = StObject.set(x, "intervalMillis", value.asInstanceOf[js.Any])
      
      inline def setSetThrottleMetadata(value: (String, ThrottleMetadata) => Unit): Self = StObject.set(x, "setThrottleMetadata", js.Any.fromFunction2(value))
      
      inline def setThrottleMetadata(value: StringDictionary[ThrottleMetadata]): Self = StObject.set(x, "throttleMetadata", value.asInstanceOf[js.Any])
    }
  }
}
