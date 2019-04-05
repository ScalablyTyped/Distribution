package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorValue extends js.Object {
  var message: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ErrorValue {
  @scala.inline
  def apply(message: java.lang.String = null, `type`: java.lang.String = null): ErrorValue = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ErrorValue]
  }
}

