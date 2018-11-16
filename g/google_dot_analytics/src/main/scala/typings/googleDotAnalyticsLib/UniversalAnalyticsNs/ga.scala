package typings
package googleDotAnalyticsLib.UniversalAnalyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ga extends js.Object {
  var l: scala.Double = js.native
  var q: js.Array[_] = js.native
  def apply(command: googleDotAnalyticsLib.googleDotAnalyticsLibStrings.create, trackingId: java.lang.String): scala.Unit = js.native
  def apply(
    command: googleDotAnalyticsLib.googleDotAnalyticsLibStrings.create,
    trackingId: java.lang.String,
    cookieDomain: java.lang.String
  ): scala.Unit = js.native
  def apply(
    command: googleDotAnalyticsLib.googleDotAnalyticsLibStrings.create,
    trackingId: java.lang.String,
    cookieDomain: java.lang.String,
    name: java.lang.String
  ): scala.Unit = js.native
  def apply(
    command: googleDotAnalyticsLib.googleDotAnalyticsLibStrings.create,
    trackingId: java.lang.String,
    cookieDomain: java.lang.String,
    name: java.lang.String,
    fieldsObject: FieldsObject
  ): scala.Unit = js.native
  def apply(
    command: googleDotAnalyticsLib.googleDotAnalyticsLibStrings.provide,
    pluginName: java.lang.String,
    pluginConstructor: js.Function2[/* tracker */ Tracker, /* pluginOptions */ js.UndefOr[js.Object], scala.Unit]
  ): scala.Unit = js.native
  def apply(command: googleDotAnalyticsLib.googleDotAnalyticsLibStrings.remove): scala.Unit = js.native
  def apply(command: googleDotAnalyticsLib.googleDotAnalyticsLibStrings.require, pluginName: java.lang.String): scala.Unit = js.native
  def apply(
    command: googleDotAnalyticsLib.googleDotAnalyticsLibStrings.require,
    pluginName: java.lang.String,
    pluginOptions: js.Any
  ): scala.Unit = js.native
  def apply(
    command: googleDotAnalyticsLib.googleDotAnalyticsLibStrings.send,
    fieldsObject: googleDotAnalyticsLib.Anon_EventCategoryEventAction
  ): scala.Unit = js.native
  def apply(command: googleDotAnalyticsLib.googleDotAnalyticsLibStrings.send, fieldsObject: FieldsObject): scala.Unit = js.native
  def apply(
    command: googleDotAnalyticsLib.googleDotAnalyticsLibStrings.send,
    hitType: googleDotAnalyticsLib.googleDotAnalyticsLibStrings.event,
    eventCategory: java.lang.String,
    eventAction: java.lang.String
  ): scala.Unit = js.native
  def apply(
    command: googleDotAnalyticsLib.googleDotAnalyticsLibStrings.send,
    hitType: googleDotAnalyticsLib.googleDotAnalyticsLibStrings.event,
    eventCategory: java.lang.String,
    eventAction: java.lang.String,
    eventLabel: java.lang.String
  ): scala.Unit = js.native
  def apply(
    command: googleDotAnalyticsLib.googleDotAnalyticsLibStrings.send,
    hitType: googleDotAnalyticsLib.googleDotAnalyticsLibStrings.event,
    eventCategory: java.lang.String,
    eventAction: java.lang.String,
    eventLabel: java.lang.String,
    eventValue: scala.Double
  ): scala.Unit = js.native
  def apply(
    command: googleDotAnalyticsLib.googleDotAnalyticsLibStrings.send,
    hitType: googleDotAnalyticsLib.googleDotAnalyticsLibStrings.event,
    eventCategory: java.lang.String,
    eventAction: java.lang.String,
    eventLabel: java.lang.String,
    eventValue: scala.Double,
    fieldsObject: FieldsObject
  ): scala.Unit = js.native
  def apply(
    command: googleDotAnalyticsLib.googleDotAnalyticsLibStrings.send,
    hitType: googleDotAnalyticsLib.googleDotAnalyticsLibStrings.event,
    fieldsObject: googleDotAnalyticsLib.Anon_EventCategory
  ): scala.Unit = js.native
  def apply(
    command: googleDotAnalyticsLib.googleDotAnalyticsLibStrings.send,
    hitType: googleDotAnalyticsLib.googleDotAnalyticsLibStrings.pageview,
    page: java.lang.String
  ): scala.Unit = js.native
  def apply(
    command: googleDotAnalyticsLib.googleDotAnalyticsLibStrings.send,
    hitType: googleDotAnalyticsLib.googleDotAnalyticsLibStrings.social,
    fieldsObject: googleDotAnalyticsLib.Anon_SocialTarget
  ): scala.Unit = js.native
  def apply(
    command: googleDotAnalyticsLib.googleDotAnalyticsLibStrings.send,
    hitType: googleDotAnalyticsLib.googleDotAnalyticsLibStrings.social,
    socialNetwork: java.lang.String,
    socialAction: java.lang.String,
    socialTarget: java.lang.String
  ): scala.Unit = js.native
  def apply(
    command: googleDotAnalyticsLib.googleDotAnalyticsLibStrings.send,
    hitType: googleDotAnalyticsLib.googleDotAnalyticsLibStrings.timing,
    fieldsObject: googleDotAnalyticsLib.Anon_TimingVar
  ): scala.Unit = js.native
  def apply(
    command: googleDotAnalyticsLib.googleDotAnalyticsLibStrings.send,
    hitType: googleDotAnalyticsLib.googleDotAnalyticsLibStrings.timing,
    timingCategory: java.lang.String,
    timingVar: java.lang.String,
    timingValue: scala.Double
  ): scala.Unit = js.native
  def apply(command: java.lang.String, fields: js.Any*): scala.Unit = js.native
  def apply(command: java.lang.String, hitType: HitType, fields: js.Any*): scala.Unit = js.native
  def apply(readyCallback: js.Function1[/* defaultTracker */ js.UndefOr[Tracker], scala.Unit]): scala.Unit = js.native
  def create(trackingId: java.lang.String): Tracker = js.native
  def create(trackingId: java.lang.String, cookieDomain: java.lang.String): Tracker = js.native
  def create(trackingId: java.lang.String, cookieDomain: java.lang.String, fieldsObject: FieldsObject): Tracker = js.native
  def create(trackingId: java.lang.String, cookieDomain: java.lang.String, name: java.lang.String): Tracker = js.native
  def create(
    trackingId: java.lang.String,
    cookieDomain: java.lang.String,
    name: java.lang.String,
    fieldsObject: FieldsObject
  ): Tracker = js.native
  def create(trackingId: java.lang.String, fieldsObject: FieldsObject): Tracker = js.native
  def getAll(): js.Array[Tracker] = js.native
  def getByName(name: java.lang.String): Tracker = js.native
  def remove(name: java.lang.String): scala.Unit = js.native
}

