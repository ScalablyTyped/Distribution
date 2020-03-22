package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonArgumentComponent
import typings.devextreme.AnonCancelComponentData
import typings.devextreme.AnonComponentDxPolarChart
import typings.devextreme.AnonComponentTElementDxElement
import typings.devextreme.AnonComponentTElementDxElementModelAny
import typings.devextreme.AnonConvertToAxisDataType
import typings.devextreme.AnonCustomizeSeriesNameField
import typings.devextreme.AnonDuration
import typings.devextreme.AnonElement
import typings.devextreme.AnonElementModelTarget
import typings.devextreme.AnonElementTarget
import typings.devextreme.AnonFormatModel
import typings.devextreme.AnonJQueryEventModelTarget
import typings.devextreme.AnonModel
import typings.devextreme.AnonModelTarget
import typings.devextreme.AnonName
import typings.devextreme.AnonPreviousRange
import typings.devextreme.AnonRange
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
import typings.devextreme.devextremeStrings.multiple
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.single_
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartOptions extends BaseChartOptions[dxPolarChart] {
  /** Specifies adaptive layout options. */
  @JSName("adaptiveLayout")
  var adaptiveLayout_dxPolarChartOptions: js.UndefOr[dxPolarChartAdaptiveLayout] = js.undefined
  /** Specifies argument axis options for the PolarChart widget. */
  var argumentAxis: js.UndefOr[dxPolarChartArgumentAxis] = js.undefined
  /** Controls the padding and consequently the angular width of a group of bars with the same argument using relative units. Ignored if the barGroupWidth option is set. */
  var barGroupPadding: js.UndefOr[Double] = js.undefined
  /** Specifies a fixed angular width for groups of bars with the same argument, measured in degrees. Takes precedence over the barGroupPadding option. */
  var barGroupWidth: js.UndefOr[Double] = js.undefined
  /** @deprecated Use CommonPolarChartSeries.barPadding instead. */
  /** Specifies a common bar width as a percentage from 0 to 1. */
  var barWidth: js.UndefOr[Double] = js.undefined
  /** An object defining the configuration options that are common for all axes of the PolarChart widget. */
  var commonAxisSettings: js.UndefOr[dxPolarChartCommonAxisSettings] = js.undefined
  /** An object defining the configuration options that are common for all series of the PolarChart widget. */
  var commonSeriesSettings: js.UndefOr[dxPolarChartCommonSeriesSettings] = js.undefined
  /** Specifies the color of the parent page element. */
  var containerBackgroundColor: js.UndefOr[String] = js.undefined
  /** An object providing options for managing data from a data source. */
  var dataPrepareSettings: js.UndefOr[AnonConvertToAxisDataType] = js.undefined
  /** @deprecated Use CommonPolarChartSeries.ignoreEmptyPoints instead. */
  /** Specifies whether or not all bars in a series must have the same angle, or may have different angles if any points in other series are missing. */
  var equalBarWidth: js.UndefOr[Boolean] = js.undefined
  /** Specifies the options of a chart's legend. */
  @JSName("legend")
  var legend_dxPolarChartOptions: js.UndefOr[dxPolarChartLegend] = js.undefined
  /** Forces the widget to treat negative values as zeroes. Applies to stacked-like series only. */
  var negativesAsZeroes: js.UndefOr[Boolean] = js.undefined
  /** A function that is executed when a label on the argument axis is clicked or tapped. */
  var onArgumentAxisClick: js.UndefOr[(js.Function1[/* e */ AnonArgumentComponent, _]) | String] = js.undefined
  /** A function that is executed when a legend item is clicked or tapped. */
  var onLegendClick: js.UndefOr[(js.Function1[/* e */ AnonJQueryEventModelTarget, _]) | String] = js.undefined
  /** A function that is executed when a series is clicked or tapped. */
  var onSeriesClick: js.UndefOr[(js.Function1[/* e */ AnonJQueryEventModelTarget, _]) | String] = js.undefined
  /** A function that is executed after the pointer enters or leaves a series. */
  var onSeriesHoverChanged: js.UndefOr[js.Function1[/* e */ AnonComponentDxPolarChart, _]] = js.undefined
  /** A function that is executed when a series is selected or selection is canceled. */
  var onSeriesSelectionChanged: js.UndefOr[js.Function1[/* e */ AnonComponentDxPolarChart, _]] = js.undefined
  /** A function that is executed when zooming or panning ends. */
  var onZoomEnd: js.UndefOr[js.Function1[/* e */ AnonPreviousRange, _]] = js.undefined
  /** A function that is executed when zooming or panning begins. */
  var onZoomStart: js.UndefOr[js.Function1[/* e */ AnonRange, _]] = js.undefined
  /** Specifies how the chart must behave when series point labels overlap. */
  var resolveLabelOverlapping: js.UndefOr[hide | none] = js.undefined
  /** Specifies whether a single series or multiple series can be selected in the chart. */
  var seriesSelectionMode: js.UndefOr[multiple | single_] = js.undefined
  /** Defines options for the series template. */
  var seriesTemplate: js.UndefOr[AnonCustomizeSeriesNameField] = js.undefined
  /** Specifies options for PolarChart widget series. */
  @JSName("series")
  var series_dxPolarChartOptions: js.UndefOr[PolarChartSeries | js.Array[PolarChartSeries]] = js.undefined
  /** Configures tooltips. */
  @JSName("tooltip")
  var tooltip_dxPolarChartOptions: js.UndefOr[dxPolarChartTooltip] = js.undefined
  /** Indicates whether or not to display a "spider web". */
  var useSpiderWeb: js.UndefOr[Boolean] = js.undefined
  /** Specifies value axis options for the PolarChart widget. */
  var valueAxis: js.UndefOr[dxPolarChartValueAxis] = js.undefined
}

object dxPolarChartOptions {
  @scala.inline
  def apply(
    adaptiveLayout: dxPolarChartAdaptiveLayout = null,
    animation: AnonDuration | Boolean = null,
    argumentAxis: dxPolarChartArgumentAxis = null,
    barGroupPadding: Int | Double = null,
    barGroupWidth: Int | Double = null,
    barWidth: Int | Double = null,
    bindingOptions: js.Any = null,
    commonAxisSettings: dxPolarChartCommonAxisSettings = null,
    commonSeriesSettings: dxPolarChartCommonSeriesSettings = null,
    containerBackgroundColor: String = null,
    customizeLabel: /* pointInfo */ js.Any => dxChartSeriesTypesCommonSeriesLabel = null,
    customizePoint: /* pointInfo */ js.Any => dxChartSeriesTypesCommonSeriesPoint = null,
    dataPrepareSettings: AnonConvertToAxisDataType = null,
    dataSource: js.Array[_] | DataSource | DataSourceOptions | String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    equalBarWidth: js.UndefOr[Boolean] = js.undefined,
    export: BaseWidgetExport = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    legend: dxPolarChartLegend = null,
    loadingIndicator: BaseWidgetLoadingIndicator = null,
    margin: BaseWidgetMargin = null,
    negativesAsZeroes: js.UndefOr[Boolean] = js.undefined,
    onArgumentAxisClick: (js.Function1[/* e */ AnonArgumentComponent, _]) | String = null,
    onDisposing: /* e */ AnonModel[dxPolarChart] => _ = null,
    onDone: /* e */ AnonComponentTElementDxElement[dxPolarChart] => _ = null,
    onDrawn: /* e */ AnonComponentTElementDxElementModelAny[dxPolarChart] => _ = null,
    onExported: /* e */ AnonComponentTElementDxElementModelAny[dxPolarChart] => _ = null,
    onExporting: /* e */ AnonFormatModel[dxPolarChart] => _ = null,
    onFileSaving: /* e */ AnonCancelComponentData[dxPolarChart] => _ = null,
    onIncidentOccurred: /* e */ AnonTargetAny[dxPolarChart] => _ = null,
    onInitialized: /* e */ AnonElement[dxPolarChart] => _ = null,
    onLegendClick: (js.Function1[/* e */ AnonJQueryEventModelTarget, _]) | String = null,
    onOptionChanged: /* e */ AnonName[dxPolarChart] => _ = null,
    onPointClick: (js.Function1[/* e */ AnonModelTarget[dxPolarChart], _]) | String = null,
    onPointHoverChanged: /* e */ AnonElementTarget => _ = null,
    onPointSelectionChanged: /* e */ AnonElementTarget => _ = null,
    onSeriesClick: (js.Function1[/* e */ AnonJQueryEventModelTarget, _]) | String = null,
    onSeriesHoverChanged: /* e */ AnonComponentDxPolarChart => _ = null,
    onSeriesSelectionChanged: /* e */ AnonComponentDxPolarChart => _ = null,
    onTooltipHidden: /* e */ AnonElementModelTarget[dxPolarChart] => _ = null,
    onTooltipShown: /* e */ AnonElementModelTarget[dxPolarChart] => _ = null,
    onZoomEnd: /* e */ AnonPreviousRange => _ = null,
    onZoomStart: /* e */ AnonRange => _ = null,
    palette: js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office = null,
    paletteExtensionMode: alternate | blend | extrapolate = null,
    pathModified: js.UndefOr[Boolean] = js.undefined,
    pointSelectionMode: multiple | single_ = null,
    redrawOnResize: js.UndefOr[Boolean] = js.undefined,
    resolveLabelOverlapping: hide | none = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    series: PolarChartSeries | js.Array[PolarChartSeries] = null,
    seriesSelectionMode: multiple | single_ = null,
    seriesTemplate: AnonCustomizeSeriesNameField = null,
    size: BaseWidgetSize = null,
    theme: genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight = null,
    title: BaseWidgetTitle | String = null,
    tooltip: dxPolarChartTooltip = null,
    useSpiderWeb: js.UndefOr[Boolean] = js.undefined,
    valueAxis: dxPolarChartValueAxis = null,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxPolarChartOptions = {
    val __obj = js.Dynamic.literal()
    if (adaptiveLayout != null) __obj.updateDynamic("adaptiveLayout")(adaptiveLayout.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (argumentAxis != null) __obj.updateDynamic("argumentAxis")(argumentAxis.asInstanceOf[js.Any])
    if (barGroupPadding != null) __obj.updateDynamic("barGroupPadding")(barGroupPadding.asInstanceOf[js.Any])
    if (barGroupWidth != null) __obj.updateDynamic("barGroupWidth")(barGroupWidth.asInstanceOf[js.Any])
    if (barWidth != null) __obj.updateDynamic("barWidth")(barWidth.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (commonAxisSettings != null) __obj.updateDynamic("commonAxisSettings")(commonAxisSettings.asInstanceOf[js.Any])
    if (commonSeriesSettings != null) __obj.updateDynamic("commonSeriesSettings")(commonSeriesSettings.asInstanceOf[js.Any])
    if (containerBackgroundColor != null) __obj.updateDynamic("containerBackgroundColor")(containerBackgroundColor.asInstanceOf[js.Any])
    if (customizeLabel != null) __obj.updateDynamic("customizeLabel")(js.Any.fromFunction1(customizeLabel))
    if (customizePoint != null) __obj.updateDynamic("customizePoint")(js.Any.fromFunction1(customizePoint))
    if (dataPrepareSettings != null) __obj.updateDynamic("dataPrepareSettings")(dataPrepareSettings.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(equalBarWidth)) __obj.updateDynamic("equalBarWidth")(equalBarWidth.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (loadingIndicator != null) __obj.updateDynamic("loadingIndicator")(loadingIndicator.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
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
    if (!js.isUndefined(pathModified)) __obj.updateDynamic("pathModified")(pathModified.asInstanceOf[js.Any])
    if (pointSelectionMode != null) __obj.updateDynamic("pointSelectionMode")(pointSelectionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(redrawOnResize)) __obj.updateDynamic("redrawOnResize")(redrawOnResize.asInstanceOf[js.Any])
    if (resolveLabelOverlapping != null) __obj.updateDynamic("resolveLabelOverlapping")(resolveLabelOverlapping.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (seriesSelectionMode != null) __obj.updateDynamic("seriesSelectionMode")(seriesSelectionMode.asInstanceOf[js.Any])
    if (seriesTemplate != null) __obj.updateDynamic("seriesTemplate")(seriesTemplate.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(useSpiderWeb)) __obj.updateDynamic("useSpiderWeb")(useSpiderWeb.asInstanceOf[js.Any])
    if (valueAxis != null) __obj.updateDynamic("valueAxis")(valueAxis.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartOptions]
  }
}

