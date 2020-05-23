package typings.feathersjsAuthenticationJwt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyKey extends js.Object {
  var bodyKey: String
  var name: String
}

object BodyKey {
  @scala.inline
  def apply(bodyKey: String, name: String): BodyKey = {
    val __obj = js.Dynamic.literal(bodyKey = bodyKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyKey]
  }
}

