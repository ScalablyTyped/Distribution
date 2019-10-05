package typings.gapiDotClientDotContent.gapi.client.content

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotContent.Anon_AccountId
import typings.gapiDotClientDotContent.Anon_AccountIdAlt
import typings.gapiDotClientDotContent.Anon_AccountIdAltDryRun
import typings.gapiDotClientDotContent.Anon_AccountIdAltFields
import typings.gapiDotClientDotContent.Anon_Alt
import typings.gapiDotClientDotContent.Anon_AltDryRun
import typings.gapiDotClientDotContent.Anon_AltDryRunFields
import typings.gapiDotClientDotContent.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  /** Returns information about the authenticated user. */
  def authinfo(request: Anon_Alt): Request[AccountsAuthInfoResponse]
  /**
    * Claims the website of a Merchant Center sub-account. This method can only be called for accounts to which the managing account has access: either the
    * managing account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def claimwebsite(request: Anon_AccountId): Request[AccountsClaimWebsiteResponse]
  /** Retrieves, inserts, updates, and deletes multiple Merchant Center (sub-)accounts in a single request. */
  def custombatch(request: Anon_AltDryRun): Request[AccountsCustomBatchResponse]
  /** Deletes a Merchant Center sub-account. This method can only be called for multi-client accounts. */
  def delete(request: Anon_AccountIdAlt): Request[Unit]
  /**
    * Retrieves a Merchant Center account. This method can only be called for accounts to which the managing account has access: either the managing account
    * itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def get(request: Anon_AccountIdAltFields): Request[Account]
  /** Creates a Merchant Center sub-account. This method can only be called for multi-client accounts. */
  def insert(request: Anon_AltDryRunFields): Request[Account]
  /** Lists the sub-accounts in your Merchant Center account. This method can only be called for multi-client accounts. */
  def list(request: Anon_AltFields): Request[AccountsListResponse]
  /**
    * Updates a Merchant Center account. This method can only be called for accounts to which the managing account has access: either the managing account
    * itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account. This method supports patch semantics.
    */
  def patch(request: Anon_AccountIdAltDryRun): Request[Account]
  /**
    * Updates a Merchant Center account. This method can only be called for accounts to which the managing account has access: either the managing account
    * itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def update(request: Anon_AccountIdAltDryRun): Request[Account]
}

object AccountsResource {
  @scala.inline
  def apply(
    authinfo: Anon_Alt => Request[AccountsAuthInfoResponse],
    claimwebsite: Anon_AccountId => Request[AccountsClaimWebsiteResponse],
    custombatch: Anon_AltDryRun => Request[AccountsCustomBatchResponse],
    delete: Anon_AccountIdAlt => Request[Unit],
    get: Anon_AccountIdAltFields => Request[Account],
    insert: Anon_AltDryRunFields => Request[Account],
    list: Anon_AltFields => Request[AccountsListResponse],
    patch: Anon_AccountIdAltDryRun => Request[Account],
    update: Anon_AccountIdAltDryRun => Request[Account]
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(authinfo = js.Any.fromFunction1(authinfo), claimwebsite = js.Any.fromFunction1(claimwebsite), custombatch = js.Any.fromFunction1(custombatch), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AccountsResource]
  }
}

