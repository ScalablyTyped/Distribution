package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about device software.
  */
@js.native
trait SchemaSoftwareInfo extends js.Object {
  /**
    * Android build ID string meant for displaying to the user. For example,
    * shamu-userdebug 6.0.1 MOB30I 2756745 dev-keys.
    */
  var androidBuildNumber: js.UndefOr[String] = js.native
  /**
    * Build time.
    */
  var androidBuildTime: js.UndefOr[String] = js.native
  /**
    * The Android Device Policy app version code.
    */
  var androidDevicePolicyVersionCode: js.UndefOr[Double] = js.native
  /**
    * The Android Device Policy app version as displayed to the user.
    */
  var androidDevicePolicyVersionName: js.UndefOr[String] = js.native
  /**
    * The user-visible Android version string. For example, 6.0.1.
    */
  var androidVersion: js.UndefOr[String] = js.native
  /**
    * The system bootloader version number, e.g. 0.6.7.
    */
  var bootloaderVersion: js.UndefOr[String] = js.native
  /**
    * SHA-256 hash of android.content.pm.Signature
    * (https://developer.android.com/reference/android/content/pm/Signature.html)
    * associated with the system package, which can be used to verify that the
    * system build hasn&#39;t been modified.
    */
  var deviceBuildSignature: js.UndefOr[String] = js.native
  /**
    * Kernel version, for example, 2.6.32.9-g103d848.
    */
  var deviceKernelVersion: js.UndefOr[String] = js.native
  /**
    * An IETF BCP 47 language code for the primary locale on the device.
    */
  var primaryLanguageCode: js.UndefOr[String] = js.native
  /**
    * Security patch level, e.g. 2016-05-01.
    */
  var securityPatchLevel: js.UndefOr[String] = js.native
}

object SchemaSoftwareInfo {
  @scala.inline
  def apply(): SchemaSoftwareInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSoftwareInfo]
  }
  @scala.inline
  implicit class SchemaSoftwareInfoOps[Self <: SchemaSoftwareInfo] (val x: Self) extends AnyVal {
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
    def setAndroidDevicePolicyVersionCode(value: Double): Self = this.set("androidDevicePolicyVersionCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidDevicePolicyVersionCode: Self = this.set("androidDevicePolicyVersionCode", js.undefined)
    @scala.inline
    def setAndroidDevicePolicyVersionName(value: String): Self = this.set("androidDevicePolicyVersionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidDevicePolicyVersionName: Self = this.set("androidDevicePolicyVersionName", js.undefined)
    @scala.inline
    def setAndroidVersion(value: String): Self = this.set("androidVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidVersion: Self = this.set("androidVersion", js.undefined)
    @scala.inline
    def setBootloaderVersion(value: String): Self = this.set("bootloaderVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBootloaderVersion: Self = this.set("bootloaderVersion", js.undefined)
    @scala.inline
    def setDeviceBuildSignature(value: String): Self = this.set("deviceBuildSignature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceBuildSignature: Self = this.set("deviceBuildSignature", js.undefined)
    @scala.inline
    def setDeviceKernelVersion(value: String): Self = this.set("deviceKernelVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceKernelVersion: Self = this.set("deviceKernelVersion", js.undefined)
    @scala.inline
    def setPrimaryLanguageCode(value: String): Self = this.set("primaryLanguageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryLanguageCode: Self = this.set("primaryLanguageCode", js.undefined)
    @scala.inline
    def setSecurityPatchLevel(value: String): Self = this.set("securityPatchLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityPatchLevel: Self = this.set("securityPatchLevel", js.undefined)
  }
  
}

