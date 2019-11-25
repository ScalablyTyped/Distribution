package typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var action: js.UndefOr[FilterAction] = js.undefined
  var criteria: js.UndefOr[FilterCriteria] = js.undefined
  var id: js.UndefOr[String] = js.undefined
}

object Filter {
  @scala.inline
  def apply(action: FilterAction = null, criteria: FilterCriteria = null, id: String = null): Filter = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (criteria != null) __obj.updateDynamic("criteria")(criteria.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

