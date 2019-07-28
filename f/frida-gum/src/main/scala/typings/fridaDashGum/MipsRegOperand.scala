package typings.fridaDashGum

import typings.fridaDashGum.fridaDashGumStrings.reg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MipsRegOperand extends MipsOperand {
  var `type`: reg
  var value: MipsRegister
}

object MipsRegOperand {
  @scala.inline
  def apply(`type`: reg, value: MipsRegister): MipsRegOperand = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MipsRegOperand]
  }
}

