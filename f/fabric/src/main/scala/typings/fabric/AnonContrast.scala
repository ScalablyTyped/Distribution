package typings.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContrast extends js.Object {
  var contrast: js.UndefOr[Double] = js.undefined
}

object AnonContrast {
  @scala.inline
  def apply(contrast: Int | Double = null): AnonContrast = {
    val __obj = js.Dynamic.literal()
    if (contrast != null) __obj.updateDynamic("contrast")(contrast.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContrast]
  }
}

