package typings.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageFilters extends js.Object {
  val contrast: js.UndefOr[Double] = js.undefined
  val exposure: js.UndefOr[Double] = js.undefined
  val highlights: js.UndefOr[Double] = js.undefined
  val saturation: js.UndefOr[Double] = js.undefined
  val shadows: js.UndefOr[Double] = js.undefined
  val temperature: js.UndefOr[Double] = js.undefined
  val tint: js.UndefOr[Double] = js.undefined
}

object ImageFilters {
  @scala.inline
  def apply(
    contrast: js.UndefOr[Double] = js.undefined,
    exposure: js.UndefOr[Double] = js.undefined,
    highlights: js.UndefOr[Double] = js.undefined,
    saturation: js.UndefOr[Double] = js.undefined,
    shadows: js.UndefOr[Double] = js.undefined,
    temperature: js.UndefOr[Double] = js.undefined,
    tint: js.UndefOr[Double] = js.undefined
  ): ImageFilters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contrast)) __obj.updateDynamic("contrast")(contrast.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exposure)) __obj.updateDynamic("exposure")(exposure.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highlights)) __obj.updateDynamic("highlights")(highlights.get.asInstanceOf[js.Any])
    if (!js.isUndefined(saturation)) __obj.updateDynamic("saturation")(saturation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadows)) __obj.updateDynamic("shadows")(shadows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(temperature)) __obj.updateDynamic("temperature")(temperature.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tint)) __obj.updateDynamic("tint")(tint.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageFilters]
  }
}

