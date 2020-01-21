package typings.googleapis.cloudresourcemanagerV2beta1Mod.cloudresourcemanagerV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ListFolders response message.
  */
@js.native
trait SchemaListFoldersResponse extends js.Object {
  /**
    * A possibly paginated list of Folders that are direct descendants of the
    * specified parent resource.
    */
  var folders: js.UndefOr[js.Array[SchemaFolder]] = js.native
  /**
    * A pagination token returned from a previous call to `ListFolders` that
    * indicates from where listing should continue. This field is optional.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListFoldersResponse {
  @scala.inline
  def apply(folders: js.Array[SchemaFolder] = null, nextPageToken: String = null): SchemaListFoldersResponse = {
    val __obj = js.Dynamic.literal()
    if (folders != null) __obj.updateDynamic("folders")(folders.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListFoldersResponse]
  }
}

