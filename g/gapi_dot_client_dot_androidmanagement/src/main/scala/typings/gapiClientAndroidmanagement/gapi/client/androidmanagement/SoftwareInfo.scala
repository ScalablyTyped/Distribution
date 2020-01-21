package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SoftwareInfo extends js.Object {
  /** Android build Id string meant for displaying to the user, e.g. shamu-userdebug 6.0.1 MOB30I 2756745 dev-keys. */
  var androidBuildNumber: js.UndefOr[String] = js.undefined
  /** Build time. */
  var androidBuildTime: js.UndefOr[String] = js.undefined
  /** The user visible Android version string, e.g. 6.0.1. */
  var androidVersion: js.UndefOr[String] = js.undefined
  /** The system bootloader version number, e.g. 0.6.7. */
  var bootloaderVersion: js.UndefOr[String] = js.undefined
  /** Kernel version, e.g. 2.6.32.9-g103d848. */
  var deviceKernelVersion: js.UndefOr[String] = js.undefined
  /** Security patch level, e.g. 2016-05-01. */
  var securityPatchLevel: js.UndefOr[String] = js.undefined
}

object SoftwareInfo {
  @scala.inline
  def apply(
    androidBuildNumber: String = null,
    androidBuildTime: String = null,
    androidVersion: String = null,
    bootloaderVersion: String = null,
    deviceKernelVersion: String = null,
    securityPatchLevel: String = null
  ): SoftwareInfo = {
    val __obj = js.Dynamic.literal()
    if (androidBuildNumber != null) __obj.updateDynamic("androidBuildNumber")(androidBuildNumber.asInstanceOf[js.Any])
    if (androidBuildTime != null) __obj.updateDynamic("androidBuildTime")(androidBuildTime.asInstanceOf[js.Any])
    if (androidVersion != null) __obj.updateDynamic("androidVersion")(androidVersion.asInstanceOf[js.Any])
    if (bootloaderVersion != null) __obj.updateDynamic("bootloaderVersion")(bootloaderVersion.asInstanceOf[js.Any])
    if (deviceKernelVersion != null) __obj.updateDynamic("deviceKernelVersion")(deviceKernelVersion.asInstanceOf[js.Any])
    if (securityPatchLevel != null) __obj.updateDynamic("securityPatchLevel")(securityPatchLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoftwareInfo]
  }
}

