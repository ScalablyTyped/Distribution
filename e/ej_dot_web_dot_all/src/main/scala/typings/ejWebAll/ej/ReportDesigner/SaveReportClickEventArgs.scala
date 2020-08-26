package typings.ejWebAll.ej.ReportDesigner

import typings.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveReportClickEventArgs extends js.Object {
  /** Name of selected item.
    */
  var select: js.UndefOr[String] = js.native
  /** DOM of the clicked target.
    */
  var target: js.UndefOr[JQuery] = js.native
}

object SaveReportClickEventArgs {
  @scala.inline
  def apply(): SaveReportClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveReportClickEventArgs]
  }
  @scala.inline
  implicit class SaveReportClickEventArgsOps[Self <: SaveReportClickEventArgs] (val x: Self) extends AnyVal {
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
    def setSelect(value: String): Self = this.set("select", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setTarget(value: JQuery): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

