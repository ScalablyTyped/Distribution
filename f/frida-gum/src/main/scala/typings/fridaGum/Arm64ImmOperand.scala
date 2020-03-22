package typings.fridaGum

import typings.fridaGum.fridaGumStrings.imm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arm64ImmOperand
  extends Arm64BaseOperand
     with Arm64Operand {
  var `type`: imm
  var value: Int64_
}

object Arm64ImmOperand {
  @scala.inline
  def apply(
    `type`: imm,
    value: Int64_,
    ext: Arm64Extender = null,
    shift: AnonValue = null,
    vas: Arm64Vas = null,
    vectorIndex: Int | Double = null
  ): Arm64ImmOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vas != null) __obj.updateDynamic("vas")(vas.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64ImmOperand]
  }
}

