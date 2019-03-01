package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NotebookDescription extends js.Object {
  var notebookDescription: js.UndefOr[java.lang.String] = js.undefined
  var privilege: js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.SharedNotebookPrivilegeLevel] = js.undefined
  var recommended: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_NotebookDescription {
  @scala.inline
  def apply(
    notebookDescription: java.lang.String = null,
    privilege: evernoteLib.evernoteMod.EvernoteNs.SharedNotebookPrivilegeLevel = null,
    recommended: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_NotebookDescription = {
    val __obj = js.Dynamic.literal()
    if (notebookDescription != null) __obj.updateDynamic("notebookDescription")(notebookDescription)
    if (privilege != null) __obj.updateDynamic("privilege")(privilege)
    if (!js.isUndefined(recommended)) __obj.updateDynamic("recommended")(recommended)
    __obj.asInstanceOf[Anon_NotebookDescription]
  }
}

