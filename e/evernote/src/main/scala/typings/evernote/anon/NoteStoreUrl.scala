package typings.evernote.anon

import typings.evernote.mod.Types.ServiceLevel
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoteStoreUrl extends js.Object {
  var noteStoreUrl: js.UndefOr[String] = js.native
  var serviceLevel: js.UndefOr[ServiceLevel] = js.native
  var userId: js.UndefOr[UserID] = js.native
  var username: js.UndefOr[String] = js.native
  var webApiUrlPrefix: js.UndefOr[String] = js.native
}

object NoteStoreUrl {
  @scala.inline
  def apply(): NoteStoreUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoteStoreUrl]
  }
  @scala.inline
  implicit class NoteStoreUrlOps[Self <: NoteStoreUrl] (val x: Self) extends AnyVal {
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
    def setNoteStoreUrl(value: String): Self = this.set("noteStoreUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoteStoreUrl: Self = this.set("noteStoreUrl", js.undefined)
    @scala.inline
    def setServiceLevel(value: ServiceLevel): Self = this.set("serviceLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceLevel: Self = this.set("serviceLevel", js.undefined)
    @scala.inline
    def setUserId(value: UserID): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
    @scala.inline
    def setWebApiUrlPrefix(value: String): Self = this.set("webApiUrlPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebApiUrlPrefix: Self = this.set("webApiUrlPrefix", js.undefined)
  }
  
}

