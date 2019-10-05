package typings.googleDashProtobuf.googleProtobufApiUnderscorePbMod.Mixin

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
    val __obj = js.Dynamic.literal(name = name, root = root)
  
    __obj.asInstanceOf[AsObject]
  }
}

