package typings
package gapiDotClientDotDoubleclickbidmanagerLib.gapiNs.clientNs.doubleclickbidmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportKey extends js.Object {
  /** Query ID. */
  var queryId: js.UndefOr[java.lang.String] = js.undefined
  /** Report ID. */
  var reportId: js.UndefOr[java.lang.String] = js.undefined
}

object ReportKey {
  @scala.inline
  def apply(queryId: java.lang.String = null, reportId: java.lang.String = null): ReportKey = {
    val __obj = js.Dynamic.literal()
    if (queryId != null) __obj.updateDynamic("queryId")(queryId)
    if (reportId != null) __obj.updateDynamic("reportId")(reportId)
    __obj.asInstanceOf[ReportKey]
  }
}

