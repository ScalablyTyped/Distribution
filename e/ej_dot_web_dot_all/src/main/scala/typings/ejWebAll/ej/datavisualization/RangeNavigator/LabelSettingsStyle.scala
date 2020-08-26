package typings.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelSettingsStyle extends js.Object {
  /** Options for customizing the font of labels in range navigator.
    */
  var font: js.UndefOr[LabelSettingsStyleFont] = js.native
  /** Specifies the horizontalAlignment of the label in RangeNavigator
    * @Default {middle}
    */
  var horizontalAlignment: js.UndefOr[HorizontalAlignment | String] = js.native
}

object LabelSettingsStyle {
  @scala.inline
  def apply(): LabelSettingsStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelSettingsStyle]
  }
  @scala.inline
  implicit class LabelSettingsStyleOps[Self <: LabelSettingsStyle] (val x: Self) extends AnyVal {
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
    def setFont(value: LabelSettingsStyleFont): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setHorizontalAlignment(value: HorizontalAlignment | String): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
  }
  
}

