package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataType extends js.Object {
  var data: js.Object
  var `type`: String
}

object AnonDataType {
  @scala.inline
  def apply(data: js.Object, `type`: String): AnonDataType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataType]
  }
}

