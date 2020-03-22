package typings.googleAuthLibrary.oauth2clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeVerifierResults extends js.Object {
  /**
    * The code_challenge that should be sent with the `generateAuthUrl` call
    * to obtain a verifiable authentication url.
    */
  var codeChallenge: js.UndefOr[String] = js.undefined
  /**
    * The code verifier that will be used when calling `getToken` to obtain a new
    * access token.
    */
  var codeVerifier: String
}

object CodeVerifierResults {
  @scala.inline
  def apply(codeVerifier: String, codeChallenge: String = null): CodeVerifierResults = {
    val __obj = js.Dynamic.literal(codeVerifier = codeVerifier.asInstanceOf[js.Any])
    if (codeChallenge != null) __obj.updateDynamic("codeChallenge")(codeChallenge.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeVerifierResults]
  }
}

