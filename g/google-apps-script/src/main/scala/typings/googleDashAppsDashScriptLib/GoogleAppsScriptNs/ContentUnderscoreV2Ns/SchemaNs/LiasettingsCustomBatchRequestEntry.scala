package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiasettingsCustomBatchRequestEntry extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var batchId: js.UndefOr[scala.Double] = js.undefined
  var contactEmail: js.UndefOr[java.lang.String] = js.undefined
  var contactName: js.UndefOr[java.lang.String] = js.undefined
  var country: js.UndefOr[java.lang.String] = js.undefined
  var gmbEmail: js.UndefOr[java.lang.String] = js.undefined
  var liaSettings: js.UndefOr[LiaSettings] = js.undefined
  var merchantId: js.UndefOr[java.lang.String] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var posDataProviderId: js.UndefOr[java.lang.String] = js.undefined
  var posExternalAccountId: js.UndefOr[java.lang.String] = js.undefined
}

object LiasettingsCustomBatchRequestEntry {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    batchId: scala.Int | scala.Double = null,
    contactEmail: java.lang.String = null,
    contactName: java.lang.String = null,
    country: java.lang.String = null,
    gmbEmail: java.lang.String = null,
    liaSettings: LiaSettings = null,
    merchantId: java.lang.String = null,
    method: java.lang.String = null,
    posDataProviderId: java.lang.String = null,
    posExternalAccountId: java.lang.String = null
  ): LiasettingsCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (contactEmail != null) __obj.updateDynamic("contactEmail")(contactEmail)
    if (contactName != null) __obj.updateDynamic("contactName")(contactName)
    if (country != null) __obj.updateDynamic("country")(country)
    if (gmbEmail != null) __obj.updateDynamic("gmbEmail")(gmbEmail)
    if (liaSettings != null) __obj.updateDynamic("liaSettings")(liaSettings)
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId)
    if (method != null) __obj.updateDynamic("method")(method)
    if (posDataProviderId != null) __obj.updateDynamic("posDataProviderId")(posDataProviderId)
    if (posExternalAccountId != null) __obj.updateDynamic("posExternalAccountId")(posExternalAccountId)
    __obj.asInstanceOf[LiasettingsCustomBatchRequestEntry]
  }
}

