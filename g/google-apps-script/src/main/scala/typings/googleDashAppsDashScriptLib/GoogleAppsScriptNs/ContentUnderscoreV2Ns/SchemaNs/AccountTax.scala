package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountTax extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var rules: js.UndefOr[js.Array[AccountTaxTaxRule]] = js.undefined
}

object AccountTax {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    kind: java.lang.String = null,
    rules: js.Array[AccountTaxTaxRule] = null
  ): AccountTax = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    __obj.asInstanceOf[AccountTax]
  }
}

