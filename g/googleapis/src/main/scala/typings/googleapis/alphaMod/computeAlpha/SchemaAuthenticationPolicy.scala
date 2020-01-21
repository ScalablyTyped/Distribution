package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The authentication settings for the backend service.
  */
@js.native
trait SchemaAuthenticationPolicy extends js.Object {
  /**
    * List of authentication methods that can be used for origin
    * authentication. Similar to peers, these will be evaluated in order the
    * first valid one will be used to set origin identity. If none of these
    * methods pass, the request will be rejected with authentication failed
    * error (401). Leave the list empty if origin authentication is not
    * required.
    */
  var origins: js.UndefOr[js.Array[SchemaOriginAuthenticationMethod]] = js.native
  /**
    * List of authentication methods that can be used for peer authentication.
    * They will be evaluated in order the first valid one will be used to set
    * peer identity. If none of these methods pass, the request will be
    * rejected with authentication failed error (401). Leave the list empty if
    * peer authentication is not required.
    */
  var peers: js.UndefOr[js.Array[SchemaPeerAuthenticationMethod]] = js.native
  /**
    * Define whether peer or origin identity should be used for principal.
    * Default value is USE_PEER. If peer (or origin) identity is not available,
    * either because peer/origin authentication is not defined, or failed,
    * principal will be left unset. In other words, binding rule does not
    * affect the decision to accept or reject request. This field can be set to
    * one of the following: USE_PEER: Principal will be set to the identity
    * from peer authentication. USE_ORIGIN: Principal will be set to the
    * identity from origin authentication.
    */
  var principalBinding: js.UndefOr[String] = js.native
  /**
    * Configures the mechanism to obtain server-side security certificates and
    * identity information.
    */
  var serverTlsContext: js.UndefOr[SchemaTlsContext] = js.native
}

object SchemaAuthenticationPolicy {
  @scala.inline
  def apply(
    origins: js.Array[SchemaOriginAuthenticationMethod] = null,
    peers: js.Array[SchemaPeerAuthenticationMethod] = null,
    principalBinding: String = null,
    serverTlsContext: SchemaTlsContext = null
  ): SchemaAuthenticationPolicy = {
    val __obj = js.Dynamic.literal()
    if (origins != null) __obj.updateDynamic("origins")(origins.asInstanceOf[js.Any])
    if (peers != null) __obj.updateDynamic("peers")(peers.asInstanceOf[js.Any])
    if (principalBinding != null) __obj.updateDynamic("principalBinding")(principalBinding.asInstanceOf[js.Any])
    if (serverTlsContext != null) __obj.updateDynamic("serverTlsContext")(serverTlsContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAuthenticationPolicy]
  }
}

