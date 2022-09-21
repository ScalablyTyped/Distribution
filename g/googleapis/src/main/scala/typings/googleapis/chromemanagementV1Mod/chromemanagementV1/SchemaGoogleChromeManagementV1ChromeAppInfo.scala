package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1ChromeAppInfo extends StObject {
  
  /**
    * Output only. Whether the app or extension is built and maintained by Google. Version-specific field that will only be set when the requested app version is found.
    */
  var googleOwned: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Whether the app or extension is in a published state in the Chrome Web Store.
    */
  var isCwsHosted: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Whether the app is only for Kiosk mode on ChromeOS devices
    */
  var isKioskOnly: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Whether the app or extension is a theme.
    */
  var isTheme: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Whether this app is enabled for Kiosk mode on ChromeOS devices
    */
  var kioskEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. The minimum number of users using this app.
    */
  var minUserCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. Every custom permission requested by the app. Version-specific field that will only be set when the requested app version is found.
    */
  var permissions: js.UndefOr[js.Array[SchemaGoogleChromeManagementV1ChromeAppPermission]] = js.undefined
  
  /**
    * Output only. Every permission giving access to domains or broad host patterns. ( e.g. www.google.com). This includes the matches from content scripts as well as hosts in the permissions node of the manifest. Version-specific field that will only be set when the requested app version is found.
    */
  var siteAccess: js.UndefOr[js.Array[SchemaGoogleChromeManagementV1ChromeAppSiteAccess]] = js.undefined
  
  /**
    * Output only. The app developer has enabled support for their app. Version-specific field that will only be set when the requested app version is found.
    */
  var supportEnabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1ChromeAppInfo {
  
  inline def apply(): SchemaGoogleChromeManagementV1ChromeAppInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1ChromeAppInfo]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1ChromeAppInfo](x: Self) {
    
    inline def setGoogleOwned(value: Boolean): Self = StObject.set(x, "googleOwned", value.asInstanceOf[js.Any])
    
    inline def setGoogleOwnedNull: Self = StObject.set(x, "googleOwned", null)
    
    inline def setGoogleOwnedUndefined: Self = StObject.set(x, "googleOwned", js.undefined)
    
    inline def setIsCwsHosted(value: Boolean): Self = StObject.set(x, "isCwsHosted", value.asInstanceOf[js.Any])
    
    inline def setIsCwsHostedNull: Self = StObject.set(x, "isCwsHosted", null)
    
    inline def setIsCwsHostedUndefined: Self = StObject.set(x, "isCwsHosted", js.undefined)
    
    inline def setIsKioskOnly(value: Boolean): Self = StObject.set(x, "isKioskOnly", value.asInstanceOf[js.Any])
    
    inline def setIsKioskOnlyNull: Self = StObject.set(x, "isKioskOnly", null)
    
    inline def setIsKioskOnlyUndefined: Self = StObject.set(x, "isKioskOnly", js.undefined)
    
    inline def setIsTheme(value: Boolean): Self = StObject.set(x, "isTheme", value.asInstanceOf[js.Any])
    
    inline def setIsThemeNull: Self = StObject.set(x, "isTheme", null)
    
    inline def setIsThemeUndefined: Self = StObject.set(x, "isTheme", js.undefined)
    
    inline def setKioskEnabled(value: Boolean): Self = StObject.set(x, "kioskEnabled", value.asInstanceOf[js.Any])
    
    inline def setKioskEnabledNull: Self = StObject.set(x, "kioskEnabled", null)
    
    inline def setKioskEnabledUndefined: Self = StObject.set(x, "kioskEnabled", js.undefined)
    
    inline def setMinUserCount(value: Double): Self = StObject.set(x, "minUserCount", value.asInstanceOf[js.Any])
    
    inline def setMinUserCountNull: Self = StObject.set(x, "minUserCount", null)
    
    inline def setMinUserCountUndefined: Self = StObject.set(x, "minUserCount", js.undefined)
    
    inline def setPermissions(value: js.Array[SchemaGoogleChromeManagementV1ChromeAppPermission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: SchemaGoogleChromeManagementV1ChromeAppPermission*): Self = StObject.set(x, "permissions", js.Array(value*))
    
    inline def setSiteAccess(value: js.Array[SchemaGoogleChromeManagementV1ChromeAppSiteAccess]): Self = StObject.set(x, "siteAccess", value.asInstanceOf[js.Any])
    
    inline def setSiteAccessUndefined: Self = StObject.set(x, "siteAccess", js.undefined)
    
    inline def setSiteAccessVarargs(value: SchemaGoogleChromeManagementV1ChromeAppSiteAccess*): Self = StObject.set(x, "siteAccess", js.Array(value*))
    
    inline def setSupportEnabled(value: Boolean): Self = StObject.set(x, "supportEnabled", value.asInstanceOf[js.Any])
    
    inline def setSupportEnabledNull: Self = StObject.set(x, "supportEnabled", null)
    
    inline def setSupportEnabledUndefined: Self = StObject.set(x, "supportEnabled", js.undefined)
  }
}
