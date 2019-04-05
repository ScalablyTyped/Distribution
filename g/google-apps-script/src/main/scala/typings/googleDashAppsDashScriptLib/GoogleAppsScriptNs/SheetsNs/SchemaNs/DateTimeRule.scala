package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimeRule extends js.Object {
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object DateTimeRule {
  @scala.inline
  def apply(`type`: java.lang.String = null): DateTimeRule = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DateTimeRule]
  }
}

