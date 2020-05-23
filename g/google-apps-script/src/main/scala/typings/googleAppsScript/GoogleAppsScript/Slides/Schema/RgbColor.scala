package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RgbColor extends js.Object {
  var blue: js.UndefOr[Double] = js.undefined
  var green: js.UndefOr[Double] = js.undefined
  var red: js.UndefOr[Double] = js.undefined
}

object RgbColor {
  @scala.inline
  def apply(
    blue: js.UndefOr[Double] = js.undefined,
    green: js.UndefOr[Double] = js.undefined,
    red: js.UndefOr[Double] = js.undefined
  ): RgbColor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blue)) __obj.updateDynamic("blue")(blue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(green)) __obj.updateDynamic("green")(green.get.asInstanceOf[js.Any])
    if (!js.isUndefined(red)) __obj.updateDynamic("red")(red.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RgbColor]
  }
}

