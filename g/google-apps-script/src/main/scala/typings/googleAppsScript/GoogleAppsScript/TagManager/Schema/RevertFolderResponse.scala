package typings.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevertFolderResponse extends js.Object {
  var folder: js.UndefOr[Folder] = js.native
}

object RevertFolderResponse {
  @scala.inline
  def apply(): RevertFolderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevertFolderResponse]
  }
  @scala.inline
  implicit class RevertFolderResponseOps[Self <: RevertFolderResponse] (val x: Self) extends AnyVal {
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
    def setFolder(value: Folder): Self = this.set("folder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFolder: Self = this.set("folder", js.undefined)
  }
  
}

