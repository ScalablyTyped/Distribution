package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingsettingsCustomBatchRequestEntry extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var batchId: js.UndefOr[scala.Double] = js.undefined
  var merchantId: js.UndefOr[java.lang.String] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var shippingSettings: js.UndefOr[ShippingSettings] = js.undefined
}

object ShippingsettingsCustomBatchRequestEntry {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    batchId: scala.Int | scala.Double = null,
    merchantId: java.lang.String = null,
    method: java.lang.String = null,
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

