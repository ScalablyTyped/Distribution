package typings.gapiDotClientDotContent.gapi.client.content

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotContent.Anon_AccountIdAltDryRun
import typings.gapiDotClientDotContent.Anon_AccountIdAltFields
import typings.gapiDotClientDotContent.Anon_AltDryRun
import typings.gapiDotClientDotContent.Anon_AltFields
import typings.gapiDotClientDotContent.Anon_AltFieldsKeyMerchantId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingsettingsResource extends js.Object {
  /** Retrieves and updates the shipping settings of multiple accounts in a single request. */
  def custombatch(request: Anon_AltDryRun): Request[ShippingsettingsCustomBatchResponse]
  /**
    * Retrieves the shipping settings of the account. This method can only be called for accounts to which the managing account has access: either the
    * managing account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def get(request: Anon_AccountIdAltFields): Request[ShippingSettings]
  /** Retrieves supported carriers and carrier services for an account. */
  def getsupportedcarriers(request: Anon_AltFieldsKeyMerchantId): Request[ShippingsettingsGetSupportedCarriersResponse]
  /** Lists the shipping settings of the sub-accounts in your Merchant Center account. This method can only be called for multi-client accounts. */
  def list(request: Anon_AltFields): Request[ShippingsettingsListResponse]
  /**
    * Updates the shipping settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account. This method supports patch
    * semantics.
    */
  def patch(request: Anon_AccountIdAltDryRun): Request[ShippingSettings]
  /**
    * Updates the shipping settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def update(request: Anon_AccountIdAltDryRun): Request[ShippingSettings]
}

object ShippingsettingsResource {
  @scala.inline
  def apply(
    custombatch: Anon_AltDryRun => Request[ShippingsettingsCustomBatchResponse],
    get: Anon_AccountIdAltFields => Request[ShippingSettings],
    getsupportedcarriers: Anon_AltFieldsKeyMerchantId => Request[ShippingsettingsGetSupportedCarriersResponse],
    list: Anon_AltFields => Request[ShippingsettingsListResponse],
    patch: Anon_AccountIdAltDryRun => Request[ShippingSettings],
    update: Anon_AccountIdAltDryRun => Request[ShippingSettings]
  ): ShippingsettingsResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), get = js.Any.fromFunction1(get), getsupportedcarriers = js.Any.fromFunction1(getsupportedcarriers), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ShippingsettingsResource]
  }
}

