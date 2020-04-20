package typings.gapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientContent.AnonDryRun
import typings.gapiClientContent.AnonKey
import typings.gapiClientContent.AnonMaxResults
import typings.gapiClientContent.AnonOauthtoken
import typings.gapiClientContent.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingsettingsResource extends js.Object {
  /** Retrieves and updates the shipping settings of multiple accounts in a single request. */
  def custombatch(request: AnonDryRun): Request_[ShippingsettingsCustomBatchResponse]
  /**
    * Retrieves the shipping settings of the account. This method can only be called for accounts to which the managing account has access: either the
    * managing account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def get(request: AnonKey): Request_[ShippingSettings]
  /** Retrieves supported carriers and carrier services for an account. */
  def getsupportedcarriers(request: AnonQuotaUser): Request_[ShippingsettingsGetSupportedCarriersResponse]
  /** Lists the shipping settings of the sub-accounts in your Merchant Center account. This method can only be called for multi-client accounts. */
  def list(request: AnonMaxResults): Request_[ShippingsettingsListResponse]
  /**
    * Updates the shipping settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account. This method supports patch
    * semantics.
    */
  def patch(request: AnonOauthtoken): Request_[ShippingSettings]
  /**
    * Updates the shipping settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def update(request: AnonOauthtoken): Request_[ShippingSettings]
}

object ShippingsettingsResource {
  @scala.inline
  def apply(
    custombatch: AnonDryRun => Request_[ShippingsettingsCustomBatchResponse],
    get: AnonKey => Request_[ShippingSettings],
    getsupportedcarriers: AnonQuotaUser => Request_[ShippingsettingsGetSupportedCarriersResponse],
    list: AnonMaxResults => Request_[ShippingsettingsListResponse],
    patch: AnonOauthtoken => Request_[ShippingSettings],
    update: AnonOauthtoken => Request_[ShippingSettings]
  ): ShippingsettingsResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), get = js.Any.fromFunction1(get), getsupportedcarriers = js.Any.fromFunction1(getsupportedcarriers), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ShippingsettingsResource]
  }
}

