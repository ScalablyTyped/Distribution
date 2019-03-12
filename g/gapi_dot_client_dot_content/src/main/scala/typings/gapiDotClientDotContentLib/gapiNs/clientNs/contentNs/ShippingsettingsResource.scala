package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingsettingsResource extends js.Object {
  /** Retrieves and updates the shipping settings of multiple accounts in a single request. */
  def custombatch(request: gapiDotClientDotContentLib.Anon_AltDryRun): gapiDotClientLib.gapiNs.clientNs.Request[ShippingsettingsCustomBatchResponse]
  /**
    * Retrieves the shipping settings of the account. This method can only be called for accounts to which the managing account has access: either the
    * managing account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def get(request: gapiDotClientDotContentLib.Anon_AccountIdAltFields): gapiDotClientLib.gapiNs.clientNs.Request[ShippingSettings]
  /** Retrieves supported carriers and carrier services for an account. */
  def getsupportedcarriers(request: gapiDotClientDotContentLib.Anon_AltFieldsKeyMerchantId): gapiDotClientLib.gapiNs.clientNs.Request[ShippingsettingsGetSupportedCarriersResponse]
  /** Lists the shipping settings of the sub-accounts in your Merchant Center account. This method can only be called for multi-client accounts. */
  def list(request: gapiDotClientDotContentLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[ShippingsettingsListResponse]
  /**
    * Updates the shipping settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account. This method supports patch
    * semantics.
    */
  def patch(request: gapiDotClientDotContentLib.Anon_AccountIdAltDryRun): gapiDotClientLib.gapiNs.clientNs.Request[ShippingSettings]
  /**
    * Updates the shipping settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def update(request: gapiDotClientDotContentLib.Anon_AccountIdAltDryRun): gapiDotClientLib.gapiNs.clientNs.Request[ShippingSettings]
}

object ShippingsettingsResource {
  @scala.inline
  def apply(
    custombatch: gapiDotClientDotContentLib.Anon_AltDryRun => gapiDotClientLib.gapiNs.clientNs.Request[ShippingsettingsCustomBatchResponse],
    get: gapiDotClientDotContentLib.Anon_AccountIdAltFields => gapiDotClientLib.gapiNs.clientNs.Request[ShippingSettings],
    getsupportedcarriers: gapiDotClientDotContentLib.Anon_AltFieldsKeyMerchantId => gapiDotClientLib.gapiNs.clientNs.Request[ShippingsettingsGetSupportedCarriersResponse],
    list: gapiDotClientDotContentLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[ShippingsettingsListResponse],
    patch: gapiDotClientDotContentLib.Anon_AccountIdAltDryRun => gapiDotClientLib.gapiNs.clientNs.Request[ShippingSettings],
    update: gapiDotClientDotContentLib.Anon_AccountIdAltDryRun => gapiDotClientLib.gapiNs.clientNs.Request[ShippingSettings]
  ): ShippingsettingsResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), get = js.Any.fromFunction1(get), getsupportedcarriers = js.Any.fromFunction1(getsupportedcarriers), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ShippingsettingsResource]
  }
}

