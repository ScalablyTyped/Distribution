package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.CancelComponentData
import typings.devextreme.anon.ComponentTElementDxElement
import typings.devextreme.anon.ComponentTElementDxElementModelAny
import typings.devextreme.anon.Duration
import typings.devextreme.anon.Element
import typings.devextreme.anon.ElementModelTarget
import typings.devextreme.anon.ElementTarget
import typings.devextreme.anon.FormatModel
import typings.devextreme.anon.Model
import typings.devextreme.anon.ModelTarget
import typings.devextreme.anon.Name
import typings.devextreme.anon.NameField
import typings.devextreme.anon.Points
import typings.devextreme.anon.TargetAny
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
import typings.devextreme.devextremeStrings.alternate
import typings.devextreme.devextremeStrings.anticlockwise
import typings.devextreme.devextremeStrings.blend
import typings.devextreme.devextremeStrings.clockwise
import typings.devextreme.devextremeStrings.donut
import typings.devextreme.devextremeStrings.doughnut
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
import typings.devextreme.devextremeStrings.multiple
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.pie
import typings.devextreme.devextremeStrings.shift
import typings.devextreme.devextremeStrings.single_
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod.global.JQuery
import typings.std.SVGElement
import typings.std.SVGGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPieChartOptions extends BaseChartOptions[dxPieChart] {
  /** @name dxPieChart.Options.adaptiveLayout */
  @JSName("adaptiveLayout")
  var adaptiveLayout_dxPieChartOptions: js.UndefOr[dxPieChartAdaptiveLayout] = js.undefined
  /** @name dxPieChart.Options.centerTemplate */
  var centerTemplate: js.UndefOr[
    template | (js.Function2[/* component */ dxPieChart, /* element */ SVGGElement, String | SVGElement | JQuery])
  ] = js.undefined
  /** @name dxPieChart.Options.commonSeriesSettings */
  var commonSeriesSettings: js.UndefOr[js.Any] = js.undefined
  /** @name dxPieChart.Options.diameter */
  var diameter: js.UndefOr[Double] = js.undefined
  /** @name dxPieChart.Options.innerRadius */
  var innerRadius: js.UndefOr[Double] = js.undefined
  /** @name dxPieChart.Options.legend */
  @JSName("legend")
  var legend_dxPieChartOptions: js.UndefOr[dxPieChartLegend] = js.undefined
  /** @name dxPieChart.Options.minDiameter */
  var minDiameter: js.UndefOr[Double] = js.undefined
  /** @name dxPieChart.Options.onLegendClick */
  var onLegendClick: js.UndefOr[(js.Function1[/* e */ Points, _]) | String] = js.undefined
  /** @name dxPieChart.Options.resolveLabelOverlapping */
  var resolveLabelOverlapping: js.UndefOr[hide | none | shift] = js.undefined
  /** @name dxPieChart.Options.segmentsDirection */
  var segmentsDirection: js.UndefOr[anticlockwise | clockwise] = js.undefined
  /** @name dxPieChart.Options.seriesTemplate */
  var seriesTemplate: js.UndefOr[NameField] = js.undefined
  /** @name dxPieChart.Options.series */
  @JSName("series")
  var series_dxPieChartOptions: js.UndefOr[PieChartSeries | js.Array[PieChartSeries]] = js.undefined
  /** @name dxPieChart.Options.sizeGroup */
  var sizeGroup: js.UndefOr[String] = js.undefined
  /** @name dxPieChart.Options.startAngle */
  var startAngle: js.UndefOr[Double] = js.undefined
  /** @name dxPieChart.Options.type */
  var `type`: js.UndefOr[donut | doughnut | pie] = js.undefined
}

object dxPieChartOptions {
  @scala.inline
  def apply(
    adaptiveLayout: dxPieChartAdaptiveLayout = null,
    animation: Duration | Boolean = null,
    bindingOptions: js.Any = null,
    centerTemplate: template | (js.Function2[/* component */ dxPieChart, /* element */ SVGGElement, String | SVGElement | JQuery]) = null,
    commonSeriesSettings: js.Any = null,
    customizeLabel: /* pointInfo */ js.Any => dxChartSeriesTypesCommonSeriesLabel = null,
    customizePoint: /* pointInfo */ js.Any => dxChartSeriesTypesCommonSeriesPoint = null,
    dataSource: js.Array[_] | DataSource | DataSourceOptions | String = null,
    diameter: js.UndefOr[Double] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    export: BaseWidgetExport = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    innerRadius: js.UndefOr[Double] = js.undefined,
    legend: dxPieChartLegend = null,
    loadingIndicator: BaseWidgetLoadingIndicator = null,
    margin: BaseWidgetMargin = null,
    minDiameter: js.UndefOr[Double] = js.undefined,
    onDisposing: /* e */ Model[dxPieChart] => _ = null,
    onDone: /* e */ ComponentTElementDxElement[dxPieChart] => _ = null,
    onDrawn: /* e */ ComponentTElementDxElementModelAny[dxPieChart] => _ = null,
    onExported: /* e */ ComponentTElementDxElementModelAny[dxPieChart] => _ = null,
    onExporting: /* e */ FormatModel[dxPieChart] => _ = null,
    onFileSaving: /* e */ CancelComponentData[dxPieChart] => _ = null,
    onIncidentOccurred: /* e */ TargetAny[dxPieChart] => _ = null,
    onInitialized: /* e */ Element[dxPieChart] => _ = null,
    onLegendClick: (js.Function1[/* e */ Points, _]) | String = null,
    onOptionChanged: /* e */ Name[dxPieChart] => _ = null,
    onPointClick: (js.Function1[/* e */ ModelTarget[dxPieChart], _]) | String = null,
    onPointHoverChanged: /* e */ ElementTarget => _ = null,
    onPointSelectionChanged: /* e */ ElementTarget => _ = null,
    onTooltipHidden: /* e */ ElementModelTarget[dxPieChart] => _ = null,
    onTooltipShown: /* e */ ElementModelTarget[dxPieChart] => _ = null,
    palette: js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office = null,
    paletteExtensionMode: alternate | blend | extrapolate = null,
    pathModified: js.UndefOr[Boolean] = js.undefined,
    pointSelectionMode: multiple | single_ = null,
    redrawOnResize: js.UndefOr[Boolean] = js.undefined,
    resolveLabelOverlapping: hide | none | shift = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    segmentsDirection: anticlockwise | clockwise = null,
    series: PieChartSeries | js.Array[PieChartSeries] = null,
    seriesTemplate: NameField = null,
    size: BaseWidgetSize = null,
    sizeGroup: String = null,
    startAngle: js.UndefOr[Double] = js.undefined,
    theme: genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight = null,
    title: BaseWidgetTitle | String = null,
    tooltip: BaseChartTooltip = null,
    `type`: donut | doughnut | pie = null,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxPieChartOptions = {
    val __obj = js.Dynamic.literal()
    if (adaptiveLayout != null) __obj.updateDynamic("adaptiveLayout")(adaptiveLayout.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (centerTemplate != null) __obj.updateDynamic("centerTemplate")(centerTemplate.asInstanceOf[js.Any])
    if (commonSeriesSettings != null) __obj.updateDynamic("commonSeriesSettings")(commonSeriesSettings.asInstanceOf[js.Any])
    if (customizeLabel != null) __obj.updateDynamic("customizeLabel")(js.Any.fromFunction1(customizeLabel))
    if (customizePoint != null) __obj.updateDynamic("customizePoint")(js.Any.fromFunction1(customizePoint))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(diameter)) __obj.updateDynamic("diameter")(diameter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(innerRadius)) __obj.updateDynamic("innerRadius")(innerRadius.get.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (loadingIndicator != null) __obj.updateDynamic("loadingIndicator")(loadingIndicator.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(minDiameter)) __obj.updateDynamic("minDiameter")(minDiameter.get.asInstanceOf[js.Any])
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
    if (onTooltipHidden != null) __obj.updateDynamic("onTooltipHidden")(js.Any.fromFunction1(onTooltipHidden))
    if (onTooltipShown != null) __obj.updateDynamic("onTooltipShown")(js.Any.fromFunction1(onTooltipShown))
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (paletteExtensionMode != null) __obj.updateDynamic("paletteExtensionMode")(paletteExtensionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(pathModified)) __obj.updateDynamic("pathModified")(pathModified.get.asInstanceOf[js.Any])
    if (pointSelectionMode != null) __obj.updateDynamic("pointSelectionMode")(pointSelectionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(redrawOnResize)) __obj.updateDynamic("redrawOnResize")(redrawOnResize.get.asInstanceOf[js.Any])
    if (resolveLabelOverlapping != null) __obj.updateDynamic("resolveLabelOverlapping")(resolveLabelOverlapping.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (segmentsDirection != null) __obj.updateDynamic("segmentsDirection")(segmentsDirection.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (seriesTemplate != null) __obj.updateDynamic("seriesTemplate")(seriesTemplate.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sizeGroup != null) __obj.updateDynamic("sizeGroup")(sizeGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(startAngle)) __obj.updateDynamic("startAngle")(startAngle.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPieChartOptions]
  }
}

