package typings.gapiClientBooks.gapi.client.books

import typings.gapiClientBooks.anon.FolderName
import typings.gapiClientBooks.anon.MoreFromAuthors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Usersettings extends js.Object {
  /** Resource type. */
  var kind: js.UndefOr[String] = js.native
  /** User settings in sub-objects, each for different purposes. */
  var notesExport: js.UndefOr[FolderName] = js.native
  var notification: js.UndefOr[MoreFromAuthors] = js.native
}

object Usersettings {
  @scala.inline
  def apply(): Usersettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Usersettings]
  }
  @scala.inline
  implicit class UsersettingsOps[Self <: Usersettings] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNotesExport(value: FolderName): Self = this.set("notesExport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotesExport: Self = this.set("notesExport", js.undefined)
    @scala.inline
    def setNotification(value: MoreFromAuthors): Self = this.set("notification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotification: Self = this.set("notification", js.undefined)
  }
  
}

