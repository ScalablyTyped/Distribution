package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyRule extends js.Object {
  var action: js.UndefOr[java.lang.String] = js.undefined
  var conditions: js.UndefOr[Conditions] = js.undefined
  var subaction: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object PolicyRule {
  @scala.inline
  def apply(
    action: java.lang.String = null,
    conditions: Conditions = null,
    subaction: js.Array[java.lang.String] = null
  ): PolicyRule = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (conditions != null) __obj.updateDynamic("conditions")(conditions)
    if (subaction != null) __obj.updateDynamic("subaction")(subaction)
    __obj.asInstanceOf[PolicyRule]
  }
}

