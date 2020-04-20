package typings.googleProtobuf.apiPbMod.Mixin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var name: String
  var root: String
}

object AsObject {
  @scala.inline
  def apply(name: String, root: String): AsObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

