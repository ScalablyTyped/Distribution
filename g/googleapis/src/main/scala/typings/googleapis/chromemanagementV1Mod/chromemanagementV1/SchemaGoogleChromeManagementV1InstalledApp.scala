package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1InstalledApp extends StObject {
  
  /**
    * Output only. Unique identifier of the app. For Chrome apps and extensions, the 32-character id (e.g. ehoadneljpdggcbbknedodolkkjodefl). For Android apps, the package name (e.g. com.evernote).
    */
  var appId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. How the app was installed.
    */
  var appInstallType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Source of the installed app.
    */
  var appSource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Type of the app.
    */
  var appType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Count of browser devices with this app installed.
    */
  var browserDeviceCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Description of the installed app.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Whether the app is disabled.
    */
  var disabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Name of the installed app.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Homepage uri of the installed app.
    */
  var homepageUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Count of ChromeOS users with this app installed.
    */
  var osUserCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Permissions of the installed app.
    */
  var permissions: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1InstalledApp {
  
  inline def apply(): SchemaGoogleChromeManagementV1InstalledApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1InstalledApp]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1InstalledApp](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdNull: Self = StObject.set(x, "appId", null)
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setAppInstallType(value: String): Self = StObject.set(x, "appInstallType", value.asInstanceOf[js.Any])
    
    inline def setAppInstallTypeNull: Self = StObject.set(x, "appInstallType", null)
    
    inline def setAppInstallTypeUndefined: Self = StObject.set(x, "appInstallType", js.undefined)
    
    inline def setAppSource(value: String): Self = StObject.set(x, "appSource", value.asInstanceOf[js.Any])
    
    inline def setAppSourceNull: Self = StObject.set(x, "appSource", null)
    
    inline def setAppSourceUndefined: Self = StObject.set(x, "appSource", js.undefined)
    
    inline def setAppType(value: String): Self = StObject.set(x, "appType", value.asInstanceOf[js.Any])
    
    inline def setAppTypeNull: Self = StObject.set(x, "appType", null)
    
    inline def setAppTypeUndefined: Self = StObject.set(x, "appType", js.undefined)
    
    inline def setBrowserDeviceCount(value: String): Self = StObject.set(x, "browserDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setBrowserDeviceCountNull: Self = StObject.set(x, "browserDeviceCount", null)
    
    inline def setBrowserDeviceCountUndefined: Self = StObject.set(x, "browserDeviceCount", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledNull: Self = StObject.set(x, "disabled", null)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setHomepageUri(value: String): Self = StObject.set(x, "homepageUri", value.asInstanceOf[js.Any])
    
    inline def setHomepageUriNull: Self = StObject.set(x, "homepageUri", null)
    
    inline def setHomepageUriUndefined: Self = StObject.set(x, "homepageUri", js.undefined)
    
    inline def setOsUserCount(value: String): Self = StObject.set(x, "osUserCount", value.asInstanceOf[js.Any])
    
    inline def setOsUserCountNull: Self = StObject.set(x, "osUserCount", null)
    
    inline def setOsUserCountUndefined: Self = StObject.set(x, "osUserCount", js.undefined)
    
    inline def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsNull: Self = StObject.set(x, "permissions", null)
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value*))
  }
}
