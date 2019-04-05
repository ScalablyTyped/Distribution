package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Condition extends js.Object {
  var parameter: js.UndefOr[js.Array[Parameter]] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Condition {
  @scala.inline
  def apply(parameter: js.Array[Parameter] = null, `type`: java.lang.String = null): Condition = {
    val __obj = js.Dynamic.literal()
    if (parameter != null) __obj.updateDynamic("parameter")(parameter)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Condition]
  }
}

