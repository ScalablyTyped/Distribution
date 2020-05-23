package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.Indent
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
import typings.devextreme.devextremeStrings.circle
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.rangeBar
import typings.devextreme.devextremeStrings.rectangle
import typings.devextreme.devextremeStrings.rectangleNeedle
import typings.devextreme.devextremeStrings.rhombus
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.textCloud
import typings.devextreme.devextremeStrings.top
import typings.devextreme.devextremeStrings.triangleMarker
import typings.devextreme.devextremeStrings.triangleNeedle
import typings.devextreme.devextremeStrings.twoColorNeedle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaugeIndicator extends CommonIndicator {
  /** @name GaugeIndicator.type */
  var `type`: js.UndefOr[
    circle | rangeBar | rectangle | rectangleNeedle | rhombus | textCloud | triangleMarker | triangleNeedle | twoColorNeedle
  ] = js.undefined
}

object GaugeIndicator {
  @scala.inline
  def apply(
    arrowLength: js.UndefOr[Double] = js.undefined,
    backgroundColor: String = null,
    baseValue: js.UndefOr[Double] = js.undefined,
    beginAdaptingAtRadius: js.UndefOr[Double] = js.undefined,
    color: String = null,
    horizontalOrientation: left | right = null,
    indentFromCenter: js.UndefOr[Double] = js.undefined,
    length: js.UndefOr[Double] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined,
    palette: js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office = null,
    secondColor: String = null,
    secondFraction: js.UndefOr[Double] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    spindleGapSize: js.UndefOr[Double] = js.undefined,
    spindleSize: js.UndefOr[Double] = js.undefined,
    text: Indent = null,
    `type`: circle | rangeBar | rectangle | rectangleNeedle | rhombus | textCloud | triangleMarker | triangleNeedle | twoColorNeedle = null,
    verticalOrientation: bottom | top = null,
    width: js.UndefOr[Double] = js.undefined
  ): GaugeIndicator = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrowLength)) __obj.updateDynamic("arrowLength")(arrowLength.get.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(baseValue)) __obj.updateDynamic("baseValue")(baseValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(beginAdaptingAtRadius)) __obj.updateDynamic("beginAdaptingAtRadius")(beginAdaptingAtRadius.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (horizontalOrientation != null) __obj.updateDynamic("horizontalOrientation")(horizontalOrientation.asInstanceOf[js.Any])
    if (!js.isUndefined(indentFromCenter)) __obj.updateDynamic("indentFromCenter")(indentFromCenter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (secondColor != null) __obj.updateDynamic("secondColor")(secondColor.asInstanceOf[js.Any])
    if (!js.isUndefined(secondFraction)) __obj.updateDynamic("secondFraction")(secondFraction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spindleGapSize)) __obj.updateDynamic("spindleGapSize")(spindleGapSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spindleSize)) __obj.updateDynamic("spindleSize")(spindleSize.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (verticalOrientation != null) __obj.updateDynamic("verticalOrientation")(verticalOrientation.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GaugeIndicator]
  }
}

