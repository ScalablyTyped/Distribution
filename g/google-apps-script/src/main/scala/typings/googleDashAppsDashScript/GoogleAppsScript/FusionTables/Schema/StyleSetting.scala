package typings.googleDashAppsDashScript.GoogleAppsScript.FusionTables.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleSetting extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var markerOptions: js.UndefOr[PointStyle] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var polygonOptions: js.UndefOr[PolygonStyle] = js.undefined
  var polylineOptions: js.UndefOr[LineStyle] = js.undefined
  var styleId: js.UndefOr[Double] = js.undefined
  var tableId: js.UndefOr[String] = js.undefined
}

object StyleSetting {
  @scala.inline
  def apply(
    kind: String = null,
    markerOptions: PointStyle = null,
    name: String = null,
    polygonOptions: PolygonStyle = null,
    polylineOptions: LineStyle = null,
    styleId: Int | Double = null,
    tableId: String = null
  ): StyleSetting = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (markerOptions != null) __obj.updateDynamic("markerOptions")(markerOptions)
    if (name != null) __obj.updateDynamic("name")(name)
    if (polygonOptions != null) __obj.updateDynamic("polygonOptions")(polygonOptions)
    if (polylineOptions != null) __obj.updateDynamic("polylineOptions")(polylineOptions)
    if (styleId != null) __obj.updateDynamic("styleId")(styleId.asInstanceOf[js.Any])
    if (tableId != null) __obj.updateDynamic("tableId")(tableId)
    __obj.asInstanceOf[StyleSetting]
  }
}

