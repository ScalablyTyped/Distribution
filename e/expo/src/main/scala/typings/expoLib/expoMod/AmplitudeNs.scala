package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Amplitude")
@js.native
object AmplitudeNs extends js.Object {
  /** Clear properties set by `setUserProperties()`. */
  def clearUserProperties(): scala.Unit = js.native
  /** Initializes Amplitude with your Amplitude API key. */
  def initialize(apiKey: java.lang.String): scala.Unit = js.native
  /** Log an event to Amplitude. */
  def logEvent(eventName: java.lang.String): scala.Unit = js.native
  /** Log an event to Amplitude with custom properties. */
  def logEventWithProperties(
    eventName: java.lang.String,
    /** A map of custom properties. */
  properties: expoLib.expoMod.HashMap
  ): scala.Unit = js.native
  /** Add the current user to a group. */
  def setGroup(
    /** The group name, e.g. `'sports'`. */
  groupType: java.lang.String,
    /** An array of group names, e.g. `['tennis', 'soccer']`. */
  groupNames: js.Array[java.lang.String]
  ): scala.Unit = js.native
  /** Assign a user ID to the current user. If you don’t have a system for user IDs you don’t need to call this. */
  def setUserId(userId: java.lang.String): scala.Unit = js.native
  /** Set properties for the current user. */
  def setUserProperties(userProperties: expoLib.expoMod.HashMap): scala.Unit = js.native
}

