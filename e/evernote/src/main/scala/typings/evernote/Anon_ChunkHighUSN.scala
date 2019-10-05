package typings.evernote

import typings.evernote.evernoteMod.Evernote.LinkedNotebook
import typings.evernote.evernoteMod.Evernote.Note
import typings.evernote.evernoteMod.Evernote.Notebook
import typings.evernote.evernoteMod.Evernote.Resource
import typings.evernote.evernoteMod.Evernote.SavedSearch
import typings.evernote.evernoteMod.Evernote.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChunkHighUSN extends js.Object {
  var chunkHighUSN: js.UndefOr[Double] = js.undefined
  var currentTime: Double
  var expungedLinkedNotebooks: js.UndefOr[js.Array[String]] = js.undefined
  var expungedNotebooks: js.UndefOr[js.Array[String]] = js.undefined
  var expungedNotes: js.UndefOr[js.Array[String]] = js.undefined
  var expungedSearches: js.UndefOr[js.Array[String]] = js.undefined
  var expungedTags: js.UndefOr[js.Array[String]] = js.undefined
  var linkedNotebooks: js.UndefOr[js.Array[LinkedNotebook]] = js.undefined
  var notebooks: js.UndefOr[js.Array[Notebook]] = js.undefined
  var notes: js.UndefOr[js.Array[Note]] = js.undefined
  var resources: js.UndefOr[js.Array[Resource]] = js.undefined
  var searches: js.UndefOr[js.Array[SavedSearch]] = js.undefined
  var tags: js.UndefOr[js.Array[Tag]] = js.undefined
  var updateCount: Double
}

object Anon_ChunkHighUSN {
  @scala.inline
  def apply(
    currentTime: Double,
    updateCount: Double,
    chunkHighUSN: Int | Double = null,
    expungedLinkedNotebooks: js.Array[String] = null,
    expungedNotebooks: js.Array[String] = null,
    expungedNotes: js.Array[String] = null,
    expungedSearches: js.Array[String] = null,
    expungedTags: js.Array[String] = null,
    linkedNotebooks: js.Array[LinkedNotebook] = null,
    notebooks: js.Array[Notebook] = null,
    notes: js.Array[Note] = null,
    resources: js.Array[Resource] = null,
    searches: js.Array[SavedSearch] = null,
    tags: js.Array[Tag] = null
  ): Anon_ChunkHighUSN = {
    val __obj = js.Dynamic.literal(currentTime = currentTime, updateCount = updateCount)
    if (chunkHighUSN != null) __obj.updateDynamic("chunkHighUSN")(chunkHighUSN.asInstanceOf[js.Any])
    if (expungedLinkedNotebooks != null) __obj.updateDynamic("expungedLinkedNotebooks")(expungedLinkedNotebooks)
    if (expungedNotebooks != null) __obj.updateDynamic("expungedNotebooks")(expungedNotebooks)
    if (expungedNotes != null) __obj.updateDynamic("expungedNotes")(expungedNotes)
    if (expungedSearches != null) __obj.updateDynamic("expungedSearches")(expungedSearches)
    if (expungedTags != null) __obj.updateDynamic("expungedTags")(expungedTags)
    if (linkedNotebooks != null) __obj.updateDynamic("linkedNotebooks")(linkedNotebooks)
    if (notebooks != null) __obj.updateDynamic("notebooks")(notebooks)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    if (searches != null) __obj.updateDynamic("searches")(searches)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Anon_ChunkHighUSN]
  }
}

