package typings.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListSpacesResponse extends js.Object {
  /**
    * Continuation token to retrieve the next page of results. It will be empty
    * for the last page of results. Tokens expire in an hour. An error is
    * thrown if an expired token is passed.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * List of spaces in the requested (or first) page.
    */
  var spaces: js.UndefOr[js.Array[SchemaSpace]] = js.native
}

object SchemaListSpacesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, spaces: js.Array[SchemaSpace] = null): SchemaListSpacesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (spaces != null) __obj.updateDynamic("spaces")(spaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListSpacesResponse]
  }
}

