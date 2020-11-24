package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaDeviceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceSettings]
  }
  
  @scala.inline
  implicit class SchemaDeviceSettingsOps[Self <: SchemaDeviceSettings] (val x: Self) extends AnyVal {
    
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
    def setAdbEnabled(value: Boolean): Self = this.set("adbEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdbEnabled: Self = this.set("adbEnabled", js.undefined)
    
    @scala.inline
    def setDevelopmentSettingsEnabled(value: Boolean): Self = this.set("developmentSettingsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevelopmentSettingsEnabled: Self = this.set("developmentSettingsEnabled", js.undefined)
    
    @scala.inline
    def setEncryptionStatus(value: String): Self = this.set("encryptionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionStatus: Self = this.set("encryptionStatus", js.undefined)
    
    @scala.inline
    def setIsDeviceSecure(value: Boolean): Self = this.set("isDeviceSecure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDeviceSecure: Self = this.set("isDeviceSecure", js.undefined)
    
    @scala.inline
    def setIsEncrypted(value: Boolean): Self = this.set("isEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEncrypted: Self = this.set("isEncrypted", js.undefined)
    
    @scala.inline
    def setUnknownSourcesEnabled(value: Boolean): Self = this.set("unknownSourcesEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnknownSourcesEnabled: Self = this.set("unknownSourcesEnabled", js.undefined)
    
    @scala.inline
    def setVerifyAppsEnabled(value: Boolean): Self = this.set("verifyAppsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerifyAppsEnabled: Self = this.set("verifyAppsEnabled", js.undefined)
  }
}
