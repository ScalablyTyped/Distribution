package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arm64FpOperand
  extends Arm64BaseOperand
     with Arm64Operand {
  var `type`: fridaDashGumLib.fridaDashGumLibStrings.fp
  var value: scala.Double
}

object Arm64FpOperand {
  @scala.inline
  def apply(
    `type`: fridaDashGumLib.fridaDashGumLibStrings.fp,
    value: scala.Double,
    ext: Arm64Extender = null,
    shift: Anon_TypeValue = null,
    vas: Arm64Vas = null,
    vectorIndex: scala.Int | scala.Double = null
  ): Arm64FpOperand = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    if (ext != null) __obj.updateDynamic("ext")(ext)
    if (shift != null) __obj.updateDynamic("shift")(shift)
    if (vas != null) __obj.updateDynamic("vas")(vas)
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64FpOperand]
  }
}

