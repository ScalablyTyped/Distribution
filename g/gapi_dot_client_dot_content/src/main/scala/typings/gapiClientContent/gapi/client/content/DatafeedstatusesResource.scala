package typings.gapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.gapiClientContent.anon.Alt
import typings.gapiClientContent.anon.Country
import typings.gapiClientContent.anon.MaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatafeedstatusesResource extends js.Object {
  def custombatch(request: Alt): Request[DatafeedstatusesCustomBatchResponse] = js.native
  /** Retrieves the status of a datafeed from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: Country): Request[DatafeedStatus] = js.native
  /** Lists the statuses of the datafeeds in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: MaxResults): Request[DatafeedstatusesListResponse] = js.native
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
  @scala.inline
  implicit class DatafeedstatusesResourceOps[Self <: DatafeedstatusesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCustombatch(value: Alt => Request[DatafeedstatusesCustomBatchResponse]): Self = this.set("custombatch", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Country => Request[DatafeedStatus]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: MaxResults => Request[DatafeedstatusesListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

