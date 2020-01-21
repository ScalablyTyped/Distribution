package typings.glReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonObj extends js.Object {
  var obj: js.Any
  var `type`: String
}

object AnonObj {
  @scala.inline
  def apply(obj: js.Any, `type`: String): AnonObj = {
    val __obj = js.Dynamic.literal(obj = obj.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonObj]
  }
}

