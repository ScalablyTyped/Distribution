package typings.googleapis.cloudresourcemanagerV2beta1Mod.cloudresourcemanagerV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for searching folders.
  */
@js.native
trait SchemaSearchFoldersResponse extends js.Object {
  /**
    * A possibly paginated folder search results. the specified parent
    * resource.
    */
  var folders: js.UndefOr[js.Array[SchemaFolder]] = js.native
  /**
    * A pagination token returned from a previous call to `SearchFolders` that
    * indicates from where searching should continue. This field is optional.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaSearchFoldersResponse {
  @scala.inline
  def apply(folders: js.Array[SchemaFolder] = null, nextPageToken: String = null): SchemaSearchFoldersResponse = {
    val __obj = js.Dynamic.literal()
    if (folders != null) __obj.updateDynamic("folders")(folders.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSearchFoldersResponse]
  }
}

