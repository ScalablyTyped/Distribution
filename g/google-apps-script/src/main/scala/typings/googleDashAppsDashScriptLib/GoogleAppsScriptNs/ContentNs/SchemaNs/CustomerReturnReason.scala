package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerReturnReason extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var reasonCode: js.UndefOr[java.lang.String] = js.undefined
}

object CustomerReturnReason {
  @scala.inline
  def apply(description: java.lang.String = null, reasonCode: java.lang.String = null): CustomerReturnReason = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode)
    __obj.asInstanceOf[CustomerReturnReason]
  }
}

