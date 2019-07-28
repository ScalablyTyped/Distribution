package typings.googleDashAppsDashScript.GoogleAppsScriptNs.FusionTablesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolygonStyle extends js.Object {
  var fillColor: js.UndefOr[String] = js.undefined
  var fillColorStyler: js.UndefOr[StyleFunction] = js.undefined
  var fillOpacity: js.UndefOr[Double] = js.undefined
  var strokeColor: js.UndefOr[String] = js.undefined
  var strokeColorStyler: js.UndefOr[StyleFunction] = js.undefined
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  var strokeWeight: js.UndefOr[Double] = js.undefined
  var strokeWeightStyler: js.UndefOr[StyleFunction] = js.undefined
}

object PolygonStyle {
  @scala.inline
  def apply(
    fillColor: String = null,
    fillColorStyler: StyleFunction = null,
    fillOpacity: Int | Double = null,
    strokeColor: String = null,
    strokeColorStyler: StyleFunction = null,
    strokeOpacity: Int | Double = null,
    strokeWeight: Int | Double = null,
    strokeWeightStyler: StyleFunction = null
  ): PolygonStyle = {
    val __obj = js.Dynamic.literal()
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (fillColorStyler != null) __obj.updateDynamic("fillColorStyler")(fillColorStyler)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeColorStyler != null) __obj.updateDynamic("strokeColorStyler")(strokeColorStyler)
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWeight != null) __obj.updateDynamic("strokeWeight")(strokeWeight.asInstanceOf[js.Any])
    if (strokeWeightStyler != null) __obj.updateDynamic("strokeWeightStyler")(strokeWeightStyler)
    __obj.asInstanceOf[PolygonStyle]
  }
}

