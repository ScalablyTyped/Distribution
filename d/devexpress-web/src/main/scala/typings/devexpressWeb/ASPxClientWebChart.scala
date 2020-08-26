package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the WebChartControl control.
  */
@js.native
trait ASPxClientWebChart extends ASPxClientWebChartElement {
  /**
    * Provides access to the chart's collection of annotations.
    */
  var annotations: js.Array[ASPxClientAnnotation] = js.native
  /**
    * Gets the name of the appearance, which is currently used to draw the chart's elements.
    */
  var appearanceName: String = js.native
  /**
    * Gets the client-side Chart Control that owns the current chart.
    */
  var chartControl: ASPxClientWebChartControl = js.native
  /**
    * Gets the settings for a crosshair cursor concerning its position and appearance on a diagram.
    */
  var crosshairOptions: ASPxClientCrosshairOptions = js.native
  /**
    * Gets a css postfix for a chart.
    */
  var cssPostfix: String = js.native
  /**
    * Gets the chart's diagram and provides access to its settings.
    */
  var diagram: ASPxClientWebChartElement = js.native
  /**
    * Gets the chart's legend and provides access to its settings.
    */
  var legend: ASPxClientLegend = js.native
  /**
    * Returns the collection of legends.
    */
  var legends: js.Array[ASPxClientLegend] = js.native
  /**
    * Gets the name of the palette currently used to draw the chart's series.
    */
  var paletteName: String = js.native
  /**
    * Gets or sets a value which specifies how the chart elements are selected.
    */
  var selectionMode: String = js.native
  /**
    * Provides access to the chart's collection of series.
    */
  var series: js.Array[ASPxClientSeries] = js.native
  /**
    * Gets a value indicating whether a crosshair cursor should be shown.
    */
  var showCrosshair: Boolean = js.native
  /**
    * Gets a value indicating whether point tooltips should be shown.
    */
  var showPointToolTip: Boolean = js.native
  /**
    * Gets a value indicating whether series tooltips should be shown.
    */
  var showSeriesToolTip: Boolean = js.native
  /**
    * Provides access to the collection of chart titles.
    */
  var titles: js.Array[ASPxClientChartTitle] = js.native
  /**
    * Returns the tooltip controller that shows tooltips for chart elements.
    */
  var toolTipController: ASPxClientToolTipController = js.native
  /**
    * Gets a value that contains information on how the tooltip position is defined, for example, relative to a mouse pointer or chart element.
    */
  var toolTipPosition: ASPxClientToolTipPosition = js.native
}

object ASPxClientWebChart {
  @scala.inline
  def apply(
    annotations: js.Array[ASPxClientAnnotation],
    appearanceName: String,
    chart: ASPxClientWebChart,
    chartControl: ASPxClientWebChartControl,
    crosshairOptions: ASPxClientCrosshairOptions,
    cssPostfix: String,
    diagram: ASPxClientWebChartElement,
    legend: ASPxClientLegend,
    legends: js.Array[ASPxClientLegend],
    paletteName: String,
    selectionMode: String,
    series: js.Array[ASPxClientSeries],
    showCrosshair: Boolean,
    showPointToolTip: Boolean,
    showSeriesToolTip: Boolean,
    titles: js.Array[ASPxClientChartTitle],
    toolTipController: ASPxClientToolTipController,
    toolTipPosition: ASPxClientToolTipPosition
  ): ASPxClientWebChart = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], appearanceName = appearanceName.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], chartControl = chartControl.asInstanceOf[js.Any], crosshairOptions = crosshairOptions.asInstanceOf[js.Any], cssPostfix = cssPostfix.asInstanceOf[js.Any], diagram = diagram.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], legends = legends.asInstanceOf[js.Any], paletteName = paletteName.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], showCrosshair = showCrosshair.asInstanceOf[js.Any], showPointToolTip = showPointToolTip.asInstanceOf[js.Any], showSeriesToolTip = showSeriesToolTip.asInstanceOf[js.Any], titles = titles.asInstanceOf[js.Any], toolTipController = toolTipController.asInstanceOf[js.Any], toolTipPosition = toolTipPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebChart]
  }
  @scala.inline
  implicit class ASPxClientWebChartOps[Self <: ASPxClientWebChart] (val x: Self) extends AnyVal {
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
    def setAnnotationsVarargs(value: ASPxClientAnnotation*): Self = this.set("annotations", js.Array(value :_*))
    @scala.inline
    def setAnnotations(value: js.Array[ASPxClientAnnotation]): Self = this.set("annotations", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppearanceName(value: String): Self = this.set("appearanceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setChartControl(value: ASPxClientWebChartControl): Self = this.set("chartControl", value.asInstanceOf[js.Any])
    @scala.inline
    def setCrosshairOptions(value: ASPxClientCrosshairOptions): Self = this.set("crosshairOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setCssPostfix(value: String): Self = this.set("cssPostfix", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiagram(value: ASPxClientWebChartElement): Self = this.set("diagram", value.asInstanceOf[js.Any])
    @scala.inline
    def setLegend(value: ASPxClientLegend): Self = this.set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def setLegendsVarargs(value: ASPxClientLegend*): Self = this.set("legends", js.Array(value :_*))
    @scala.inline
    def setLegends(value: js.Array[ASPxClientLegend]): Self = this.set("legends", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaletteName(value: String): Self = this.set("paletteName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionMode(value: String): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeriesVarargs(value: ASPxClientSeries*): Self = this.set("series", js.Array(value :_*))
    @scala.inline
    def setSeries(value: js.Array[ASPxClientSeries]): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowCrosshair(value: Boolean): Self = this.set("showCrosshair", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowPointToolTip(value: Boolean): Self = this.set("showPointToolTip", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowSeriesToolTip(value: Boolean): Self = this.set("showSeriesToolTip", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitlesVarargs(value: ASPxClientChartTitle*): Self = this.set("titles", js.Array(value :_*))
    @scala.inline
    def setTitles(value: js.Array[ASPxClientChartTitle]): Self = this.set("titles", value.asInstanceOf[js.Any])
    @scala.inline
    def setToolTipController(value: ASPxClientToolTipController): Self = this.set("toolTipController", value.asInstanceOf[js.Any])
    @scala.inline
    def setToolTipPosition(value: ASPxClientToolTipPosition): Self = this.set("toolTipPosition", value.asInstanceOf[js.Any])
  }
  
}

