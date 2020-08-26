package typings.devtoolsProtocol.mod.Protocol.Fetch

import typings.devtoolsProtocol.devtoolsProtocolStrings.CancelAuth
import typings.devtoolsProtocol.devtoolsProtocolStrings.Default
import typings.devtoolsProtocol.devtoolsProtocolStrings.ProvideCredentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthChallengeResponse extends js.Object {
  /**
    * The password to provide, possibly empty. Should only be set if response is
    * ProvideCredentials.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * The decision on what to do in response to the authorization challenge.  Default means
    * deferring to the default behavior of the net stack, which will likely either the Cancel
    * authentication or display a popup dialog box. (AuthChallengeResponseResponse enum)
    */
  var response: Default | CancelAuth | ProvideCredentials = js.native
  /**
    * The username to provide, possibly empty. Should only be set if response is
    * ProvideCredentials.
    */
  var username: js.UndefOr[String] = js.native
}

object AuthChallengeResponse {
  @scala.inline
  def apply(response: Default | CancelAuth | ProvideCredentials): AuthChallengeResponse = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthChallengeResponse]
  }
  @scala.inline
  implicit class AuthChallengeResponseOps[Self <: AuthChallengeResponse] (val x: Self) extends AnyVal {
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
    def setResponse(value: Default | CancelAuth | ProvideCredentials): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

