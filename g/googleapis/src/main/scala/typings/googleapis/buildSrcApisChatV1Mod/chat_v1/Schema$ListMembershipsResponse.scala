package typings.googleapis.buildSrcApisChatV1Mod.chat_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ListMembershipsResponse extends js.Object {
  /**
    * List of memberships in the requested (or first) page.
    */
  var memberships: js.UndefOr[js.Array[Schema$Membership]] = js.native
  /**
    * Continuation token to retrieve the next page of results. It will be empty
    * for the last page of results.
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

