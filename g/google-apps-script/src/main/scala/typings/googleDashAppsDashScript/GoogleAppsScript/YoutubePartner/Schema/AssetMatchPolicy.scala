package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssetMatchPolicy extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var policyId: js.UndefOr[String] = js.undefined
  var rules: js.UndefOr[js.Array[PolicyRule]] = js.undefined
}

object AssetMatchPolicy {
  @scala.inline
  def apply(kind: String = null, policyId: String = null, rules: js.Array[PolicyRule] = null): AssetMatchPolicy = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (policyId != null) __obj.updateDynamic("policyId")(policyId.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetMatchPolicy]
  }
}

