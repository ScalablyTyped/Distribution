package typings.ejDotWebDotAll.ej.ReportDesigner

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
    if (!js.isUndefined(cancelDataInputDialog)) __obj.updateDynamic("cancelDataInputDialog")(cancelDataInputDialog)
    if (dataSets != null) __obj.updateDynamic("dataSets")(dataSets)
    if (reportViewer != null) __obj.updateDynamic("reportViewer")(reportViewer)
    __obj.asInstanceOf[PreviewReportEventArgs]
  }
}

