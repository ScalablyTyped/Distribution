package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ENoteConfigurations extends js.Object {
  
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
  implicit class ENoteConfigurationsOps[Self <: ENoteConfigurations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConnectConfigured(value: String): Self = this.set("connectConfigured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectConfigured: Self = this.set("connectConfigured", js.undefined)
    
    @scala.inline
    def setENoteConfigured(value: String): Self = this.set("eNoteConfigured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteENoteConfigured: Self = this.set("eNoteConfigured", js.undefined)
    
    @scala.inline
    def setOrganization(value: String): Self = this.set("organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganization: Self = this.set("organization", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
  }
}
