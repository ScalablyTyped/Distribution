package typings
package gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs.androidmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SoftwareInfo extends js.Object {
  /** Android build Id string meant for displaying to the user, e.g. shamu-userdebug 6.0.1 MOB30I 2756745 dev-keys. */
  var androidBuildNumber: js.UndefOr[java.lang.String] = js.undefined
  /** Build time. */
  var androidBuildTime: js.UndefOr[java.lang.String] = js.undefined
  /** The user visible Android version string, e.g. 6.0.1. */
  var androidVersion: js.UndefOr[java.lang.String] = js.undefined
  /** The system bootloader version number, e.g. 0.6.7. */
  var bootloaderVersion: js.UndefOr[java.lang.String] = js.undefined
  /** Kernel version, e.g. 2.6.32.9-g103d848. */
  var deviceKernelVersion: js.UndefOr[java.lang.String] = js.undefined
  /** Security patch level, e.g. 2016-05-01. */
  var securityPatchLevel: js.UndefOr[java.lang.String] = js.undefined
}

