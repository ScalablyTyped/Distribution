package typings.evernote.anon

import typings.evernote.mod.Types.LinkedNotebook
import typings.evernote.mod.Types.Notebook
import typings.evernote.mod.Types.Resource
import typings.evernote.mod.Types.SavedSearch
import typings.evernote.mod.Types.Tag
import typings.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChunkHighUSN extends js.Object {
  var chunkHighUSN: js.UndefOr[Double] = js.undefined
  var currentTime: js.UndefOr[Timestamp] = js.undefined
  var expungedLinkedNotebooks: js.UndefOr[js.Array[typings.evernote.mod.Types.Guid]] = js.undefined
  var expungedNotebooks: js.UndefOr[js.Array[typings.evernote.mod.Types.Guid]] = js.undefined
  var expungedNotes: js.UndefOr[js.Array[typings.evernote.mod.Types.Guid]] = js.undefined
  var expungedSearches: js.UndefOr[js.Array[typings.evernote.mod.Types.Guid]] = js.undefined
  var expungedTags: js.UndefOr[js.Array[typings.evernote.mod.Types.Guid]] = js.undefined
  var linkedNotebooks: js.UndefOr[js.Array[LinkedNotebook]] = js.undefined
  var notebooks: js.UndefOr[js.Array[Notebook]] = js.undefined
  var notes: js.UndefOr[js.Array[typings.evernote.mod.Types.Note]] = js.undefined
  var resources: js.UndefOr[js.Array[Resource]] = js.undefined
  var searches: js.UndefOr[js.Array[SavedSearch]] = js.undefined
  var tags: js.UndefOr[js.Array[Tag]] = js.undefined
  var updateCount: js.UndefOr[Double] = js.undefined
}

object ChunkHighUSN {
  @scala.inline
  def apply(
    chunkHighUSN: js.UndefOr[Double] = js.undefined,
    currentTime: js.UndefOr[Timestamp] = js.undefined,
    expungedLinkedNotebooks: js.Array[typings.evernote.mod.Types.Guid] = null,
    expungedNotebooks: js.Array[typings.evernote.mod.Types.Guid] = null,
    expungedNotes: js.Array[typings.evernote.mod.Types.Guid] = null,
    expungedSearches: js.Array[typings.evernote.mod.Types.Guid] = null,
    expungedTags: js.Array[typings.evernote.mod.Types.Guid] = null,
    linkedNotebooks: js.Array[LinkedNotebook] = null,
    notebooks: js.Array[Notebook] = null,
    notes: js.Array[typings.evernote.mod.Types.Note] = null,
    resources: js.Array[Resource] = null,
    searches: js.Array[SavedSearch] = null,
    tags: js.Array[Tag] = null,
    updateCount: js.UndefOr[Double] = js.undefined
  ): ChunkHighUSN = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chunkHighUSN)) __obj.updateDynamic("chunkHighUSN")(chunkHighUSN.get.asInstanceOf[js.Any])
    if (!js.isUndefined(currentTime)) __obj.updateDynamic("currentTime")(currentTime.get.asInstanceOf[js.Any])
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
    if (!js.isUndefined(updateCount)) __obj.updateDynamic("updateCount")(updateCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkHighUSN]
  }
}

