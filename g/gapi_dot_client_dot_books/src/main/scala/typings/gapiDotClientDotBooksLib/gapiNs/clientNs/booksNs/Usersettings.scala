package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Usersettings extends js.Object {
  /** Resource type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** User settings in sub-objects, each for different purposes. */
  var notesExport: js.UndefOr[gapiDotClientDotBooksLib.Anon_FolderName] = js.undefined
  var notification: js.UndefOr[gapiDotClientDotBooksLib.Anon_MoreFromAuthors] = js.undefined
}

object Usersettings {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    notesExport: gapiDotClientDotBooksLib.Anon_FolderName = null,
    notification: gapiDotClientDotBooksLib.Anon_MoreFromAuthors = null
  ): Usersettings = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (notesExport != null) __obj.updateDynamic("notesExport")(notesExport)
    if (notification != null) __obj.updateDynamic("notification")(notification)
    __obj.asInstanceOf[Usersettings]
  }
}

