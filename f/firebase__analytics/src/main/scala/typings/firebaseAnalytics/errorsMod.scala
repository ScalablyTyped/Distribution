package typings.firebaseAnalytics

import typings.firebaseAnalytics.firebaseAnalyticsStrings.`already-exists`
import typings.firebaseAnalytics.firebaseAnalyticsStrings.`already-initialized`
import typings.firebaseAnalytics.firebaseAnalyticsStrings.`config-fetch-failed`
import typings.firebaseAnalytics.firebaseAnalyticsStrings.`fetch-throttle`
import typings.firebaseAnalytics.firebaseAnalyticsStrings.`indexeddb-unavailable`
import typings.firebaseAnalytics.firebaseAnalyticsStrings.`interop-component-reg-failed`
import typings.firebaseAnalytics.firebaseAnalyticsStrings.`invalid-analytics-context`
import typings.firebaseAnalytics.firebaseAnalyticsStrings.`no-api-key`
import typings.firebaseAnalytics.firebaseAnalyticsStrings.`no-app-id`
import typings.firebaseUtil.mod.ErrorFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("@firebase/analytics/dist/src/errors", "ERROR_FACTORY")
  @js.native
  val ERROR_FACTORY: ErrorFactory[AnalyticsError, ErrorParams] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.`already-exists`
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.`already-initialized`
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.`interop-component-reg-failed`
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.`invalid-analytics-context`
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.`indexeddb-unavailable`
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.`fetch-throttle`
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.`config-fetch-failed`
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.`no-api-key`
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.`no-app-id`
  */
  trait AnalyticsError extends StObject
  object AnalyticsError {
    
    @scala.inline
    def ALREADY_EXISTS: `already-exists` = "already-exists".asInstanceOf[`already-exists`]
    
    @scala.inline
    def ALREADY_INITIALIZED: `already-initialized` = "already-initialized".asInstanceOf[`already-initialized`]
    
    @scala.inline
    def CONFIG_FETCH_FAILED: `config-fetch-failed` = "config-fetch-failed".asInstanceOf[`config-fetch-failed`]
    
    @scala.inline
    def FETCH_THROTTLE: `fetch-throttle` = "fetch-throttle".asInstanceOf[`fetch-throttle`]
    
    @scala.inline
    def INDEXEDDB_UNAVAILABLE: `indexeddb-unavailable` = "indexeddb-unavailable".asInstanceOf[`indexeddb-unavailable`]
    
    @scala.inline
    def INTEROP_COMPONENT_REG_FAILED: `interop-component-reg-failed` = "interop-component-reg-failed".asInstanceOf[`interop-component-reg-failed`]
    
    @scala.inline
    def INVALID_ANALYTICS_CONTEXT: `invalid-analytics-context` = "invalid-analytics-context".asInstanceOf[`invalid-analytics-context`]
    
    @scala.inline
    def NO_API_KEY: `no-api-key` = "no-api-key".asInstanceOf[`no-api-key`]
    
    @scala.inline
    def NO_APP_ID: `no-app-id` = "no-app-id".asInstanceOf[`no-app-id`]
  }
  
  @js.native
  trait ErrorParams extends StObject
}
