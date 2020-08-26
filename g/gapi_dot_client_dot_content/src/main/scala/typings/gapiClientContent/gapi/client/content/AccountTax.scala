package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountTax extends js.Object {
  /** The ID of the account to which these account tax settings belong. */
  var accountId: js.UndefOr[String] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "content#accountTax". */
  var kind: js.UndefOr[String] = js.native
  /** Tax rules. Updating the tax rules will enable US taxes (not reversible). Defining no rules is equivalent to not charging tax at all. */
  var rules: js.UndefOr[js.Array[AccountTaxTaxRule]] = js.native
}

object AccountTax {
  @scala.inline
  def apply(): AccountTax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountTax]
  }
  @scala.inline
  implicit class AccountTaxOps[Self <: AccountTax] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setRulesVarargs(value: AccountTaxTaxRule*): Self = this.set("rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: js.Array[AccountTaxTaxRule]): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
  }
  
}

