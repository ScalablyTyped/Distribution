package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaseDispIndex extends js.Object {
  var base: js.UndefOr[Arm64Register] = js.undefined
  var disp: Double
  var index: js.UndefOr[Arm64Register] = js.undefined
}

object AnonBaseDispIndex {
  @scala.inline
  def apply(disp: Double, base: Arm64Register = null, index: Arm64Register = null): AnonBaseDispIndex = {
    val __obj = js.Dynamic.literal(disp = disp.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBaseDispIndex]
  }
}

