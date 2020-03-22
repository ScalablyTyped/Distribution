package typings.gapiClientToolresults.gapi.client.toolresults

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientToolresults.AnonFields
import typings.gapiClientToolresults.AnonFilter
import typings.gapiClientToolresults.AnonHistoryId
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
  def create(request: AnonFields): Request_[PerfSampleSeries]
  /**
    * Gets a PerfSampleSeries.
    *
    * May return any of the following error code(s): - NOT_FOUND - The specified PerfSampleSeries does not exist
    */
  def get(request: AnonHistoryId): Request_[PerfSampleSeries]
  /**
    * Lists PerfSampleSeries for a given Step.
    *
    * The request provides an optional filter which specifies one or more PerfMetricsType to include in the result; if none returns all. The resulting
    * PerfSampleSeries are sorted by ids.
    *
    * May return any of the following canonical error codes: - NOT_FOUND - The containing Step does not exist
    */
  def list(request: AnonFilter): Request_[ListPerfSampleSeriesResponse]
}

object PerfSampleSeriesResource {
  @scala.inline
  def apply(
    create: AnonFields => Request_[PerfSampleSeries],
    get: AnonHistoryId => Request_[PerfSampleSeries],
    list: AnonFilter => Request_[ListPerfSampleSeriesResponse],
    samples: SamplesResource
  ): PerfSampleSeriesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), samples = samples.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PerfSampleSeriesResource]
  }
}

