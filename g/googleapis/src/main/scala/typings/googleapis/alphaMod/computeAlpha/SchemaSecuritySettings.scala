package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The authentication and authorization settings for a BackendService.
  */
trait SchemaSecuritySettings extends StObject {
  
  /**
    * Authentication policy defines what authentication methods can be accepted
    * on backends, and if authenticated, which method/certificate will set the
    * request principal.
    */
  var authenticationPolicy: js.UndefOr[SchemaAuthenticationPolicy] = js.undefined
  
  /**
    * Authorization config defines the Role Based Access Control (RBAC) config.
    */
  var authorizationConfig: js.UndefOr[SchemaAuthorizationConfig] = js.undefined
  
  /**
    * TLS Settings for the backend service.
    */
  var clientTlsSettings: js.UndefOr[SchemaClientTlsSettings] = js.undefined
  
  /**
    * The listener config of the XDS client is generated if the selector
    * matches the client.
    */
  var serverSettingsSelector: js.UndefOr[SchemaServerSecuritySettingsSelector] = js.undefined
}
object SchemaSecuritySettings {
  
  inline def apply(): SchemaSecuritySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecuritySettings]
  }
  
  extension [Self <: SchemaSecuritySettings](x: Self) {
    
    inline def setAuthenticationPolicy(value: SchemaAuthenticationPolicy): Self = StObject.set(x, "authenticationPolicy", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationPolicyUndefined: Self = StObject.set(x, "authenticationPolicy", js.undefined)
    
    inline def setAuthorizationConfig(value: SchemaAuthorizationConfig): Self = StObject.set(x, "authorizationConfig", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationConfigUndefined: Self = StObject.set(x, "authorizationConfig", js.undefined)
    
    inline def setClientTlsSettings(value: SchemaClientTlsSettings): Self = StObject.set(x, "clientTlsSettings", value.asInstanceOf[js.Any])
    
    inline def setClientTlsSettingsUndefined: Self = StObject.set(x, "clientTlsSettings", js.undefined)
    
    inline def setServerSettingsSelector(value: SchemaServerSecuritySettingsSelector): Self = StObject.set(x, "serverSettingsSelector", value.asInstanceOf[js.Any])
    
    inline def setServerSettingsSelectorUndefined: Self = StObject.set(x, "serverSettingsSelector", js.undefined)
  }
}
