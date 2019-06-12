package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MipsMemOperand extends MipsOperand {
  var `type`: fridaDashGumLib.fridaDashGumLibStrings.mem
  var value: Anon_BaseDispMipsRegister
}

object MipsMemOperand {
  @scala.inline
  def apply(`type`: fridaDashGumLib.fridaDashGumLibStrings.mem, value: Anon_BaseDispMipsRegister): MipsMemOperand = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MipsMemOperand]
  }
}

