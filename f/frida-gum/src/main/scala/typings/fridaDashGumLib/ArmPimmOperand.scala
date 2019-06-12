package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArmPimmOperand
  extends ArmBaseOperand
     with ArmOperand {
  var `type`: fridaDashGumLib.fridaDashGumLibStrings.pimm
  var value: scala.Double
}

object ArmPimmOperand {
  @scala.inline
  def apply(
    subtracted: scala.Boolean,
    `type`: fridaDashGumLib.fridaDashGumLibStrings.pimm,
    value: scala.Double,
    shift: Anon_Type = null,
    vectorIndex: scala.Int | scala.Double = null
  ): ArmPimmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted, value = value)
    __obj.updateDynamic("type")(`type`)
    if (shift != null) __obj.updateDynamic("shift")(shift)
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmPimmOperand]
  }
}

