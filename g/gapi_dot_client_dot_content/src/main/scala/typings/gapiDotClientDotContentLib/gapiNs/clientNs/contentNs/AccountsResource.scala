package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  /** Returns information about the authenticated user. */
  def authinfo(request: gapiDotClientDotContentLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[AccountsAuthInfoResponse]
  /**
    * Claims the website of a Merchant Center sub-account. This method can only be called for accounts to which the managing account has access: either the
    * managing account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def claimwebsite(request: gapiDotClientDotContentLib.Anon_AccountId): gapiDotClientLib.gapiNs.clientNs.Request[AccountsClaimWebsiteResponse]
  /** Retrieves, inserts, updates, and deletes multiple Merchant Center (sub-)accounts in a single request. */
  def custombatch(request: gapiDotClientDotContentLib.Anon_AltDryRun): gapiDotClientLib.gapiNs.clientNs.Request[AccountsCustomBatchResponse]
  /** Deletes a Merchant Center sub-account. This method can only be called for multi-client accounts. */
  def delete(request: gapiDotClientDotContentLib.Anon_AccountIdAlt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /**
    * Retrieves a Merchant Center account. This method can only be called for accounts to which the managing account has access: either the managing account
    * itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def get(request: gapiDotClientDotContentLib.Anon_AccountIdAltFields): gapiDotClientLib.gapiNs.clientNs.Request[Account]
  /** Creates a Merchant Center sub-account. This method can only be called for multi-client accounts. */
  def insert(request: gapiDotClientDotContentLib.Anon_AltDryRunFields): gapiDotClientLib.gapiNs.clientNs.Request[Account]
  /** Lists the sub-accounts in your Merchant Center account. This method can only be called for multi-client accounts. */
  def list(request: gapiDotClientDotContentLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[AccountsListResponse]
  /**
    * Updates a Merchant Center account. This method can only be called for accounts to which the managing account has access: either the managing account
    * itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account. This method supports patch semantics.
    */
  def patch(request: gapiDotClientDotContentLib.Anon_AccountIdAltDryRun): gapiDotClientLib.gapiNs.clientNs.Request[Account]
  /**
    * Updates a Merchant Center account. This method can only be called for accounts to which the managing account has access: either the managing account
    * itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def update(request: gapiDotClientDotContentLib.Anon_AccountIdAltDryRun): gapiDotClientLib.gapiNs.clientNs.Request[Account]
}

object AccountsResource {
  @scala.inline
  def apply(
    authinfo: gapiDotClientDotContentLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[AccountsAuthInfoResponse],
    claimwebsite: gapiDotClientDotContentLib.Anon_AccountId => gapiDotClientLib.gapiNs.clientNs.Request[AccountsClaimWebsiteResponse],
    custombatch: gapiDotClientDotContentLib.Anon_AltDryRun => gapiDotClientLib.gapiNs.clientNs.Request[AccountsCustomBatchResponse],
    delete: gapiDotClientDotContentLib.Anon_AccountIdAlt => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotContentLib.Anon_AccountIdAltFields => gapiDotClientLib.gapiNs.clientNs.Request[Account],
    insert: gapiDotClientDotContentLib.Anon_AltDryRunFields => gapiDotClientLib.gapiNs.clientNs.Request[Account],
    list: gapiDotClientDotContentLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[AccountsListResponse],
    patch: gapiDotClientDotContentLib.Anon_AccountIdAltDryRun => gapiDotClientLib.gapiNs.clientNs.Request[Account],
    update: gapiDotClientDotContentLib.Anon_AccountIdAltDryRun => gapiDotClientLib.gapiNs.clientNs.Request[Account]
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(authinfo = js.Any.fromFunction1(authinfo), claimwebsite = js.Any.fromFunction1(claimwebsite), custombatch = js.Any.fromFunction1(custombatch), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AccountsResource]
  }
}

