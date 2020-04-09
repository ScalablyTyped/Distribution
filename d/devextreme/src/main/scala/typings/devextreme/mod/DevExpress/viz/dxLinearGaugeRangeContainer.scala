package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonEndValue
import typings.devextreme.AnonStart
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
import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.extrapolate
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxLinearGaugeRangeContainer extends BaseGaugeRangeContainer {
  /** @name dxLinearGauge.Options.rangeContainer.horizontalOrientation */
  var horizontalOrientation: js.UndefOr[center | left | right] = js.undefined
  /** @name dxLinearGauge.Options.rangeContainer.verticalOrientation */
  var verticalOrientation: js.UndefOr[bottom | center | top] = js.undefined
  /** @name dxLinearGauge.Options.rangeContainer.width */
  var width: js.UndefOr[AnonStart | Double] = js.undefined
}

object dxLinearGaugeRangeContainer {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    horizontalOrientation: center | left | right = null,
    offset: Int | Double = null,
    palette: js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office = null,
    paletteExtensionMode: alternate | blend | extrapolate = null,
    ranges: js.Array[AnonEndValue] = null,
    verticalOrientation: bottom | center | top = null,
    width: AnonStart | Double = null
  ): dxLinearGaugeRangeContainer = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (horizontalOrientation != null) __obj.updateDynamic("horizontalOrientation")(horizontalOrientation.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (paletteExtensionMode != null) __obj.updateDynamic("paletteExtensionMode")(paletteExtensionMode.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    if (verticalOrientation != null) __obj.updateDynamic("verticalOrientation")(verticalOrientation.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxLinearGaugeRangeContainer]
  }
}

