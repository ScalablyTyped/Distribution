package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountTax extends js.Object {
  /** The ID of the account to which these account tax settings belong. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#accountTax". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Tax rules. Updating the tax rules will enable US taxes (not reversible). Defining no rules is equivalent to not charging tax at all. */
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

