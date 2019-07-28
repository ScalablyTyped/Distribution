package typings.expo.expoMod

import typings.expo.Anon_Manifest
import typings.expo.Anon_Remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Util")
@js.native
object UtilNs extends js.Object {
  /** _Android only_. Invokes a callback when a new version of your app is successfully downloaded in the background. */
  def addNewVersionListenerExperimental(listener: js.Function1[/* event */ Anon_Manifest, Unit]): Anon_Remove = js.native
  /** Returns the current device country code. */
  def getCurrentDeviceCountryAsync(): js.Promise[String] = js.native
  /** Returns the current device locale as a string. */
  def getCurrentLocaleAsync(): js.Promise[String] = js.native
  /** Returns the current device time zone name. */
  def getCurrentTimeZoneAsync(): js.Promise[String] = js.native
  /** Reloads the current experience. This will fetch and load the newest available JavaScript supported by the device’s Expo environment. This is useful for triggering an update of your experience if you have published a new version. */
  def reload(): Unit = js.native
}

