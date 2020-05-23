package typings.gapiClientBooks.gapi.client.books

import typings.gapiClientBooks.anon.FolderName
import typings.gapiClientBooks.anon.MoreFromAuthors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Usersettings extends js.Object {
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
  /** User settings in sub-objects, each for different purposes. */
  var notesExport: js.UndefOr[FolderName] = js.undefined
  var notification: js.UndefOr[MoreFromAuthors] = js.undefined
}

object Usersettings {
  @scala.inline
  def apply(kind: String = null, notesExport: FolderName = null, notification: MoreFromAuthors = null): Usersettings = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (notesExport != null) __obj.updateDynamic("notesExport")(notesExport.asInstanceOf[js.Any])
    if (notification != null) __obj.updateDynamic("notification")(notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[Usersettings]
  }
}

