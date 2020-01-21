package typings.googleAppsScriptOauth2.GoogleAppsScriptOAuth2

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
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], grant_type = grant_type.asInstanceOf[js.Any], redirect_uri = redirect_uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TokenPayload]
  }
}

