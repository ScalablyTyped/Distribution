package typings.googleDashAppsDashScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsolidationStrategy extends js.Object {
  var legacy: js.UndefOr[js.Any] = js.undefined
  var none: js.UndefOr[js.Any] = js.undefined
}

object ConsolidationStrategy {
  @scala.inline
  def apply(legacy: js.Any = null, none: js.Any = null): ConsolidationStrategy = {
    val __obj = js.Dynamic.literal()
    if (legacy != null) __obj.updateDynamic("legacy")(legacy.asInstanceOf[js.Any])
    if (none != null) __obj.updateDynamic("none")(none.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsolidationStrategy]
  }
}

