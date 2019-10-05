package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingsettingsCustomBatchRequestEntry extends js.Object {
  /** The ID of the account for which to get/update account shipping settings. */
  var accountId: js.UndefOr[String] = js.undefined
  /** An entry ID, unique within the batch request. */
  var batchId: js.UndefOr[Double] = js.undefined
  /** The ID of the managing account. */
  var merchantId: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  /** The account shipping settings to update. Only defined if the method is update. */
  var shippingSettings: js.UndefOr[ShippingSettings] = js.undefined
}

object ShippingsettingsCustomBatchRequestEntry {
  @scala.inline
  def apply(
    accountId: String = null,
    batchId: Int | Double = null,
    merchantId: String = null,
    method: String = null,
    shippingSettings: ShippingSettings = null
  ): ShippingsettingsCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId)
    if (method != null) __obj.updateDynamic("method")(method)
    if (shippingSettings != null) __obj.updateDynamic("shippingSettings")(shippingSettings)
    __obj.asInstanceOf[ShippingsettingsCustomBatchRequestEntry]
  }
}

