package typings.firebaseDashAdmin.adminNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base Auth provider configuration interface.
  */
trait AuthProviderConfig extends js.Object {
  /**
    * The user-friendly display name to the current configuration. This name is
    * also used as the provider label in the Cloud Console.
    */
  var displayName: String
  /**
    * Whether the current provider configuration is enabled or disabled. A user
    * cannot sign in using a disabled provider.
    */
  var enabled: Boolean
  /**
    * The provider ID defined by the developer.
    * For a SAML provider, this is always prefixed by `saml.`.
    * For an OIDC provider, this is always prefixed by `oidc.`.
    */
  var providerId: String
}

object AuthProviderConfig {
  @scala.inline
  def apply(displayName: String, enabled: Boolean, providerId: String): AuthProviderConfig = {
    val __obj = js.Dynamic.literal(displayName = displayName, enabled = enabled, providerId = providerId)
  
    __obj.asInstanceOf[AuthProviderConfig]
  }
}

