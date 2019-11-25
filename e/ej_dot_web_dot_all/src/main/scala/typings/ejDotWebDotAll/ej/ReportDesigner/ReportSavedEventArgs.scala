package typings.ejDotWebDotAll.ej.ReportDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportSavedEventArgs extends js.Object {
  /** Specifies whether report opened from device or server.
    */
  var isServerReport: js.UndefOr[Boolean] = js.undefined
  /** States whether report is downloaded from ReportServer.
    */
  var reportAction: js.UndefOr[String] = js.undefined
}

object ReportSavedEventArgs {
  @scala.inline
  def apply(isServerReport: js.UndefOr[Boolean] = js.undefined, reportAction: String = null): ReportSavedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isServerReport)) __obj.updateDynamic("isServerReport")(isServerReport.asInstanceOf[js.Any])
    if (reportAction != null) __obj.updateDynamic("reportAction")(reportAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportSavedEventArgs]
  }
}

