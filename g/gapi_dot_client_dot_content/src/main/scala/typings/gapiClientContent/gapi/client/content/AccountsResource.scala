package typings.gapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientContent.AnonAccountId
import typings.gapiClientContent.AnonAlt
import typings.gapiClientContent.AnonDryRun
import typings.gapiClientContent.AnonFields
import typings.gapiClientContent.AnonKey
import typings.gapiClientContent.AnonMaxResults
import typings.gapiClientContent.AnonMerchantId
import typings.gapiClientContent.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  /** Returns information about the authenticated user. */
  def authinfo(request: AnonAlt): Request_[AccountsAuthInfoResponse]
  /**
    * Claims the website of a Merchant Center sub-account. This method can only be called for accounts to which the managing account has access: either the
    * managing account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def claimwebsite(request: AnonAccountId): Request_[AccountsClaimWebsiteResponse]
  /** Retrieves, inserts, updates, and deletes multiple Merchant Center (sub-)accounts in a single request. */
  def custombatch(request: AnonDryRun): Request_[AccountsCustomBatchResponse]
  /** Deletes a Merchant Center sub-account. This method can only be called for multi-client accounts. */
  def delete(request: AnonFields): Request_[Unit]
  /**
    * Retrieves a Merchant Center account. This method can only be called for accounts to which the managing account has access: either the managing account
    * itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def get(request: AnonKey): Request_[Account]
  /** Creates a Merchant Center sub-account. This method can only be called for multi-client accounts. */
  def insert(request: AnonMerchantId): Request_[Account]
  /** Lists the sub-accounts in your Merchant Center account. This method can only be called for multi-client accounts. */
  def list(request: AnonMaxResults): Request_[AccountsListResponse]
  /**
    * Updates a Merchant Center account. This method can only be called for accounts to which the managing account has access: either the managing account
    * itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account. This method supports patch semantics.
    */
  def patch(request: AnonOauthtoken): Request_[Account]
  /**
    * Updates a Merchant Center account. This method can only be called for accounts to which the managing account has access: either the managing account
    * itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def update(request: AnonOauthtoken): Request_[Account]
}

object AccountsResource {
  @scala.inline
  def apply(
    authinfo: AnonAlt => Request_[AccountsAuthInfoResponse],
    claimwebsite: AnonAccountId => Request_[AccountsClaimWebsiteResponse],
    custombatch: AnonDryRun => Request_[AccountsCustomBatchResponse],
    delete: AnonFields => Request_[Unit],
    get: AnonKey => Request_[Account],
    insert: AnonMerchantId => Request_[Account],
    list: AnonMaxResults => Request_[AccountsListResponse],
    patch: AnonOauthtoken => Request_[Account],
    update: AnonOauthtoken => Request_[Account]
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(authinfo = js.Any.fromFunction1(authinfo), claimwebsite = js.Any.fromFunction1(claimwebsite), custombatch = js.Any.fromFunction1(custombatch), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AccountsResource]
  }
}

