package typings.firebaseAnalyticsTypes.mod

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAppTypes.mod.FirebaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirebaseAnalytics extends js.Object {
  var app: FirebaseApp = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of official event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  def logEvent(eventName: EventNameString): Unit = js.native
  def logEvent(eventName: EventNameString, eventParams: EventParams): Unit = js.native
  def logEvent(eventName: EventNameString, eventParams: EventParams, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sets whether analytics collection is enabled for this app on this device.
    * window['ga-disable-analyticsId'] = true;
    */
  def setAnalyticsCollectionEnabled(enabled: Boolean): Unit = js.native
  /**
    * Use gtag 'config' command to set 'screen_name'.
    */
  def setCurrentScreen(screenName: String): Unit = js.native
  def setCurrentScreen(screenName: String, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Use gtag 'config' command to set 'user_id'.
    */
  def setUserId(id: String): Unit = js.native
  def setUserId(id: String, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Use gtag 'config' command to set all params specified.
    */
  def setUserProperties(properties: StringDictionary[js.Any]): Unit = js.native
  def setUserProperties(properties: StringDictionary[js.Any], options: AnalyticsCallOptions): Unit = js.native
}

