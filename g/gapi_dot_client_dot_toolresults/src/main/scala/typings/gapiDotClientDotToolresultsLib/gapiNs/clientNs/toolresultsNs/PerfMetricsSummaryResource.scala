package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerfMetricsSummaryResource extends js.Object {
  /**
    * Creates a PerfMetricsSummary resource. Returns the existing one if it has already been created.
    *
    * May return any of the following error code(s): - NOT_FOUND - The containing Step does not exist
    */
  def create(request: gapiDotClientDotToolresultsLib.Anon_AltExecutionIdFields): gapiDotClientLib.gapiNs.clientNs.Request[PerfMetricsSummary]
}

object PerfMetricsSummaryResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotToolresultsLib.Anon_AltExecutionIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[PerfMetricsSummary]
    ]
  ): PerfMetricsSummaryResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.asInstanceOf[PerfMetricsSummaryResource]
  }
}

