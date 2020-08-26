package typings.gapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.gapiClientContent.anon.DryRun
import typings.gapiClientContent.anon.Key
import typings.gapiClientContent.anon.MaxResults
import typings.gapiClientContent.anon.Oauthtoken
import typings.gapiClientContent.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShippingsettingsResource extends js.Object {
  /** Retrieves and updates the shipping settings of multiple accounts in a single request. */
  def custombatch(request: DryRun): Request[ShippingsettingsCustomBatchResponse] = js.native
  /**
    * Retrieves the shipping settings of the account. This method can only be called for accounts to which the managing account has access: either the
    * managing account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def get(request: Key): Request[ShippingSettings] = js.native
  /** Retrieves supported carriers and carrier services for an account. */
  def getsupportedcarriers(request: QuotaUser): Request[ShippingsettingsGetSupportedCarriersResponse] = js.native
  /** Lists the shipping settings of the sub-accounts in your Merchant Center account. This method can only be called for multi-client accounts. */
  def list(request: MaxResults): Request[ShippingsettingsListResponse] = js.native
  /**
    * Updates the shipping settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account. This method supports patch
    * semantics.
    */
  def patch(request: Oauthtoken): Request[ShippingSettings] = js.native
  /**
    * Updates the shipping settings of the account. This method can only be called for accounts to which the managing account has access: either the managing
    * account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def update(request: Oauthtoken): Request[ShippingSettings] = js.native
}

object ShippingsettingsResource {
  @scala.inline
  def apply(
    custombatch: DryRun => Request[ShippingsettingsCustomBatchResponse],
    get: Key => Request[ShippingSettings],
    getsupportedcarriers: QuotaUser => Request[ShippingsettingsGetSupportedCarriersResponse],
    list: MaxResults => Request[ShippingsettingsListResponse],
    patch: Oauthtoken => Request[ShippingSettings],
    update: Oauthtoken => Request[ShippingSettings]
  ): ShippingsettingsResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), get = js.Any.fromFunction1(get), getsupportedcarriers = js.Any.fromFunction1(getsupportedcarriers), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ShippingsettingsResource]
  }
  @scala.inline
  implicit class ShippingsettingsResourceOps[Self <: ShippingsettingsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCustombatch(value: DryRun => Request[ShippingsettingsCustomBatchResponse]): Self = this.set("custombatch", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Key => Request[ShippingSettings]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetsupportedcarriers(value: QuotaUser => Request[ShippingsettingsGetSupportedCarriersResponse]): Self = this.set("getsupportedcarriers", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: MaxResults => Request[ShippingsettingsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Oauthtoken => Request[ShippingSettings]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Oauthtoken => Request[ShippingSettings]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

