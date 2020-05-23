package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SolidFill extends js.Object {
  var alpha: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[OpaqueColor] = js.undefined
}

object SolidFill {
  @scala.inline
  def apply(alpha: js.UndefOr[Double] = js.undefined, color: OpaqueColor = null): SolidFill = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[SolidFill]
  }
}

