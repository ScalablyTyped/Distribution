package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ascending extends js.Object {
  var ascending: js.UndefOr[scala.Boolean] = js.undefined
  var emphasized: js.UndefOr[java.lang.String] = js.undefined
  var inactive: js.UndefOr[scala.Boolean] = js.undefined
  var notebookGuid: js.UndefOr[java.lang.String] = js.undefined
  var order: js.UndefOr[scala.Double] = js.undefined
  var tagGuids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var timeZone: js.UndefOr[java.lang.String] = js.undefined
  var words: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Ascending {
  @scala.inline
  def apply(
    ascending: js.UndefOr[scala.Boolean] = js.undefined,
    emphasized: java.lang.String = null,
    inactive: js.UndefOr[scala.Boolean] = js.undefined,
    notebookGuid: java.lang.String = null,
    order: scala.Int | scala.Double = null,
    tagGuids: js.Array[java.lang.String] = null,
    timeZone: java.lang.String = null,
    words: java.lang.String = null
  ): Anon_Ascending = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascending)) __obj.updateDynamic("ascending")(ascending)
    if (emphasized != null) __obj.updateDynamic("emphasized")(emphasized)
    if (!js.isUndefined(inactive)) __obj.updateDynamic("inactive")(inactive)
    if (notebookGuid != null) __obj.updateDynamic("notebookGuid")(notebookGuid)
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (tagGuids != null) __obj.updateDynamic("tagGuids")(tagGuids)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    if (words != null) __obj.updateDynamic("words")(words)
    __obj.asInstanceOf[Anon_Ascending]
  }
}

