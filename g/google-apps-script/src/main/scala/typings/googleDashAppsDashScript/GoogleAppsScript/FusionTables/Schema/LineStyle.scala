package typings.googleDashAppsDashScript.GoogleAppsScript.FusionTables.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineStyle extends js.Object {
  var strokeColor: js.UndefOr[String] = js.undefined
  var strokeColorStyler: js.UndefOr[StyleFunction] = js.undefined
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  var strokeWeight: js.UndefOr[Double] = js.undefined
  var strokeWeightStyler: js.UndefOr[StyleFunction] = js.undefined
}

object LineStyle {
  @scala.inline
  def apply(
    strokeColor: String = null,
    strokeColorStyler: StyleFunction = null,
    strokeOpacity: Int | Double = null,
    strokeWeight: Int | Double = null,
    strokeWeightStyler: StyleFunction = null
  ): LineStyle = {
    val __obj = js.Dynamic.literal()
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (strokeColorStyler != null) __obj.updateDynamic("strokeColorStyler")(strokeColorStyler.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWeight != null) __obj.updateDynamic("strokeWeight")(strokeWeight.asInstanceOf[js.Any])
    if (strokeWeightStyler != null) __obj.updateDynamic("strokeWeightStyler")(strokeWeightStyler.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineStyle]
  }
}

