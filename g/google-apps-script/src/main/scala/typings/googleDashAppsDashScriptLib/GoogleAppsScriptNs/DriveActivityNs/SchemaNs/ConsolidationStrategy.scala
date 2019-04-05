package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveActivityNs.SchemaNs

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
    if (legacy != null) __obj.updateDynamic("legacy")(legacy)
    if (none != null) __obj.updateDynamic("none")(none)
    __obj.asInstanceOf[ConsolidationStrategy]
  }
}

