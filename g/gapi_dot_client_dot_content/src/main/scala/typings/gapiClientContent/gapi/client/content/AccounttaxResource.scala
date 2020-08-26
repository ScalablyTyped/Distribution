package typings.gapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.gapiClientContent.anon.DryRun
import typings.gapiClientContent.anon.Key
import typings.gapiClientContent.anon.MaxResults
import typings.gapiClientContent.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccounttaxResource extends js.Object {
  /** Retrieves and updates tax settings of multiple accounts in a single request. */
  def custombatch(request: DryRun): Request[AccounttaxCustomBatchResponse] = js.native
  /**
    * Retrieves the tax settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def get(request: Key): Request[AccountTax] = js.native
  /** Lists the tax settings of the sub-accounts in your Merchant Center account. This method can only be called for multi-client accounts. */
  def list(request: MaxResults): Request[AccounttaxListResponse] = js.native
  /**
    * Updates the tax settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account. This method supports patch
    * semantics.
    */
  def patch(request: Oauthtoken): Request[AccountTax] = js.native
  /**
    * Updates the tax settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def update(request: Oauthtoken): Request[AccountTax] = js.native
}

object AccounttaxResource {
  @scala.inline
  def apply(
    custombatch: DryRun => Request[AccounttaxCustomBatchResponse],
    get: Key => Request[AccountTax],
    list: MaxResults => Request[AccounttaxListResponse],
    patch: Oauthtoken => Request[AccountTax],
    update: Oauthtoken => Request[AccountTax]
  ): AccounttaxResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AccounttaxResource]
  }
  @scala.inline
  implicit class AccounttaxResourceOps[Self <: AccounttaxResource] (val x: Self) extends AnyVal {
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
    def setCustombatch(value: DryRun => Request[AccounttaxCustomBatchResponse]): Self = this.set("custombatch", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Key => Request[AccountTax]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: MaxResults => Request[AccounttaxListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Oauthtoken => Request[AccountTax]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Oauthtoken => Request[AccountTax]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

