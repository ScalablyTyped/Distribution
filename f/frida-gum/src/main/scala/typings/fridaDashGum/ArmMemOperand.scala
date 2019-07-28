package typings.fridaDashGum

import typings.fridaDashGum.fridaDashGumStrings.mem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArmMemOperand
  extends ArmBaseOperand
     with ArmOperand {
  var `type`: mem
  var value: Anon_BaseDisp
}

object ArmMemOperand {
  @scala.inline
  def apply(
    subtracted: Boolean,
    `type`: mem,
    value: Anon_BaseDisp,
    shift: Anon_Type = null,
    vectorIndex: Int | Double = null
  ): ArmMemOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted, value = value)
    __obj.updateDynamic("type")(`type`)
    if (shift != null) __obj.updateDynamic("shift")(shift)
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmMemOperand]
  }
}

