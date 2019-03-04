package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccounttaxResource extends js.Object {
  /** Retrieves and updates tax settings of multiple accounts in a single request. */
  def custombatch(request: gapiDotClientDotContentLib.Anon_AltDryRun): gapiDotClientLib.gapiNs.clientNs.Request[AccounttaxCustomBatchResponse]
  /**
    * Retrieves the tax settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def get(request: gapiDotClientDotContentLib.Anon_AccountIdAltFields): gapiDotClientLib.gapiNs.clientNs.Request[AccountTax]
  /** Lists the tax settings of the sub-accounts in your Merchant Center account. This method can only be called for multi-client accounts. */
  def list(request: gapiDotClientDotContentLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[AccounttaxListResponse]
  /**
    * Updates the tax settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account. This method supports patch
    * semantics.
    */
  def patch(request: gapiDotClientDotContentLib.Anon_AccountIdAltDryRun): gapiDotClientLib.gapiNs.clientNs.Request[AccountTax]
  /**
    * Updates the tax settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def update(request: gapiDotClientDotContentLib.Anon_AccountIdAltDryRun): gapiDotClientLib.gapiNs.clientNs.Request[AccountTax]
}

object AccounttaxResource {
  @scala.inline
  def apply(
    custombatch: js.Function1[
      gapiDotClientDotContentLib.Anon_AltDryRun, 
      gapiDotClientLib.gapiNs.clientNs.Request[AccounttaxCustomBatchResponse]
    ],
    get: js.Function1[
      gapiDotClientDotContentLib.Anon_AccountIdAltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[AccountTax]
    ],
    list: js.Function1[
      gapiDotClientDotContentLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[AccounttaxListResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotContentLib.Anon_AccountIdAltDryRun, 
      gapiDotClientLib.gapiNs.clientNs.Request[AccountTax]
    ],
    update: js.Function1[
      gapiDotClientDotContentLib.Anon_AccountIdAltDryRun, 
      gapiDotClientLib.gapiNs.clientNs.Request[AccountTax]
    ]
  ): AccounttaxResource = {
    val __obj = js.Dynamic.literal(custombatch = custombatch, get = get, list = list, patch = patch, update = update)
  
    __obj.asInstanceOf[AccounttaxResource]
  }
}

