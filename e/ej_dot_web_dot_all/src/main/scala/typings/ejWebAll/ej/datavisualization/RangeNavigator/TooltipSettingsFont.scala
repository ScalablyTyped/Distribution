package typings.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipSettingsFont extends js.Object {
  /** Specifies the color of text in tooltip. Tooltip text render in the specified color.
    * @Default {#FFFFFF}
    */
  var color: js.UndefOr[String] = js.native
  /** Specifies the font family of text in tooltip. Tooltip text render in the specified font family.
    * @Default {Segoe UI}
    */
  var family: js.UndefOr[String] = js.native
  /** Specifies the font style of text in tooltip. Tooltip text render in the specified font style.
    * @Default {ej.datavisualization.RangeNavigator.fontStyle.Normal}
    */
  var fontStyle: js.UndefOr[String] = js.native
  /** Specifies the opacity of text in tooltip. Tooltip text render in the specified opacity.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Specifies the size of text in tooltip. Tooltip text render in the specified size.
    * @Default {10px}
    */
  var size: js.UndefOr[String] = js.native
  /** Specifies the weight of text in tooltip. Tooltip text render in the specified weight.
    * @Default {ej.datavisualization.RangeNavigator.weight.Regular}
    */
  var weight: js.UndefOr[String] = js.native
}

object TooltipSettingsFont {
  @scala.inline
  def apply(): TooltipSettingsFont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipSettingsFont]
  }
  @scala.inline
  implicit class TooltipSettingsFontOps[Self <: TooltipSettingsFont] (val x: Self) extends AnyVal {
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
    def setFamily(value: String): Self = this.set("family", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFamily: Self = this.set("family", js.undefined)
    @scala.inline
    def setFontStyle(value: String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setWeight(value: String): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
  
}

