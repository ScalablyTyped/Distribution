package typings.gapiClientFusiontables.gapi.client.fusiontables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleSetting extends js.Object {
  /**
    * The kind of item this is. A StyleSetting contains the style definitions for points, lines, and polygons in a table. Since a table can have any one or
    * all of them, a style definition can have point, line and polygon style definitions.
    */
  var kind: js.UndefOr[String] = js.native
  /** Style definition for points in the table. */
  var markerOptions: js.UndefOr[PointStyle] = js.native
  /** Optional name for the style setting. */
  var name: js.UndefOr[String] = js.native
  /** Style definition for polygons in the table. */
  var polygonOptions: js.UndefOr[PolygonStyle] = js.native
  /** Style definition for lines in the table. */
  var polylineOptions: js.UndefOr[LineStyle] = js.native
  /** Identifier for the style setting (unique only within tables). */
  var styleId: js.UndefOr[Double] = js.native
  /** Identifier for the table. */
  var tableId: js.UndefOr[String] = js.native
}

object StyleSetting {
  @scala.inline
  def apply(): StyleSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleSetting]
  }
  @scala.inline
  implicit class StyleSettingOps[Self <: StyleSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMarkerOptions(value: PointStyle): Self = this.set("markerOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerOptions: Self = this.set("markerOptions", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPolygonOptions(value: PolygonStyle): Self = this.set("polygonOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolygonOptions: Self = this.set("polygonOptions", js.undefined)
    @scala.inline
    def setPolylineOptions(value: LineStyle): Self = this.set("polylineOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolylineOptions: Self = this.set("polylineOptions", js.undefined)
    @scala.inline
    def setStyleId(value: Double): Self = this.set("styleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleId: Self = this.set("styleId", js.undefined)
    @scala.inline
    def setTableId(value: String): Self = this.set("tableId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableId: Self = this.set("tableId", js.undefined)
  }
  
}

