package typings.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSaturation extends js.Object {
  var saturation: js.UndefOr[Double] = js.undefined
}

object AnonSaturation {
  @scala.inline
  def apply(saturation: Int | Double = null): AnonSaturation = {
    val __obj = js.Dynamic.literal()
    if (saturation != null) __obj.updateDynamic("saturation")(saturation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSaturation]
  }
}

