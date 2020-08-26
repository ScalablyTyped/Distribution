package typings.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelSettingsHigherLevelBorder extends js.Object {
  /** Specifies the border color of grid lines.
    * @Default {transparent}
    */
  var color: js.UndefOr[String] = js.native
  /** Specifies the border width of grid lines.
    * @Default {0.5}
    */
  var width: js.UndefOr[String] = js.native
}

object LabelSettingsHigherLevelBorder {
  @scala.inline
  def apply(): LabelSettingsHigherLevelBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelSettingsHigherLevelBorder]
  }
  @scala.inline
  implicit class LabelSettingsHigherLevelBorderOps[Self <: LabelSettingsHigherLevelBorder] (val x: Self) extends AnyVal {
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
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

