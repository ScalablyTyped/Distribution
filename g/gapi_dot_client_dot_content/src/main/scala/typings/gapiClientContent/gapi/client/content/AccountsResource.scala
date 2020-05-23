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

trait AccountsResource extends js.Object {
  /** Returns information about the authenticated user. */
  def authinfo(request: Alt): Request[AccountsAuthInfoResponse]
  /**
    * Claims the website of a Merchant Center sub-account. This method can only be called for accounts to which the managing account has access: either the
    * managing account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def claimwebsite(request: AccountId): Request[AccountsClaimWebsiteResponse]
  /** Retrieves, inserts, updates, and deletes multiple Merchant Center (sub-)accounts in a single request. */
  def custombatch(request: DryRun): Request[AccountsCustomBatchResponse]
  /** Deletes a Merchant Center sub-account. This method can only be called for multi-client accounts. */
  def delete(request: Fields): Request[Unit]
  /**
    * Retrieves a Merchant Center account. This method can only be called for accounts to which the managing account has access: either the managing account
    * itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def get(request: Key): Request[Account]
  /** Creates a Merchant Center sub-account. This method can only be called for multi-client accounts. */
  def insert(request: MerchantId): Request[Account]
  /** Lists the sub-accounts in your Merchant Center account. This method can only be called for multi-client accounts. */
  def list(request: MaxResults): Request[AccountsListResponse]
  /**
    * Updates a Merchant Center account. This method can only be called for accounts to which the managing account has access: either the managing account
    * itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account. This method supports patch semantics.
    */
  def patch(request: Oauthtoken): Request[Account]
  /**
    * Updates a Merchant Center account. This method can only be called for accounts to which the managing account has access: either the managing account
    * itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def update(request: Oauthtoken): Request[Account]
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
}

