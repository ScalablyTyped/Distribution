package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceJobsGetqueryresults extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * [Required] Job ID of the query job
    */
  var jobId: js.UndefOr[String] = js.native
  /**
    * The geographic location where the job should run. Required except for US
    * and EU. See details at
    * https://cloud.google.com/bigquery/docs/locations#specifying_your_location.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Maximum number of results to read
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Page token, returned by a previous call, to request the next page of
    * results
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * [Required] Project ID of the query job
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Zero-based index of the starting row
    */
  var startIndex: js.UndefOr[String] = js.native
  /**
    * How long to wait for the query to complete, in milliseconds, before
    * returning. Default is 10 seconds. If the timeout passes before the job
    * completes, the 'jobComplete' field in the response will be false
    */
  var timeoutMs: js.UndefOr[Double] = js.native
}

object ParamsResourceJobsGetqueryresults {
  @scala.inline
  def apply(): ParamsResourceJobsGetqueryresults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceJobsGetqueryresults]
  }
  @scala.inline
  implicit class ParamsResourceJobsGetqueryresultsOps[Self <: ParamsResourceJobsGetqueryresults] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setJobId(value: String): Self = this.set("jobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobId: Self = this.set("jobId", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setStartIndex(value: String): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
    @scala.inline
    def setTimeoutMs(value: Double): Self = this.set("timeoutMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutMs: Self = this.set("timeoutMs", js.undefined)
  }
  
}

