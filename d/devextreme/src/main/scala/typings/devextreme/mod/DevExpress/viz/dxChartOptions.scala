package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonActionType
import typings.devextreme.AnonAllowMouseWheel
import typings.devextreme.AnonArgument
import typings.devextreme.AnonAxis
import typings.devextreme.AnonCancelComponentData
import typings.devextreme.AnonCheckTypeForAllData
import typings.devextreme.AnonComponentDxChart
import typings.devextreme.AnonComponentTElementDxElement
import typings.devextreme.AnonComponentTElementDxElementModelAny
import typings.devextreme.AnonCustomizeSeries
import typings.devextreme.AnonDuration
import typings.devextreme.AnonElement
import typings.devextreme.AnonElementModelTarget
import typings.devextreme.AnonElementTarget
import typings.devextreme.AnonEventJQueryEventModel
import typings.devextreme.AnonFormatModel
import typings.devextreme.AnonHorizontalLine
import typings.devextreme.AnonModel
import typings.devextreme.AnonModelTarget
import typings.devextreme.AnonName
import typings.devextreme.AnonOffset
import typings.devextreme.AnonTargetAny
import typings.devextreme.devextremeStrings.Bright
import typings.devextreme.devextremeStrings.Carmine
import typings.devextreme.devextremeStrings.Default
import typings.devextreme.devextremeStrings.Material
import typings.devextreme.devextremeStrings.Ocean
import typings.devextreme.devextremeStrings.Office
import typings.devextreme.devextremeStrings.Pastel
import typings.devextreme.devextremeStrings.Soft
import typings.devextreme.devextremeStrings.Vintage
import typings.devextreme.devextremeStrings.Violet
import typings.devextreme.devextremeStrings.`Dark Moon`
import typings.devextreme.devextremeStrings.`Dark Violet`
import typings.devextreme.devextremeStrings.`Green Mist`
import typings.devextreme.devextremeStrings.`Harmony Light`
import typings.devextreme.devextremeStrings.`Soft Blue`
import typings.devextreme.devextremeStrings.`Soft Pastel`
import typings.devextreme.devextremeStrings.all
import typings.devextreme.devextremeStrings.alternate
import typings.devextreme.devextremeStrings.blend
import typings.devextreme.devextremeStrings.extrapolate
import typings.devextreme.devextremeStrings.genericDotcarmine
import typings.devextreme.devextremeStrings.genericDotcontrast
import typings.devextreme.devextremeStrings.genericDotdark
import typings.devextreme.devextremeStrings.genericDotdarkmoon
import typings.devextreme.devextremeStrings.genericDotdarkviolet
import typings.devextreme.devextremeStrings.genericDotgreenmist
import typings.devextreme.devextremeStrings.genericDotlight
import typings.devextreme.devextremeStrings.genericDotsoftblue
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.ios7Dotdefault
import typings.devextreme.devextremeStrings.materialDotblueDotlight
import typings.devextreme.devextremeStrings.materialDotlimeDotlight
import typings.devextreme.devextremeStrings.materialDotorangeDotlight
import typings.devextreme.devextremeStrings.materialDotpurpleDotlight
import typings.devextreme.devextremeStrings.materialDottealDotlight
import typings.devextreme.devextremeStrings.mouse
import typings.devextreme.devextremeStrings.multiple
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.single_
import typings.devextreme.devextremeStrings.stack
import typings.devextreme.devextremeStrings.touch
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxChartOptions extends BaseChartOptions[dxChart] {
  /** @name dxChart.Options.adjustOnZoom */
  var adjustOnZoom: js.UndefOr[Boolean] = js.undefined
  /** @name dxChart.Options.annotations */
  var annotations: js.UndefOr[js.Array[dxChartAnnotationConfig | _]] = js.undefined
  /** @name dxChart.Options.argumentAxis */
  var argumentAxis: js.UndefOr[dxChartArgumentAxis] = js.undefined
  /** @name dxChart.Options.autoHidePointMarkers */
  var autoHidePointMarkers: js.UndefOr[Boolean] = js.undefined
  /** @name dxChart.Options.barGroupPadding */
  var barGroupPadding: js.UndefOr[Double] = js.undefined
  /** @name dxChart.Options.barGroupWidth */
  var barGroupWidth: js.UndefOr[Double] = js.undefined
  /** @deprecated */
  /** @name dxChart.Options.barWidth */
  var barWidth: js.UndefOr[Double] = js.undefined
  /** @name dxChart.Options.commonAnnotationSettings */
  var commonAnnotationSettings: js.UndefOr[dxChartCommonAnnotationConfig] = js.undefined
  /** @name dxChart.Options.commonAxisSettings */
  var commonAxisSettings: js.UndefOr[dxChartCommonAxisSettings] = js.undefined
  /** @name dxChart.Options.commonPaneSettings */
  var commonPaneSettings: js.UndefOr[dxChartCommonPaneSettings] = js.undefined
  /** @name dxChart.Options.commonSeriesSettings */
  var commonSeriesSettings: js.UndefOr[dxChartCommonSeriesSettings] = js.undefined
  /** @name dxChart.Options.containerBackgroundColor */
  var containerBackgroundColor: js.UndefOr[String] = js.undefined
  /** @name dxChart.Options.crosshair */
  var crosshair: js.UndefOr[AnonHorizontalLine] = js.undefined
  /** @name dxChart.Options.customizeAnnotation */
  var customizeAnnotation: js.UndefOr[
    js.Function1[/* annotation */ dxChartAnnotationConfig | js.Any, dxChartAnnotationConfig]
  ] = js.undefined
  /** @name dxChart.Options.dataPrepareSettings */
  var dataPrepareSettings: js.UndefOr[AnonCheckTypeForAllData] = js.undefined
  /** @name dxChart.Options.defaultPane */
  var defaultPane: js.UndefOr[String] = js.undefined
  /** @deprecated */
  /** @name dxChart.Options.equalBarWidth */
  var equalBarWidth: js.UndefOr[Boolean] = js.undefined
  /** @name dxChart.Options.legend */
  @JSName("legend")
  var legend_dxChartOptions: js.UndefOr[dxChartLegend] = js.undefined
  /** @name dxChart.Options.maxBubbleSize */
  var maxBubbleSize: js.UndefOr[Double] = js.undefined
  /** @name dxChart.Options.minBubbleSize */
  var minBubbleSize: js.UndefOr[Double] = js.undefined
  /** @name dxChart.Options.negativesAsZeroes */
  var negativesAsZeroes: js.UndefOr[Boolean] = js.undefined
  /** @name dxChart.Options.onArgumentAxisClick */
  var onArgumentAxisClick: js.UndefOr[(js.Function1[/* e */ AnonArgument, _]) | String] = js.undefined
  /** @name dxChart.Options.onLegendClick */
  var onLegendClick: js.UndefOr[(js.Function1[/* e */ AnonEventJQueryEventModel, _]) | String] = js.undefined
  /** @name dxChart.Options.onSeriesClick */
  var onSeriesClick: js.UndefOr[(js.Function1[/* e */ AnonEventJQueryEventModel, _]) | String] = js.undefined
  /** @name dxChart.Options.onSeriesHoverChanged */
  var onSeriesHoverChanged: js.UndefOr[js.Function1[/* e */ AnonComponentDxChart, _]] = js.undefined
  /** @name dxChart.Options.onSeriesSelectionChanged */
  var onSeriesSelectionChanged: js.UndefOr[js.Function1[/* e */ AnonComponentDxChart, _]] = js.undefined
  /** @name dxChart.Options.onZoomEnd */
  var onZoomEnd: js.UndefOr[js.Function1[/* e */ AnonActionType, _]] = js.undefined
  /** @name dxChart.Options.onZoomStart */
  var onZoomStart: js.UndefOr[js.Function1[/* e */ AnonAxis, _]] = js.undefined
  /** @name dxChart.Options.panes */
  var panes: js.UndefOr[dxChartPanes | js.Array[dxChartPanes]] = js.undefined
  /** @name dxChart.Options.resizePanesOnZoom */
  var resizePanesOnZoom: js.UndefOr[Boolean] = js.undefined
  /** @name dxChart.Options.resolveLabelOverlapping */
  var resolveLabelOverlapping: js.UndefOr[hide | none | stack] = js.undefined
  /** @name dxChart.Options.rotated */
  var rotated: js.UndefOr[Boolean] = js.undefined
  /** @name dxChart.Options.scrollBar */
  var scrollBar: js.UndefOr[AnonOffset] = js.undefined
  /** @deprecated */
  /** @name dxChart.Options.scrollingMode */
  var scrollingMode: js.UndefOr[all | mouse | none | touch] = js.undefined
  /** @name dxChart.Options.seriesSelectionMode */
  var seriesSelectionMode: js.UndefOr[multiple | single_] = js.undefined
  /** @name dxChart.Options.seriesTemplate */
  var seriesTemplate: js.UndefOr[AnonCustomizeSeries] = js.undefined
  /** @name dxChart.Options.series */
  @JSName("series")
  var series_dxChartOptions: js.UndefOr[ChartSeries | js.Array[ChartSeries]] = js.undefined
  /** @name dxChart.Options.stickyHovering */
  var stickyHovering: js.UndefOr[Boolean] = js.undefined
  /** @name dxChart.Options.synchronizeMultiAxes */
  var synchronizeMultiAxes: js.UndefOr[Boolean] = js.undefined
  /** @name dxChart.Options.tooltip */
  @JSName("tooltip")
  var tooltip_dxChartOptions: js.UndefOr[dxChartTooltip] = js.undefined
  /** @deprecated */
  /** @name dxChart.Options.useAggregation */
  var useAggregation: js.UndefOr[Boolean] = js.undefined
  /** @name dxChart.Options.valueAxis */
  var valueAxis: js.UndefOr[dxChartValueAxis | js.Array[dxChartValueAxis]] = js.undefined
  /** @name dxChart.Options.zoomAndPan */
  var zoomAndPan: js.UndefOr[AnonAllowMouseWheel] = js.undefined
  /** @deprecated */
  /** @name dxChart.Options.zoomingMode */
  var zoomingMode: js.UndefOr[all | mouse | none | touch] = js.undefined
}

object dxChartOptions {
  @scala.inline
  def apply(
    adaptiveLayout: BaseChartAdaptiveLayout = null,
    adjustOnZoom: js.UndefOr[Boolean] = js.undefined,
    animation: AnonDuration | Boolean = null,
    annotations: js.Array[dxChartAnnotationConfig | _] = null,
    argumentAxis: dxChartArgumentAxis = null,
    autoHidePointMarkers: js.UndefOr[Boolean] = js.undefined,
    barGroupPadding: Int | Double = null,
    barGroupWidth: Int | Double = null,
    barWidth: Int | Double = null,
    bindingOptions: js.Any = null,
    commonAnnotationSettings: dxChartCommonAnnotationConfig = null,
    commonAxisSettings: dxChartCommonAxisSettings = null,
    commonPaneSettings: dxChartCommonPaneSettings = null,
    commonSeriesSettings: dxChartCommonSeriesSettings = null,
    containerBackgroundColor: String = null,
    crosshair: AnonHorizontalLine = null,
    customizeAnnotation: /* annotation */ dxChartAnnotationConfig | js.Any => dxChartAnnotationConfig = null,
    customizeLabel: /* pointInfo */ js.Any => dxChartSeriesTypesCommonSeriesLabel = null,
    customizePoint: /* pointInfo */ js.Any => dxChartSeriesTypesCommonSeriesPoint = null,
    dataPrepareSettings: AnonCheckTypeForAllData = null,
    dataSource: js.Array[_] | DataSource | DataSourceOptions | String = null,
    defaultPane: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    equalBarWidth: js.UndefOr[Boolean] = js.undefined,
    export: BaseWidgetExport = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    legend: dxChartLegend = null,
    loadingIndicator: BaseWidgetLoadingIndicator = null,
    margin: BaseWidgetMargin = null,
    maxBubbleSize: Int | Double = null,
    minBubbleSize: Int | Double = null,
    negativesAsZeroes: js.UndefOr[Boolean] = js.undefined,
    onArgumentAxisClick: (js.Function1[/* e */ AnonArgument, _]) | String = null,
    onDisposing: /* e */ AnonModel[dxChart] => _ = null,
    onDone: /* e */ AnonComponentTElementDxElement[dxChart] => _ = null,
    onDrawn: /* e */ AnonComponentTElementDxElementModelAny[dxChart] => _ = null,
    onExported: /* e */ AnonComponentTElementDxElementModelAny[dxChart] => _ = null,
    onExporting: /* e */ AnonFormatModel[dxChart] => _ = null,
    onFileSaving: /* e */ AnonCancelComponentData[dxChart] => _ = null,
    onIncidentOccurred: /* e */ AnonTargetAny[dxChart] => _ = null,
    onInitialized: /* e */ AnonElement[dxChart] => _ = null,
    onLegendClick: (js.Function1[/* e */ AnonEventJQueryEventModel, _]) | String = null,
    onOptionChanged: /* e */ AnonName[dxChart] => _ = null,
    onPointClick: (js.Function1[/* e */ AnonModelTarget[dxChart], _]) | String = null,
    onPointHoverChanged: /* e */ AnonElementTarget => _ = null,
    onPointSelectionChanged: /* e */ AnonElementTarget => _ = null,
    onSeriesClick: (js.Function1[/* e */ AnonEventJQueryEventModel, _]) | String = null,
    onSeriesHoverChanged: /* e */ AnonComponentDxChart => _ = null,
    onSeriesSelectionChanged: /* e */ AnonComponentDxChart => _ = null,
    onTooltipHidden: /* e */ AnonElementModelTarget[dxChart] => _ = null,
    onTooltipShown: /* e */ AnonElementModelTarget[dxChart] => _ = null,
    onZoomEnd: /* e */ AnonActionType => _ = null,
    onZoomStart: /* e */ AnonAxis => _ = null,
    palette: js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office = null,
    paletteExtensionMode: alternate | blend | extrapolate = null,
    panes: dxChartPanes | js.Array[dxChartPanes] = null,
    pathModified: js.UndefOr[Boolean] = js.undefined,
    pointSelectionMode: multiple | single_ = null,
    redrawOnResize: js.UndefOr[Boolean] = js.undefined,
    resizePanesOnZoom: js.UndefOr[Boolean] = js.undefined,
    resolveLabelOverlapping: hide | none | stack = null,
    rotated: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    scrollBar: AnonOffset = null,
    scrollingMode: all | mouse | none | touch = null,
    series: ChartSeries | js.Array[ChartSeries] = null,
    seriesSelectionMode: multiple | single_ = null,
    seriesTemplate: AnonCustomizeSeries = null,
    size: BaseWidgetSize = null,
    stickyHovering: js.UndefOr[Boolean] = js.undefined,
    synchronizeMultiAxes: js.UndefOr[Boolean] = js.undefined,
    theme: genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight = null,
    title: BaseWidgetTitle | String = null,
    tooltip: dxChartTooltip = null,
    useAggregation: js.UndefOr[Boolean] = js.undefined,
    valueAxis: dxChartValueAxis | js.Array[dxChartValueAxis] = null,
    width: Double | String | (js.Function0[Double | String]) = null,
    zoomAndPan: AnonAllowMouseWheel = null,
    zoomingMode: all | mouse | none | touch = null
  ): dxChartOptions = {
    val __obj = js.Dynamic.literal()
    if (adaptiveLayout != null) __obj.updateDynamic("adaptiveLayout")(adaptiveLayout.asInstanceOf[js.Any])
    if (!js.isUndefined(adjustOnZoom)) __obj.updateDynamic("adjustOnZoom")(adjustOnZoom.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (argumentAxis != null) __obj.updateDynamic("argumentAxis")(argumentAxis.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHidePointMarkers)) __obj.updateDynamic("autoHidePointMarkers")(autoHidePointMarkers.asInstanceOf[js.Any])
    if (barGroupPadding != null) __obj.updateDynamic("barGroupPadding")(barGroupPadding.asInstanceOf[js.Any])
    if (barGroupWidth != null) __obj.updateDynamic("barGroupWidth")(barGroupWidth.asInstanceOf[js.Any])
    if (barWidth != null) __obj.updateDynamic("barWidth")(barWidth.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (commonAnnotationSettings != null) __obj.updateDynamic("commonAnnotationSettings")(commonAnnotationSettings.asInstanceOf[js.Any])
    if (commonAxisSettings != null) __obj.updateDynamic("commonAxisSettings")(commonAxisSettings.asInstanceOf[js.Any])
    if (commonPaneSettings != null) __obj.updateDynamic("commonPaneSettings")(commonPaneSettings.asInstanceOf[js.Any])
    if (commonSeriesSettings != null) __obj.updateDynamic("commonSeriesSettings")(commonSeriesSettings.asInstanceOf[js.Any])
    if (containerBackgroundColor != null) __obj.updateDynamic("containerBackgroundColor")(containerBackgroundColor.asInstanceOf[js.Any])
    if (crosshair != null) __obj.updateDynamic("crosshair")(crosshair.asInstanceOf[js.Any])
    if (customizeAnnotation != null) __obj.updateDynamic("customizeAnnotation")(js.Any.fromFunction1(customizeAnnotation))
    if (customizeLabel != null) __obj.updateDynamic("customizeLabel")(js.Any.fromFunction1(customizeLabel))
    if (customizePoint != null) __obj.updateDynamic("customizePoint")(js.Any.fromFunction1(customizePoint))
    if (dataPrepareSettings != null) __obj.updateDynamic("dataPrepareSettings")(dataPrepareSettings.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (defaultPane != null) __obj.updateDynamic("defaultPane")(defaultPane.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(equalBarWidth)) __obj.updateDynamic("equalBarWidth")(equalBarWidth.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (loadingIndicator != null) __obj.updateDynamic("loadingIndicator")(loadingIndicator.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maxBubbleSize != null) __obj.updateDynamic("maxBubbleSize")(maxBubbleSize.asInstanceOf[js.Any])
    if (minBubbleSize != null) __obj.updateDynamic("minBubbleSize")(minBubbleSize.asInstanceOf[js.Any])
    if (!js.isUndefined(negativesAsZeroes)) __obj.updateDynamic("negativesAsZeroes")(negativesAsZeroes.asInstanceOf[js.Any])
    if (onArgumentAxisClick != null) __obj.updateDynamic("onArgumentAxisClick")(onArgumentAxisClick.asInstanceOf[js.Any])
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onDone != null) __obj.updateDynamic("onDone")(js.Any.fromFunction1(onDone))
    if (onDrawn != null) __obj.updateDynamic("onDrawn")(js.Any.fromFunction1(onDrawn))
    if (onExported != null) __obj.updateDynamic("onExported")(js.Any.fromFunction1(onExported))
    if (onExporting != null) __obj.updateDynamic("onExporting")(js.Any.fromFunction1(onExporting))
    if (onFileSaving != null) __obj.updateDynamic("onFileSaving")(js.Any.fromFunction1(onFileSaving))
    if (onIncidentOccurred != null) __obj.updateDynamic("onIncidentOccurred")(js.Any.fromFunction1(onIncidentOccurred))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onLegendClick != null) __obj.updateDynamic("onLegendClick")(onLegendClick.asInstanceOf[js.Any])
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onPointClick != null) __obj.updateDynamic("onPointClick")(onPointClick.asInstanceOf[js.Any])
    if (onPointHoverChanged != null) __obj.updateDynamic("onPointHoverChanged")(js.Any.fromFunction1(onPointHoverChanged))
    if (onPointSelectionChanged != null) __obj.updateDynamic("onPointSelectionChanged")(js.Any.fromFunction1(onPointSelectionChanged))
    if (onSeriesClick != null) __obj.updateDynamic("onSeriesClick")(onSeriesClick.asInstanceOf[js.Any])
    if (onSeriesHoverChanged != null) __obj.updateDynamic("onSeriesHoverChanged")(js.Any.fromFunction1(onSeriesHoverChanged))
    if (onSeriesSelectionChanged != null) __obj.updateDynamic("onSeriesSelectionChanged")(js.Any.fromFunction1(onSeriesSelectionChanged))
    if (onTooltipHidden != null) __obj.updateDynamic("onTooltipHidden")(js.Any.fromFunction1(onTooltipHidden))
    if (onTooltipShown != null) __obj.updateDynamic("onTooltipShown")(js.Any.fromFunction1(onTooltipShown))
    if (onZoomEnd != null) __obj.updateDynamic("onZoomEnd")(js.Any.fromFunction1(onZoomEnd))
    if (onZoomStart != null) __obj.updateDynamic("onZoomStart")(js.Any.fromFunction1(onZoomStart))
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (paletteExtensionMode != null) __obj.updateDynamic("paletteExtensionMode")(paletteExtensionMode.asInstanceOf[js.Any])
    if (panes != null) __obj.updateDynamic("panes")(panes.asInstanceOf[js.Any])
    if (!js.isUndefined(pathModified)) __obj.updateDynamic("pathModified")(pathModified.asInstanceOf[js.Any])
    if (pointSelectionMode != null) __obj.updateDynamic("pointSelectionMode")(pointSelectionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(redrawOnResize)) __obj.updateDynamic("redrawOnResize")(redrawOnResize.asInstanceOf[js.Any])
    if (!js.isUndefined(resizePanesOnZoom)) __obj.updateDynamic("resizePanesOnZoom")(resizePanesOnZoom.asInstanceOf[js.Any])
    if (resolveLabelOverlapping != null) __obj.updateDynamic("resolveLabelOverlapping")(resolveLabelOverlapping.asInstanceOf[js.Any])
    if (!js.isUndefined(rotated)) __obj.updateDynamic("rotated")(rotated.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (scrollBar != null) __obj.updateDynamic("scrollBar")(scrollBar.asInstanceOf[js.Any])
    if (scrollingMode != null) __obj.updateDynamic("scrollingMode")(scrollingMode.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (seriesSelectionMode != null) __obj.updateDynamic("seriesSelectionMode")(seriesSelectionMode.asInstanceOf[js.Any])
    if (seriesTemplate != null) __obj.updateDynamic("seriesTemplate")(seriesTemplate.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(stickyHovering)) __obj.updateDynamic("stickyHovering")(stickyHovering.asInstanceOf[js.Any])
    if (!js.isUndefined(synchronizeMultiAxes)) __obj.updateDynamic("synchronizeMultiAxes")(synchronizeMultiAxes.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(useAggregation)) __obj.updateDynamic("useAggregation")(useAggregation.asInstanceOf[js.Any])
    if (valueAxis != null) __obj.updateDynamic("valueAxis")(valueAxis.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoomAndPan != null) __obj.updateDynamic("zoomAndPan")(zoomAndPan.asInstanceOf[js.Any])
    if (zoomingMode != null) __obj.updateDynamic("zoomingMode")(zoomingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartOptions]
  }
}

