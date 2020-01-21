package typings.evernote

import typings.evernote.mod.Evernote.LinkedNotebook
import typings.evernote.mod.Evernote.Note
import typings.evernote.mod.Evernote.Notebook
import typings.evernote.mod.Evernote.Resource
import typings.evernote.mod.Evernote.SavedSearch
import typings.evernote.mod.Evernote.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChunkHighUSN extends js.Object {
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

object AnonChunkHighUSN {
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
  ): AnonChunkHighUSN = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], updateCount = updateCount.asInstanceOf[js.Any])
    if (chunkHighUSN != null) __obj.updateDynamic("chunkHighUSN")(chunkHighUSN.asInstanceOf[js.Any])
    if (expungedLinkedNotebooks != null) __obj.updateDynamic("expungedLinkedNotebooks")(expungedLinkedNotebooks.asInstanceOf[js.Any])
    if (expungedNotebooks != null) __obj.updateDynamic("expungedNotebooks")(expungedNotebooks.asInstanceOf[js.Any])
    if (expungedNotes != null) __obj.updateDynamic("expungedNotes")(expungedNotes.asInstanceOf[js.Any])
    if (expungedSearches != null) __obj.updateDynamic("expungedSearches")(expungedSearches.asInstanceOf[js.Any])
    if (expungedTags != null) __obj.updateDynamic("expungedTags")(expungedTags.asInstanceOf[js.Any])
    if (linkedNotebooks != null) __obj.updateDynamic("linkedNotebooks")(linkedNotebooks.asInstanceOf[js.Any])
    if (notebooks != null) __obj.updateDynamic("notebooks")(notebooks.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (searches != null) __obj.updateDynamic("searches")(searches.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChunkHighUSN]
  }
}

