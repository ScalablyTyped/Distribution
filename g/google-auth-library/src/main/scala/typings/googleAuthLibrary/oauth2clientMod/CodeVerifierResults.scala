package typings.googleAuthLibrary.oauth2clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeVerifierResults extends js.Object {
  /**
    * The code_challenge that should be sent with the `generateAuthUrl` call
    * to obtain a verifiable authentication url.
    */
  var codeChallenge: js.UndefOr[String] = js.native
  /**
    * The code verifier that will be used when calling `getToken` to obtain a new
    * access token.
    */
  var codeVerifier: String = js.native
}

object CodeVerifierResults {
  @scala.inline
  def apply(codeVerifier: String): CodeVerifierResults = {
    val __obj = js.Dynamic.literal(codeVerifier = codeVerifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeVerifierResults]
  }
  @scala.inline
  implicit class CodeVerifierResultsOps[Self <: CodeVerifierResults] (val x: Self) extends AnyVal {
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
    def setCodeVerifier(value: String): Self = this.set("codeVerifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setCodeChallenge(value: String): Self = this.set("codeChallenge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeChallenge: Self = this.set("codeChallenge", js.undefined)
  }
  
}

