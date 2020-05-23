package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var alpha: js.UndefOr[Double] = js.undefined
  var blue: js.UndefOr[Double] = js.undefined
  var green: js.UndefOr[Double] = js.undefined
  var red: js.UndefOr[Double] = js.undefined
}

object Color {
  @scala.inline
  def apply(
    alpha: js.UndefOr[Double] = js.undefined,
    blue: js.UndefOr[Double] = js.undefined,
    green: js.UndefOr[Double] = js.undefined,
    red: js.UndefOr[Double] = js.undefined
  ): Color = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(blue)) __obj.updateDynamic("blue")(blue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(green)) __obj.updateDynamic("green")(green.get.asInstanceOf[js.Any])
    if (!js.isUndefined(red)) __obj.updateDynamic("red")(red.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

