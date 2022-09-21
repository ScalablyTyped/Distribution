package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1ChromeAppRequest extends StObject {
  
  /**
    * Output only. Format: app_details=customers/{customer_id\}/apps/chrome/{app_id\}
    */
  var appDetails: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Unique store identifier for the app. Example: "gmbmikajjgmnabiglmofipeabaddhgne" for the Save to Google Drive Chrome extension.
    */
  var appId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The uri for the detail page of the item.
    */
  var detailUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. App's display name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A link to an image that can be used as an icon for the product.
    */
  var iconUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The timestamp of the most recently made request for this app.
    */
  var latestRequestTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Total count of requests for this app.
    */
  var requestCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1ChromeAppRequest {
  
  inline def apply(): SchemaGoogleChromeManagementV1ChromeAppRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1ChromeAppRequest]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1ChromeAppRequest](x: Self) {
    
    inline def setAppDetails(value: String): Self = StObject.set(x, "appDetails", value.asInstanceOf[js.Any])
    
    inline def setAppDetailsNull: Self = StObject.set(x, "appDetails", null)
    
    inline def setAppDetailsUndefined: Self = StObject.set(x, "appDetails", js.undefined)
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdNull: Self = StObject.set(x, "appId", null)
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setDetailUri(value: String): Self = StObject.set(x, "detailUri", value.asInstanceOf[js.Any])
    
    inline def setDetailUriNull: Self = StObject.set(x, "detailUri", null)
    
    inline def setDetailUriUndefined: Self = StObject.set(x, "detailUri", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setIconUri(value: String): Self = StObject.set(x, "iconUri", value.asInstanceOf[js.Any])
    
    inline def setIconUriNull: Self = StObject.set(x, "iconUri", null)
    
    inline def setIconUriUndefined: Self = StObject.set(x, "iconUri", js.undefined)
    
    inline def setLatestRequestTime(value: String): Self = StObject.set(x, "latestRequestTime", value.asInstanceOf[js.Any])
    
    inline def setLatestRequestTimeNull: Self = StObject.set(x, "latestRequestTime", null)
    
    inline def setLatestRequestTimeUndefined: Self = StObject.set(x, "latestRequestTime", js.undefined)
    
    inline def setRequestCount(value: String): Self = StObject.set(x, "requestCount", value.asInstanceOf[js.Any])
    
    inline def setRequestCountNull: Self = StObject.set(x, "requestCount", null)
    
    inline def setRequestCountUndefined: Self = StObject.set(x, "requestCount", js.undefined)
  }
}
