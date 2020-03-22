package typings.gapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientContent.AnonAlt
import typings.gapiClientContent.AnonCountry
import typings.gapiClientContent.AnonMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedstatusesResource extends js.Object {
  def custombatch(request: AnonAlt): Request_[DatafeedstatusesCustomBatchResponse]
  /** Retrieves the status of a datafeed from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: AnonCountry): Request_[DatafeedStatus]
  /** Lists the statuses of the datafeeds in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: AnonMaxResults): Request_[DatafeedstatusesListResponse]
}

object DatafeedstatusesResource {
  @scala.inline
  def apply(
    custombatch: AnonAlt => Request_[DatafeedstatusesCustomBatchResponse],
    get: AnonCountry => Request_[DatafeedStatus],
    list: AnonMaxResults => Request_[DatafeedstatusesListResponse]
  ): DatafeedstatusesResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[DatafeedstatusesResource]
  }
}

