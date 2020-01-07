package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

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
  var folder: js.UndefOr[js.Array[Schema$Folder]] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListFoldersResponse {
  @scala.inline
  def apply(folder: js.Array[Schema$Folder] = null, nextPageToken: String = null): Schema$ListFoldersResponse = {
    val __obj = js.Dynamic.literal()
    if (folder != null) __obj.updateDynamic("folder")(folder.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListFoldersResponse]
  }
}

