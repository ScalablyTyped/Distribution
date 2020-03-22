package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonCancelComponentData
import typings.devextreme.AnonComponentTElementDxElement
import typings.devextreme.AnonComponentTElementDxElementModelAny
import typings.devextreme.AnonDuration
import typings.devextreme.AnonElement
import typings.devextreme.AnonElementModelTarget
import typings.devextreme.AnonElementTarget
import typings.devextreme.AnonFormatModel
import typings.devextreme.AnonModel
import typings.devextreme.AnonModelTarget
import typings.devextreme.AnonName
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
import typings.devextreme.devextremeStrings.ios7Dotdefault
import typings.devextreme.devextremeStrings.materialDotblueDotlight
import typings.devextreme.devextremeStrings.materialDotlimeDotlight
import typings.devextreme.devextremeStrings.materialDotorangeDotlight
import typings.devextreme.devextremeStrings.materialDotpurpleDotlight
import typings.devextreme.devextremeStrings.materialDottealDotlight
import typings.devextreme.devextremeStrings.multiple
import typings.devextreme.devextremeStrings.single_
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseChartOptions[T] extends BaseWidgetOptions[T] {
  /** Specifies adaptive layout options. */
  var adaptiveLayout: js.UndefOr[BaseChartAdaptiveLayout] = js.undefined
  /** Specifies animation options. */
  var animation: js.UndefOr[AnonDuration | Boolean] = js.undefined
  /** Customizes the appearance of an individual point label. */
  var customizeLabel: js.UndefOr[js.Function1[/* pointInfo */ js.Any, dxChartSeriesTypesCommonSeriesLabel]] = js.undefined
  /** Customizes the appearance of an individual series point. */
  var customizePoint: js.UndefOr[js.Function1[/* pointInfo */ js.Any, dxChartSeriesTypesCommonSeriesPoint]] = js.undefined
  /** Binds the widget to data. */
  var dataSource: js.UndefOr[js.Array[_] | DataSource | DataSourceOptions | String] = js.undefined
  /** Specifies options of the legend. */
  var legend: js.UndefOr[BaseChartLegend] = js.undefined
  /** A function that is executed when all series are ready. */
  var onDone: js.UndefOr[js.Function1[/* e */ AnonComponentTElementDxElement[T], _]] = js.undefined
  /** A function that is executed when a series point is clicked or tapped. */
  var onPointClick: js.UndefOr[(js.Function1[/* e */ AnonModelTarget[T], _]) | String] = js.undefined
  /** A function that is executed after the pointer enters or leaves a series point. */
  var onPointHoverChanged: js.UndefOr[js.Function1[/* e */ AnonElementTarget, _]] = js.undefined
  /** A function that is executed when a series point is selected or selection is canceled. */
  var onPointSelectionChanged: js.UndefOr[js.Function1[/* e */ AnonElementTarget, _]] = js.undefined
  /** A function that is executed when a tooltip becomes hidden. */
  var onTooltipHidden: js.UndefOr[js.Function1[/* e */ AnonElementModelTarget[T], _]] = js.undefined
  /** A function that is executed when a tooltip appears. */
  var onTooltipShown: js.UndefOr[js.Function1[/* e */ AnonElementModelTarget[T], _]] = js.undefined
  /** Sets the palette to be used for colorizing series and their elements. */
  var palette: js.UndefOr[
    js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.undefined
  /** Specifies what to do with colors in the palette when their number is less than the number of series (in the Chart widget) or points in a series (in the PieChart widget). */
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.undefined
  /** Specifies whether a single point or multiple points can be selected in the chart. */
  var pointSelectionMode: js.UndefOr[multiple | single_] = js.undefined
  /** Specifies options for series. */
  var series: js.UndefOr[js.Any | js.Array[_]] = js.undefined
  /** Configures tooltips. */
  @JSName("tooltip")
  var tooltip_BaseChartOptions: js.UndefOr[BaseChartTooltip] = js.undefined
}

object BaseChartOptions {
  @scala.inline
  def apply[T](
    adaptiveLayout: BaseChartAdaptiveLayout = null,
    animation: AnonDuration | Boolean = null,
    bindingOptions: js.Any = null,
    customizeLabel: /* pointInfo */ js.Any => dxChartSeriesTypesCommonSeriesLabel = null,
    customizePoint: /* pointInfo */ js.Any => dxChartSeriesTypesCommonSeriesPoint = null,
    dataSource: js.Array[_] | DataSource | DataSourceOptions | String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    export: BaseWidgetExport = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    legend: BaseChartLegend = null,
    loadingIndicator: BaseWidgetLoadingIndicator = null,
    margin: BaseWidgetMargin = null,
    onDisposing: /* e */ AnonModel[T] => _ = null,
    onDone: /* e */ AnonComponentTElementDxElement[T] => _ = null,
    onDrawn: /* e */ AnonComponentTElementDxElementModelAny[T] => _ = null,
    onExported: /* e */ AnonComponentTElementDxElementModelAny[T] => _ = null,
    onExporting: /* e */ AnonFormatModel[T] => _ = null,
    onFileSaving: /* e */ AnonCancelComponentData[T] => _ = null,
    onIncidentOccurred: /* e */ AnonTargetAny[T] => _ = null,
    onInitialized: /* e */ AnonElement[T] => _ = null,
    onOptionChanged: /* e */ AnonName[T] => _ = null,
    onPointClick: (js.Function1[/* e */ AnonModelTarget[T], _]) | String = null,
    onPointHoverChanged: /* e */ AnonElementTarget => _ = null,
    onPointSelectionChanged: /* e */ AnonElementTarget => _ = null,
    onTooltipHidden: /* e */ AnonElementModelTarget[T] => _ = null,
    onTooltipShown: /* e */ AnonElementModelTarget[T] => _ = null,
    palette: js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office = null,
    paletteExtensionMode: alternate | blend | extrapolate = null,
    pathModified: js.UndefOr[Boolean] = js.undefined,
    pointSelectionMode: multiple | single_ = null,
    redrawOnResize: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    series: js.Any | js.Array[_] = null,
    size: BaseWidgetSize = null,
    theme: genericDotdark | genericDotlight | genericDotcontrast | ios7Dotdefault | genericDotcarmine | genericDotdarkmoon | genericDotdarkviolet | genericDotgreenmist | genericDotsoftblue | materialDotblueDotlight | materialDotlimeDotlight | materialDotorangeDotlight | materialDotpurpleDotlight | materialDottealDotlight = null,
    title: BaseWidgetTitle | String = null,
    tooltip: BaseChartTooltip = null,
    width: Double | String | (js.Function0[Double | String]) = null
  ): BaseChartOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (adaptiveLayout != null) __obj.updateDynamic("adaptiveLayout")(adaptiveLayout.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (customizeLabel != null) __obj.updateDynamic("customizeLabel")(js.Any.fromFunction1(customizeLabel))
    if (customizePoint != null) __obj.updateDynamic("customizePoint")(js.Any.fromFunction1(customizePoint))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (loadingIndicator != null) __obj.updateDynamic("loadingIndicator")(loadingIndicator.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onDone != null) __obj.updateDynamic("onDone")(js.Any.fromFunction1(onDone))
    if (onDrawn != null) __obj.updateDynamic("onDrawn")(js.Any.fromFunction1(onDrawn))
    if (onExported != null) __obj.updateDynamic("onExported")(js.Any.fromFunction1(onExported))
    if (onExporting != null) __obj.updateDynamic("onExporting")(js.Any.fromFunction1(onExporting))
    if (onFileSaving != null) __obj.updateDynamic("onFileSaving")(js.Any.fromFunction1(onFileSaving))
    if (onIncidentOccurred != null) __obj.updateDynamic("onIncidentOccurred")(js.Any.fromFunction1(onIncidentOccurred))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onPointClick != null) __obj.updateDynamic("onPointClick")(onPointClick.asInstanceOf[js.Any])
    if (onPointHoverChanged != null) __obj.updateDynamic("onPointHoverChanged")(js.Any.fromFunction1(onPointHoverChanged))
    if (onPointSelectionChanged != null) __obj.updateDynamic("onPointSelectionChanged")(js.Any.fromFunction1(onPointSelectionChanged))
    if (onTooltipHidden != null) __obj.updateDynamic("onTooltipHidden")(js.Any.fromFunction1(onTooltipHidden))
    if (onTooltipShown != null) __obj.updateDynamic("onTooltipShown")(js.Any.fromFunction1(onTooltipShown))
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (paletteExtensionMode != null) __obj.updateDynamic("paletteExtensionMode")(paletteExtensionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(pathModified)) __obj.updateDynamic("pathModified")(pathModified.asInstanceOf[js.Any])
    if (pointSelectionMode != null) __obj.updateDynamic("pointSelectionMode")(pointSelectionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(redrawOnResize)) __obj.updateDynamic("redrawOnResize")(redrawOnResize.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseChartOptions[T]]
  }
}

