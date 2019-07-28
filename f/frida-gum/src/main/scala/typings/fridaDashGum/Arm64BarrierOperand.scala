package typings.fridaDashGum

import typings.fridaDashGum.fridaDashGumStrings.barrier
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
    shift: Anon_TypeValue = null,
    vas: Arm64Vas = null,
    vectorIndex: Int | Double = null
  ): Arm64BarrierOperand = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    if (ext != null) __obj.updateDynamic("ext")(ext)
    if (shift != null) __obj.updateDynamic("shift")(shift)
    if (vas != null) __obj.updateDynamic("vas")(vas)
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64BarrierOperand]
  }
}

