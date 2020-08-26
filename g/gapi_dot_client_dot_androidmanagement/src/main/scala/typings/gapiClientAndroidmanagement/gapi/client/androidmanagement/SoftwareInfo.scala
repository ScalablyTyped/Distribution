package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SoftwareInfo extends js.Object {
  /** Android build Id string meant for displaying to the user, e.g. shamu-userdebug 6.0.1 MOB30I 2756745 dev-keys. */
  var androidBuildNumber: js.UndefOr[String] = js.native
  /** Build time. */
  var androidBuildTime: js.UndefOr[String] = js.native
  /** The user visible Android version string, e.g. 6.0.1. */
  var androidVersion: js.UndefOr[String] = js.native
  /** The system bootloader version number, e.g. 0.6.7. */
  var bootloaderVersion: js.UndefOr[String] = js.native
  /** Kernel version, e.g. 2.6.32.9-g103d848. */
  var deviceKernelVersion: js.UndefOr[String] = js.native
  /** Security patch level, e.g. 2016-05-01. */
  var securityPatchLevel: js.UndefOr[String] = js.native
}

object SoftwareInfo {
  @scala.inline
  def apply(): SoftwareInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoftwareInfo]
  }
  @scala.inline
  implicit class SoftwareInfoOps[Self <: SoftwareInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAndroidBuildNumber(value: String): Self = this.set("androidBuildNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidBuildNumber: Self = this.set("androidBuildNumber", js.undefined)
    @scala.inline
    def setAndroidBuildTime(value: String): Self = this.set("androidBuildTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidBuildTime: Self = this.set("androidBuildTime", js.undefined)
    @scala.inline
    def setAndroidVersion(value: String): Self = this.set("androidVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidVersion: Self = this.set("androidVersion", js.undefined)
    @scala.inline
    def setBootloaderVersion(value: String): Self = this.set("bootloaderVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBootloaderVersion: Self = this.set("bootloaderVersion", js.undefined)
    @scala.inline
    def setDeviceKernelVersion(value: String): Self = this.set("deviceKernelVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceKernelVersion: Self = this.set("deviceKernelVersion", js.undefined)
    @scala.inline
    def setSecurityPatchLevel(value: String): Self = this.set("securityPatchLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityPatchLevel: Self = this.set("securityPatchLevel", js.undefined)
  }
  
}

