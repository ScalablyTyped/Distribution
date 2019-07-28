package typings.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ascending extends js.Object {
  var ascending: js.UndefOr[Boolean] = js.undefined
  var emphasized: js.UndefOr[String] = js.undefined
  var inactive: js.UndefOr[Boolean] = js.undefined
  var notebookGuid: js.UndefOr[String] = js.undefined
  var order: js.UndefOr[Double] = js.undefined
  var tagGuids: js.UndefOr[js.Array[String]] = js.undefined
  var timeZone: js.UndefOr[String] = js.undefined
  var words: js.UndefOr[String] = js.undefined
}

object Anon_Ascending {
  @scala.inline
  def apply(
    ascending: js.UndefOr[Boolean] = js.undefined,
    emphasized: String = null,
    inactive: js.UndefOr[Boolean] = js.undefined,
    notebookGuid: String = null,
    order: Int | Double = null,
    tagGuids: js.Array[String] = null,
    timeZone: String = null,
    words: String = null
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

