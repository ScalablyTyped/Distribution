package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLeadsResponse extends js.Object {
  /** The list of leads. */
  var leads: js.UndefOr[js.Array[Lead]] = js.native
  /**
    * A token to retrieve next page of results.
    * Pass this value in the `ListLeadsRequest.page_token` field in the
    * subsequent call to
    * ListLeads to retrieve the
    * next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** Current response metadata. */
  var responseMetadata: js.UndefOr[ResponseMetadata] = js.native
  /** The total count of leads for the given company. */
  var totalSize: js.UndefOr[Double] = js.native
}

object ListLeadsResponse {
  @scala.inline
  def apply(): ListLeadsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLeadsResponse]
  }
  @scala.inline
  implicit class ListLeadsResponseOps[Self <: ListLeadsResponse] (val x: Self) extends AnyVal {
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
    def setLeadsVarargs(value: Lead*): Self = this.set("leads", js.Array(value :_*))
    @scala.inline
    def setLeads(value: js.Array[Lead]): Self = this.set("leads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeads: Self = this.set("leads", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setResponseMetadata(value: ResponseMetadata): Self = this.set("responseMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseMetadata: Self = this.set("responseMetadata", js.undefined)
    @scala.inline
    def setTotalSize(value: Double): Self = this.set("totalSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalSize: Self = this.set("totalSize", js.undefined)
  }
  
}

