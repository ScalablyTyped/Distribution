package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The authentication and authorization settings for a BackendService.
  */
@js.native
trait SchemaSecuritySettings extends js.Object {
  
  /**
    * Authentication policy defines what authentication methods can be accepted
    * on backends, and if authenticated, which method/certificate will set the
    * request principal.
    */
  var authenticationPolicy: js.UndefOr[SchemaAuthenticationPolicy] = js.native
  
  /**
    * Authorization config defines the Role Based Access Control (RBAC) config.
    */
  var authorizationConfig: js.UndefOr[SchemaAuthorizationConfig] = js.native
  
  /**
    * TLS Settings for the backend service.
    */
  var clientTlsSettings: js.UndefOr[SchemaClientTlsSettings] = js.native
  
  /**
    * The listener config of the XDS client is generated if the selector
    * matches the client.
    */
  var serverSettingsSelector: js.UndefOr[SchemaServerSecuritySettingsSelector] = js.native
}
object SchemaSecuritySettings {
  
  @scala.inline
  def apply(): SchemaSecuritySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecuritySettings]
  }
  
  @scala.inline
  implicit class SchemaSecuritySettingsOps[Self <: SchemaSecuritySettings] (val x: Self) extends AnyVal {
    
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
    def setAuthenticationPolicy(value: SchemaAuthenticationPolicy): Self = this.set("authenticationPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticationPolicy: Self = this.set("authenticationPolicy", js.undefined)
    
    @scala.inline
    def setAuthorizationConfig(value: SchemaAuthorizationConfig): Self = this.set("authorizationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizationConfig: Self = this.set("authorizationConfig", js.undefined)
    
    @scala.inline
    def setClientTlsSettings(value: SchemaClientTlsSettings): Self = this.set("clientTlsSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientTlsSettings: Self = this.set("clientTlsSettings", js.undefined)
    
    @scala.inline
    def setServerSettingsSelector(value: SchemaServerSecuritySettingsSelector): Self = this.set("serverSettingsSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerSettingsSelector: Self = this.set("serverSettingsSelector", js.undefined)
  }
}
