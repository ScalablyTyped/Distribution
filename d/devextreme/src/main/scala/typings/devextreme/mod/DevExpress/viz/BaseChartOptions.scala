package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.Duration
import typings.devextreme.anon.ElementModelTarget
import typings.devextreme.anon.ElementTarget
import typings.devextreme.anon.ModelTarget
import typings.devextreme.anon.`14`
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
import typings.devextreme.devextremeStrings.multiple
import typings.devextreme.devextremeStrings.single_
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseChartOptions[T] extends BaseWidgetOptions[T] {
  /** @name BaseChart.Options.adaptiveLayout */
  var adaptiveLayout: js.UndefOr[BaseChartAdaptiveLayout] = js.native
  /** @name BaseChart.Options.animation */
  var animation: js.UndefOr[Duration | Boolean] = js.native
  /** @name BaseChart.Options.customizeLabel */
  var customizeLabel: js.UndefOr[js.Function1[/* pointInfo */ js.Any, dxChartSeriesTypesCommonSeriesLabel]] = js.native
  /** @name BaseChart.Options.customizePoint */
  var customizePoint: js.UndefOr[js.Function1[/* pointInfo */ js.Any, dxChartSeriesTypesCommonSeriesPoint]] = js.native
  /** @name BaseChart.Options.dataSource */
  var dataSource: js.UndefOr[js.Array[_] | DataSource | DataSourceOptions | String] = js.native
  /** @name BaseChart.Options.legend */
  var legend: js.UndefOr[BaseChartLegend] = js.native
  /** @name BaseChart.Options.onDone */
  var onDone: js.UndefOr[js.Function1[/* e */ `14`[T], _]] = js.native
  /** @name BaseChart.Options.onPointClick */
  var onPointClick: js.UndefOr[(js.Function1[/* e */ ModelTarget[T], _]) | String] = js.native
  /** @name BaseChart.Options.onPointHoverChanged */
  var onPointHoverChanged: js.UndefOr[js.Function1[/* e */ ElementTarget, _]] = js.native
  /** @name BaseChart.Options.onPointSelectionChanged */
  var onPointSelectionChanged: js.UndefOr[js.Function1[/* e */ ElementTarget, _]] = js.native
  /** @name BaseChart.Options.onTooltipHidden */
  var onTooltipHidden: js.UndefOr[js.Function1[/* e */ ElementModelTarget[T], _]] = js.native
  /** @name BaseChart.Options.onTooltipShown */
  var onTooltipShown: js.UndefOr[js.Function1[/* e */ ElementModelTarget[T], _]] = js.native
  /** @name BaseChart.Options.palette */
  var palette: js.UndefOr[
    js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.native
  /** @name BaseChart.Options.paletteExtensionMode */
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.native
  /** @name BaseChart.Options.pointSelectionMode */
  var pointSelectionMode: js.UndefOr[multiple | single_] = js.native
  /** @name BaseChart.Options.series */
  var series: js.UndefOr[js.Any | js.Array[_]] = js.native
  /** @name BaseChart.Options.tooltip */
  @JSName("tooltip")
  var tooltip_BaseChartOptions: js.UndefOr[BaseChartTooltip] = js.native
}

object BaseChartOptions {
  @scala.inline
  def apply[T](): BaseChartOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseChartOptions[T]]
  }
  @scala.inline
  implicit class BaseChartOptionsOps[Self <: BaseChartOptions[_], T] (val x: Self with BaseChartOptions[T]) extends AnyVal {
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
    def setAdaptiveLayout(value: BaseChartAdaptiveLayout): Self = this.set("adaptiveLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdaptiveLayout: Self = this.set("adaptiveLayout", js.undefined)
    @scala.inline
    def setAnimation(value: Duration | Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setCustomizeLabel(value: /* pointInfo */ js.Any => dxChartSeriesTypesCommonSeriesLabel): Self = this.set("customizeLabel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomizeLabel: Self = this.set("customizeLabel", js.undefined)
    @scala.inline
    def setCustomizePoint(value: /* pointInfo */ js.Any => dxChartSeriesTypesCommonSeriesPoint): Self = this.set("customizePoint", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomizePoint: Self = this.set("customizePoint", js.undefined)
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = this.set("dataSource", js.Array(value :_*))
    @scala.inline
    def setDataSource(value: js.Array[_] | DataSource | DataSourceOptions | String): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setLegend(value: BaseChartLegend): Self = this.set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    @scala.inline
    def setOnDone(value: /* e */ `14`[T] => _): Self = this.set("onDone", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDone: Self = this.set("onDone", js.undefined)
    @scala.inline
    def setOnPointClickFunction1(value: /* e */ ModelTarget[T] => _): Self = this.set("onPointClick", js.Any.fromFunction1(value))
    @scala.inline
    def setOnPointClick(value: (js.Function1[/* e */ ModelTarget[T], _]) | String): Self = this.set("onPointClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPointClick: Self = this.set("onPointClick", js.undefined)
    @scala.inline
    def setOnPointHoverChanged(value: /* e */ ElementTarget => _): Self = this.set("onPointHoverChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointHoverChanged: Self = this.set("onPointHoverChanged", js.undefined)
    @scala.inline
    def setOnPointSelectionChanged(value: /* e */ ElementTarget => _): Self = this.set("onPointSelectionChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointSelectionChanged: Self = this.set("onPointSelectionChanged", js.undefined)
    @scala.inline
    def setOnTooltipHidden(value: /* e */ ElementModelTarget[T] => _): Self = this.set("onTooltipHidden", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTooltipHidden: Self = this.set("onTooltipHidden", js.undefined)
    @scala.inline
    def setOnTooltipShown(value: /* e */ ElementModelTarget[T] => _): Self = this.set("onTooltipShown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTooltipShown: Self = this.set("onTooltipShown", js.undefined)
    @scala.inline
    def setPaletteVarargs(value: String*): Self = this.set("palette", js.Array(value :_*))
    @scala.inline
    def setPalette(
      value: js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
    ): Self = this.set("palette", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePalette: Self = this.set("palette", js.undefined)
    @scala.inline
    def setPaletteExtensionMode(value: alternate | blend | extrapolate): Self = this.set("paletteExtensionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaletteExtensionMode: Self = this.set("paletteExtensionMode", js.undefined)
    @scala.inline
    def setPointSelectionMode(value: multiple | single_): Self = this.set("pointSelectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointSelectionMode: Self = this.set("pointSelectionMode", js.undefined)
    @scala.inline
    def setSeriesVarargs(value: js.Any*): Self = this.set("series", js.Array(value :_*))
    @scala.inline
    def setSeries(value: js.Any | js.Array[_]): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    @scala.inline
    def setTooltip(value: BaseChartTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
  
}

