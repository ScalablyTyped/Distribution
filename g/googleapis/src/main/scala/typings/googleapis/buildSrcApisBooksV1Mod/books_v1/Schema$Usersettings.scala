package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import typings.googleapis.Anon_FolderName
import typings.googleapis.Anon_MatchMyInterests
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Usersettings extends js.Object {
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * User settings in sub-objects, each for different purposes.
    */
  var notesExport: js.UndefOr[Anon_FolderName] = js.native
  var notification: js.UndefOr[Anon_MatchMyInterests] = js.native
}

object Schema$Usersettings {
  @scala.inline
  def apply(
    kind: String = null,
    notesExport: Anon_FolderName = null,
    notification: Anon_MatchMyInterests = null
  ): Schema$Usersettings = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (notesExport != null) __obj.updateDynamic("notesExport")(notesExport.asInstanceOf[js.Any])
    if (notification != null) __obj.updateDynamic("notification")(notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Usersettings]
  }
}

