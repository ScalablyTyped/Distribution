package typings.googleAppsScriptOauth2.GoogleAppsScriptOAuth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenPayload extends js.Object {
  var client_id: String = js.native
  var client_secret: String = js.native
  var code: String = js.native
  var grant_type: String = js.native
  var redirect_uri: String = js.native
}

object TokenPayload {
  @scala.inline
  def apply(client_id: String, client_secret: String, code: String, grant_type: String, redirect_uri: String): TokenPayload = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], grant_type = grant_type.asInstanceOf[js.Any], redirect_uri = redirect_uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenPayload]
  }
  @scala.inline
  implicit class TokenPayloadOps[Self <: TokenPayload] (val x: Self) extends AnyVal {
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
    def setClient_id(value: String): Self = this.set("client_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setClient_secret(value: String): Self = this.set("client_secret", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrant_type(value: String): Self = this.set("grant_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedirect_uri(value: String): Self = this.set("redirect_uri", value.asInstanceOf[js.Any])
  }
  
}

