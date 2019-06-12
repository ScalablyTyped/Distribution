package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X86ImmOperand
  extends X86BaseOperand
     with X86Operand {
  var `type`: fridaDashGumLib.fridaDashGumLibStrings.imm
  var value: scala.Double | Int64
}

object X86ImmOperand {
  @scala.inline
  def apply(
    size: scala.Double,
    `type`: fridaDashGumLib.fridaDashGumLibStrings.imm,
    value: scala.Double | Int64
  ): X86ImmOperand = {
    val __obj = js.Dynamic.literal(size = size, value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[X86ImmOperand]
  }
}

