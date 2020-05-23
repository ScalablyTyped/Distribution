package typings.fridaGum.anon

import typings.fridaGum.Arm64Shifter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var `type`: Arm64Shifter
  var value: Double
}

object Value {
  @scala.inline
  def apply(`type`: Arm64Shifter, value: Double): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

