package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MipsRegOperand extends MipsOperand {
  var `type`: fridaDashGumLib.fridaDashGumLibStrings.reg
  var value: MipsRegister
}

object MipsRegOperand {
  @scala.inline
  def apply(`type`: fridaDashGumLib.fridaDashGumLibStrings.reg, value: MipsRegister): MipsRegOperand = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MipsRegOperand]
  }
}

