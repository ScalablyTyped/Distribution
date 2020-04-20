package typings.gapiClientToolresults.gapi.client.toolresults

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientToolresults.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerfMetricsSummaryResource extends js.Object {
  /**
    * Creates a PerfMetricsSummary resource. Returns the existing one if it has already been created.
    *
    * May return any of the following error code(s): - NOT_FOUND - The containing Step does not exist
    */
  def create(request: AnonFields): Request_[PerfMetricsSummary]
}

object PerfMetricsSummaryResource {
  @scala.inline
  def apply(create: AnonFields => Request_[PerfMetricsSummary]): PerfMetricsSummaryResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[PerfMetricsSummaryResource]
  }
}

