package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request interface for updating an OIDC Auth provider. This is used
  * when updating an OIDC provider's configuration via
  * {@link auth.Auth.updateProviderConfig `updateProviderConfig()`}.
  */
@js.native
trait OIDCUpdateAuthProviderRequest extends UpdateAuthProviderRequest {
  
  /**
    * The OIDC provider's updated client ID. If not provided, the existing
    * configuration's value is not modified.
    */
  var clientId: js.UndefOr[String] = js.native
  
  /**
    * The OIDC provider's updated display name. If not provided, the existing
    * configuration's value is not modified.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Whether the OIDC provider is enabled or not. If not provided, the existing
    * configuration's setting is not modified.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The OIDC provider's updated issuer. If not provided, the existing
    * configuration's value is not modified.
    */
  var issuer: js.UndefOr[String] = js.native
}
object OIDCUpdateAuthProviderRequest {
  
  @scala.inline
  def apply(): OIDCUpdateAuthProviderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OIDCUpdateAuthProviderRequest]
  }
  
  @scala.inline
  implicit class OIDCUpdateAuthProviderRequestMutableBuilder[Self <: OIDCUpdateAuthProviderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
  }
}
