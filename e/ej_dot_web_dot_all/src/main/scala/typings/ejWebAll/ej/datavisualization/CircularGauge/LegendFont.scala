package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendFont extends js.Object {
  /** Font color of the text for legend items.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.native
  /** Font family for legend item text.
    * @Default {Segoe UI}
    */
  var fontFamily: js.UndefOr[String] = js.native
  /** Font style for legend item text.
    * @Default {Normal}
    */
  var fontStyle: js.UndefOr[String] = js.native
  /** Font weight for legend item text.
    * @Default {Regular}
    */
  var fontWeight: js.UndefOr[String] = js.native
  /** Font size for legend item text.
    * @Default {12px}
    */
  var size: js.UndefOr[String] = js.native
}

object LegendFont {
  @scala.inline
  def apply(): LegendFont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendFont]
  }
  @scala.inline
  implicit class LegendFontOps[Self <: LegendFont] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontStyle(value: String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    @scala.inline
    def setFontWeight(value: String): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

