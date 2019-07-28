package typings.evernote

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_K extends js.Object {
  var notebookCounts: js.UndefOr[StringDictionary[Double]] = js.undefined
  var tagCounts: js.UndefOr[StringDictionary[Double]] = js.undefined
  var trashCount: js.UndefOr[Double] = js.undefined
}

object Anon_K {
  @scala.inline
  def apply(
    notebookCounts: StringDictionary[Double] = null,
    tagCounts: StringDictionary[Double] = null,
    trashCount: Int | Double = null
  ): Anon_K = {
    val __obj = js.Dynamic.literal()
    if (notebookCounts != null) __obj.updateDynamic("notebookCounts")(notebookCounts)
    if (tagCounts != null) __obj.updateDynamic("tagCounts")(tagCounts)
    if (trashCount != null) __obj.updateDynamic("trashCount")(trashCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_K]
  }
}

