package typings.googleapis.buildSrcApisLibraryagentV1Mod.libraryagent_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for LibraryAgent.ListShelves.
  */
@js.native
trait Schema$GoogleExampleLibraryagentV1ListShelvesResponse extends js.Object {
  /**
    * A token to retrieve next page of results. Pass this value in the
    * ListShelvesRequest.page_token field in the subsequent call to
    * `ListShelves` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of shelves.
    */
  var shelves: js.UndefOr[js.Array[Schema$GoogleExampleLibraryagentV1Shelf]] = js.native
}

object Schema$GoogleExampleLibraryagentV1ListShelvesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, shelves: js.Array[Schema$GoogleExampleLibraryagentV1Shelf] = null): Schema$GoogleExampleLibraryagentV1ListShelvesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (shelves != null) __obj.updateDynamic("shelves")(shelves.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleExampleLibraryagentV1ListShelvesResponse]
  }
}

