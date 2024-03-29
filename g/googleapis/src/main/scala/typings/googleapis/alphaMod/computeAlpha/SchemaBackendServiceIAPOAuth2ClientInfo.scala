package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBackendServiceIAPOAuth2ClientInfo extends StObject {
  
  /**
    * Application name to be used in OAuth consent screen.
    */
  var applicationName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the client to be generated. Optional - If not provided, the name will be autogenerated by the backend.
    */
  var clientName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Developer's information to be used in OAuth consent screen.
    */
  var developerEmailAddress: js.UndefOr[String | Null] = js.undefined
}
object SchemaBackendServiceIAPOAuth2ClientInfo {
  
  inline def apply(): SchemaBackendServiceIAPOAuth2ClientInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendServiceIAPOAuth2ClientInfo]
  }
  
  extension [Self <: SchemaBackendServiceIAPOAuth2ClientInfo](x: Self) {
    
    inline def setApplicationName(value: String): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    inline def setApplicationNameNull: Self = StObject.set(x, "applicationName", null)
    
    inline def setApplicationNameUndefined: Self = StObject.set(x, "applicationName", js.undefined)
    
    inline def setClientName(value: String): Self = StObject.set(x, "clientName", value.asInstanceOf[js.Any])
    
    inline def setClientNameNull: Self = StObject.set(x, "clientName", null)
    
    inline def setClientNameUndefined: Self = StObject.set(x, "clientName", js.undefined)
    
    inline def setDeveloperEmailAddress(value: String): Self = StObject.set(x, "developerEmailAddress", value.asInstanceOf[js.Any])
    
    inline def setDeveloperEmailAddressNull: Self = StObject.set(x, "developerEmailAddress", null)
    
    inline def setDeveloperEmailAddressUndefined: Self = StObject.set(x, "developerEmailAddress", js.undefined)
  }
}
