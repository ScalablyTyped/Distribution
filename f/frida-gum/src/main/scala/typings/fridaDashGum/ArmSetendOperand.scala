package typings.fridaDashGum

import typings.fridaDashGum.fridaDashGumStrings.setend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArmSetendOperand
  extends ArmBaseOperand
     with ArmOperand {
  var `type`: setend
  var value: Endian
}

object ArmSetendOperand {
  @scala.inline
  def apply(
    subtracted: Boolean,
    `type`: setend,
    value: Endian,
    shift: Anon_Type = null,
    vectorIndex: Int | Double = null
  ): ArmSetendOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted, value = value)
    __obj.updateDynamic("type")(`type`)
    if (shift != null) __obj.updateDynamic("shift")(shift)
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmSetendOperand]
  }
}

