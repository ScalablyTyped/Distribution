package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AffineTransform extends js.Object {
  var scaleX: js.UndefOr[Double] = js.undefined
  var scaleY: js.UndefOr[Double] = js.undefined
  var shearX: js.UndefOr[Double] = js.undefined
  var shearY: js.UndefOr[Double] = js.undefined
  var translateX: js.UndefOr[Double] = js.undefined
  var translateY: js.UndefOr[Double] = js.undefined
  var unit: js.UndefOr[String] = js.undefined
}

object AffineTransform {
  @scala.inline
  def apply(
    scaleX: js.UndefOr[Double] = js.undefined,
    scaleY: js.UndefOr[Double] = js.undefined,
    shearX: js.UndefOr[Double] = js.undefined,
    shearY: js.UndefOr[Double] = js.undefined,
    translateX: js.UndefOr[Double] = js.undefined,
    translateY: js.UndefOr[Double] = js.undefined,
    unit: String = null
  ): AffineTransform = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(scaleX)) __obj.updateDynamic("scaleX")(scaleX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleY)) __obj.updateDynamic("scaleY")(scaleY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shearX)) __obj.updateDynamic("shearX")(shearX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shearY)) __obj.updateDynamic("shearY")(shearY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(translateX)) __obj.updateDynamic("translateX")(translateX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(translateY)) __obj.updateDynamic("translateY")(translateY.get.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AffineTransform]
  }
}

