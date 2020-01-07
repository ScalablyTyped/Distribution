package typings.googleapis.buildSrcApisTagmanagerV1Mod.tagmanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List Folders Response.
  */
@js.native
trait Schema$ListFoldersResponse extends js.Object {
  /**
    * All GTM Folders of a GTM Container.
    */
  var folders: js.UndefOr[js.Array[Schema$Folder]] = js.native
}

object Schema$ListFoldersResponse {
  @scala.inline
  def apply(folders: js.Array[Schema$Folder] = null): Schema$ListFoldersResponse = {
    val __obj = js.Dynamic.literal()
    if (folders != null) __obj.updateDynamic("folders")(folders.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListFoldersResponse]
  }
}

