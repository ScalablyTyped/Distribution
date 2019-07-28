package typings.googleDotAnalytics.UniversalAnalyticsNs

import typings.googleDotAnalytics.Anon_EventAction
import typings.googleDotAnalytics.Anon_EventActionEventCategory
import typings.googleDotAnalytics.Anon_SocialAction
import typings.googleDotAnalytics.Anon_TimingCategory
import typings.googleDotAnalytics.googleDotAnalyticsStrings.create
import typings.googleDotAnalytics.googleDotAnalyticsStrings.event
import typings.googleDotAnalytics.googleDotAnalyticsStrings.pageview
import typings.googleDotAnalytics.googleDotAnalyticsStrings.provide
import typings.googleDotAnalytics.googleDotAnalyticsStrings.remove
import typings.googleDotAnalytics.googleDotAnalyticsStrings.require
import typings.googleDotAnalytics.googleDotAnalyticsStrings.send
import typings.googleDotAnalytics.googleDotAnalyticsStrings.social
import typings.googleDotAnalytics.googleDotAnalyticsStrings.timing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ga extends js.Object {
  var l: Double = js.native
  var q: js.Array[_] = js.native
  def apply(command: String, fields: js.Any*): Unit = js.native
  def apply(command: String, hitType: HitType, fields: js.Any*): Unit = js.native
  def apply(command: create, trackingId: String): Unit = js.native
  def apply(command: create, trackingId: String, cookieDomain: String): Unit = js.native
  def apply(command: create, trackingId: String, cookieDomain: String, name: String): Unit = js.native
  def apply(
    command: create,
    trackingId: String,
    cookieDomain: String,
    name: String,
    fieldsObject: FieldsObject
  ): Unit = js.native
  def apply(
    command: provide,
    pluginName: String,
    pluginConstructor: js.Function2[
      /* tracker */ typings.googleDotAnalytics.UniversalAnalyticsNs.Tracker, 
      /* pluginOptions */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Unit = js.native
  def apply(command: remove): Unit = js.native
  def apply(command: require, pluginName: String): Unit = js.native
  def apply(command: require, pluginName: String, pluginOptions: js.Any): Unit = js.native
  def apply(command: send, fieldsObject: Anon_EventActionEventCategory): Unit = js.native
  def apply(command: send, fieldsObject: FieldsObject): Unit = js.native
  def apply(command: send, hitType: event, eventCategory: String, eventAction: String): Unit = js.native
  def apply(command: send, hitType: event, eventCategory: String, eventAction: String, eventLabel: String): Unit = js.native
  def apply(
    command: send,
    hitType: event,
    eventCategory: String,
    eventAction: String,
    eventLabel: String,
    eventValue: Double
  ): Unit = js.native
  def apply(
    command: send,
    hitType: event,
    eventCategory: String,
    eventAction: String,
    eventLabel: String,
    eventValue: Double,
    fieldsObject: FieldsObject
  ): Unit = js.native
  def apply(command: send, hitType: event, fieldsObject: Anon_EventAction): Unit = js.native
  def apply(command: send, hitType: pageview, page: String): Unit = js.native
  def apply(command: send, hitType: social, fieldsObject: Anon_SocialAction): Unit = js.native
  def apply(command: send, hitType: social, socialNetwork: String, socialAction: String, socialTarget: String): Unit = js.native
  def apply(command: send, hitType: timing, fieldsObject: Anon_TimingCategory): Unit = js.native
  def apply(command: send, hitType: timing, timingCategory: String, timingVar: String, timingValue: Double): Unit = js.native
  def apply(
    readyCallback: js.Function1[
      /* defaultTracker */ js.UndefOr[typings.googleDotAnalytics.UniversalAnalyticsNs.Tracker], 
      Unit
    ]
  ): Unit = js.native
  def create(trackingId: String): typings.googleDotAnalytics.UniversalAnalyticsNs.Tracker = js.native
  def create(trackingId: String, cookieDomain: String): typings.googleDotAnalytics.UniversalAnalyticsNs.Tracker = js.native
  def create(trackingId: String, cookieDomain: String, fieldsObject: FieldsObject): typings.googleDotAnalytics.UniversalAnalyticsNs.Tracker = js.native
  def create(trackingId: String, cookieDomain: String, name: String): typings.googleDotAnalytics.UniversalAnalyticsNs.Tracker = js.native
  def create(trackingId: String, cookieDomain: String, name: String, fieldsObject: FieldsObject): typings.googleDotAnalytics.UniversalAnalyticsNs.Tracker = js.native
  def create(trackingId: String, fieldsObject: FieldsObject): typings.googleDotAnalytics.UniversalAnalyticsNs.Tracker = js.native
  def getAll(): js.Array[typings.googleDotAnalytics.UniversalAnalyticsNs.Tracker] = js.native
  def getByName(name: String): typings.googleDotAnalytics.UniversalAnalyticsNs.Tracker = js.native
  def remove(name: String): Unit = js.native
}

