package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NotesSearchedWords extends js.Object {
  var notes: js.Array[evernoteLib.evernoteMod.EvernoteNs.NoteMetadata]
  var searchedWords: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var startIndex: scala.Double
  var stoppedWords: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var totalNotes: scala.Double
  var updateCount: js.UndefOr[scala.Double] = js.undefined
}

object Anon_NotesSearchedWords {
  @scala.inline
  def apply(
    notes: js.Array[evernoteLib.evernoteMod.EvernoteNs.NoteMetadata],
    startIndex: scala.Double,
    totalNotes: scala.Double,
    searchedWords: js.Array[java.lang.String] = null,
    stoppedWords: js.Array[java.lang.String] = null,
    updateCount: scala.Int | scala.Double = null
  ): Anon_NotesSearchedWords = {
    val __obj = js.Dynamic.literal(notes = notes, startIndex = startIndex, totalNotes = totalNotes)
    if (searchedWords != null) __obj.updateDynamic("searchedWords")(searchedWords)
    if (stoppedWords != null) __obj.updateDynamic("stoppedWords")(stoppedWords)
    if (updateCount != null) __obj.updateDynamic("updateCount")(updateCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NotesSearchedWords]
  }
}

