package typings
package googleDashAppsDashScriptDashOauth2Lib.GoogleAppsScriptOAuth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenPayload extends js.Object {
  var client_id: java.lang.String
  var client_secret: java.lang.String
  var code: java.lang.String
  var grant_type: java.lang.String
  var redirect_uri: java.lang.String
}

object TokenPayload {
  @scala.inline
  def apply(
    client_id: java.lang.String,
    client_secret: java.lang.String,
    code: java.lang.String,
    grant_type: java.lang.String,
    redirect_uri: java.lang.String
  ): TokenPayload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("client_id")(client_id)
    __obj.updateDynamic("client_secret")(client_secret)
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("grant_type")(grant_type)
    __obj.updateDynamic("redirect_uri")(redirect_uri)
    __obj.asInstanceOf[TokenPayload]
  }
}

