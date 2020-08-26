package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartTextStyle extends js.Object {
  var auraColor: js.UndefOr[String] = js.native
  var bold: js.UndefOr[Boolean] = js.native
  var color: js.UndefOr[String] = js.native
  var fontName: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var italic: js.UndefOr[Boolean] = js.native
  var opacity: js.UndefOr[Double] = js.native
}

object ChartTextStyle {
  @scala.inline
  def apply(): ChartTextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTextStyle]
  }
  @scala.inline
  implicit class ChartTextStyleOps[Self <: ChartTextStyle] (val x: Self) extends AnyVal {
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
    def setAuraColor(value: String): Self = this.set("auraColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuraColor: Self = this.set("auraColor", js.undefined)
    @scala.inline
    def setBold(value: Boolean): Self = this.set("bold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBold: Self = this.set("bold", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setFontName(value: String): Self = this.set("fontName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontName: Self = this.set("fontName", js.undefined)
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setItalic(value: Boolean): Self = this.set("italic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItalic: Self = this.set("italic", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
  }
  
}

