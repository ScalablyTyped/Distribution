package typings.fridaDashGum

import typings.fridaDashGum.fridaDashGumStrings.`reg-mrs`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arm64RegMrsOperand
  extends Arm64BaseOperand
     with Arm64Operand {
  var `type`: `reg-mrs`
  var value: Arm64Register
}

object Arm64RegMrsOperand {
  @scala.inline
  def apply(
    `type`: `reg-mrs`,
    value: Arm64Register,
    ext: Arm64Extender = null,
    shift: Anon_TypeValue = null,
    vas: Arm64Vas = null,
    vectorIndex: Int | Double = null
  ): Arm64RegMrsOperand = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    if (ext != null) __obj.updateDynamic("ext")(ext)
    if (shift != null) __obj.updateDynamic("shift")(shift)
    if (vas != null) __obj.updateDynamic("vas")(vas)
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64RegMrsOperand]
  }
}

