package typings.googleapis.buildSrcApisJobsV3Mod.jobs_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  The List companies response object.
  */
@js.native
trait Schema$ListCompaniesResponse extends js.Object {
  /**
    * Companies for the current client.
    */
  var companies: js.UndefOr[js.Array[Schema$Company]] = js.native
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

object Schema$ListCompaniesResponse {
  @scala.inline
  def apply(
    companies: js.Array[Schema$Company] = null,
    metadata: Schema$ResponseMetadata = null,
    nextPageToken: String = null
  ): Schema$ListCompaniesResponse = {
    val __obj = js.Dynamic.literal()
    if (companies != null) __obj.updateDynamic("companies")(companies.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListCompaniesResponse]
  }
}

