package typings.googleVisualization.google.visualization

import typings.googleVisualization.googleVisualizationStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoChartOptions extends js.Object {
  var backgroundColor: js.UndefOr[String | ChartStrokeFill] = js.native
  var colorAxis: js.UndefOr[ChartColorAxis] = js.native
  var datalessRegionColor: js.UndefOr[String] = js.native
  var defaultColor: js.UndefOr[String] = js.native
  var displayMode: js.UndefOr[String] = js.native
  var enableRegionInteractivity: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var keepAspectRatio: js.UndefOr[Boolean] = js.native
  var legend: js.UndefOr[ChartLegend | none] = js.native
  var magnifyingGlass: js.UndefOr[GeoChartMagnifyingGlass] = js.native
  var markerOpacity: js.UndefOr[Double] = js.native
  var region: js.UndefOr[String] = js.native
  var resolution: js.UndefOr[String] = js.native
  var sizeAxis: js.UndefOr[ChartSizeAxis] = js.native
  var tooltip: js.UndefOr[ChartTooltip] = js.native
  var width: js.UndefOr[Double] = js.native
}

object GeoChartOptions {
  @scala.inline
  def apply(): GeoChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoChartOptions]
  }
  @scala.inline
  implicit class GeoChartOptionsOps[Self <: GeoChartOptions] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String | ChartStrokeFill): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setColorAxis(value: ChartColorAxis): Self = this.set("colorAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorAxis: Self = this.set("colorAxis", js.undefined)
    @scala.inline
    def setDatalessRegionColor(value: String): Self = this.set("datalessRegionColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatalessRegionColor: Self = this.set("datalessRegionColor", js.undefined)
    @scala.inline
    def setDefaultColor(value: String): Self = this.set("defaultColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultColor: Self = this.set("defaultColor", js.undefined)
    @scala.inline
    def setDisplayMode(value: String): Self = this.set("displayMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayMode: Self = this.set("displayMode", js.undefined)
    @scala.inline
    def setEnableRegionInteractivity(value: Boolean): Self = this.set("enableRegionInteractivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRegionInteractivity: Self = this.set("enableRegionInteractivity", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setKeepAspectRatio(value: Boolean): Self = this.set("keepAspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepAspectRatio: Self = this.set("keepAspectRatio", js.undefined)
    @scala.inline
    def setLegend(value: ChartLegend | none): Self = this.set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    @scala.inline
    def setMagnifyingGlass(value: GeoChartMagnifyingGlass): Self = this.set("magnifyingGlass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMagnifyingGlass: Self = this.set("magnifyingGlass", js.undefined)
    @scala.inline
    def setMarkerOpacity(value: Double): Self = this.set("markerOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerOpacity: Self = this.set("markerOpacity", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setResolution(value: String): Self = this.set("resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
    @scala.inline
    def setSizeAxis(value: ChartSizeAxis): Self = this.set("sizeAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeAxis: Self = this.set("sizeAxis", js.undefined)
    @scala.inline
    def setTooltip(value: ChartTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

