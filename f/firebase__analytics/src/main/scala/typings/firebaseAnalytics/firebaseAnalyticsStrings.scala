package typings.firebaseAnalytics

import typings.firebaseAnalytics.errorsMod.AnalyticsError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseAnalyticsStrings {
  
  @js.native
  sealed trait `already-exists`
    extends StObject
       with AnalyticsError
  inline def `already-exists`: `already-exists` = "already-exists".asInstanceOf[`already-exists`]
  
  @js.native
  sealed trait `already-initialized`
    extends StObject
       with AnalyticsError
  inline def `already-initialized`: `already-initialized` = "already-initialized".asInstanceOf[`already-initialized`]
  
  @js.native
  sealed trait config extends StObject
  inline def config: config = "config".asInstanceOf[config]
  
  @js.native
  sealed trait `config-fetch-failed`
    extends StObject
       with AnalyticsError
  inline def `config-fetch-failed`: `config-fetch-failed` = "config-fetch-failed".asInstanceOf[`config-fetch-failed`]
  
  @js.native
  sealed trait event extends StObject
  inline def event: event = "event".asInstanceOf[event]
  
  @js.native
  sealed trait `fetch-throttle`
    extends StObject
       with AnalyticsError
  inline def `fetch-throttle`: `fetch-throttle` = "fetch-throttle".asInstanceOf[`fetch-throttle`]
  
  @js.native
  sealed trait `indexeddb-unavailable`
    extends StObject
       with AnalyticsError
  inline def `indexeddb-unavailable`: `indexeddb-unavailable` = "indexeddb-unavailable".asInstanceOf[`indexeddb-unavailable`]
  
  @js.native
  sealed trait `interop-component-reg-failed`
    extends StObject
       with AnalyticsError
  inline def `interop-component-reg-failed`: `interop-component-reg-failed` = "interop-component-reg-failed".asInstanceOf[`interop-component-reg-failed`]
  
  @js.native
  sealed trait `invalid-analytics-context`
    extends StObject
       with AnalyticsError
  inline def `invalid-analytics-context`: `invalid-analytics-context` = "invalid-analytics-context".asInstanceOf[`invalid-analytics-context`]
  
  @js.native
  sealed trait `no-api-key`
    extends StObject
       with AnalyticsError
  inline def `no-api-key`: `no-api-key` = "no-api-key".asInstanceOf[`no-api-key`]
  
  @js.native
  sealed trait `no-app-id`
    extends StObject
       with AnalyticsError
  inline def `no-app-id`: `no-app-id` = "no-app-id".asInstanceOf[`no-app-id`]
  
  @js.native
  sealed trait set extends StObject
  inline def set: set = "set".asInstanceOf[set]
}
