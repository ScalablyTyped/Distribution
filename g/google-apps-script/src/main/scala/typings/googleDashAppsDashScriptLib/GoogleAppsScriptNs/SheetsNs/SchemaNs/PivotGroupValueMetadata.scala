package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotGroupValueMetadata extends js.Object {
  var collapsed: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[ExtendedValue] = js.undefined
}

object PivotGroupValueMetadata {
  @scala.inline
  def apply(collapsed: js.UndefOr[scala.Boolean] = js.undefined, value: ExtendedValue = null): PivotGroupValueMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[PivotGroupValueMetadata]
  }
}

