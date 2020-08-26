package typings.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelSettingsLowerLevelStyleFont extends js.Object {
  /** Specifies the color of labels. Label text render in this specified color.
    * @Default {black}
    */
  var color: js.UndefOr[String] = js.native
  /** Specifies the font family of labels. Label text render in this specified font family.
    * @Default {Segoe UI}
    */
  var fontFamily: js.UndefOr[String] = js.native
  /** Specifies the font style of labels. Label text render in this specified font style.
    * @Default {Normal}
    */
  var fontStyle: js.UndefOr[String] = js.native
  /** Specifies the font weight of labels. Label text render in this specified font weight.
    * @Default {regular}
    */
  var fontWeight: js.UndefOr[String] = js.native
  /** Specifies the opacity of labels. Label text render in this specified opacity.
    * @Default {12px}
    */
  var opacity: js.UndefOr[String] = js.native
  /** Specifies the size of labels. Label text render in this specified size.
    * @Default {12px}
    */
  var size: js.UndefOr[String] = js.native
}

object LabelSettingsLowerLevelStyleFont {
  @scala.inline
  def apply(): LabelSettingsLowerLevelStyleFont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelSettingsLowerLevelStyleFont]
  }
  @scala.inline
  implicit class LabelSettingsLowerLevelStyleFontOps[Self <: LabelSettingsLowerLevelStyleFont] (val x: Self) extends AnyVal {
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
    def setOpacity(value: String): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

