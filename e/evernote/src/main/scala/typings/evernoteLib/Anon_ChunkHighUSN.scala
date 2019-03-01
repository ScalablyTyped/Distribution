package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChunkHighUSN extends js.Object {
  var chunkHighUSN: js.UndefOr[scala.Double] = js.undefined
  var currentTime: scala.Double
  var expungedLinkedNotebooks: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var expungedNotebooks: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var expungedNotes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var expungedSearches: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var expungedTags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var linkedNotebooks: js.UndefOr[js.Array[evernoteLib.evernoteMod.EvernoteNs.LinkedNotebook]] = js.undefined
  var notebooks: js.UndefOr[js.Array[evernoteLib.evernoteMod.EvernoteNs.Notebook]] = js.undefined
  var notes: js.UndefOr[js.Array[evernoteLib.evernoteMod.EvernoteNs.Note]] = js.undefined
  var resources: js.UndefOr[js.Array[evernoteLib.evernoteMod.EvernoteNs.Resource]] = js.undefined
  var searches: js.UndefOr[js.Array[evernoteLib.evernoteMod.EvernoteNs.SavedSearch]] = js.undefined
  var tags: js.UndefOr[js.Array[evernoteLib.evernoteMod.EvernoteNs.Tag]] = js.undefined
  var updateCount: scala.Double
}

object Anon_ChunkHighUSN {
  @scala.inline
  def apply(
    currentTime: scala.Double,
    updateCount: scala.Double,
    chunkHighUSN: scala.Int | scala.Double = null,
    expungedLinkedNotebooks: js.Array[java.lang.String] = null,
    expungedNotebooks: js.Array[java.lang.String] = null,
    expungedNotes: js.Array[java.lang.String] = null,
    expungedSearches: js.Array[java.lang.String] = null,
    expungedTags: js.Array[java.lang.String] = null,
    linkedNotebooks: js.Array[evernoteLib.evernoteMod.EvernoteNs.LinkedNotebook] = null,
    notebooks: js.Array[evernoteLib.evernoteMod.EvernoteNs.Notebook] = null,
    notes: js.Array[evernoteLib.evernoteMod.EvernoteNs.Note] = null,
    resources: js.Array[evernoteLib.evernoteMod.EvernoteNs.Resource] = null,
    searches: js.Array[evernoteLib.evernoteMod.EvernoteNs.SavedSearch] = null,
    tags: js.Array[evernoteLib.evernoteMod.EvernoteNs.Tag] = null
  ): Anon_ChunkHighUSN = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currentTime")(currentTime)
    __obj.updateDynamic("updateCount")(updateCount)
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

