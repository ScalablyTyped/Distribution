package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddFilterViewResponse extends js.Object {
  var filter: js.UndefOr[FilterView] = js.undefined
}

object AddFilterViewResponse {
  @scala.inline
  def apply(filter: FilterView = null): AddFilterViewResponse = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddFilterViewResponse]
  }
}

