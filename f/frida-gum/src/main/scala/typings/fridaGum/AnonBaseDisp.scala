package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaseDisp extends js.Object {
  var base: js.UndefOr[MipsRegister] = js.undefined
  var disp: Double
}

object AnonBaseDisp {
  @scala.inline
  def apply(disp: Double, base: MipsRegister = null): AnonBaseDisp = {
    val __obj = js.Dynamic.literal(disp = disp.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBaseDisp]
  }
}

