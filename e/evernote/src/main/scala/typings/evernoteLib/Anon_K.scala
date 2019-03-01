package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_K extends js.Object {
  var notebookCounts: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Double]] = js.undefined
  var tagCounts: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Double]] = js.undefined
  var trashCount: js.UndefOr[scala.Double] = js.undefined
}

object Anon_K {
  @scala.inline
  def apply(
    notebookCounts: org.scalablytyped.runtime.StringDictionary[scala.Double] = null,
    tagCounts: org.scalablytyped.runtime.StringDictionary[scala.Double] = null,
    trashCount: scala.Int | scala.Double = null
  ): Anon_K = {
    val __obj = js.Dynamic.literal()
    if (notebookCounts != null) __obj.updateDynamic("notebookCounts")(notebookCounts)
    if (tagCounts != null) __obj.updateDynamic("tagCounts")(tagCounts)
    if (trashCount != null) __obj.updateDynamic("trashCount")(trashCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_K]
  }
}

