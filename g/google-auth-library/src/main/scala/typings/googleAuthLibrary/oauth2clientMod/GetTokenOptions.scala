package typings.googleAuthLibrary.oauth2clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTokenOptions extends js.Object {
  /**
    * The client ID for your application. The value passed into the constructor
    * will be used if not provided. Must match any client_id option passed to
    * a corresponding call to generateAuthUrl.
    */
  var client_id: js.UndefOr[String] = js.native
  var code: String = js.native
  var codeVerifier: js.UndefOr[String] = js.native
  /**
    * Determines where the API server redirects the user after the user
    * completes the authorization flow. The value passed into the constructor
    * will be used if not provided. Must match any redirect_uri option passed to
    * a corresponding call to generateAuthUrl.
    */
  var redirect_uri: js.UndefOr[String] = js.native
}

object GetTokenOptions {
  @scala.inline
  def apply(code: String): GetTokenOptions = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTokenOptions]
  }
  @scala.inline
  implicit class GetTokenOptionsOps[Self <: GetTokenOptions] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setClient_id(value: String): Self = this.set("client_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient_id: Self = this.set("client_id", js.undefined)
    @scala.inline
    def setCodeVerifier(value: String): Self = this.set("codeVerifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeVerifier: Self = this.set("codeVerifier", js.undefined)
    @scala.inline
    def setRedirect_uri(value: String): Self = this.set("redirect_uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirect_uri: Self = this.set("redirect_uri", js.undefined)
  }
  
}

