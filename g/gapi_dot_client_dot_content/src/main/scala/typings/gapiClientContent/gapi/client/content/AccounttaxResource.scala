package typings.gapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientContent.AnonAccountIdAltDryRun
import typings.gapiClientContent.AnonAccountIdAltFields
import typings.gapiClientContent.AnonAltDryRun
import typings.gapiClientContent.AnonAltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccounttaxResource extends js.Object {
  /** Retrieves and updates tax settings of multiple accounts in a single request. */
  def custombatch(request: AnonAltDryRun): Request_[AccounttaxCustomBatchResponse]
  /**
    * Retrieves the tax settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def get(request: AnonAccountIdAltFields): Request_[AccountTax]
  /** Lists the tax settings of the sub-accounts in your Merchant Center account. This method can only be called for multi-client accounts. */
  def list(request: AnonAltFields): Request_[AccounttaxListResponse]
  /**
    * Updates the tax settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account. This method supports patch
    * semantics.
    */
  def patch(request: AnonAccountIdAltDryRun): Request_[AccountTax]
  /**
    * Updates the tax settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def update(request: AnonAccountIdAltDryRun): Request_[AccountTax]
}

object AccounttaxResource {
  @scala.inline
  def apply(
    custombatch: AnonAltDryRun => Request_[AccounttaxCustomBatchResponse],
    get: AnonAccountIdAltFields => Request_[AccountTax],
    list: AnonAltFields => Request_[AccounttaxListResponse],
    patch: AnonAccountIdAltDryRun => Request_[AccountTax],
    update: AnonAccountIdAltDryRun => Request_[AccountTax]
  ): AccounttaxResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AccounttaxResource]
  }
}

