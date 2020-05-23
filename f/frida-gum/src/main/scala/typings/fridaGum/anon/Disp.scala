package typings.fridaGum.anon

import typings.fridaGum.ArmRegister
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disp extends js.Object {
  var base: js.UndefOr[ArmRegister] = js.undefined
  var disp: Double
  var index: js.UndefOr[ArmRegister] = js.undefined
  var scale: Double
}

object Disp {
  @scala.inline
  def apply(disp: Double, scale: Double, base: ArmRegister = null, index: ArmRegister = null): Disp = {
    val __obj = js.Dynamic.literal(disp = disp.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disp]
  }
}

