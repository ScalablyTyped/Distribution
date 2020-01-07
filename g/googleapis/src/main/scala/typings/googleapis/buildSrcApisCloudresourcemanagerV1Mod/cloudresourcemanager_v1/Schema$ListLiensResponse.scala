package typings.googleapis.buildSrcApisCloudresourcemanagerV1Mod.cloudresourcemanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for Liens.ListLiens.
  */
@js.native
trait Schema$ListLiensResponse extends js.Object {
  /**
    * A list of Liens.
    */
  var liens: js.UndefOr[js.Array[Schema$Lien]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListLiensResponse {
  @scala.inline
  def apply(liens: js.Array[Schema$Lien] = null, nextPageToken: String = null): Schema$ListLiensResponse = {
    val __obj = js.Dynamic.literal()
    if (liens != null) __obj.updateDynamic("liens")(liens.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListLiensResponse]
  }
}

