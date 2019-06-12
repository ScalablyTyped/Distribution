package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MipsImmOperand extends MipsOperand {
  var `type`: fridaDashGumLib.fridaDashGumLibStrings.imm
  var value: scala.Double
}

object MipsImmOperand {
  @scala.inline
  def apply(`type`: fridaDashGumLib.fridaDashGumLibStrings.imm, value: scala.Double): MipsImmOperand = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MipsImmOperand]
  }
}

