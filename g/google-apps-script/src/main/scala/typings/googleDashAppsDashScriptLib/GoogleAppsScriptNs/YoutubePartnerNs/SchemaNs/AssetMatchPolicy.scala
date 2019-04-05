package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssetMatchPolicy extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var policyId: js.UndefOr[java.lang.String] = js.undefined
  var rules: js.UndefOr[js.Array[PolicyRule]] = js.undefined
}

object AssetMatchPolicy {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    policyId: java.lang.String = null,
    rules: js.Array[PolicyRule] = null
  ): AssetMatchPolicy = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (policyId != null) __obj.updateDynamic("policyId")(policyId)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    __obj.asInstanceOf[AssetMatchPolicy]
  }
}

