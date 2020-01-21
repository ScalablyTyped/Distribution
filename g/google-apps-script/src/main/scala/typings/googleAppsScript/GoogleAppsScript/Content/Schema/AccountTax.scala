package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountTax extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var rules: js.UndefOr[js.Array[AccountTaxTaxRule]] = js.undefined
}

object AccountTax {
  @scala.inline
  def apply(accountId: String = null, kind: String = null, rules: js.Array[AccountTaxTaxRule] = null): AccountTax = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountTax]
  }
}

