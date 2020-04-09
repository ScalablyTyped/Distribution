package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonIndent
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
import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonIndicator extends js.Object {
  /** @name CommonIndicator.arrowLength */
  var arrowLength: js.UndefOr[Double] = js.undefined
  /** @name CommonIndicator.backgroundColor */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /** @name CommonIndicator.baseValue */
  var baseValue: js.UndefOr[Double] = js.undefined
  /** @name CommonIndicator.beginAdaptingAtRadius */
  var beginAdaptingAtRadius: js.UndefOr[Double] = js.undefined
  /** @name CommonIndicator.color */
  var color: js.UndefOr[String] = js.undefined
  /** @name CommonIndicator.horizontalOrientation */
  var horizontalOrientation: js.UndefOr[left | right] = js.undefined
  /** @name CommonIndicator.indentFromCenter */
  var indentFromCenter: js.UndefOr[Double] = js.undefined
  /** @name CommonIndicator.length */
  var length: js.UndefOr[Double] = js.undefined
  /** @name CommonIndicator.offset */
  var offset: js.UndefOr[Double] = js.undefined
  /** @name CommonIndicator.palette */
  var palette: js.UndefOr[
    js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.undefined
  /** @name CommonIndicator.secondColor */
  var secondColor: js.UndefOr[String] = js.undefined
  /** @name CommonIndicator.secondFraction */
  var secondFraction: js.UndefOr[Double] = js.undefined
  /** @name CommonIndicator.size */
  var size: js.UndefOr[Double] = js.undefined
  /** @name CommonIndicator.spindleGapSize */
  var spindleGapSize: js.UndefOr[Double] = js.undefined
  /** @name CommonIndicator.spindleSize */
  var spindleSize: js.UndefOr[Double] = js.undefined
  /** @name CommonIndicator.text */
  var text: js.UndefOr[AnonIndent] = js.undefined
  /** @name CommonIndicator.verticalOrientation */
  var verticalOrientation: js.UndefOr[bottom | top] = js.undefined
  /** @name CommonIndicator.width */
  var width: js.UndefOr[Double] = js.undefined
}

object CommonIndicator {
  @scala.inline
  def apply(
    arrowLength: Int | Double = null,
    backgroundColor: String = null,
    baseValue: Int | Double = null,
    beginAdaptingAtRadius: Int | Double = null,
    color: String = null,
    horizontalOrientation: left | right = null,
    indentFromCenter: Int | Double = null,
    length: Int | Double = null,
    offset: Int | Double = null,
    palette: js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office = null,
    secondColor: String = null,
    secondFraction: Int | Double = null,
    size: Int | Double = null,
    spindleGapSize: Int | Double = null,
    spindleSize: Int | Double = null,
    text: AnonIndent = null,
    verticalOrientation: bottom | top = null,
    width: Int | Double = null
  ): CommonIndicator = {
    val __obj = js.Dynamic.literal()
    if (arrowLength != null) __obj.updateDynamic("arrowLength")(arrowLength.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (baseValue != null) __obj.updateDynamic("baseValue")(baseValue.asInstanceOf[js.Any])
    if (beginAdaptingAtRadius != null) __obj.updateDynamic("beginAdaptingAtRadius")(beginAdaptingAtRadius.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (horizontalOrientation != null) __obj.updateDynamic("horizontalOrientation")(horizontalOrientation.asInstanceOf[js.Any])
    if (indentFromCenter != null) __obj.updateDynamic("indentFromCenter")(indentFromCenter.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (secondColor != null) __obj.updateDynamic("secondColor")(secondColor.asInstanceOf[js.Any])
    if (secondFraction != null) __obj.updateDynamic("secondFraction")(secondFraction.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (spindleGapSize != null) __obj.updateDynamic("spindleGapSize")(spindleGapSize.asInstanceOf[js.Any])
    if (spindleSize != null) __obj.updateDynamic("spindleSize")(spindleSize.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (verticalOrientation != null) __obj.updateDynamic("verticalOrientation")(verticalOrientation.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonIndicator]
  }
}

