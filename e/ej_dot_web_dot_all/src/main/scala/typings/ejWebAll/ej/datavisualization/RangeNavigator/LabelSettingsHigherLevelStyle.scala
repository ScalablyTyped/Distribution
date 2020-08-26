package typings.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelSettingsHigherLevelStyle extends js.Object {
  /** Options for customizing the font properties.
    */
  var font: js.UndefOr[LabelSettingsHigherLevelStyleFont] = js.native
  /** Specifies the horizontal text alignment of the text in label.
    * @Default {middle}
    */
  var horizontalAlignment: js.UndefOr[String] = js.native
}

object LabelSettingsHigherLevelStyle {
  @scala.inline
  def apply(): LabelSettingsHigherLevelStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelSettingsHigherLevelStyle]
  }
  @scala.inline
  implicit class LabelSettingsHigherLevelStyleOps[Self <: LabelSettingsHigherLevelStyle] (val x: Self) extends AnyVal {
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
    def setFont(value: LabelSettingsHigherLevelStyleFont): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setHorizontalAlignment(value: String): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
  }
  
}

