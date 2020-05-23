package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notes extends js.Object {
  var notes: js.UndefOr[js.Array[typings.evernote.mod.Types.Note]] = js.undefined
  var searchedWords: js.UndefOr[js.Array[String]] = js.undefined
  var startIndex: js.UndefOr[Double] = js.undefined
  var stoppedWords: js.UndefOr[js.Array[String]] = js.undefined
  var totalNotes: js.UndefOr[Double] = js.undefined
  var updateCount: js.UndefOr[Double] = js.undefined
}

object Notes {
  @scala.inline
  def apply(
    notes: js.Array[typings.evernote.mod.Types.Note] = null,
    searchedWords: js.Array[String] = null,
    startIndex: js.UndefOr[Double] = js.undefined,
    stoppedWords: js.Array[String] = null,
    totalNotes: js.UndefOr[Double] = js.undefined,
    updateCount: js.UndefOr[Double] = js.undefined
  ): Notes = {
    val __obj = js.Dynamic.literal()
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (searchedWords != null) __obj.updateDynamic("searchedWords")(searchedWords.asInstanceOf[js.Any])
    if (!js.isUndefined(startIndex)) __obj.updateDynamic("startIndex")(startIndex.get.asInstanceOf[js.Any])
    if (stoppedWords != null) __obj.updateDynamic("stoppedWords")(stoppedWords.asInstanceOf[js.Any])
    if (!js.isUndefined(totalNotes)) __obj.updateDynamic("totalNotes")(totalNotes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updateCount)) __obj.updateDynamic("updateCount")(updateCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notes]
  }
}

