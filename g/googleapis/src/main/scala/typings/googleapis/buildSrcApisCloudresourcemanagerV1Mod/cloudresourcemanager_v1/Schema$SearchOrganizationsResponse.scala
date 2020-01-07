package typings.googleapis.buildSrcApisCloudresourcemanagerV1Mod.cloudresourcemanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response returned from the `SearchOrganizations` method.
  */
@js.native
trait Schema$SearchOrganizationsResponse extends js.Object {
  /**
    * A pagination token to be used to retrieve the next page of results. If
    * the result is too large to fit within the page size specified in the
    * request, this field will be set with a token that can be used to fetch
    * the next page of results. If this field is empty, it indicates that this
    * response contains the last page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of Organizations that matched the search query, possibly
    * paginated.
    */
  var organizations: js.UndefOr[js.Array[Schema$Organization]] = js.native
}

object Schema$SearchOrganizationsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, organizations: js.Array[Schema$Organization] = null): Schema$SearchOrganizationsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (organizations != null) __obj.updateDynamic("organizations")(organizations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SearchOrganizationsResponse]
  }
}

