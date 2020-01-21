package typings.glReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonObjRatio extends js.Object {
  var obj: js.Any
  var ratio: Boolean
  var `type`: String
}

object AnonObjRatio {
  @scala.inline
  def apply(obj: js.Any, ratio: Boolean, `type`: String): AnonObjRatio = {
    val __obj = js.Dynamic.literal(obj = obj.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonObjRatio]
  }
}

