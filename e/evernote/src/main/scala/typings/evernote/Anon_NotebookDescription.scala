package typings.evernote

import typings.evernote.evernoteMod.Evernote.SharedNotebookPrivilegeLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NotebookDescription extends js.Object {
  var notebookDescription: js.UndefOr[String] = js.undefined
  var privilege: js.UndefOr[SharedNotebookPrivilegeLevel] = js.undefined
  var recommended: js.UndefOr[Boolean] = js.undefined
}

object Anon_NotebookDescription {
  @scala.inline
  def apply(
    notebookDescription: String = null,
    privilege: SharedNotebookPrivilegeLevel = null,
    recommended: js.UndefOr[Boolean] = js.undefined
  ): Anon_NotebookDescription = {
    val __obj = js.Dynamic.literal()
    if (notebookDescription != null) __obj.updateDynamic("notebookDescription")(notebookDescription.asInstanceOf[js.Any])
    if (privilege != null) __obj.updateDynamic("privilege")(privilege.asInstanceOf[js.Any])
    if (!js.isUndefined(recommended)) __obj.updateDynamic("recommended")(recommended.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NotebookDescription]
  }
}

