package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contrast extends js.Object {
  var contrast: js.UndefOr[Double] = js.undefined
}

object Contrast {
  @scala.inline
  def apply(contrast: js.UndefOr[Double] = js.undefined): Contrast = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contrast)) __obj.updateDynamic("contrast")(contrast.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contrast]
  }
}

