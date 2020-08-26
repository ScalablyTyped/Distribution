package typings.firebaseAnalytics

import typings.firebaseAnalytics.errorsMod.AnalyticsError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object firebaseAnalyticsStrings {
  @js.native
  sealed trait `already-exists` extends AnalyticsError
  
  @js.native
  sealed trait `already-initialized` extends AnalyticsError
  
  @js.native
  sealed trait config extends js.Object
  
  @js.native
  sealed trait `cookies-not-enabled` extends AnalyticsError
  
  @js.native
  sealed trait event extends js.Object
  
  @js.native
  sealed trait `indexedDB-unsupported` extends AnalyticsError
  
  @js.native
  sealed trait `interop-component-reg-failed` extends AnalyticsError
  
  @js.native
  sealed trait `invalid-indexedDB-context` extends AnalyticsError
  
  @js.native
  sealed trait `no-ga-id` extends AnalyticsError
  
  @js.native
  sealed trait set extends js.Object
  
  @scala.inline
  def `already-exists`: `already-exists` = "already-exists".asInstanceOf[`already-exists`]
  @scala.inline
  def `already-initialized`: `already-initialized` = "already-initialized".asInstanceOf[`already-initialized`]
  @scala.inline
  def config: config = "config".asInstanceOf[config]
  @scala.inline
  def `cookies-not-enabled`: `cookies-not-enabled` = "cookies-not-enabled".asInstanceOf[`cookies-not-enabled`]
  @scala.inline
  def event: event = "event".asInstanceOf[event]
  @scala.inline
  def `indexedDB-unsupported`: `indexedDB-unsupported` = "indexedDB-unsupported".asInstanceOf[`indexedDB-unsupported`]
  @scala.inline
  def `interop-component-reg-failed`: `interop-component-reg-failed` = "interop-component-reg-failed".asInstanceOf[`interop-component-reg-failed`]
  @scala.inline
  def `invalid-indexedDB-context`: `invalid-indexedDB-context` = "invalid-indexedDB-context".asInstanceOf[`invalid-indexedDB-context`]
  @scala.inline
  def `no-ga-id`: `no-ga-id` = "no-ga-id".asInstanceOf[`no-ga-id`]
  @scala.inline
  def set: set = "set".asInstanceOf[set]
}

