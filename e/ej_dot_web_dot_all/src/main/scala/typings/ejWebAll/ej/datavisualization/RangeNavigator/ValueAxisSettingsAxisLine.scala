package typings.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueAxisSettingsAxisLine extends js.Object {
  /** Toggles the visibility of axis line.
    * @Default {none}
    */
  var visible: js.UndefOr[String] = js.native
}

object ValueAxisSettingsAxisLine {
  @scala.inline
  def apply(): ValueAxisSettingsAxisLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueAxisSettingsAxisLine]
  }
  @scala.inline
  implicit class ValueAxisSettingsAxisLineOps[Self <: ValueAxisSettingsAxisLine] (val x: Self) extends AnyVal {
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
    def setVisible(value: String): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

