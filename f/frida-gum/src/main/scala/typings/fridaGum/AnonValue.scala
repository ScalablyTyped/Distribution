package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue extends js.Object {
  var `type`: Arm64Shifter
  var value: Double
}

object AnonValue {
  @scala.inline
  def apply(`type`: Arm64Shifter, value: Double): AnonValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValue]
  }
}

