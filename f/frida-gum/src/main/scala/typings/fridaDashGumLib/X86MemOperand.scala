package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X86MemOperand
  extends X86BaseOperand
     with X86Operand {
  var `type`: fridaDashGumLib.fridaDashGumLibStrings.mem
  var value: Anon_Base
}

object X86MemOperand {
  @scala.inline
  def apply(size: scala.Double, `type`: fridaDashGumLib.fridaDashGumLibStrings.mem, value: Anon_Base): X86MemOperand = {
    val __obj = js.Dynamic.literal(size = size, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[X86MemOperand]
  }
}

