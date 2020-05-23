package typings.fridaGum

import typings.fridaGum.anon.BaseDisp
import typings.fridaGum.fridaGumStrings.mem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MipsMemOperand extends MipsOperand {
  var `type`: mem
  var value: BaseDisp
}

object MipsMemOperand {
  @scala.inline
  def apply(`type`: mem, value: BaseDisp): MipsMemOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MipsMemOperand]
  }
}

