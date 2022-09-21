package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdvancedSecurityOverrides extends StObject {
  
  /**
    * Controls Common Criteria Mode—security standards defined in the Common Criteria for Information Technology Security Evaluation (https://www.commoncriteriaportal.org/) (CC). Enabling Common Criteria Mode increases certain security components on a device, including AES-GCM encryption of Bluetooth Long Term Keys, and Wi-Fi configuration stores.Warning: Common Criteria Mode enforces a strict security model typically only required for IT products used in national security systems and other highly sensitive organizations. Standard device use may be affected. Only enabled if required.
    */
  var commonCriteriaMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Controls access to developer settings: developer options and safe boot. Replaces safeBootDisabled (deprecated) and debuggingFeaturesAllowed (deprecated).
    */
  var developerSettings: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether Google Play Protect verification (https://support.google.com/accounts/answer/2812853) is enforced. Replaces ensureVerifyAppsEnabled (deprecated).
    */
  var googlePlayProtectVerifyApps: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Personal apps that can read work profile notifications using a NotificationListenerService (https://developer.android.com/reference/android/service/notification/NotificationListenerService). By default, no personal apps (aside from system apps) can read work notifications. Each value in the list must be a package name.
    */
  var personalAppsThatCanReadWorkNotifications: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The policy for untrusted apps (apps from unknown sources) enforced on the device. Replaces install_unknown_sources_allowed (deprecated).
    */
  var untrustedAppsPolicy: js.UndefOr[String | Null] = js.undefined
}
object SchemaAdvancedSecurityOverrides {
  
  inline def apply(): SchemaAdvancedSecurityOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdvancedSecurityOverrides]
  }
  
  extension [Self <: SchemaAdvancedSecurityOverrides](x: Self) {
    
    inline def setCommonCriteriaMode(value: String): Self = StObject.set(x, "commonCriteriaMode", value.asInstanceOf[js.Any])
    
    inline def setCommonCriteriaModeNull: Self = StObject.set(x, "commonCriteriaMode", null)
    
    inline def setCommonCriteriaModeUndefined: Self = StObject.set(x, "commonCriteriaMode", js.undefined)
    
    inline def setDeveloperSettings(value: String): Self = StObject.set(x, "developerSettings", value.asInstanceOf[js.Any])
    
    inline def setDeveloperSettingsNull: Self = StObject.set(x, "developerSettings", null)
    
    inline def setDeveloperSettingsUndefined: Self = StObject.set(x, "developerSettings", js.undefined)
    
    inline def setGooglePlayProtectVerifyApps(value: String): Self = StObject.set(x, "googlePlayProtectVerifyApps", value.asInstanceOf[js.Any])
    
    inline def setGooglePlayProtectVerifyAppsNull: Self = StObject.set(x, "googlePlayProtectVerifyApps", null)
    
    inline def setGooglePlayProtectVerifyAppsUndefined: Self = StObject.set(x, "googlePlayProtectVerifyApps", js.undefined)
    
    inline def setPersonalAppsThatCanReadWorkNotifications(value: js.Array[String]): Self = StObject.set(x, "personalAppsThatCanReadWorkNotifications", value.asInstanceOf[js.Any])
    
    inline def setPersonalAppsThatCanReadWorkNotificationsNull: Self = StObject.set(x, "personalAppsThatCanReadWorkNotifications", null)
    
    inline def setPersonalAppsThatCanReadWorkNotificationsUndefined: Self = StObject.set(x, "personalAppsThatCanReadWorkNotifications", js.undefined)
    
    inline def setPersonalAppsThatCanReadWorkNotificationsVarargs(value: String*): Self = StObject.set(x, "personalAppsThatCanReadWorkNotifications", js.Array(value*))
    
    inline def setUntrustedAppsPolicy(value: String): Self = StObject.set(x, "untrustedAppsPolicy", value.asInstanceOf[js.Any])
    
    inline def setUntrustedAppsPolicyNull: Self = StObject.set(x, "untrustedAppsPolicy", null)
    
    inline def setUntrustedAppsPolicyUndefined: Self = StObject.set(x, "untrustedAppsPolicy", js.undefined)
  }
}
