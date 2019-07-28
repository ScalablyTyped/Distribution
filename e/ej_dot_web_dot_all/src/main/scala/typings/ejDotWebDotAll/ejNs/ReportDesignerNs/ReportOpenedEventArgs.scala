package typings.ejDotWebDotAll.ejNs.ReportDesignerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportOpenedEventArgs extends js.Object {
  /** Specifies whether report opened from device or server.
    */
  var isServerReport: js.UndefOr[Boolean] = js.undefined
  /** Name of Opened Report.
    */
  var reportName: js.UndefOr[String] = js.undefined
}

object ReportOpenedEventArgs {
  @scala.inline
  def apply(isServerReport: js.UndefOr[Boolean] = js.undefined, reportName: String = null): ReportOpenedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isServerReport)) __obj.updateDynamic("isServerReport")(isServerReport)
    if (reportName != null) __obj.updateDynamic("reportName")(reportName)
    __obj.asInstanceOf[ReportOpenedEventArgs]
  }
}

