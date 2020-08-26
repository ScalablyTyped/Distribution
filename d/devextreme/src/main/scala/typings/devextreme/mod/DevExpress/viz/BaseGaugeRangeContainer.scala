package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.EndValue
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name BaseGauge.Options.rangeContainer */
@js.native
trait BaseGaugeRangeContainer extends js.Object {
  /** @name BaseGauge.Options.rangeContainer.backgroundColor */
  var backgroundColor: js.UndefOr[String] = js.native
  /** @name BaseGauge.Options.rangeContainer.offset */
  var offset: js.UndefOr[Double] = js.native
  /** @name BaseGauge.Options.rangeContainer.palette */
  var palette: js.UndefOr[
    js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.native
  /** @name BaseGauge.Options.rangeContainer.paletteExtensionMode */
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.native
  /** @name BaseGauge.Options.rangeContainer.ranges */
  var ranges: js.UndefOr[js.Array[EndValue]] = js.native
}

object BaseGaugeRangeContainer {
  @scala.inline
  def apply(): BaseGaugeRangeContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseGaugeRangeContainer]
  }
  @scala.inline
  implicit class BaseGaugeRangeContainerOps[Self <: BaseGaugeRangeContainer] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
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
    def setRangesVarargs(value: EndValue*): Self = this.set("ranges", js.Array(value :_*))
    @scala.inline
    def setRanges(value: js.Array[EndValue]): Self = this.set("ranges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRanges: Self = this.set("ranges", js.undefined)
  }
  
}

