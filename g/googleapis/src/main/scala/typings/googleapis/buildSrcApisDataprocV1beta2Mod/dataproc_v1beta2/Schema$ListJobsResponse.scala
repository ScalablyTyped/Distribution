package typings.googleapis.buildSrcApisDataprocV1beta2Mod.dataproc_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of jobs in a project.
  */
@js.native
trait Schema$ListJobsResponse extends js.Object {
  /**
    * Output only. Jobs list.
    */
  var jobs: js.UndefOr[js.Array[Schema$Job]] = js.native
  /**
    * Optional. This token is included in the response if there are more
    * results to fetch. To fetch additional results, provide this value as the
    * page_token in a subsequent &lt;code&gt;ListJobsRequest&lt;/code&gt;.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListJobsResponse {
  @scala.inline
  def apply(jobs: js.Array[Schema$Job] = null, nextPageToken: String = null): Schema$ListJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (jobs != null) __obj.updateDynamic("jobs")(jobs.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListJobsResponse]
  }
}

