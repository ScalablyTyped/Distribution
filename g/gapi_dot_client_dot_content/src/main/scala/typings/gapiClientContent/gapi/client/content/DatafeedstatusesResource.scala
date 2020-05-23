package typings.gapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.gapiClientContent.anon.Alt
import typings.gapiClientContent.anon.Country
import typings.gapiClientContent.anon.MaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedstatusesResource extends js.Object {
  def custombatch(request: Alt): Request[DatafeedstatusesCustomBatchResponse]
  /** Retrieves the status of a datafeed from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: Country): Request[DatafeedStatus]
  /** Lists the statuses of the datafeeds in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: MaxResults): Request[DatafeedstatusesListResponse]
}

object DatafeedstatusesResource {
  @scala.inline
  def apply(
    custombatch: Alt => Request[DatafeedstatusesCustomBatchResponse],
    get: Country => Request[DatafeedStatus],
    list: MaxResults => Request[DatafeedstatusesListResponse]
  ): DatafeedstatusesResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[DatafeedstatusesResource]
  }
}

