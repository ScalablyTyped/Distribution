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
  /** @name BaseChart.Options.adaptiveLayout */
  var adaptiveLayout: js.UndefOr[BaseChartAdaptiveLayout] = js.undefined
  /** @name BaseChart.Options.animation */
  var animation: js.UndefOr[Duration | Boolean] = js.undefined
  /** @name BaseChart.Options.customizeLabel */
  var customizeLabel: js.UndefOr[js.Function1[/* pointInfo */ js.Any, dxChartSeriesTypesCommonSeriesLabel]] = js.undefined
  /** @name BaseChart.Options.customizePoint */
  var customizePoint: js.UndefOr[js.Function1[/* pointInfo */ js.Any, dxChartSeriesTypesCommonSeriesPoint]] = js.undefined
  /** @name BaseChart.Options.dataSource */
  var dataSource: js.UndefOr[js.Array[_] | DataSource | DataSourceOptions | String] = js.undefined
  /** @name BaseChart.Options.legend */
  var legend: js.UndefOr[BaseChartLegend] = js.undefined
  /** @name BaseChart.Options.onDone */
  var onDone: js.UndefOr[js.Function1[/* e */ ComponentTElementDxElement[T], _]] = js.undefined
  /** @name BaseChart.Options.onPointClick */
  var onPointClick: js.UndefOr[(js.Function1[/* e */ ModelTarget[T], _]) | String] = js.undefined
  /** @name BaseChart.Options.onPointHoverChanged */
  var onPointHoverChanged: js.UndefOr[js.Function1[/* e */ ElementTarget, _]] = js.undefined
  /** @name BaseChart.Options.onPointSelectionChanged */
  var onPointSelectionChanged: js.UndefOr[js.Function1[/* e */ ElementTarget, _]] = js.undefined
  /** @name BaseChart.Options.onTooltipHidden */
  var onTooltipHidden: js.UndefOr[js.Function1[/* e */ ElementModelTarget[T], _]] = js.undefined
  /** @name BaseChart.Options.onTooltipShown */
  var onTooltipShown: js.UndefOr[js.Function1[/* e */ ElementModelTarget[T], _]] = js.undefined
  /** @name BaseChart.Options.palette */
  var palette: js.UndefOr[
    js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.undefined
  /** @name BaseChart.Options.paletteExtensionMode */
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.undefined
  /** @name BaseChart.Options.pointSelectionMode */
  var pointSelectionMode: js.UndefOr[multiple | single_] = js.undefined
  /** @name BaseChart.Options.series */
  var series: js.UndefOr[js.Any | js.Array[_]] = js.undefined
  /** @name BaseChart.Options.tooltip */
  @JSName("tooltip")
  var tooltip_BaseChartOptions: js.UndefOr[BaseChartTooltip] = js.undefined
}

object BaseChartOptions {
  @scala.inline
  def apply[T](
    adaptiveLayout: BaseChartAdaptiveLayout = null,
    animation: Duration | Boolean = null,
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
    onDisposing: /* e */ Model[T] => _ = null,
    onDone: /* e */ ComponentTElementDxElement[T] => _ = null,
    onDrawn: /* e */ ComponentTElementDxElementModelAny[T] => _ = null,
    onExported: /* e */ ComponentTElementDxElementModelAny[T] => _ = null,
    onExporting: /* e */ FormatModel[T] => _ = null,
    onFileSaving: /* e */ CancelComponentData[T] => _ = null,
    onIncidentOccurred: /* e */ TargetAny[T] => _ = null,
    onInitialized: /* e */ Element[T] => _ = null,
    onOptionChanged: /* e */ Name[T] => _ = null,
    onPointClick: (js.Function1[/* e */ ModelTarget[T], _]) | String = null,
    onPointHoverChanged: /* e */ ElementTarget => _ = null,
    onPointSelectionChanged: /* e */ ElementTarget => _ = null,
    onTooltipHidden: /* e */ ElementModelTarget[T] => _ = null,
    onTooltipShown: /* e */ ElementModelTarget[T] => _ = null,
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
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
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
    if (!js.isUndefined(pathModified)) __obj.updateDynamic("pathModified")(pathModified.get.asInstanceOf[js.Any])
    if (pointSelectionMode != null) __obj.updateDynamic("pointSelectionMode")(pointSelectionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(redrawOnResize)) __obj.updateDynamic("redrawOnResize")(redrawOnResize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseChartOptions[T]]
  }
}

