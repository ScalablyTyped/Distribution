package typings.evernote

import typings.evernote.mod.Evernote.Note
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNotes extends js.Object {
  var notes: js.Array[Note]
  var searchedWords: js.UndefOr[js.Array[String]] = js.undefined
  var startIndex: Double
  var stoppedWords: js.UndefOr[js.Array[String]] = js.undefined
  var totalNotes: Double
  var updateCount: js.UndefOr[Double] = js.undefined
}

object AnonNotes {
  @scala.inline
  def apply(
    notes: js.Array[Note],
    startIndex: Double,
    totalNotes: Double,
    searchedWords: js.Array[String] = null,
    stoppedWords: js.Array[String] = null,
    updateCount: Int | Double = null
  ): AnonNotes = {
    val __obj = js.Dynamic.literal(notes = notes.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], totalNotes = totalNotes.asInstanceOf[js.Any])
    if (searchedWords != null) __obj.updateDynamic("searchedWords")(searchedWords.asInstanceOf[js.Any])
    if (stoppedWords != null) __obj.updateDynamic("stoppedWords")(stoppedWords.asInstanceOf[js.Any])
    if (updateCount != null) __obj.updateDynamic("updateCount")(updateCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNotes]
  }
}

