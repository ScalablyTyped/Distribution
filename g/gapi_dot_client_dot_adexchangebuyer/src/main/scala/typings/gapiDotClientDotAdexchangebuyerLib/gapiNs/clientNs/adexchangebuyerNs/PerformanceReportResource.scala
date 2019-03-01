package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerformanceReportResource extends js.Object {
  /** Retrieves the authenticated user's list of performance metrics. */
  def list(request: gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltEndDateTime): gapiDotClientLib.gapiNs.clientNs.Request[PerformanceReportList]
}

object PerformanceReportResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltEndDateTime, 
      gapiDotClientLib.gapiNs.clientNs.Request[PerformanceReportList]
    ]
  ): PerformanceReportResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[PerformanceReportResource]
  }
}

