package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminReportsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsageReportsWarningsData extends js.Object {
  var key: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object UsageReportsWarningsData {
  @scala.inline
  def apply(key: java.lang.String = null, value: java.lang.String = null): UsageReportsWarningsData = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[UsageReportsWarningsData]
  }
}

