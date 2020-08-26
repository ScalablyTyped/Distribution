package typings.ejWebAll.ej.ReportDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreviewReportEventArgs extends js.Object {
  /** Specifies whether to show or hide preview data dialog.
    */
  var cancelDataInputDialog: js.UndefOr[Boolean] = js.native
  /** Contains the required data to load the report.
    */
  var dataSets: js.UndefOr[js.Array[_]] = js.native
  /** Contains the instance of Report Viewer component.
    */
  var reportViewer: js.UndefOr[js.Any] = js.native
}

object PreviewReportEventArgs {
  @scala.inline
  def apply(): PreviewReportEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviewReportEventArgs]
  }
  @scala.inline
  implicit class PreviewReportEventArgsOps[Self <: PreviewReportEventArgs] (val x: Self) extends AnyVal {
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
    def setCancelDataInputDialog(value: Boolean): Self = this.set("cancelDataInputDialog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelDataInputDialog: Self = this.set("cancelDataInputDialog", js.undefined)
    @scala.inline
    def setDataSetsVarargs(value: js.Any*): Self = this.set("dataSets", js.Array(value :_*))
    @scala.inline
    def setDataSets(value: js.Array[_]): Self = this.set("dataSets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSets: Self = this.set("dataSets", js.undefined)
    @scala.inline
    def setReportViewer(value: js.Any): Self = this.set("reportViewer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportViewer: Self = this.set("reportViewer", js.undefined)
  }
  
}

