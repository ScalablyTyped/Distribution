package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainingNotebooks extends js.Object {
  var containingNotebooks: js.UndefOr[js.Array[evernoteLib.evernoteMod.EvernoteNs.NotebookDescriptor]] = js.undefined
  var notebooks: js.UndefOr[js.Array[evernoteLib.evernoteMod.EvernoteNs.Notebook]] = js.undefined
  var notes: js.UndefOr[js.Array[evernoteLib.evernoteMod.EvernoteNs.Note]] = js.undefined
  var tags: js.UndefOr[js.Array[evernoteLib.evernoteMod.EvernoteNs.Tag]] = js.undefined
}

object Anon_ContainingNotebooks {
  @scala.inline
  def apply(
    containingNotebooks: js.Array[evernoteLib.evernoteMod.EvernoteNs.NotebookDescriptor] = null,
    notebooks: js.Array[evernoteLib.evernoteMod.EvernoteNs.Notebook] = null,
    notes: js.Array[evernoteLib.evernoteMod.EvernoteNs.Note] = null,
    tags: js.Array[evernoteLib.evernoteMod.EvernoteNs.Tag] = null
  ): Anon_ContainingNotebooks = {
    val __obj = js.Dynamic.literal()
    if (containingNotebooks != null) __obj.updateDynamic("containingNotebooks")(containingNotebooks)
    if (notebooks != null) __obj.updateDynamic("notebooks")(notebooks)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Anon_ContainingNotebooks]
  }
}

