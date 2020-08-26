package typings.gapiClientDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobsResponse extends js.Object {
  /** Output-only. Jobs list. */
  var jobs: js.UndefOr[js.Array[Job]] = js.native
  /**
    * Optional. This token is included in the response if there are more results to fetch. To fetch additional results, provide this value as the page_token
    * in a subsequent <code>ListJobsRequest</code>.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListJobsResponse {
  @scala.inline
  def apply(): ListJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobsResponse]
  }
  @scala.inline
  implicit class ListJobsResponseOps[Self <: ListJobsResponse] (val x: Self) extends AnyVal {
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
    def setJobsVarargs(value: Job*): Self = this.set("jobs", js.Array(value :_*))
    @scala.inline
    def setJobs(value: js.Array[Job]): Self = this.set("jobs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobs: Self = this.set("jobs", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

