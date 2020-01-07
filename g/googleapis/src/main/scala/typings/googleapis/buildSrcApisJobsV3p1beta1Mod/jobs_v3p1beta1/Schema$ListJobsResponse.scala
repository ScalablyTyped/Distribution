package typings.googleapis.buildSrcApisJobsV3p1beta1Mod.jobs_v3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  List jobs response.
  */
@js.native
trait Schema$ListJobsResponse extends js.Object {
  /**
    * The Jobs for a given company.  The maximum number of items returned is
    * based on the limit field provided in the request.
    */
  var jobs: js.UndefOr[js.Array[Schema$Job]] = js.native
  /**
    * Additional information for the API invocation, such as the request
    * tracking id.
    */
  var metadata: js.UndefOr[Schema$ResponseMetadata] = js.native
  /**
    * A token to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListJobsResponse {
  @scala.inline
  def apply(
    jobs: js.Array[Schema$Job] = null,
    metadata: Schema$ResponseMetadata = null,
    nextPageToken: String = null
  ): Schema$ListJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (jobs != null) __obj.updateDynamic("jobs")(jobs.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListJobsResponse]
  }
}

