package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaseDispMipsRegister extends js.Object {
  var base: js.UndefOr[MipsRegister] = js.undefined
  var disp: Double
}

object AnonBaseDispMipsRegister {
  @scala.inline
  def apply(disp: Double, base: MipsRegister = null): AnonBaseDispMipsRegister = {
    val __obj = js.Dynamic.literal(disp = disp.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBaseDispMipsRegister]
  }
}

