package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ENoteConfigurations extends StObject {
  
  var connectConfigured: js.UndefOr[String] = js.undefined
  
  var eNoteConfigured: js.UndefOr[String] = js.undefined
  
  var organization: js.UndefOr[String] = js.undefined
  
  /**
    * The user's encrypted password hash.
    */
  var password: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the user.
    */
  var userName: js.UndefOr[String] = js.undefined
}
object ENoteConfigurations {
  
  inline def apply(): ENoteConfigurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ENoteConfigurations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ENoteConfigurations] (val x: Self) extends AnyVal {
    
    inline def setConnectConfigured(value: String): Self = StObject.set(x, "connectConfigured", value.asInstanceOf[js.Any])
    
    inline def setConnectConfiguredUndefined: Self = StObject.set(x, "connectConfigured", js.undefined)
    
    inline def setENoteConfigured(value: String): Self = StObject.set(x, "eNoteConfigured", value.asInstanceOf[js.Any])
    
    inline def setENoteConfiguredUndefined: Self = StObject.set(x, "eNoteConfigured", js.undefined)
    
    inline def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}
