package typings.gapiDotClientDotToolresults.gapiNs.clientNs.toolresultsNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotToolresults.Anon_AltExecutionIdFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerfMetricsSummaryResource extends js.Object {
  /**
    * Creates a PerfMetricsSummary resource. Returns the existing one if it has already been created.
    *
    * May return any of the following error code(s): - NOT_FOUND - The containing Step does not exist
    */
  def create(request: Anon_AltExecutionIdFields): Request[PerfMetricsSummary]
}

object PerfMetricsSummaryResource {
  @scala.inline
  def apply(create: Anon_AltExecutionIdFields => Request[PerfMetricsSummary]): PerfMetricsSummaryResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
  
    __obj.asInstanceOf[PerfMetricsSummaryResource]
  }
}

