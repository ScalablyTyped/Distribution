package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerfSampleSeriesResource extends js.Object {
  var samples: SamplesResource
  /**
    * Creates a PerfSampleSeries.
    *
    * May return any of the following error code(s): - ALREADY_EXISTS - PerfMetricSummary already exists for the given Step - NOT_FOUND - The containing Step
    * does not exist
    */
  def create(request: gapiDotClientDotToolresultsLib.Anon_AltExecutionIdFields): gapiDotClientLib.gapiNs.clientNs.Request[PerfSampleSeries]
  /**
    * Gets a PerfSampleSeries.
    *
    * May return any of the following error code(s): - NOT_FOUND - The specified PerfSampleSeries does not exist
    */
  def get(request: gapiDotClientDotToolresultsLib.Anon_AltExecutionIdFieldsHistoryId): gapiDotClientLib.gapiNs.clientNs.Request[PerfSampleSeries]
  /**
    * Lists PerfSampleSeries for a given Step.
    *
    * The request provides an optional filter which specifies one or more PerfMetricsType to include in the result; if none returns all. The resulting
    * PerfSampleSeries are sorted by ids.
    *
    * May return any of the following canonical error codes: - NOT_FOUND - The containing Step does not exist
    */
  def list(request: gapiDotClientDotToolresultsLib.Anon_AltExecutionIdFieldsFilter): gapiDotClientLib.gapiNs.clientNs.Request[ListPerfSampleSeriesResponse]
}

object PerfSampleSeriesResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotToolresultsLib.Anon_AltExecutionIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[PerfSampleSeries]
    ],
    get: js.Function1[
      gapiDotClientDotToolresultsLib.Anon_AltExecutionIdFieldsHistoryId, 
      gapiDotClientLib.gapiNs.clientNs.Request[PerfSampleSeries]
    ],
    list: js.Function1[
      gapiDotClientDotToolresultsLib.Anon_AltExecutionIdFieldsFilter, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListPerfSampleSeriesResponse]
    ],
    samples: SamplesResource
  ): PerfSampleSeriesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("samples")(samples)
    __obj.asInstanceOf[PerfSampleSeriesResource]
  }
}

