package typings.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueAxisSettingsMajorGridLines extends js.Object {
  /** Toggles the visibility of major grid lines.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object ValueAxisSettingsMajorGridLines {
  @scala.inline
  def apply(): ValueAxisSettingsMajorGridLines = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueAxisSettingsMajorGridLines]
  }
  @scala.inline
  implicit class ValueAxisSettingsMajorGridLinesOps[Self <: ValueAxisSettingsMajorGridLines] (val x: Self) extends AnyVal {
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
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

