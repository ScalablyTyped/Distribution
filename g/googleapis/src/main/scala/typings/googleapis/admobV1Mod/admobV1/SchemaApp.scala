package typings.googleapis.admobV1Mod.admobV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApp extends StObject {
  
  /**
    * The externally visible ID of the app which can be used to integrate with the AdMob SDK. This is a read only property. Example: ca-app-pub-9876543210987654~0123456789
    */
  var appId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. The information for an app that is linked to an app store. This field is present if and only if the app is linked to an app store.
    */
  var linkedAppInfo: js.UndefOr[SchemaAppLinkedAppInfo] = js.undefined
  
  /**
    * The information for an app that is not linked to any app store. After an app is linked, this information is still retrivable. If no name is provided for the app upon creation, a placeholder name will be used.
    */
  var manualAppInfo: js.UndefOr[SchemaAppManualAppInfo] = js.undefined
  
  /**
    * Resource name for this app. Format is accounts/{publisher_id\}/apps/{app_id_fragment\} Example: accounts/pub-9876543210987654/apps/0123456789
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Describes the platform of the app. Limited to "IOS" and "ANDROID".
    */
  var platform: js.UndefOr[String | Null] = js.undefined
}
object SchemaApp {
  
  inline def apply(): SchemaApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApp]
  }
  
  extension [Self <: SchemaApp](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdNull: Self = StObject.set(x, "appId", null)
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setLinkedAppInfo(value: SchemaAppLinkedAppInfo): Self = StObject.set(x, "linkedAppInfo", value.asInstanceOf[js.Any])
    
    inline def setLinkedAppInfoUndefined: Self = StObject.set(x, "linkedAppInfo", js.undefined)
    
    inline def setManualAppInfo(value: SchemaAppManualAppInfo): Self = StObject.set(x, "manualAppInfo", value.asInstanceOf[js.Any])
    
    inline def setManualAppInfoUndefined: Self = StObject.set(x, "manualAppInfo", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformNull: Self = StObject.set(x, "platform", null)
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
  }
}
