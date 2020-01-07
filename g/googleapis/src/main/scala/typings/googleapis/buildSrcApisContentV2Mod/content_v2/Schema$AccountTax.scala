package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The tax settings of a merchant account. All methods require the admin role.
  */
@js.native
trait Schema$AccountTax extends js.Object {
  /**
    * The ID of the account to which these account tax settings belong.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#accountTax&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Tax rules. Updating the tax rules will enable US taxes (not reversible).
    * Defining no rules is equivalent to not charging tax at all.
    */
  var rules: js.UndefOr[js.Array[Schema$AccountTaxTaxRule]] = js.native
}

object Schema$AccountTax {
  @scala.inline
  def apply(accountId: String = null, kind: String = null, rules: js.Array[Schema$AccountTaxTaxRule] = null): Schema$AccountTax = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AccountTax]
  }
}

