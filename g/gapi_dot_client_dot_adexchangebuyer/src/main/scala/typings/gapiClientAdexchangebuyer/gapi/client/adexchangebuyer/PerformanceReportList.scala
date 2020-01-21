package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerformanceReportList extends js.Object {
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
  /** A list of performance reports relevant for the account. */
  var performanceReport: js.UndefOr[js.Array[PerformanceReport]] = js.undefined
}

object PerformanceReportList {
  @scala.inline
  def apply(kind: String = null, performanceReport: js.Array[PerformanceReport] = null): PerformanceReportList = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (performanceReport != null) __obj.updateDynamic("performanceReport")(performanceReport.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceReportList]
  }
}

