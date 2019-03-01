package typings
package ejDotWebDotAllLib.ejNs.ReportDesignerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportOpenedEventArgs extends js.Object {
  /** Specifies whether report opened from device or server.
    */
  var isServerReport: js.UndefOr[scala.Boolean] = js.undefined
  /** Name of Opened Report.
    */
  var reportName: js.UndefOr[java.lang.String] = js.undefined
}

object ReportOpenedEventArgs {
  @scala.inline
  def apply(isServerReport: js.UndefOr[scala.Boolean] = js.undefined, reportName: java.lang.String = null): ReportOpenedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isServerReport)) __obj.updateDynamic("isServerReport")(isServerReport)
    if (reportName != null) __obj.updateDynamic("reportName")(reportName)
    __obj.asInstanceOf[ReportOpenedEventArgs]
  }
}

