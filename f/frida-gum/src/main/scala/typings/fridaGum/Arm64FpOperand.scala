package typings.fridaGum

import typings.fridaGum.fridaGumStrings.fp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arm64FpOperand
  extends Arm64BaseOperand
     with Arm64Operand {
  var `type`: fp
  var value: Double
}

object Arm64FpOperand {
  @scala.inline
  def apply(
    `type`: fp,
    value: Double,
    ext: Arm64Extender = null,
    shift: AnonValue = null,
    vas: Arm64Vas = null,
    vectorIndex: Int | Double = null
  ): Arm64FpOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vas != null) __obj.updateDynamic("vas")(vas.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64FpOperand]
  }
}

