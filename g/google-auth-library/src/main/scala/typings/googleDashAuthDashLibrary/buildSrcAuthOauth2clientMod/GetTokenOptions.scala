package typings.googleDashAuthDashLibrary.buildSrcAuthOauth2clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTokenOptions extends js.Object {
  /**
    * The client ID for your application. The value passed into the constructor
    * will be used if not provided. Must match any client_id option passed to
    * a corresponding call to generateAuthUrl.
    */
  var client_id: js.UndefOr[String] = js.undefined
  var code: String
  var codeVerifier: js.UndefOr[String] = js.undefined
  /**
    * Determines where the API server redirects the user after the user
    * completes the authorization flow. The value passed into the constructor
    * will be used if not provided. Must match any redirect_uri option passed to
    * a corresponding call to generateAuthUrl.
    */
  var redirect_uri: js.UndefOr[String] = js.undefined
}

object GetTokenOptions {
  @scala.inline
  def apply(code: String, client_id: String = null, codeVerifier: String = null, redirect_uri: String = null): GetTokenOptions = {
    val __obj = js.Dynamic.literal(code = code)
    if (client_id != null) __obj.updateDynamic("client_id")(client_id)
    if (codeVerifier != null) __obj.updateDynamic("codeVerifier")(codeVerifier)
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    __obj.asInstanceOf[GetTokenOptions]
  }
}

