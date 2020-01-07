package typings.googleapis.buildSrcApisCloudresourcemanagerV2beta1Mod.cloudresourcemanager_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for searching folders.
  */
@js.native
trait Schema$SearchFoldersResponse extends js.Object {
  /**
    * A possibly paginated folder search results. the specified parent
    * resource.
    */
  var folders: js.UndefOr[js.Array[Schema$Folder]] = js.native
  /**
    * A pagination token returned from a previous call to `SearchFolders` that
    * indicates from where searching should continue. This field is optional.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$SearchFoldersResponse {
  @scala.inline
  def apply(folders: js.Array[Schema$Folder] = null, nextPageToken: String = null): Schema$SearchFoldersResponse = {
    val __obj = js.Dynamic.literal()
    if (folders != null) __obj.updateDynamic("folders")(folders.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SearchFoldersResponse]
  }
}

