package typings.ejWebAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveReportEventArgs extends js.Object {
  /** returns the report to be stored in database.
    */
  var report: js.UndefOr[js.Any] = js.native
}

object SaveReportEventArgs {
  @scala.inline
  def apply(): SaveReportEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveReportEventArgs]
  }
  @scala.inline
  implicit class SaveReportEventArgsOps[Self <: SaveReportEventArgs] (val x: Self) extends AnyVal {
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
    def setReport(value: js.Any): Self = this.set("report", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReport: Self = this.set("report", js.undefined)
  }
  
}

