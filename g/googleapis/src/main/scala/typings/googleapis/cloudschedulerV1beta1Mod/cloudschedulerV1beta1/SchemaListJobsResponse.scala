package typings.googleapis.cloudschedulerV1beta1Mod.cloudschedulerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing jobs using ListJobs.
  */
@js.native
trait SchemaListJobsResponse extends js.Object {
  /**
    * The list of jobs.
    */
  var jobs: js.UndefOr[js.Array[SchemaJob]] = js.native
  /**
    * A token to retrieve next page of results. Pass this value in the
    * page_token field in the subsequent call to ListJobs to retrieve the next
    * page of results. If this is empty it indicates that there are no more
    * results through which to paginate.  The page token is valid for only 2
    * hours.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListJobsResponse {
  @scala.inline
  def apply(): SchemaListJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListJobsResponse]
  }
  @scala.inline
  implicit class SchemaListJobsResponseOps[Self <: SchemaListJobsResponse] (val x: Self) extends AnyVal {
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
    def setJobsVarargs(value: SchemaJob*): Self = this.set("jobs", js.Array(value :_*))
    @scala.inline
    def setJobs(value: js.Array[SchemaJob]): Self = this.set("jobs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobs: Self = this.set("jobs", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

