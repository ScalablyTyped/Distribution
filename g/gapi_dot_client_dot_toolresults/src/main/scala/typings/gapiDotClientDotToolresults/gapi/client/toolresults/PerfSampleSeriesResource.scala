package typings.gapiDotClientDotToolresults.gapi.client.toolresults

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotToolresults.Anon_AltExecutionIdFields
import typings.gapiDotClientDotToolresults.Anon_AltExecutionIdFieldsFilter
import typings.gapiDotClientDotToolresults.Anon_AltExecutionIdFieldsHistoryId
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
  def create(request: Anon_AltExecutionIdFields): Request[PerfSampleSeries]
  /**
    * Gets a PerfSampleSeries.
    *
    * May return any of the following error code(s): - NOT_FOUND - The specified PerfSampleSeries does not exist
    */
  def get(request: Anon_AltExecutionIdFieldsHistoryId): Request[PerfSampleSeries]
  /**
    * Lists PerfSampleSeries for a given Step.
    *
    * The request provides an optional filter which specifies one or more PerfMetricsType to include in the result; if none returns all. The resulting
    * PerfSampleSeries are sorted by ids.
    *
    * May return any of the following canonical error codes: - NOT_FOUND - The containing Step does not exist
    */
  def list(request: Anon_AltExecutionIdFieldsFilter): Request[ListPerfSampleSeriesResponse]
}

object PerfSampleSeriesResource {
  @scala.inline
  def apply(
    create: Anon_AltExecutionIdFields => Request[PerfSampleSeries],
    get: Anon_AltExecutionIdFieldsHistoryId => Request[PerfSampleSeries],
    list: Anon_AltExecutionIdFieldsFilter => Request[ListPerfSampleSeriesResponse],
    samples: SamplesResource
  ): PerfSampleSeriesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), samples = samples.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PerfSampleSeriesResource]
  }
}

