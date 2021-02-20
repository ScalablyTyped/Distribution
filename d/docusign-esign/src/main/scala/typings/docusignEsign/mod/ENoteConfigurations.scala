package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ENoteConfigurations extends StObject {
  
  var connectConfigured: js.UndefOr[String] = js.native
  
  var eNoteConfigured: js.UndefOr[String] = js.native
  
  var organization: js.UndefOr[String] = js.native
  
  /**
    * The user's encrypted password hash.
    */
  var password: js.UndefOr[String] = js.native
  
  /**
    * The name of the user.
    */
  var userName: js.UndefOr[String] = js.native
}
object ENoteConfigurations {
  
  @scala.inline
  def apply(): ENoteConfigurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ENoteConfigurations]
  }
  
  @scala.inline
  implicit class ENoteConfigurationsMutableBuilder[Self <: ENoteConfigurations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectConfigured(value: String): Self = StObject.set(x, "connectConfigured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectConfiguredUndefined: Self = StObject.set(x, "connectConfigured", js.undefined)
    
    @scala.inline
    def setENoteConfigured(value: String): Self = StObject.set(x, "eNoteConfigured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setENoteConfiguredUndefined: Self = StObject.set(x, "eNoteConfigured", js.undefined)
    
    @scala.inline
    def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}
