package typings.gapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.gapiClientContent.anon.AccountId
import typings.gapiClientContent.anon.Alt
import typings.gapiClientContent.anon.DryRun
import typings.gapiClientContent.anon.Fields
import typings.gapiClientContent.anon.Key
import typings.gapiClientContent.anon.MaxResults
import typings.gapiClientContent.anon.MerchantId
import typings.gapiClientContent.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountsResource extends js.Object {
  /** Returns information about the authenticated user. */
  def authinfo(request: Alt): Request[AccountsAuthInfoResponse] = js.native
  /**
    * Claims the website of a Merchant Center sub-account. This method can only be called for accounts to which the managing account has access: either the
    * managing account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def claimwebsite(request: AccountId): Request[AccountsClaimWebsiteResponse] = js.native
  /** Retrieves, inserts, updates, and deletes multiple Merchant Center (sub-)accounts in a single request. */
  def custombatch(request: DryRun): Request[AccountsCustomBatchResponse] = js.native
  /** Deletes a Merchant Center sub-account. This method can only be called for multi-client accounts. */
  def delete(request: Fields): Request[Unit] = js.native
  /**
    * Retrieves a Merchant Center account. This method can only be called for accounts to which the managing account has access: either the managing account
    * itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def get(request: Key): Request[Account] = js.native
  /** Creates a Merchant Center sub-account. This method can only be called for multi-client accounts. */
  def insert(request: MerchantId): Request[Account] = js.native
  /** Lists the sub-accounts in your Merchant Center account. This method can only be called for multi-client accounts. */
  def list(request: MaxResults): Request[AccountsListResponse] = js.native
  /**
    * Updates a Merchant Center account. This method can only be called for accounts to which the managing account has access: either the managing account
    * itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account. This method supports patch semantics.
    */
  def patch(request: Oauthtoken): Request[Account] = js.native
  /**
    * Updates a Merchant Center account. This method can only be called for accounts to which the managing account has access: either the managing account
    * itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def update(request: Oauthtoken): Request[Account] = js.native
}

object AccountsResource {
  @scala.inline
  def apply(
    authinfo: Alt => Request[AccountsAuthInfoResponse],
    claimwebsite: AccountId => Request[AccountsClaimWebsiteResponse],
    custombatch: DryRun => Request[AccountsCustomBatchResponse],
    delete: Fields => Request[Unit],
    get: Key => Request[Account],
    insert: MerchantId => Request[Account],
    list: MaxResults => Request[AccountsListResponse],
    patch: Oauthtoken => Request[Account],
    update: Oauthtoken => Request[Account]
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(authinfo = js.Any.fromFunction1(authinfo), claimwebsite = js.Any.fromFunction1(claimwebsite), custombatch = js.Any.fromFunction1(custombatch), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AccountsResource]
  }
  @scala.inline
  implicit class AccountsResourceOps[Self <: AccountsResource] (val x: Self) extends AnyVal {
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
    def setAuthinfo(value: Alt => Request[AccountsAuthInfoResponse]): Self = this.set("authinfo", js.Any.fromFunction1(value))
    @scala.inline
    def setClaimwebsite(value: AccountId => Request[AccountsClaimWebsiteResponse]): Self = this.set("claimwebsite", js.Any.fromFunction1(value))
    @scala.inline
    def setCustombatch(value: DryRun => Request[AccountsCustomBatchResponse]): Self = this.set("custombatch", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Fields => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Key => Request[Account]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: MerchantId => Request[Account]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: MaxResults => Request[AccountsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Oauthtoken => Request[Account]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Oauthtoken => Request[Account]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

