package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about security related device settings on device.
  */
trait SchemaDeviceSettings extends StObject {
  
  /**
    * Whether ADB (https://developer.android.com/studio/command-line/adb.html)
    * is enabled on the device.
    */
  var adbEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether developer mode is enabled on the device.
    */
  var developmentSettingsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Encryption status from DevicePolicyManager.
    */
  var encryptionStatus: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the device is secured with PIN/password.
    */
  var isDeviceSecure: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the storage encryption is enabled.
    */
  var isEncrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether installing apps from unknown sources is enabled.
    */
  var unknownSourcesEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether Verify Apps (Google Play Protect
    * (https://support.google.com/googleplay/answer/2812853)) is enabled on the
    * device.
    */
  var verifyAppsEnabled: js.UndefOr[Boolean] = js.undefined
}
object SchemaDeviceSettings {
  
  @scala.inline
  def apply(): SchemaDeviceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceSettings]
  }
  
  @scala.inline
  implicit class SchemaDeviceSettingsMutableBuilder[Self <: SchemaDeviceSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdbEnabled(value: Boolean): Self = StObject.set(x, "adbEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdbEnabledUndefined: Self = StObject.set(x, "adbEnabled", js.undefined)
    
    @scala.inline
    def setDevelopmentSettingsEnabled(value: Boolean): Self = StObject.set(x, "developmentSettingsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevelopmentSettingsEnabledUndefined: Self = StObject.set(x, "developmentSettingsEnabled", js.undefined)
    
    @scala.inline
    def setEncryptionStatus(value: String): Self = StObject.set(x, "encryptionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionStatusUndefined: Self = StObject.set(x, "encryptionStatus", js.undefined)
    
    @scala.inline
    def setIsDeviceSecure(value: Boolean): Self = StObject.set(x, "isDeviceSecure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDeviceSecureUndefined: Self = StObject.set(x, "isDeviceSecure", js.undefined)
    
    @scala.inline
    def setIsEncrypted(value: Boolean): Self = StObject.set(x, "isEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEncryptedUndefined: Self = StObject.set(x, "isEncrypted", js.undefined)
    
    @scala.inline
    def setUnknownSourcesEnabled(value: Boolean): Self = StObject.set(x, "unknownSourcesEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknownSourcesEnabledUndefined: Self = StObject.set(x, "unknownSourcesEnabled", js.undefined)
    
    @scala.inline
    def setVerifyAppsEnabled(value: Boolean): Self = StObject.set(x, "verifyAppsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifyAppsEnabledUndefined: Self = StObject.set(x, "verifyAppsEnabled", js.undefined)
  }
}
