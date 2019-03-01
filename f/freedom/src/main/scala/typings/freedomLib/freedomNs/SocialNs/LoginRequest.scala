package typings
package freedomLib.freedomNs.SocialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// A request to login to a specific network as a specific agent
trait LoginRequest extends js.Object {
  // Name of the application connecting to the network. Other logins with
  // the same agent field will be listed as having status |ONLINE|, where
  // those with different agents will be listed as
  // |ONLINE_WITH_OTHER_CLIENT|
  var agent: java.lang.String
  // When |interactive === true| social will always prompt user for login.
  // Promise fails if the user did not login or provided invalid
  // credentials. When |interactive === false|, promise fails unless the
  // social provider has  cached tokens/credentials.
  var interactive: scala.Boolean
  // When true, social provider will remember the token/credentials.
  var rememberLogin: scala.Boolean
  // URL of application
  var url: java.lang.String
  // Version of application
  var version: java.lang.String
}

object LoginRequest {
  @scala.inline
  def apply(
    agent: java.lang.String,
    interactive: scala.Boolean,
    rememberLogin: scala.Boolean,
    url: java.lang.String,
    version: java.lang.String
  ): LoginRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("agent")(agent)
    __obj.updateDynamic("interactive")(interactive)
    __obj.updateDynamic("rememberLogin")(rememberLogin)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[LoginRequest]
  }
}

