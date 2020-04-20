package typings.freedom.freedom.Social

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// A request to login to a specific network as a specific agent
trait LoginRequest extends js.Object {
  // Name of the application connecting to the network. Other logins with
  // the same agent field will be listed as having status |ONLINE|, where
  // those with different agents will be listed as
  // |ONLINE_WITH_OTHER_CLIENT|
  var agent: String
  // When |interactive === true| social will always prompt user for login.
  // Promise fails if the user did not login or provided invalid
  // credentials. When |interactive === false|, promise fails unless the
  // social provider has  cached tokens/credentials.
  var interactive: Boolean
  // When true, social provider will remember the token/credentials.
  var rememberLogin: Boolean
  // URL of application
  var url: String
  // Version of application
  var version: String
}

object LoginRequest {
  @scala.inline
  def apply(agent: String, interactive: Boolean, rememberLogin: Boolean, url: String, version: String): LoginRequest = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], interactive = interactive.asInstanceOf[js.Any], rememberLogin = rememberLogin.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginRequest]
  }
}

