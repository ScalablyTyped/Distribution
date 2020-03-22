package typings.devextreme

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
import typings.devextreme.devextremeStrings.discrete
import typings.devextreme.devextremeStrings.extrapolate
import typings.devextreme.devextremeStrings.gradient
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorCodeField extends js.Object {
  var colorCodeField: js.UndefOr[String] = js.undefined
  var colorizeGroups: js.UndefOr[Boolean] = js.undefined
  var palette: js.UndefOr[
    js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.undefined
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.undefined
  var range: js.UndefOr[js.Array[Double]] = js.undefined
  var `type`: js.UndefOr[discrete | gradient | none | range] = js.undefined
}

object AnonColorCodeField {
  @scala.inline
  def apply(
    colorCodeField: String = null,
    colorizeGroups: js.UndefOr[Boolean] = js.undefined,
    palette: js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office = null,
    paletteExtensionMode: alternate | blend | extrapolate = null,
    range: js.Array[Double] = null,
    `type`: discrete | gradient | none | range = null
  ): AnonColorCodeField = {
    val __obj = js.Dynamic.literal()
    if (colorCodeField != null) __obj.updateDynamic("colorCodeField")(colorCodeField.asInstanceOf[js.Any])
    if (!js.isUndefined(colorizeGroups)) __obj.updateDynamic("colorizeGroups")(colorizeGroups.asInstanceOf[js.Any])
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (paletteExtensionMode != null) __obj.updateDynamic("paletteExtensionMode")(paletteExtensionMode.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorCodeField]
  }
}

