package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ConnectorColor
import typings.devextreme.anon.EndAngle
import typings.devextreme.anon.`18`
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
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxBarGaugeOptions extends BaseWidgetOptions[dxBarGauge] {
  /** @name dxBarGauge.Options.animation */
  var animation: js.UndefOr[js.Any] = js.native
  /** @name dxBarGauge.Options.backgroundColor */
  var backgroundColor: js.UndefOr[String] = js.native
  /** @name dxBarGauge.Options.barSpacing */
  var barSpacing: js.UndefOr[Double] = js.native
  /** @name dxBarGauge.Options.baseValue */
  var baseValue: js.UndefOr[Double] = js.native
  /** @name dxBarGauge.Options.endValue */
  var endValue: js.UndefOr[Double] = js.native
  /** @name dxBarGauge.Options.geometry */
  var geometry: js.UndefOr[EndAngle] = js.native
  /** @name dxBarGauge.Options.label */
  var label: js.UndefOr[ConnectorColor] = js.native
  /** @name dxBarGauge.Options.legend */
  var legend: js.UndefOr[dxBarGaugeLegend] = js.native
  /** @name dxBarGauge.Options.loadingIndicator */
  @JSName("loadingIndicator")
  var loadingIndicator_dxBarGaugeOptions: js.UndefOr[dxBarGaugeLoadingIndicator] = js.native
  /** @name dxBarGauge.Options.onTooltipHidden */
  var onTooltipHidden: js.UndefOr[js.Function1[/* e */ `18`, _]] = js.native
  /** @name dxBarGauge.Options.onTooltipShown */
  var onTooltipShown: js.UndefOr[js.Function1[/* e */ `18`, _]] = js.native
  /** @name dxBarGauge.Options.palette */
  var palette: js.UndefOr[
    js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.native
  /** @name dxBarGauge.Options.paletteExtensionMode */
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.native
  /** @name dxBarGauge.Options.relativeInnerRadius */
  var relativeInnerRadius: js.UndefOr[Double] = js.native
  /** @name dxBarGauge.Options.resolveLabelOverlapping */
  var resolveLabelOverlapping: js.UndefOr[hide | none] = js.native
  /** @name dxBarGauge.Options.startValue */
  var startValue: js.UndefOr[Double] = js.native
  /** @name dxBarGauge.Options.tooltip */
  @JSName("tooltip")
  var tooltip_dxBarGaugeOptions: js.UndefOr[dxBarGaugeTooltip] = js.native
  /** @name dxBarGauge.Options.values */
  var values: js.UndefOr[js.Array[Double]] = js.native
}

object dxBarGaugeOptions {
  @scala.inline
  def apply(): dxBarGaugeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxBarGaugeOptions]
  }
  @scala.inline
  implicit class dxBarGaugeOptionsOps[Self <: dxBarGaugeOptions] (val x: Self) extends AnyVal {
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
    def setAnimation(value: js.Any): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBarSpacing(value: Double): Self = this.set("barSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarSpacing: Self = this.set("barSpacing", js.undefined)
    @scala.inline
    def setBaseValue(value: Double): Self = this.set("baseValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseValue: Self = this.set("baseValue", js.undefined)
    @scala.inline
    def setEndValue(value: Double): Self = this.set("endValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndValue: Self = this.set("endValue", js.undefined)
    @scala.inline
    def setGeometry(value: EndAngle): Self = this.set("geometry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometry: Self = this.set("geometry", js.undefined)
    @scala.inline
    def setLabel(value: ConnectorColor): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLegend(value: dxBarGaugeLegend): Self = this.set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    @scala.inline
    def setLoadingIndicator(value: dxBarGaugeLoadingIndicator): Self = this.set("loadingIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingIndicator: Self = this.set("loadingIndicator", js.undefined)
    @scala.inline
    def setOnTooltipHidden(value: /* e */ `18` => _): Self = this.set("onTooltipHidden", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTooltipHidden: Self = this.set("onTooltipHidden", js.undefined)
    @scala.inline
    def setOnTooltipShown(value: /* e */ `18` => _): Self = this.set("onTooltipShown", js.Any.fromFunction1(value))
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
    def setRelativeInnerRadius(value: Double): Self = this.set("relativeInnerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelativeInnerRadius: Self = this.set("relativeInnerRadius", js.undefined)
    @scala.inline
    def setResolveLabelOverlapping(value: hide | none): Self = this.set("resolveLabelOverlapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolveLabelOverlapping: Self = this.set("resolveLabelOverlapping", js.undefined)
    @scala.inline
    def setStartValue(value: Double): Self = this.set("startValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartValue: Self = this.set("startValue", js.undefined)
    @scala.inline
    def setTooltip(value: dxBarGaugeTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setValuesVarargs(value: Double*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[Double]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

