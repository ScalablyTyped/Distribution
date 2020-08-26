package typings.googleVisualization.google.visualization

import typings.googleVisualization.anon.MapTypeId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapOptions extends js.Object {
  var enableScrollWheel: js.UndefOr[Boolean] = js.native
  var icons: js.UndefOr[js.Object] = js.native
  var lineColor: js.UndefOr[String] = js.native
  var lineWidth: js.UndefOr[Double] = js.native
  var mapType: js.UndefOr[String] = js.native
  var mapTypeIds: js.UndefOr[js.Array[_]] = js.native
  var maps: MapTypeId = js.native
  var showInfoWindow: js.UndefOr[Boolean] = js.native
  var showLine: js.UndefOr[Boolean] = js.native
  var showTooltip: js.UndefOr[Boolean] = js.native
  var useMapTypeControl: js.UndefOr[Boolean] = js.native
  var zoomLevel: js.UndefOr[Double] = js.native
}

object MapOptions {
  @scala.inline
  def apply(maps: MapTypeId): MapOptions = {
    val __obj = js.Dynamic.literal(maps = maps.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
  @scala.inline
  implicit class MapOptionsOps[Self <: MapOptions] (val x: Self) extends AnyVal {
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
    def setMaps(value: MapTypeId): Self = this.set("maps", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableScrollWheel(value: Boolean): Self = this.set("enableScrollWheel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableScrollWheel: Self = this.set("enableScrollWheel", js.undefined)
    @scala.inline
    def setIcons(value: js.Object): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    @scala.inline
    def setLineColor(value: String): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineColor: Self = this.set("lineColor", js.undefined)
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    @scala.inline
    def setMapType(value: String): Self = this.set("mapType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapType: Self = this.set("mapType", js.undefined)
    @scala.inline
    def setMapTypeIdsVarargs(value: js.Any*): Self = this.set("mapTypeIds", js.Array(value :_*))
    @scala.inline
    def setMapTypeIds(value: js.Array[_]): Self = this.set("mapTypeIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapTypeIds: Self = this.set("mapTypeIds", js.undefined)
    @scala.inline
    def setShowInfoWindow(value: Boolean): Self = this.set("showInfoWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowInfoWindow: Self = this.set("showInfoWindow", js.undefined)
    @scala.inline
    def setShowLine(value: Boolean): Self = this.set("showLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowLine: Self = this.set("showLine", js.undefined)
    @scala.inline
    def setShowTooltip(value: Boolean): Self = this.set("showTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTooltip: Self = this.set("showTooltip", js.undefined)
    @scala.inline
    def setUseMapTypeControl(value: Boolean): Self = this.set("useMapTypeControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseMapTypeControl: Self = this.set("useMapTypeControl", js.undefined)
    @scala.inline
    def setZoomLevel(value: Double): Self = this.set("zoomLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomLevel: Self = this.set("zoomLevel", js.undefined)
  }
  
}

