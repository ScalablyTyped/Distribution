package typings
package googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTokenOptions extends js.Object {
  /**
    * The client ID for your application. The value passed into the constructor
    * will be used if not provided. Must match any client_id option passed to
    * a corresponding call to generateAuthUrl.
    */
  var client_id: js.UndefOr[java.lang.String] = js.undefined
  var code: java.lang.String
  var codeVerifier: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Determines where the API server redirects the user after the user
    * completes the authorization flow. The value passed into the constructor
    * will be used if not provided. Must match any redirect_uri option passed to
    * a corresponding call to generateAuthUrl.
    */
  var redirect_uri: js.UndefOr[java.lang.String] = js.undefined
}

object GetTokenOptions {
  @scala.inline
  def apply(
    code: java.lang.String,
    client_id: java.lang.String = null,
    codeVerifier: java.lang.String = null,
    redirect_uri: java.lang.String = null
  ): GetTokenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    if (client_id != null) __obj.updateDynamic("client_id")(client_id)
    if (codeVerifier != null) __obj.updateDynamic("codeVerifier")(codeVerifier)
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    __obj.asInstanceOf[GetTokenOptions]
  }
}

