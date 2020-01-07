package typings.googleapis.buildSrcApisCloudidentityV1Mod.cloudidentity_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ListMembershipsResponse extends js.Object {
  /**
    * List of Memberships.
    */
  var memberships: js.UndefOr[js.Array[Schema$Membership]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results available for listing.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListMembershipsResponse {
  @scala.inline
  def apply(memberships: js.Array[Schema$Membership] = null, nextPageToken: String = null): Schema$ListMembershipsResponse = {
    val __obj = js.Dynamic.literal()
    if (memberships != null) __obj.updateDynamic("memberships")(memberships.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListMembershipsResponse]
  }
}

