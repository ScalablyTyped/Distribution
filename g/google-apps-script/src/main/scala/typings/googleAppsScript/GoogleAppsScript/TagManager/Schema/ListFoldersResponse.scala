package typings.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFoldersResponse extends js.Object {
  var folder: js.UndefOr[js.Array[Folder]] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListFoldersResponse {
  @scala.inline
  def apply(): ListFoldersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFoldersResponse]
  }
  @scala.inline
  implicit class ListFoldersResponseOps[Self <: ListFoldersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFolderVarargs(value: Folder*): Self = this.set("folder", js.Array(value :_*))
    @scala.inline
    def setFolder(value: js.Array[Folder]): Self = this.set("folder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFolder: Self = this.set("folder", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

