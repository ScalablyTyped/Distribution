package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for Liens.ListLiens.
  */
@js.native
trait SchemaListLiensResponse extends js.Object {
  /**
    * A list of Liens.
    */
  var liens: js.UndefOr[js.Array[SchemaLien]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListLiensResponse {
  @scala.inline
  def apply(liens: js.Array[SchemaLien] = null, nextPageToken: String = null): SchemaListLiensResponse = {
    val __obj = js.Dynamic.literal()
    if (liens != null) __obj.updateDynamic("liens")(liens.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListLiensResponse]
  }
}

