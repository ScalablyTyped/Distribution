package typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotContent.Anon_Alt
import typings.gapiDotClientDotContent.Anon_AltCountry
import typings.gapiDotClientDotContent.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedstatusesResource extends js.Object {
  def custombatch(request: Anon_Alt): Request[DatafeedstatusesCustomBatchResponse]
  /** Retrieves the status of a datafeed from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: Anon_AltCountry): Request[DatafeedStatus]
  /** Lists the statuses of the datafeeds in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: Anon_AltFields): Request[DatafeedstatusesListResponse]
}

object DatafeedstatusesResource {
  @scala.inline
  def apply(
    custombatch: Anon_Alt => Request[DatafeedstatusesCustomBatchResponse],
    get: Anon_AltCountry => Request[DatafeedStatus],
    list: Anon_AltFields => Request[DatafeedstatusesListResponse]
  ): DatafeedstatusesResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[DatafeedstatusesResource]
  }
}

