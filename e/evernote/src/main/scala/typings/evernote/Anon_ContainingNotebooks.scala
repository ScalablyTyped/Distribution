package typings.evernote

import typings.evernote.evernoteMod.Evernote.Note
import typings.evernote.evernoteMod.Evernote.Notebook
import typings.evernote.evernoteMod.Evernote.NotebookDescriptor
import typings.evernote.evernoteMod.Evernote.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainingNotebooks extends js.Object {
  var containingNotebooks: js.UndefOr[js.Array[NotebookDescriptor]] = js.undefined
  var notebooks: js.UndefOr[js.Array[Notebook]] = js.undefined
  var notes: js.UndefOr[js.Array[Note]] = js.undefined
  var tags: js.UndefOr[js.Array[Tag]] = js.undefined
}

object Anon_ContainingNotebooks {
  @scala.inline
  def apply(
    containingNotebooks: js.Array[NotebookDescriptor] = null,
    notebooks: js.Array[Notebook] = null,
    notes: js.Array[Note] = null,
    tags: js.Array[Tag] = null
  ): Anon_ContainingNotebooks = {
    val __obj = js.Dynamic.literal()
    if (containingNotebooks != null) __obj.updateDynamic("containingNotebooks")(containingNotebooks)
    if (notebooks != null) __obj.updateDynamic("notebooks")(notebooks)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Anon_ContainingNotebooks]
  }
}

