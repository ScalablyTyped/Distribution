package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTypeValue extends js.Object {
  var `type`: Arm64Shifter
  var value: Double
}

object AnonTypeValue {
  @scala.inline
  def apply(`type`: Arm64Shifter, value: Double): AnonTypeValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTypeValue]
  }
}

