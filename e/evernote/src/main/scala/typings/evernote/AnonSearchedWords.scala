package typings.evernote

import typings.evernote.mod.Evernote.NoteMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSearchedWords extends js.Object {
  var notes: js.Array[NoteMetadata]
  var searchedWords: js.UndefOr[js.Array[String]] = js.undefined
  var startIndex: Double
  var stoppedWords: js.UndefOr[js.Array[String]] = js.undefined
  var totalNotes: Double
  var updateCount: js.UndefOr[Double] = js.undefined
}

object AnonSearchedWords {
  @scala.inline
  def apply(
    notes: js.Array[NoteMetadata],
    startIndex: Double,
    totalNotes: Double,
    searchedWords: js.Array[String] = null,
    stoppedWords: js.Array[String] = null,
    updateCount: Int | Double = null
  ): AnonSearchedWords = {
    val __obj = js.Dynamic.literal(notes = notes.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], totalNotes = totalNotes.asInstanceOf[js.Any])
    if (searchedWords != null) __obj.updateDynamic("searchedWords")(searchedWords.asInstanceOf[js.Any])
    if (stoppedWords != null) __obj.updateDynamic("stoppedWords")(stoppedWords.asInstanceOf[js.Any])
    if (updateCount != null) __obj.updateDynamic("updateCount")(updateCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSearchedWords]
  }
}

