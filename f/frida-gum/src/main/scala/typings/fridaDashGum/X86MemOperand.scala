package typings.fridaDashGum

import typings.fridaDashGum.fridaDashGumStrings.mem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X86MemOperand
  extends X86BaseOperand
     with X86Operand {
  var `type`: mem
  var value: Anon_Base
}

object X86MemOperand {
  @scala.inline
  def apply(size: Double, `type`: mem, value: Anon_Base): X86MemOperand = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[X86MemOperand]
  }
}

