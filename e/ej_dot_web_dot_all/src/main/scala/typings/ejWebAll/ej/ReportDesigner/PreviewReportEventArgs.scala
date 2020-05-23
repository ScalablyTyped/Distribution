package typings.ejWebAll.ej.ReportDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewReportEventArgs extends js.Object {
  /** Specifies whether to show or hide preview data dialog.
    */
  var cancelDataInputDialog: js.UndefOr[Boolean] = js.undefined
  /** Contains the required data to load the report.
    */
  var dataSets: js.UndefOr[js.Array[_]] = js.undefined
  /** Contains the instance of Report Viewer component.
    */
  var reportViewer: js.UndefOr[js.Any] = js.undefined
}

object PreviewReportEventArgs {
  @scala.inline
  def apply(
    cancelDataInputDialog: js.UndefOr[Boolean] = js.undefined,
    dataSets: js.Array[_] = null,
    reportViewer: js.Any = null
  ): PreviewReportEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancelDataInputDialog)) __obj.updateDynamic("cancelDataInputDialog")(cancelDataInputDialog.get.asInstanceOf[js.Any])
    if (dataSets != null) __obj.updateDynamic("dataSets")(dataSets.asInstanceOf[js.Any])
    if (reportViewer != null) __obj.updateDynamic("reportViewer")(reportViewer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewReportEventArgs]
  }
}

