package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.Connector
import typings.devextreme.anon.EventItem
import typings.devextreme.anon.HoverStyle
import typings.devextreme.anon.ItemModel
import typings.devextreme.anon.KeepLabels
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
import typings.devextreme.devextremeStrings.dynamicHeight
import typings.devextreme.devextremeStrings.dynamicSlope
import typings.devextreme.devextremeStrings.extrapolate
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.multiple
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.shift
import typings.devextreme.devextremeStrings.single_
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxFunnelOptions extends BaseWidgetOptions[dxFunnel] {
  /** @name dxFunnel.Options.adaptiveLayout */
  var adaptiveLayout: js.UndefOr[KeepLabels] = js.native
  /** @name dxFunnel.Options.algorithm */
  var algorithm: js.UndefOr[dynamicHeight | dynamicSlope] = js.native
  /** @name dxFunnel.Options.argumentField */
  var argumentField: js.UndefOr[String] = js.native
  /** @name dxFunnel.Options.colorField */
  var colorField: js.UndefOr[String] = js.native
  /** @name dxFunnel.Options.dataSource */
  var dataSource: js.UndefOr[js.Array[_] | DataSource | DataSourceOptions | String] = js.native
  /** @name dxFunnel.Options.hoverEnabled */
  var hoverEnabled: js.UndefOr[Boolean] = js.native
  /** @name dxFunnel.Options.inverted */
  var inverted: js.UndefOr[Boolean] = js.native
  /** @name dxFunnel.Options.item */
  var item: js.UndefOr[HoverStyle] = js.native
  /** @name dxFunnel.Options.label */
  var label: js.UndefOr[Connector] = js.native
  /** @name dxFunnel.Options.legend */
  var legend: js.UndefOr[dxFunnelLegend] = js.native
  /** @name dxFunnel.Options.neckHeight */
  var neckHeight: js.UndefOr[Double] = js.native
  /** @name dxFunnel.Options.neckWidth */
  var neckWidth: js.UndefOr[Double] = js.native
  /** @name dxFunnel.Options.onHoverChanged */
  var onHoverChanged: js.UndefOr[js.Function1[/* e */ ItemModel, _]] = js.native
  /** @name dxFunnel.Options.onItemClick */
  var onItemClick: js.UndefOr[(js.Function1[/* e */ EventItem, _]) | String] = js.native
  /** @name dxFunnel.Options.onLegendClick */
  var onLegendClick: js.UndefOr[(js.Function1[/* e */ EventItem, _]) | String] = js.native
  /** @name dxFunnel.Options.onSelectionChanged */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ ItemModel, _]] = js.native
  /** @name dxFunnel.Options.palette */
  var palette: js.UndefOr[
    js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.native
  /** @name dxFunnel.Options.paletteExtensionMode */
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.native
  /** @name dxFunnel.Options.resolveLabelOverlapping */
  var resolveLabelOverlapping: js.UndefOr[hide | none | shift] = js.native
  /** @name dxFunnel.Options.selectionMode */
  var selectionMode: js.UndefOr[multiple | none | single_] = js.native
  /** @name dxFunnel.Options.sortData */
  var sortData: js.UndefOr[Boolean] = js.native
  /** @name dxFunnel.Options.tooltip */
  @JSName("tooltip")
  var tooltip_dxFunnelOptions: js.UndefOr[dxFunnelTooltip] = js.native
  /** @name dxFunnel.Options.valueField */
  var valueField: js.UndefOr[String] = js.native
}

object dxFunnelOptions {
  @scala.inline
  def apply(): dxFunnelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFunnelOptions]
  }
  @scala.inline
  implicit class dxFunnelOptionsOps[Self <: dxFunnelOptions] (val x: Self) extends AnyVal {
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
    def setAdaptiveLayout(value: KeepLabels): Self = this.set("adaptiveLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdaptiveLayout: Self = this.set("adaptiveLayout", js.undefined)
    @scala.inline
    def setAlgorithm(value: dynamicHeight | dynamicSlope): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    @scala.inline
    def setArgumentField(value: String): Self = this.set("argumentField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgumentField: Self = this.set("argumentField", js.undefined)
    @scala.inline
    def setColorField(value: String): Self = this.set("colorField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorField: Self = this.set("colorField", js.undefined)
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = this.set("dataSource", js.Array(value :_*))
    @scala.inline
    def setDataSource(value: js.Array[_] | DataSource | DataSourceOptions | String): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setHoverEnabled(value: Boolean): Self = this.set("hoverEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverEnabled: Self = this.set("hoverEnabled", js.undefined)
    @scala.inline
    def setInverted(value: Boolean): Self = this.set("inverted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInverted: Self = this.set("inverted", js.undefined)
    @scala.inline
    def setItem(value: HoverStyle): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    @scala.inline
    def setLabel(value: Connector): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLegend(value: dxFunnelLegend): Self = this.set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    @scala.inline
    def setNeckHeight(value: Double): Self = this.set("neckHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeckHeight: Self = this.set("neckHeight", js.undefined)
    @scala.inline
    def setNeckWidth(value: Double): Self = this.set("neckWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeckWidth: Self = this.set("neckWidth", js.undefined)
    @scala.inline
    def setOnHoverChanged(value: /* e */ ItemModel => _): Self = this.set("onHoverChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHoverChanged: Self = this.set("onHoverChanged", js.undefined)
    @scala.inline
    def setOnItemClickFunction1(value: /* e */ EventItem => _): Self = this.set("onItemClick", js.Any.fromFunction1(value))
    @scala.inline
    def setOnItemClick(value: (js.Function1[/* e */ EventItem, _]) | String): Self = this.set("onItemClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnItemClick: Self = this.set("onItemClick", js.undefined)
    @scala.inline
    def setOnLegendClickFunction1(value: /* e */ EventItem => _): Self = this.set("onLegendClick", js.Any.fromFunction1(value))
    @scala.inline
    def setOnLegendClick(value: (js.Function1[/* e */ EventItem, _]) | String): Self = this.set("onLegendClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLegendClick: Self = this.set("onLegendClick", js.undefined)
    @scala.inline
    def setOnSelectionChanged(value: /* e */ ItemModel => _): Self = this.set("onSelectionChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelectionChanged: Self = this.set("onSelectionChanged", js.undefined)
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
    def setResolveLabelOverlapping(value: hide | none | shift): Self = this.set("resolveLabelOverlapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolveLabelOverlapping: Self = this.set("resolveLabelOverlapping", js.undefined)
    @scala.inline
    def setSelectionMode(value: multiple | none | single_): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    @scala.inline
    def setSortData(value: Boolean): Self = this.set("sortData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortData: Self = this.set("sortData", js.undefined)
    @scala.inline
    def setTooltip(value: dxFunnelTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setValueField(value: String): Self = this.set("valueField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueField: Self = this.set("valueField", js.undefined)
  }
  
}

