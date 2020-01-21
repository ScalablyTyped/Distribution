package typings.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListMembershipsResponse extends js.Object {
  /**
    * List of memberships in the requested (or first) page.
    */
  var memberships: js.UndefOr[js.Array[SchemaMembership]] = js.native
  /**
    * Continuation token to retrieve the next page of results. It will be empty
    * for the last page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListMembershipsResponse {
  @scala.inline
  def apply(memberships: js.Array[SchemaMembership] = null, nextPageToken: String = null): SchemaListMembershipsResponse = {
    val __obj = js.Dynamic.literal()
    if (memberships != null) __obj.updateDynamic("memberships")(memberships.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListMembershipsResponse]
  }
}

