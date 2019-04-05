package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomFloodlightVariable extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object CustomFloodlightVariable {
  @scala.inline
  def apply(kind: java.lang.String = null, `type`: java.lang.String = null, value: java.lang.String = null): CustomFloodlightVariable = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CustomFloodlightVariable]
  }
}

