package typings.gapiDotClientDotBooks.gapi.client.books

import typings.gapiDotClientDotBooks.Anon_FolderName
import typings.gapiDotClientDotBooks.Anon_MoreFromAuthors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Usersettings extends js.Object {
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
  /** User settings in sub-objects, each for different purposes. */
  var notesExport: js.UndefOr[Anon_FolderName] = js.undefined
  var notification: js.UndefOr[Anon_MoreFromAuthors] = js.undefined
}

object Usersettings {
  @scala.inline
  def apply(
    kind: String = null,
    notesExport: Anon_FolderName = null,
    notification: Anon_MoreFromAuthors = null
  ): Usersettings = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (notesExport != null) __obj.updateDynamic("notesExport")(notesExport.asInstanceOf[js.Any])
    if (notification != null) __obj.updateDynamic("notification")(notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[Usersettings]
  }
}

