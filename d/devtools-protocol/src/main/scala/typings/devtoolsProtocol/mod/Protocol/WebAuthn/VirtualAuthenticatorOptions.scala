package typings.devtoolsProtocol.mod.Protocol.WebAuthn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualAuthenticatorOptions extends js.Object {
  /**
    * If set to true, tests of user presence will succeed immediately.
    * Otherwise, they will not be resolved. Defaults to true.
    */
  var automaticPresenceSimulation: js.UndefOr[Boolean] = js.native
  /**
    * Defaults to false.
    */
  var hasResidentKey: js.UndefOr[Boolean] = js.native
  /**
    * Defaults to false.
    */
  var hasUserVerification: js.UndefOr[Boolean] = js.native
  /**
    * Sets whether User Verification succeeds or fails for an authenticator.
    * Defaults to false.
    */
  var isUserVerified: js.UndefOr[Boolean] = js.native
  var protocol: AuthenticatorProtocol = js.native
  var transport: AuthenticatorTransport = js.native
}

object VirtualAuthenticatorOptions {
  @scala.inline
  def apply(protocol: AuthenticatorProtocol, transport: AuthenticatorTransport): VirtualAuthenticatorOptions = {
    val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualAuthenticatorOptions]
  }
  @scala.inline
  implicit class VirtualAuthenticatorOptionsOps[Self <: VirtualAuthenticatorOptions] (val x: Self) extends AnyVal {
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
    def setProtocol(value: AuthenticatorProtocol): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransport(value: AuthenticatorTransport): Self = this.set("transport", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutomaticPresenceSimulation(value: Boolean): Self = this.set("automaticPresenceSimulation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomaticPresenceSimulation: Self = this.set("automaticPresenceSimulation", js.undefined)
    @scala.inline
    def setHasResidentKey(value: Boolean): Self = this.set("hasResidentKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasResidentKey: Self = this.set("hasResidentKey", js.undefined)
    @scala.inline
    def setHasUserVerification(value: Boolean): Self = this.set("hasUserVerification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasUserVerification: Self = this.set("hasUserVerification", js.undefined)
    @scala.inline
    def setIsUserVerified(value: Boolean): Self = this.set("isUserVerified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsUserVerified: Self = this.set("isUserVerified", js.undefined)
  }
  
}

