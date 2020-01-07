package typings.googleapis.buildSrcApisChatV1Mod.chat_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ListSpacesResponse extends js.Object {
  /**
    * Continuation token to retrieve the next page of results. It will be empty
    * for the last page of results. Tokens expire in an hour. An error is
    * thrown if an expired token is passed.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * List of spaces in the requested (or first) page.
    */
  var spaces: js.UndefOr[js.Array[Schema$Space]] = js.native
}

object Schema$ListSpacesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, spaces: js.Array[Schema$Space] = null): Schema$ListSpacesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (spaces != null) __obj.updateDynamic("spaces")(spaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListSpacesResponse]
  }
}

