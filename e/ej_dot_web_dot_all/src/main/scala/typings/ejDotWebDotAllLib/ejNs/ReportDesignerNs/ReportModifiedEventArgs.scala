package typings
package ejDotWebDotAllLib.ejNs.ReportDesignerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportModifiedEventArgs extends js.Object {
  /** Specifies whether the report is modified or not.
    */
  var isModified: js.UndefOr[scala.Boolean] = js.undefined
  /** Name of Opened Report.
    */
  var reportName: js.UndefOr[java.lang.String] = js.undefined
}

object ReportModifiedEventArgs {
  @scala.inline
  def apply(isModified: js.UndefOr[scala.Boolean] = js.undefined, reportName: java.lang.String = null): ReportModifiedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isModified)) __obj.updateDynamic("isModified")(isModified)
    if (reportName != null) __obj.updateDynamic("reportName")(reportName)
    __obj.asInstanceOf[ReportModifiedEventArgs]
  }
}

