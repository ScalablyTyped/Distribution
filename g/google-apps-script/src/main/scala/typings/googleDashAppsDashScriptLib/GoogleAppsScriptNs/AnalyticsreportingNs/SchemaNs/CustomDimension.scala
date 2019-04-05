package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDimension extends js.Object {
  var index: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object CustomDimension {
  @scala.inline
  def apply(index: scala.Int | scala.Double = null, value: java.lang.String = null): CustomDimension = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CustomDimension]
  }
}

