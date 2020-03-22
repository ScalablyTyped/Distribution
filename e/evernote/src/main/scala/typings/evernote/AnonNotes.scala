package typings.evernote

import typings.evernote.mod.Types.Note
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNotes extends js.Object {
  var notes: js.UndefOr[js.Array[Note]] = js.undefined
  var searchedWords: js.UndefOr[js.Array[String]] = js.undefined
  var startIndex: js.UndefOr[Double] = js.undefined
  var stoppedWords: js.UndefOr[js.Array[String]] = js.undefined
  var totalNotes: js.UndefOr[Double] = js.undefined
  var updateCount: js.UndefOr[Double] = js.undefined
}

object AnonNotes {
  @scala.inline
  def apply(
    notes: js.Array[Note] = null,
    searchedWords: js.Array[String] = null,
    startIndex: Int | Double = null,
    stoppedWords: js.Array[String] = null,
    totalNotes: Int | Double = null,
    updateCount: Int | Double = null
  ): AnonNotes = {
    val __obj = js.Dynamic.literal()
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (searchedWords != null) __obj.updateDynamic("searchedWords")(searchedWords.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (stoppedWords != null) __obj.updateDynamic("stoppedWords")(stoppedWords.asInstanceOf[js.Any])
    if (totalNotes != null) __obj.updateDynamic("totalNotes")(totalNotes.asInstanceOf[js.Any])
    if (updateCount != null) __obj.updateDynamic("updateCount")(updateCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNotes]
  }
}

