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
    authinfo: js.Function1[
      gapiDotClientDotContentLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[AccountsAuthInfoResponse]
    ],
    claimwebsite: js.Function1[
      gapiDotClientDotContentLib.Anon_AccountId, 
      gapiDotClientLib.gapiNs.clientNs.Request[AccountsClaimWebsiteResponse]
    ],
    custombatch: js.Function1[
      gapiDotClientDotContentLib.Anon_AltDryRun, 
      gapiDotClientLib.gapiNs.clientNs.Request[AccountsCustomBatchResponse]
    ],
    delete: js.Function1[
      gapiDotClientDotContentLib.Anon_AccountIdAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotContentLib.Anon_AccountIdAltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Account]
    ],
    insert: js.Function1[
      gapiDotClientDotContentLib.Anon_AltDryRunFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Account]
    ],
    list: js.Function1[
      gapiDotClientDotContentLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[AccountsListResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotContentLib.Anon_AccountIdAltDryRun, 
      gapiDotClientLib.gapiNs.clientNs.Request[Account]
    ],
    update: js.Function1[
      gapiDotClientDotContentLib.Anon_AccountIdAltDryRun, 
      gapiDotClientLib.gapiNs.clientNs.Request[Account]
    ]
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(authinfo = authinfo, claimwebsite = claimwebsite, custombatch = custombatch, delete = delete, get = get, insert = insert, list = list, patch = patch, update = update)
  
    __obj.asInstanceOf[AccountsResource]
  }
}

