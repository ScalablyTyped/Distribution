package typings.atFirebaseAnalytics

import typings.atFirebaseAnalytics.distSrcErrorsMod.AnalyticsError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atFirebaseAnalyticsStrings {
  @js.native
  sealed trait `already-exists` extends AnalyticsError
  
  @js.native
  sealed trait `already-initialized` extends AnalyticsError
  
  @js.native
  sealed trait config extends js.Object
  
  @js.native
  sealed trait event extends js.Object
  
  @js.native
  sealed trait firebase_id extends js.Object
  
  @js.native
  sealed trait `https://wwwDOTgoogletagmanagerDOTcom/gtag/js` extends js.Object
  
  @js.native
  sealed trait `interop-component-reg-failed` extends AnalyticsError
  
  @js.native
  sealed trait measurementId extends js.Object
  
  @js.native
  sealed trait `no-ga-id` extends AnalyticsError
  
  @js.native
  sealed trait origin extends js.Object
  
  @js.native
  sealed trait set extends js.Object
  
  @scala.inline
  def `already-exists`: `already-exists` = "already-exists".asInstanceOf[`already-exists`]
  @scala.inline
  def `already-initialized`: `already-initialized` = "already-initialized".asInstanceOf[`already-initialized`]
  @scala.inline
  def config: config = "config".asInstanceOf[config]
  @scala.inline
  def event: event = "event".asInstanceOf[event]
  @scala.inline
  def firebase_id: firebase_id = "firebase_id".asInstanceOf[firebase_id]
  @scala.inline
  def `https://wwwDOTgoogletagmanagerDOTcom/gtag/js`: `https://wwwDOTgoogletagmanagerDOTcom/gtag/js` = "https://www.googletagmanager.com/gtag/js".asInstanceOf[`https://wwwDOTgoogletagmanagerDOTcom/gtag/js`]
  @scala.inline
  def `interop-component-reg-failed`: `interop-component-reg-failed` = "interop-component-reg-failed".asInstanceOf[`interop-component-reg-failed`]
  @scala.inline
  def measurementId: measurementId = "measurementId".asInstanceOf[measurementId]
  @scala.inline
  def `no-ga-id`: `no-ga-id` = "no-ga-id".asInstanceOf[`no-ga-id`]
  @scala.inline
  def origin: origin = "origin".asInstanceOf[origin]
  @scala.inline
  def set: set = "set".asInstanceOf[set]
}

