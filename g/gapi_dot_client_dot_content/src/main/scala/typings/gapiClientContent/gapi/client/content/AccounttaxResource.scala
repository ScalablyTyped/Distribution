package typings.gapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientContent.AnonDryRun
import typings.gapiClientContent.AnonKey
import typings.gapiClientContent.AnonMaxResults
import typings.gapiClientContent.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccounttaxResource extends js.Object {
  /** Retrieves and updates tax settings of multiple accounts in a single request. */
  def custombatch(request: AnonDryRun): Request_[AccounttaxCustomBatchResponse]
  /**
    * Retrieves the tax settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def get(request: AnonKey): Request_[AccountTax]
  /** Lists the tax settings of the sub-accounts in your Merchant Center account. This method can only be called for multi-client accounts. */
  def list(request: AnonMaxResults): Request_[AccounttaxListResponse]
  /**
    * Updates the tax settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account. This method supports patch
    * semantics.
    */
  def patch(request: AnonOauthtoken): Request_[AccountTax]
  /**
    * Updates the tax settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def update(request: AnonOauthtoken): Request_[AccountTax]
}

object AccounttaxResource {
  @scala.inline
  def apply(
    custombatch: AnonDryRun => Request_[AccounttaxCustomBatchResponse],
    get: AnonKey => Request_[AccountTax],
    list: AnonMaxResults => Request_[AccounttaxListResponse],
    patch: AnonOauthtoken => Request_[AccountTax],
    update: AnonOauthtoken => Request_[AccountTax]
  ): AccounttaxResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AccounttaxResource]
  }
}

