package typings
package firebaseDashAdminLib.adminNs.authNs

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
  var displayName: java.lang.String
  /**
    * Whether the current provider configuration is enabled or disabled. A user
    * cannot sign in using a disabled provider.
    */
  var enabled: scala.Boolean
  /**
    * The provider ID defined by the developer.
    * For a SAML provider, this is always prefixed by `saml.`.
    * For an OIDC provider, this is always prefixed by `oidc.`.
    */
  var providerId: java.lang.String
}

object AuthProviderConfig {
  @scala.inline
  def apply(displayName: java.lang.String, enabled: scala.Boolean, providerId: java.lang.String): AuthProviderConfig = {
    val __obj = js.Dynamic.literal(displayName = displayName, enabled = enabled, providerId = providerId)
  
    __obj.asInstanceOf[AuthProviderConfig]
  }
}

