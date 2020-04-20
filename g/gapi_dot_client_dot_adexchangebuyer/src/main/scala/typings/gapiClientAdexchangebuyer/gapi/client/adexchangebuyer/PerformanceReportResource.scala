package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangebuyer.AnonEndDateTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerformanceReportResource extends js.Object {
  /** Retrieves the authenticated user's list of performance metrics. */
  def list(request: AnonEndDateTime): Request_[PerformanceReportList]
}

object PerformanceReportResource {
  @scala.inline
  def apply(list: AnonEndDateTime => Request_[PerformanceReportList]): PerformanceReportResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[PerformanceReportResource]
  }
}

