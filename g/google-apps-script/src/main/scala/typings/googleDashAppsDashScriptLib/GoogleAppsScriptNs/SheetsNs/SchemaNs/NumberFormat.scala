package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberFormat extends js.Object {
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object NumberFormat {
  @scala.inline
  def apply(pattern: java.lang.String = null, `type`: java.lang.String = null): NumberFormat = {
    val __obj = js.Dynamic.literal()
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NumberFormat]
  }
}

