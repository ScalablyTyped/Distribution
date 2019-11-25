package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetBasicFilterRequest extends js.Object {
  var filter: js.UndefOr[BasicFilter] = js.undefined
}

object SetBasicFilterRequest {
  @scala.inline
  def apply(filter: BasicFilter = null): SetBasicFilterRequest = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBasicFilterRequest]
  }
}

