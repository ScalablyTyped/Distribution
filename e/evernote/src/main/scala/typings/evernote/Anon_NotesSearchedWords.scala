package typings.evernote

import typings.evernote.evernoteMod.Evernote.NoteMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NotesSearchedWords extends js.Object {
  var notes: js.Array[NoteMetadata]
  var searchedWords: js.UndefOr[js.Array[String]] = js.undefined
  var startIndex: Double
  var stoppedWords: js.UndefOr[js.Array[String]] = js.undefined
  var totalNotes: Double
  var updateCount: js.UndefOr[Double] = js.undefined
}

object Anon_NotesSearchedWords {
  @scala.inline
  def apply(
    notes: js.Array[NoteMetadata],
    startIndex: Double,
    totalNotes: Double,
    searchedWords: js.Array[String] = null,
    stoppedWords: js.Array[String] = null,
    updateCount: Int | Double = null
  ): Anon_NotesSearchedWords = {
    val __obj = js.Dynamic.literal(notes = notes, startIndex = startIndex, totalNotes = totalNotes)
    if (searchedWords != null) __obj.updateDynamic("searchedWords")(searchedWords)
    if (stoppedWords != null) __obj.updateDynamic("stoppedWords")(stoppedWords)
    if (updateCount != null) __obj.updateDynamic("updateCount")(updateCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NotesSearchedWords]
  }
}

