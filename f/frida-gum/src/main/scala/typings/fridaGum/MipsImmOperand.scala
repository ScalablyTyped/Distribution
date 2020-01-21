package typings.fridaGum

import typings.fridaGum.fridaGumStrings.imm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MipsImmOperand extends MipsOperand {
  var `type`: imm
  var value: Double
}

object MipsImmOperand {
  @scala.inline
  def apply(`type`: imm, value: Double): MipsImmOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MipsImmOperand]
  }
}

