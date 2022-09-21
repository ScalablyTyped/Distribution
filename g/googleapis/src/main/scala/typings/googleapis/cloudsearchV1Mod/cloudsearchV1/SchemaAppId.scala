package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppId extends StObject {
  
  /**
    * Enum indicating the type of App this is.
    */
  var appType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Enum indicating which 1P App this is when app_type is GSUITE_APP. Determined & set by the 1P API as a convenience for all users of this identifier(Eg. clients, chime, backend etc.) to map to 1P properties.
    */
  var gsuiteAppType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Numeric identifier of the App. Set to Project number for 1/3P Apps. For Webhook, this is WebhookId. Determined & set by the 1P API from App credentials on the side channel.
    */
  var id: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppId {
  
  inline def apply(): SchemaAppId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppId]
  }
  
  extension [Self <: SchemaAppId](x: Self) {
    
    inline def setAppType(value: String): Self = StObject.set(x, "appType", value.asInstanceOf[js.Any])
    
    inline def setAppTypeNull: Self = StObject.set(x, "appType", null)
    
    inline def setAppTypeUndefined: Self = StObject.set(x, "appType", js.undefined)
    
    inline def setGsuiteAppType(value: String): Self = StObject.set(x, "gsuiteAppType", value.asInstanceOf[js.Any])
    
    inline def setGsuiteAppTypeNull: Self = StObject.set(x, "gsuiteAppType", null)
    
    inline def setGsuiteAppTypeUndefined: Self = StObject.set(x, "gsuiteAppType", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
