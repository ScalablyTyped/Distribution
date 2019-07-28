package typings.gapiDotClientDotAdexchangebuyer.gapiNs.clientNs.adexchangebuyerNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAdexchangebuyer.Anon_AccountIdAltEndDateTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerformanceReportResource extends js.Object {
  /** Retrieves the authenticated user's list of performance metrics. */
  def list(request: Anon_AccountIdAltEndDateTime): Request[PerformanceReportList]
}

object PerformanceReportResource {
  @scala.inline
  def apply(list: Anon_AccountIdAltEndDateTime => Request[PerformanceReportList]): PerformanceReportResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[PerformanceReportResource]
  }
}

