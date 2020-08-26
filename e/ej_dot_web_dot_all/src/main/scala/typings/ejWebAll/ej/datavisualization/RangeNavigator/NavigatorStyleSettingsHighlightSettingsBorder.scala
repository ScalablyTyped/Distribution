package typings.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigatorStyleSettingsHighlightSettingsBorder extends js.Object {
  /** To set the border color to the highlight.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.native
  /** To set the border width to the highlight.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.native
}

object NavigatorStyleSettingsHighlightSettingsBorder {
  @scala.inline
  def apply(): NavigatorStyleSettingsHighlightSettingsBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigatorStyleSettingsHighlightSettingsBorder]
  }
  @scala.inline
  implicit class NavigatorStyleSettingsHighlightSettingsBorderOps[Self <: NavigatorStyleSettingsHighlightSettingsBorder] (val x: Self) extends AnyVal {
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
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

