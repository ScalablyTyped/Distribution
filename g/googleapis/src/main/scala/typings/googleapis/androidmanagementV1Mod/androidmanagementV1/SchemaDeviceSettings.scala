package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about security related device settings on device.
  */
@js.native
trait SchemaDeviceSettings extends js.Object {
  /**
    * Whether ADB (https://developer.android.com/studio/command-line/adb.html)
    * is enabled on the device.
    */
  var adbEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether developer mode is enabled on the device.
    */
  var developmentSettingsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Encryption status from DevicePolicyManager.
    */
  var encryptionStatus: js.UndefOr[String] = js.native
  /**
    * Whether the device is secured with PIN/password.
    */
  var isDeviceSecure: js.UndefOr[Boolean] = js.native
  /**
    * Whether the storage encryption is enabled.
    */
  var isEncrypted: js.UndefOr[Boolean] = js.native
  /**
    * Whether installing apps from unknown sources is enabled.
    */
  var unknownSourcesEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether Verify Apps (Google Play Protect
    * (https://support.google.com/googleplay/answer/2812853)) is enabled on the
    * device.
    */
  var verifyAppsEnabled: js.UndefOr[Boolean] = js.native
}

object SchemaDeviceSettings {
  @scala.inline
  def apply(
    adbEnabled: js.UndefOr[Boolean] = js.undefined,
    developmentSettingsEnabled: js.UndefOr[Boolean] = js.undefined,
    encryptionStatus: String = null,
    isDeviceSecure: js.UndefOr[Boolean] = js.undefined,
    isEncrypted: js.UndefOr[Boolean] = js.undefined,
    unknownSourcesEnabled: js.UndefOr[Boolean] = js.undefined,
    verifyAppsEnabled: js.UndefOr[Boolean] = js.undefined
  ): SchemaDeviceSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adbEnabled)) __obj.updateDynamic("adbEnabled")(adbEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(developmentSettingsEnabled)) __obj.updateDynamic("developmentSettingsEnabled")(developmentSettingsEnabled.get.asInstanceOf[js.Any])
    if (encryptionStatus != null) __obj.updateDynamic("encryptionStatus")(encryptionStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(isDeviceSecure)) __obj.updateDynamic("isDeviceSecure")(isDeviceSecure.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isEncrypted)) __obj.updateDynamic("isEncrypted")(isEncrypted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unknownSourcesEnabled)) __obj.updateDynamic("unknownSourcesEnabled")(unknownSourcesEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verifyAppsEnabled)) __obj.updateDynamic("verifyAppsEnabled")(verifyAppsEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeviceSettings]
  }
}

