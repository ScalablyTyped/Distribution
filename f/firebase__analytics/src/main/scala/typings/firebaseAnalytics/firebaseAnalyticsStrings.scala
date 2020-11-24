package typings.firebaseAnalytics

import typings.firebaseAnalytics.errorsMod.AnalyticsError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseAnalyticsStrings {
  
  @scala.inline
  def `already-exists`: `already-exists` = "already-exists".asInstanceOf[`already-exists`]
  
  @scala.inline
  def `already-initialized`: `already-initialized` = "already-initialized".asInstanceOf[`already-initialized`]
  
  @scala.inline
  def config: config = "config".asInstanceOf[config]
  
  @scala.inline
  def `config-fetch-failed`: `config-fetch-failed` = "config-fetch-failed".asInstanceOf[`config-fetch-failed`]
  
  @scala.inline
  def event: event = "event".asInstanceOf[event]
  
  @scala.inline
  def `fetch-throttle`: `fetch-throttle` = "fetch-throttle".asInstanceOf[`fetch-throttle`]
  
  @scala.inline
  def `indexeddb-unavailable`: `indexeddb-unavailable` = "indexeddb-unavailable".asInstanceOf[`indexeddb-unavailable`]
  
  @scala.inline
  def `interop-component-reg-failed`: `interop-component-reg-failed` = "interop-component-reg-failed".asInstanceOf[`interop-component-reg-failed`]
  
  @scala.inline
  def `invalid-analytics-context`: `invalid-analytics-context` = "invalid-analytics-context".asInstanceOf[`invalid-analytics-context`]
  
  @scala.inline
  def `no-api-key`: `no-api-key` = "no-api-key".asInstanceOf[`no-api-key`]
  
  @scala.inline
  def `no-app-id`: `no-app-id` = "no-app-id".asInstanceOf[`no-app-id`]
  
  @scala.inline
  def set: set = "set".asInstanceOf[set]
  
  @js.native
  sealed trait `already-exists` extends AnalyticsError
  
  @js.native
  sealed trait `already-initialized` extends AnalyticsError
  
  @js.native
  sealed trait config extends js.Object
  
  @js.native
  sealed trait `config-fetch-failed` extends AnalyticsError
  
  @js.native
  sealed trait event extends js.Object
  
  @js.native
  sealed trait `fetch-throttle` extends AnalyticsError
  
  @js.native
  sealed trait `indexeddb-unavailable` extends AnalyticsError
  
  @js.native
  sealed trait `interop-component-reg-failed` extends AnalyticsError
  
  @js.native
  sealed trait `invalid-analytics-context` extends AnalyticsError
  
  @js.native
  sealed trait `no-api-key` extends AnalyticsError
  
  @js.native
  sealed trait `no-app-id` extends AnalyticsError
  
  @js.native
  sealed trait set extends js.Object
}
