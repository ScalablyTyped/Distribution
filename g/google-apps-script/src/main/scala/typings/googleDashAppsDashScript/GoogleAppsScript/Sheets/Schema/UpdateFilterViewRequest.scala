package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFilterViewRequest extends js.Object {
  var fields: js.UndefOr[String] = js.undefined
  var filter: js.UndefOr[FilterView] = js.undefined
}

object UpdateFilterViewRequest {
  @scala.inline
  def apply(fields: String = null, filter: FilterView = null): UpdateFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFilterViewRequest]
  }
}

