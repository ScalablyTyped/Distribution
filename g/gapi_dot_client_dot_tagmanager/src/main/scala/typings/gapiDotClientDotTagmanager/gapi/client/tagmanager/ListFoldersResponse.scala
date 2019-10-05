package typings.gapiDotClientDotTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFoldersResponse extends js.Object {
  /** All GTM Folders of a GTM Container. */
  var folder: js.UndefOr[js.Array[Folder]] = js.undefined
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListFoldersResponse {
  @scala.inline
  def apply(folder: js.Array[Folder] = null, nextPageToken: String = null): ListFoldersResponse = {
    val __obj = js.Dynamic.literal()
    if (folder != null) __obj.updateDynamic("folder")(folder)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListFoldersResponse]
  }
}

