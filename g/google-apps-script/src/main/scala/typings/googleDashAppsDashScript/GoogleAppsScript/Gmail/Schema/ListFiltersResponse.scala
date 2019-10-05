package typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFiltersResponse extends js.Object {
  var filter: js.UndefOr[js.Array[Filter]] = js.undefined
}

object ListFiltersResponse {
  @scala.inline
  def apply(filter: js.Array[Filter] = null): ListFiltersResponse = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    __obj.asInstanceOf[ListFiltersResponse]
  }
}

