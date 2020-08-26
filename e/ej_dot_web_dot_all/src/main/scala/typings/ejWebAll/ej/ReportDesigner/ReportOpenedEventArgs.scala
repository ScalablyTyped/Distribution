package typings.ejWebAll.ej.ReportDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportOpenedEventArgs extends js.Object {
  /** Specifies whether report opened from device or server.
    */
  var isServerReport: js.UndefOr[Boolean] = js.native
  /** Name of Opened Report.
    */
  var reportName: js.UndefOr[String] = js.native
}

object ReportOpenedEventArgs {
  @scala.inline
  def apply(): ReportOpenedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportOpenedEventArgs]
  }
  @scala.inline
  implicit class ReportOpenedEventArgsOps[Self <: ReportOpenedEventArgs] (val x: Self) extends AnyVal {
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
    def setIsServerReport(value: Boolean): Self = this.set("isServerReport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsServerReport: Self = this.set("isServerReport", js.undefined)
    @scala.inline
    def setReportName(value: String): Self = this.set("reportName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportName: Self = this.set("reportName", js.undefined)
  }
  
}

