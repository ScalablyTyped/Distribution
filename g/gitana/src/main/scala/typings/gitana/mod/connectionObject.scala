package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait connectionObject extends js.Object {
  var clientKey: String
  var clientSecret: String
  var password: String
  var username: String
}

object connectionObject {
  @scala.inline
  def apply(clientKey: String, clientSecret: String, password: String, username: String): connectionObject = {
    val __obj = js.Dynamic.literal(clientKey = clientKey.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[connectionObject]
  }
}

