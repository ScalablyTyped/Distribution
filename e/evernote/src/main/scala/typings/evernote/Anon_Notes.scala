package typings.evernote

import typings.evernote.evernoteMod.Evernote.Note
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Notes extends js.Object {
  var notes: js.Array[Note]
  var searchedWords: js.UndefOr[js.Array[String]] = js.undefined
  var startIndex: Double
  var stoppedWords: js.UndefOr[js.Array[String]] = js.undefined
  var totalNotes: Double
  var updateCount: js.UndefOr[Double] = js.undefined
}

object Anon_Notes {
  @scala.inline
  def apply(
    notes: js.Array[Note],
    startIndex: Double,
    totalNotes: Double,
    searchedWords: js.Array[String] = null,
    stoppedWords: js.Array[String] = null,
    updateCount: Int | Double = null
  ): Anon_Notes = {
    val __obj = js.Dynamic.literal(notes = notes.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], totalNotes = totalNotes.asInstanceOf[js.Any])
    if (searchedWords != null) __obj.updateDynamic("searchedWords")(searchedWords.asInstanceOf[js.Any])
    if (stoppedWords != null) __obj.updateDynamic("stoppedWords")(stoppedWords.asInstanceOf[js.Any])
    if (updateCount != null) __obj.updateDynamic("updateCount")(updateCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Notes]
  }
}

