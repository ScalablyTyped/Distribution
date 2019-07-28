package typings.expo.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Amplitude")
@js.native
object AmplitudeNs extends js.Object {
  /** Clear properties set by `setUserProperties()`. */
  def clearUserProperties(): Unit = js.native
  /** Initializes Amplitude with your Amplitude API key. */
  def initialize(apiKey: String): Unit = js.native
  /** Log an event to Amplitude. */
  def logEvent(eventName: String): Unit = js.native
  /** Log an event to Amplitude with custom properties. */
  def logEventWithProperties(eventName: String, /** A map of custom properties. */
  properties: HashMap): Unit = js.native
  /** Add the current user to a group. */
  def setGroup(
    /** The group name, e.g. `'sports'`. */
  groupType: String,
    /** An array of group names, e.g. `['tennis', 'soccer']`. */
  groupNames: js.Array[String]
  ): Unit = js.native
  /** Assign a user ID to the current user. If you don’t have a system for user IDs you don’t need to call this. */
  def setUserId(userId: String): Unit = js.native
  /** Set properties for the current user. */
  def setUserProperties(userProperties: HashMap): Unit = js.native
}

