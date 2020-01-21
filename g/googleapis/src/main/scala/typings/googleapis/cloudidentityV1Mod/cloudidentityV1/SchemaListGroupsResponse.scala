package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for ListGroups operation.
  */
@js.native
trait SchemaListGroupsResponse extends js.Object {
  /**
    * Groups returned in response to list request. The results are not sorted.
    */
  var groups: js.UndefOr[js.Array[SchemaGroup]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results available for listing.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListGroupsResponse {
  @scala.inline
  def apply(groups: js.Array[SchemaGroup] = null, nextPageToken: String = null): SchemaListGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListGroupsResponse]
  }
}

