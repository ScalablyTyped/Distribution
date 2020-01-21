package typings.gapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientContent.AnonAccountIdAltDryRun
import typings.gapiClientContent.AnonAccountIdAltFields
import typings.gapiClientContent.AnonAltDryRun
import typings.gapiClientContent.AnonAltFields
import typings.gapiClientContent.AnonAltFieldsKeyMerchantId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingsettingsResource extends js.Object {
  /** Retrieves and updates the shipping settings of multiple accounts in a single request. */
  def custombatch(request: AnonAltDryRun): Request_[ShippingsettingsCustomBatchResponse]
  /**
    * Retrieves the shipping settings of the account. This method can only be called for accounts to which the managing account has access: either the
    * managing account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def get(request: AnonAccountIdAltFields): Request_[ShippingSettings]
  /** Retrieves supported carriers and carrier services for an account. */
  def getsupportedcarriers(request: AnonAltFieldsKeyMerchantId): Request_[ShippingsettingsGetSupportedCarriersResponse]
  /** Lists the shipping settings of the sub-accounts in your Merchant Center account. This method can only be called for multi-client accounts. */
  def list(request: AnonAltFields): Request_[ShippingsettingsListResponse]
  /**
    * Updates the shipping settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account. This method supports patch
    * semantics.
    */
  def patch(request: AnonAccountIdAltDryRun): Request_[ShippingSettings]
  /**
    * Updates the shipping settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def update(request: AnonAccountIdAltDryRun): Request_[ShippingSettings]
}

object ShippingsettingsResource {
  @scala.inline
  def apply(
    custombatch: AnonAltDryRun => Request_[ShippingsettingsCustomBatchResponse],
    get: AnonAccountIdAltFields => Request_[ShippingSettings],
    getsupportedcarriers: AnonAltFieldsKeyMerchantId => Request_[ShippingsettingsGetSupportedCarriersResponse],
    list: AnonAltFields => Request_[ShippingsettingsListResponse],
    patch: AnonAccountIdAltDryRun => Request_[ShippingSettings],
    update: AnonAccountIdAltDryRun => Request_[ShippingSettings]
  ): ShippingsettingsResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), get = js.Any.fromFunction1(get), getsupportedcarriers = js.Any.fromFunction1(getsupportedcarriers), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ShippingsettingsResource]
  }
}

