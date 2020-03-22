package typings.evernote

import typings.evernote.mod.Types.Guid
import typings.evernote.mod.Types.LinkedNotebook
import typings.evernote.mod.Types.Note
import typings.evernote.mod.Types.Notebook
import typings.evernote.mod.Types.Resource
import typings.evernote.mod.Types.SavedSearch
import typings.evernote.mod.Types.Tag
import typings.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChunkHighUSN extends js.Object {
  var chunkHighUSN: js.UndefOr[Double] = js.undefined
  var currentTime: js.UndefOr[Timestamp] = js.undefined
  var expungedLinkedNotebooks: js.UndefOr[js.Array[Guid]] = js.undefined
  var expungedNotebooks: js.UndefOr[js.Array[Guid]] = js.undefined
  var expungedNotes: js.UndefOr[js.Array[Guid]] = js.undefined
  var expungedSearches: js.UndefOr[js.Array[Guid]] = js.undefined
  var expungedTags: js.UndefOr[js.Array[Guid]] = js.undefined
  var linkedNotebooks: js.UndefOr[js.Array[LinkedNotebook]] = js.undefined
  var notebooks: js.UndefOr[js.Array[Notebook]] = js.undefined
  var notes: js.UndefOr[js.Array[Note]] = js.undefined
  var resources: js.UndefOr[js.Array[Resource]] = js.undefined
  var searches: js.UndefOr[js.Array[SavedSearch]] = js.undefined
  var tags: js.UndefOr[js.Array[Tag]] = js.undefined
  var updateCount: js.UndefOr[Double] = js.undefined
}

object AnonChunkHighUSN {
  @scala.inline
  def apply(
    chunkHighUSN: Int | Double = null,
    currentTime: Int | Double = null,
    expungedLinkedNotebooks: js.Array[Guid] = null,
    expungedNotebooks: js.Array[Guid] = null,
    expungedNotes: js.Array[Guid] = null,
    expungedSearches: js.Array[Guid] = null,
    expungedTags: js.Array[Guid] = null,
    linkedNotebooks: js.Array[LinkedNotebook] = null,
    notebooks: js.Array[Notebook] = null,
    notes: js.Array[Note] = null,
    resources: js.Array[Resource] = null,
    searches: js.Array[SavedSearch] = null,
    tags: js.Array[Tag] = null,
    updateCount: Int | Double = null
  ): AnonChunkHighUSN = {
    val __obj = js.Dynamic.literal()
    if (chunkHighUSN != null) __obj.updateDynamic("chunkHighUSN")(chunkHighUSN.asInstanceOf[js.Any])
    if (currentTime != null) __obj.updateDynamic("currentTime")(currentTime.asInstanceOf[js.Any])
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
    if (updateCount != null) __obj.updateDynamic("updateCount")(updateCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChunkHighUSN]
  }
}

