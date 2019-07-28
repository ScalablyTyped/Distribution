package typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotContent.Anon_AccountIdAltDryRun
import typings.gapiDotClientDotContent.Anon_AccountIdAltFields
import typings.gapiDotClientDotContent.Anon_AltDryRun
import typings.gapiDotClientDotContent.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccounttaxResource extends js.Object {
  /** Retrieves and updates tax settings of multiple accounts in a single request. */
  def custombatch(request: Anon_AltDryRun): Request[AccounttaxCustomBatchResponse]
  /**
    * Retrieves the tax settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def get(request: Anon_AccountIdAltFields): Request[AccountTax]
  /** Lists the tax settings of the sub-accounts in your Merchant Center account. This method can only be called for multi-client accounts. */
  def list(request: Anon_AltFields): Request[AccounttaxListResponse]
  /**
    * Updates the tax settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account. This method supports patch
    * semantics.
    */
  def patch(request: Anon_AccountIdAltDryRun): Request[AccountTax]
  /**
    * Updates the tax settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def update(request: Anon_AccountIdAltDryRun): Request[AccountTax]
}

object AccounttaxResource {
  @scala.inline
  def apply(
    custombatch: Anon_AltDryRun => Request[AccounttaxCustomBatchResponse],
    get: Anon_AccountIdAltFields => Request[AccountTax],
    list: Anon_AltFields => Request[AccounttaxListResponse],
    patch: Anon_AccountIdAltDryRun => Request[AccountTax],
    update: Anon_AccountIdAltDryRun => Request[AccountTax]
  ): AccounttaxResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AccounttaxResource]
  }
}

