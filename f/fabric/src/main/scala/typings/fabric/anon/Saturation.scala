package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Saturation extends js.Object {
  var saturation: js.UndefOr[Double] = js.undefined
}

object Saturation {
  @scala.inline
  def apply(saturation: js.UndefOr[Double] = js.undefined): Saturation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(saturation)) __obj.updateDynamic("saturation")(saturation.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Saturation]
  }
}

