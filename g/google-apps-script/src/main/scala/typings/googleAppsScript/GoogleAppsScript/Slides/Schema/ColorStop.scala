package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorStop extends js.Object {
  var alpha: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[OpaqueColor] = js.undefined
  var position: js.UndefOr[Double] = js.undefined
}

object ColorStop {
  @scala.inline
  def apply(
    alpha: js.UndefOr[Double] = js.undefined,
    color: OpaqueColor = null,
    position: js.UndefOr[Double] = js.undefined
  ): ColorStop = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorStop]
  }
}

