package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSearchGroupsResponse extends js.Object {
  /**
    * List of Groups satisfying the search query.
    */
  var groups: js.UndefOr[js.Array[SchemaGroup]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results available for specified query.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaSearchGroupsResponse {
  @scala.inline
  def apply(groups: js.Array[SchemaGroup] = null, nextPageToken: String = null): SchemaSearchGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSearchGroupsResponse]
  }
}

