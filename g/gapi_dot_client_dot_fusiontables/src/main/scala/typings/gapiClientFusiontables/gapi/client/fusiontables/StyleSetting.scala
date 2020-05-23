package typings.gapiClientFusiontables.gapi.client.fusiontables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleSetting extends js.Object {
  /**
    * The kind of item this is. A StyleSetting contains the style definitions for points, lines, and polygons in a table. Since a table can have any one or
    * all of them, a style definition can have point, line and polygon style definitions.
    */
  var kind: js.UndefOr[String] = js.undefined
  /** Style definition for points in the table. */
  var markerOptions: js.UndefOr[PointStyle] = js.undefined
  /** Optional name for the style setting. */
  var name: js.UndefOr[String] = js.undefined
  /** Style definition for polygons in the table. */
  var polygonOptions: js.UndefOr[PolygonStyle] = js.undefined
  /** Style definition for lines in the table. */
  var polylineOptions: js.UndefOr[LineStyle] = js.undefined
  /** Identifier for the style setting (unique only within tables). */
  var styleId: js.UndefOr[Double] = js.undefined
  /** Identifier for the table. */
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
    styleId: js.UndefOr[Double] = js.undefined,
    tableId: String = null
  ): StyleSetting = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (markerOptions != null) __obj.updateDynamic("markerOptions")(markerOptions.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (polygonOptions != null) __obj.updateDynamic("polygonOptions")(polygonOptions.asInstanceOf[js.Any])
    if (polylineOptions != null) __obj.updateDynamic("polylineOptions")(polylineOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(styleId)) __obj.updateDynamic("styleId")(styleId.get.asInstanceOf[js.Any])
    if (tableId != null) __obj.updateDynamic("tableId")(tableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSetting]
  }
}

