package typings.feathersjsAuthenticationJwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyKey extends js.Object {
  var bodyKey: String
  var name: String
}

object AnonBodyKey {
  @scala.inline
  def apply(bodyKey: String, name: String): AnonBodyKey = {
    val __obj = js.Dynamic.literal(bodyKey = bodyKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBodyKey]
  }
}

