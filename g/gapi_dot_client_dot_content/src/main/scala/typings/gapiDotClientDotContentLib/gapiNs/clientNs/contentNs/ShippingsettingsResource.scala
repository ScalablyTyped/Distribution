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
    custombatch: js.Function1[
      gapiDotClientDotContentLib.Anon_AltDryRun, 
      gapiDotClientLib.gapiNs.clientNs.Request[ShippingsettingsCustomBatchResponse]
    ],
    get: js.Function1[
      gapiDotClientDotContentLib.Anon_AccountIdAltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[ShippingSettings]
    ],
    getsupportedcarriers: js.Function1[
      gapiDotClientDotContentLib.Anon_AltFieldsKeyMerchantId, 
      gapiDotClientLib.gapiNs.clientNs.Request[ShippingsettingsGetSupportedCarriersResponse]
    ],
    list: js.Function1[
      gapiDotClientDotContentLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[ShippingsettingsListResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotContentLib.Anon_AccountIdAltDryRun, 
      gapiDotClientLib.gapiNs.clientNs.Request[ShippingSettings]
    ],
    update: js.Function1[
      gapiDotClientDotContentLib.Anon_AccountIdAltDryRun, 
      gapiDotClientLib.gapiNs.clientNs.Request[ShippingSettings]
    ]
  ): ShippingsettingsResource = {
    val __obj = js.Dynamic.literal(custombatch = custombatch, get = get, getsupportedcarriers = getsupportedcarriers, list = list, patch = patch, update = update)
  
    __obj.asInstanceOf[ShippingsettingsResource]
  }
}

