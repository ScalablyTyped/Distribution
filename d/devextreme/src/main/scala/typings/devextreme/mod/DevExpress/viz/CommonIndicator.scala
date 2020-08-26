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
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonIndicator extends js.Object {
  /** @name CommonIndicator.arrowLength */
  var arrowLength: js.UndefOr[Double] = js.native
  /** @name CommonIndicator.backgroundColor */
  var backgroundColor: js.UndefOr[String] = js.native
  /** @name CommonIndicator.baseValue */
  var baseValue: js.UndefOr[Double] = js.native
  /** @name CommonIndicator.beginAdaptingAtRadius */
  var beginAdaptingAtRadius: js.UndefOr[Double] = js.native
  /** @name CommonIndicator.color */
  var color: js.UndefOr[String] = js.native
  /** @name CommonIndicator.horizontalOrientation */
  var horizontalOrientation: js.UndefOr[left | right] = js.native
  /** @name CommonIndicator.indentFromCenter */
  var indentFromCenter: js.UndefOr[Double] = js.native
  /** @name CommonIndicator.length */
  var length: js.UndefOr[Double] = js.native
  /** @name CommonIndicator.offset */
  var offset: js.UndefOr[Double] = js.native
  /** @name CommonIndicator.palette */
  var palette: js.UndefOr[
    js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.native
  /** @name CommonIndicator.secondColor */
  var secondColor: js.UndefOr[String] = js.native
  /** @name CommonIndicator.secondFraction */
  var secondFraction: js.UndefOr[Double] = js.native
  /** @name CommonIndicator.size */
  var size: js.UndefOr[Double] = js.native
  /** @name CommonIndicator.spindleGapSize */
  var spindleGapSize: js.UndefOr[Double] = js.native
  /** @name CommonIndicator.spindleSize */
  var spindleSize: js.UndefOr[Double] = js.native
  /** @name CommonIndicator.text */
  var text: js.UndefOr[Indent] = js.native
  /** @name CommonIndicator.verticalOrientation */
  var verticalOrientation: js.UndefOr[bottom | top] = js.native
  /** @name CommonIndicator.width */
  var width: js.UndefOr[Double] = js.native
}

object CommonIndicator {
  @scala.inline
  def apply(): CommonIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonIndicator]
  }
  @scala.inline
  implicit class CommonIndicatorOps[Self <: CommonIndicator] (val x: Self) extends AnyVal {
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
    def setArrowLength(value: Double): Self = this.set("arrowLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowLength: Self = this.set("arrowLength", js.undefined)
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBaseValue(value: Double): Self = this.set("baseValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseValue: Self = this.set("baseValue", js.undefined)
    @scala.inline
    def setBeginAdaptingAtRadius(value: Double): Self = this.set("beginAdaptingAtRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeginAdaptingAtRadius: Self = this.set("beginAdaptingAtRadius", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setHorizontalOrientation(value: left | right): Self = this.set("horizontalOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalOrientation: Self = this.set("horizontalOrientation", js.undefined)
    @scala.inline
    def setIndentFromCenter(value: Double): Self = this.set("indentFromCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentFromCenter: Self = this.set("indentFromCenter", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
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
    def setSecondColor(value: String): Self = this.set("secondColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondColor: Self = this.set("secondColor", js.undefined)
    @scala.inline
    def setSecondFraction(value: Double): Self = this.set("secondFraction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondFraction: Self = this.set("secondFraction", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSpindleGapSize(value: Double): Self = this.set("spindleGapSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpindleGapSize: Self = this.set("spindleGapSize", js.undefined)
    @scala.inline
    def setSpindleSize(value: Double): Self = this.set("spindleSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpindleSize: Self = this.set("spindleSize", js.undefined)
    @scala.inline
    def setText(value: Indent): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setVerticalOrientation(value: bottom | top): Self = this.set("verticalOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalOrientation: Self = this.set("verticalOrientation", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

