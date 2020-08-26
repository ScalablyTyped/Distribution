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
  def apply(): SchemaAuthenticationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthenticationPolicy]
  }
  @scala.inline
  implicit class SchemaAuthenticationPolicyOps[Self <: SchemaAuthenticationPolicy] (val x: Self) extends AnyVal {
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
    def setOriginsVarargs(value: SchemaOriginAuthenticationMethod*): Self = this.set("origins", js.Array(value :_*))
    @scala.inline
    def setOrigins(value: js.Array[SchemaOriginAuthenticationMethod]): Self = this.set("origins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigins: Self = this.set("origins", js.undefined)
    @scala.inline
    def setPeersVarargs(value: SchemaPeerAuthenticationMethod*): Self = this.set("peers", js.Array(value :_*))
    @scala.inline
    def setPeers(value: js.Array[SchemaPeerAuthenticationMethod]): Self = this.set("peers", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeers: Self = this.set("peers", js.undefined)
    @scala.inline
    def setPrincipalBinding(value: String): Self = this.set("principalBinding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrincipalBinding: Self = this.set("principalBinding", js.undefined)
    @scala.inline
    def setServerTlsContext(value: SchemaTlsContext): Self = this.set("serverTlsContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerTlsContext: Self = this.set("serverTlsContext", js.undefined)
  }
  
}

