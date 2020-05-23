package typings.fridaGum.anon

import typings.fridaGum.MipsRegister
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseDisp extends js.Object {
  var base: js.UndefOr[MipsRegister] = js.undefined
  var disp: Double
}

object BaseDisp {
  @scala.inline
  def apply(disp: Double, base: MipsRegister = null): BaseDisp = {
    val __obj = js.Dynamic.literal(disp = disp.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseDisp]
  }
}

