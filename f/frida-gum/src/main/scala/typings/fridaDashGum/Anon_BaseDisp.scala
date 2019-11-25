package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseDisp extends js.Object {
  var base: js.UndefOr[ArmRegister] = js.undefined
  var disp: Double
  var index: js.UndefOr[ArmRegister] = js.undefined
  var scale: Double
}

object Anon_BaseDisp {
  @scala.inline
  def apply(disp: Double, scale: Double, base: ArmRegister = null, index: ArmRegister = null): Anon_BaseDisp = {
    val __obj = js.Dynamic.literal(disp = disp.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BaseDisp]
  }
}

