package typings.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFoldersResponse extends js.Object {
  var folder: js.UndefOr[js.Array[Folder]] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListFoldersResponse {
  @scala.inline
  def apply(folder: js.Array[Folder] = null, nextPageToken: String = null): ListFoldersResponse = {
    val __obj = js.Dynamic.literal()
    if (folder != null) __obj.updateDynamic("folder")(folder.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFoldersResponse]
  }
}

