package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about device software.
  */
@js.native
trait Schema$SoftwareInfo extends js.Object {
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

object Schema$SoftwareInfo {
  @scala.inline
  def apply(
    androidBuildNumber: String = null,
    androidBuildTime: String = null,
    androidDevicePolicyVersionCode: Int | Double = null,
    androidDevicePolicyVersionName: String = null,
    androidVersion: String = null,
    bootloaderVersion: String = null,
    deviceBuildSignature: String = null,
    deviceKernelVersion: String = null,
    primaryLanguageCode: String = null,
    securityPatchLevel: String = null
  ): Schema$SoftwareInfo = {
    val __obj = js.Dynamic.literal()
    if (androidBuildNumber != null) __obj.updateDynamic("androidBuildNumber")(androidBuildNumber.asInstanceOf[js.Any])
    if (androidBuildTime != null) __obj.updateDynamic("androidBuildTime")(androidBuildTime.asInstanceOf[js.Any])
    if (androidDevicePolicyVersionCode != null) __obj.updateDynamic("androidDevicePolicyVersionCode")(androidDevicePolicyVersionCode.asInstanceOf[js.Any])
    if (androidDevicePolicyVersionName != null) __obj.updateDynamic("androidDevicePolicyVersionName")(androidDevicePolicyVersionName.asInstanceOf[js.Any])
    if (androidVersion != null) __obj.updateDynamic("androidVersion")(androidVersion.asInstanceOf[js.Any])
    if (bootloaderVersion != null) __obj.updateDynamic("bootloaderVersion")(bootloaderVersion.asInstanceOf[js.Any])
    if (deviceBuildSignature != null) __obj.updateDynamic("deviceBuildSignature")(deviceBuildSignature.asInstanceOf[js.Any])
    if (deviceKernelVersion != null) __obj.updateDynamic("deviceKernelVersion")(deviceKernelVersion.asInstanceOf[js.Any])
    if (primaryLanguageCode != null) __obj.updateDynamic("primaryLanguageCode")(primaryLanguageCode.asInstanceOf[js.Any])
    if (securityPatchLevel != null) __obj.updateDynamic("securityPatchLevel")(securityPatchLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SoftwareInfo]
  }
}

