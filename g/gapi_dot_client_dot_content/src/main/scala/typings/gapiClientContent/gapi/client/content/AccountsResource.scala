package typings.gapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientContent.AnonAccountId
import typings.gapiClientContent.AnonAccountIdAlt
import typings.gapiClientContent.AnonAccountIdAltDryRun
import typings.gapiClientContent.AnonAccountIdAltFields
import typings.gapiClientContent.AnonAlt
import typings.gapiClientContent.AnonAltDryRun
import typings.gapiClientContent.AnonAltDryRunFields
import typings.gapiClientContent.AnonAltFields
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
  def custombatch(request: AnonAltDryRun): Request_[AccountsCustomBatchResponse]
  /** Deletes a Merchant Center sub-account. This method can only be called for multi-client accounts. */
  def delete(request: AnonAccountIdAlt): Request_[Unit]
  /**
    * Retrieves a Merchant Center account. This method can only be called for accounts to which the managing account has access: either the managing account
    * itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def get(request: AnonAccountIdAltFields): Request_[Account]
  /** Creates a Merchant Center sub-account. This method can only be called for multi-client accounts. */
  def insert(request: AnonAltDryRunFields): Request_[Account]
  /** Lists the sub-accounts in your Merchant Center account. This method can only be called for multi-client accounts. */
  def list(request: AnonAltFields): Request_[AccountsListResponse]
  /**
    * Updates a Merchant Center account. This method can only be called for accounts to which the managing account has access: either the managing account
    * itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account. This method supports patch semantics.
    */
  def patch(request: AnonAccountIdAltDryRun): Request_[Account]
  /**
    * Updates a Merchant Center account. This method can only be called for accounts to which the managing account has access: either the managing account
    * itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def update(request: AnonAccountIdAltDryRun): Request_[Account]
}

object AccountsResource {
  @scala.inline
  def apply(
    authinfo: AnonAlt => Request_[AccountsAuthInfoResponse],
    claimwebsite: AnonAccountId => Request_[AccountsClaimWebsiteResponse],
    custombatch: AnonAltDryRun => Request_[AccountsCustomBatchResponse],
    delete: AnonAccountIdAlt => Request_[Unit],
    get: AnonAccountIdAltFields => Request_[Account],
    insert: AnonAltDryRunFields => Request_[Account],
    list: AnonAltFields => Request_[AccountsListResponse],
    patch: AnonAccountIdAltDryRun => Request_[Account],
    update: AnonAccountIdAltDryRun => Request_[Account]
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(authinfo = js.Any.fromFunction1(authinfo), claimwebsite = js.Any.fromFunction1(claimwebsite), custombatch = js.Any.fromFunction1(custombatch), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AccountsResource]
  }
}

