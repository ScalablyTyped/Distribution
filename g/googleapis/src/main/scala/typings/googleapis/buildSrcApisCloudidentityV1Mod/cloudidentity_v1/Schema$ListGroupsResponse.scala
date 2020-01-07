package typings.googleapis.buildSrcApisCloudidentityV1Mod.cloudidentity_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for ListGroups operation.
  */
@js.native
trait Schema$ListGroupsResponse extends js.Object {
  /**
    * Groups returned in response to list request. The results are not sorted.
    */
  var groups: js.UndefOr[js.Array[Schema$Group]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results available for listing.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListGroupsResponse {
  @scala.inline
  def apply(groups: js.Array[Schema$Group] = null, nextPageToken: String = null): Schema$ListGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListGroupsResponse]
  }
}

