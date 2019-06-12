package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arm64MemOperand
  extends Arm64BaseOperand
     with Arm64Operand {
  var `type`: fridaDashGumLib.fridaDashGumLibStrings.mem
  var value: Anon_BaseDispIndex
}

object Arm64MemOperand {
  @scala.inline
  def apply(
    `type`: fridaDashGumLib.fridaDashGumLibStrings.mem,
    value: Anon_BaseDispIndex,
    ext: Arm64Extender = null,
    shift: Anon_TypeValue = null,
    vas: Arm64Vas = null,
    vectorIndex: scala.Int | scala.Double = null
  ): Arm64MemOperand = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    if (ext != null) __obj.updateDynamic("ext")(ext)
    if (shift != null) __obj.updateDynamic("shift")(shift)
    if (vas != null) __obj.updateDynamic("vas")(vas)
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64MemOperand]
  }
}

