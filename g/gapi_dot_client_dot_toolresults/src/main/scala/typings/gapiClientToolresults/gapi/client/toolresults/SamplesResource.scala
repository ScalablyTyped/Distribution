package typings.gapiClientToolresults.gapi.client.toolresults

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientToolresults.AnonHistoryId
import typings.gapiClientToolresults.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SamplesResource extends js.Object {
  /**
    * Creates a batch of PerfSamples - a client can submit multiple batches of Perf Samples through repeated calls to this method in order to split up a
    * large request payload - duplicates and existing timestamp entries will be ignored. - the batch operation may partially succeed - the set of elements
    * successfully inserted is returned in the response (omits items which already existed in the database).
    *
    * May return any of the following canonical error codes: - NOT_FOUND - The containing PerfSampleSeries does not exist
    */
  def batchCreate(request: AnonHistoryId): Request_[BatchCreatePerfSamplesResponse]
  /**
    * Lists the Performance Samples of a given Sample Series - The list results are sorted by timestamps ascending - The default page size is 500 samples;
    * and maximum size allowed 5000 - The response token indicates the last returned PerfSample timestamp - When the results size exceeds the page size,
    * submit a subsequent request including the page token to return the rest of the samples up to the page limit
    *
    * May return any of the following canonical error codes: - OUT_OF_RANGE - The specified request page_token is out of valid range - NOT_FOUND - The
    * containing PerfSampleSeries does not exist
    */
  def list(request: AnonKey): Request_[ListPerfSamplesResponse]
}

object SamplesResource {
  @scala.inline
  def apply(
    batchCreate: AnonHistoryId => Request_[BatchCreatePerfSamplesResponse],
    list: AnonKey => Request_[ListPerfSamplesResponse]
  ): SamplesResource = {
    val __obj = js.Dynamic.literal(batchCreate = js.Any.fromFunction1(batchCreate), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[SamplesResource]
  }
}

