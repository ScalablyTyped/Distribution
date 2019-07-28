package typings.googleDashAppsDashScriptDashOauth2.GoogleAppsScriptOAuth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenPayload extends js.Object {
  var client_id: String
  var client_secret: String
  var code: String
  var grant_type: String
  var redirect_uri: String
}

object TokenPayload {
  @scala.inline
  def apply(client_id: String, client_secret: String, code: String, grant_type: String, redirect_uri: String): TokenPayload = {
    val __obj = js.Dynamic.literal(client_id = client_id, client_secret = client_secret, code = code, grant_type = grant_type, redirect_uri = redirect_uri)
  
    __obj.asInstanceOf[TokenPayload]
  }
}

