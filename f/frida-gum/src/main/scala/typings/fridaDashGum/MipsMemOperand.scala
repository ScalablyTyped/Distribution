package typings.fridaDashGum

import typings.fridaDashGum.fridaDashGumStrings.mem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MipsMemOperand extends MipsOperand {
  var `type`: mem
  var value: Anon_BaseDispMipsRegister
}

object MipsMemOperand {
  @scala.inline
  def apply(`type`: mem, value: Anon_BaseDispMipsRegister): MipsMemOperand = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MipsMemOperand]
  }
}

