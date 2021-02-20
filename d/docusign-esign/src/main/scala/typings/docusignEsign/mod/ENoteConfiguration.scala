package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ENoteConfiguration extends StObject {
  
  /**
    * When **false**, the user must configure Connect and eOriginal for the integration to work.
    */
  var connectConfigured: js.UndefOr[String] = js.native
  
  /**
    * When **false**, the user must configure eNote for the feature to work.
    *
    * **Note**: In the account settings, `allowENoteEOriginal` must be set to **true** to make changes to the configuration.
    */
  var eNoteConfigured: js.UndefOr[String] = js.native
  
  /**
    * The name of the organization.
    */
  var organization: js.UndefOr[String] = js.native
  
  /**
    * The user's encrypted password hash.
    */
  var password: js.UndefOr[String] = js.native
  
  /**
    * The user's username.
    */
  var userName: js.UndefOr[String] = js.native
}
object ENoteConfiguration {
  
  @scala.inline
  def apply(): ENoteConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ENoteConfiguration]
  }
  
  @scala.inline
  implicit class ENoteConfigurationMutableBuilder[Self <: ENoteConfiguration] (val x: Self) extends AnyVal {
    
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
