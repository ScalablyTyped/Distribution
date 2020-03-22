package typings.fridaGum

import typings.fridaGum.fridaGumStrings.barrier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arm64BarrierOperand
  extends Arm64BaseOperand
     with Arm64Operand {
  var `type`: barrier
  var value: Double
}

object Arm64BarrierOperand {
  @scala.inline
  def apply(
    `type`: barrier,
    value: Double,
    ext: Arm64Extender = null,
    shift: AnonValue = null,
    vas: Arm64Vas = null,
    vectorIndex: Int | Double = null
  ): Arm64BarrierOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vas != null) __obj.updateDynamic("vas")(vas.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64BarrierOperand]
  }
}

