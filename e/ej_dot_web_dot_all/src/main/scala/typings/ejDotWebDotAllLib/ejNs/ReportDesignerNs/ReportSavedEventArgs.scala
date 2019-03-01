package typings
package ejDotWebDotAllLib.ejNs.ReportDesignerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportSavedEventArgs extends js.Object {
  /** Specifies whether report opened from device or server.
    */
  var isServerReport: js.UndefOr[scala.Boolean] = js.undefined
  /** States whether report is downloaded from ReportServer.
    */
  var reportAction: js.UndefOr[java.lang.String] = js.undefined
}

object ReportSavedEventArgs {
  @scala.inline
  def apply(isServerReport: js.UndefOr[scala.Boolean] = js.undefined, reportAction: java.lang.String = null): ReportSavedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isServerReport)) __obj.updateDynamic("isServerReport")(isServerReport)
    if (reportAction != null) __obj.updateDynamic("reportAction")(reportAction)
    __obj.asInstanceOf[ReportSavedEventArgs]
  }
}

