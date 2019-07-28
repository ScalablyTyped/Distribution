package typings.fridaDashGum

import typings.fridaDashGum.fridaDashGumStrings.pstate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arm64PstateOperand
  extends Arm64BaseOperand
     with Arm64Operand {
  var `type`: pstate
  var value: Double
}

object Arm64PstateOperand {
  @scala.inline
  def apply(
    `type`: pstate,
    value: Double,
    ext: Arm64Extender = null,
    shift: Anon_TypeValue = null,
    vas: Arm64Vas = null,
    vectorIndex: Int | Double = null
  ): Arm64PstateOperand = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    if (ext != null) __obj.updateDynamic("ext")(ext)
    if (shift != null) __obj.updateDynamic("shift")(shift)
    if (vas != null) __obj.updateDynamic("vas")(vas)
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64PstateOperand]
  }
}

