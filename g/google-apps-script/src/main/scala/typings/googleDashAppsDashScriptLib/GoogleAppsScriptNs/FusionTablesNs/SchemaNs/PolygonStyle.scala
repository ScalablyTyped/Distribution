package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolygonStyle extends js.Object {
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  var fillColorStyler: js.UndefOr[StyleFunction] = js.undefined
  var fillOpacity: js.UndefOr[stdLib.Number] = js.undefined
  var strokeColor: js.UndefOr[java.lang.String] = js.undefined
  var strokeColorStyler: js.UndefOr[StyleFunction] = js.undefined
  var strokeOpacity: js.UndefOr[stdLib.Number] = js.undefined
  var strokeWeight: js.UndefOr[scala.Double] = js.undefined
  var strokeWeightStyler: js.UndefOr[StyleFunction] = js.undefined
}

object PolygonStyle {
  @scala.inline
  def apply(
    fillColor: java.lang.String = null,
    fillColorStyler: StyleFunction = null,
    fillOpacity: stdLib.Number = null,
    strokeColor: java.lang.String = null,
    strokeColorStyler: StyleFunction = null,
    strokeOpacity: stdLib.Number = null,
    strokeWeight: scala.Int | scala.Double = null,
    strokeWeightStyler: StyleFunction = null
  ): PolygonStyle = {
    val __obj = js.Dynamic.literal()
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (fillColorStyler != null) __obj.updateDynamic("fillColorStyler")(fillColorStyler)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity)
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeColorStyler != null) __obj.updateDynamic("strokeColorStyler")(strokeColorStyler)
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity)
    if (strokeWeight != null) __obj.updateDynamic("strokeWeight")(strokeWeight.asInstanceOf[js.Any])
    if (strokeWeightStyler != null) __obj.updateDynamic("strokeWeightStyler")(strokeWeightStyler)
    __obj.asInstanceOf[PolygonStyle]
  }
}

