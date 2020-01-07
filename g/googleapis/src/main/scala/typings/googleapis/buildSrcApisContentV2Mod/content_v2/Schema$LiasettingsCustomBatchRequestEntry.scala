package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LiasettingsCustomBatchRequestEntry extends js.Object {
  /**
    * The ID of the account for which to get/update account shipping settings.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * An entry ID, unique within the batch request.
    */
  var batchId: js.UndefOr[Double] = js.native
  /**
    * Inventory validation contact email. Required only for
    * SetInventoryValidationContact.
    */
  var contactEmail: js.UndefOr[String] = js.native
  /**
    * Inventory validation contact name. Required only for
    * SetInventoryValidationContact.
    */
  var contactName: js.UndefOr[String] = js.native
  /**
    * The country code. Required only for RequestInventoryVerification.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The GMB account. Required only for RequestGmbAccess.
    */
  var gmbEmail: js.UndefOr[String] = js.native
  /**
    * The account Lia settings to update. Only defined if the method is update.
    */
  var liaSettings: js.UndefOr[Schema$LiaSettings] = js.native
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String] = js.native
  var method: js.UndefOr[String] = js.native
  /**
    * The ID of POS data provider. Required only for SetPosProvider.
    */
  var posDataProviderId: js.UndefOr[String] = js.native
  /**
    * The account ID by which this merchant is known to the POS provider.
    */
  var posExternalAccountId: js.UndefOr[String] = js.native
}

object Schema$LiasettingsCustomBatchRequestEntry {
  @scala.inline
  def apply(
    accountId: String = null,
    batchId: Int | Double = null,
    contactEmail: String = null,
    contactName: String = null,
    country: String = null,
    gmbEmail: String = null,
    liaSettings: Schema$LiaSettings = null,
    merchantId: String = null,
    method: String = null,
    posDataProviderId: String = null,
    posExternalAccountId: String = null
  ): Schema$LiasettingsCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (contactEmail != null) __obj.updateDynamic("contactEmail")(contactEmail.asInstanceOf[js.Any])
    if (contactName != null) __obj.updateDynamic("contactName")(contactName.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (gmbEmail != null) __obj.updateDynamic("gmbEmail")(gmbEmail.asInstanceOf[js.Any])
    if (liaSettings != null) __obj.updateDynamic("liaSettings")(liaSettings.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (posDataProviderId != null) __obj.updateDynamic("posDataProviderId")(posDataProviderId.asInstanceOf[js.Any])
    if (posExternalAccountId != null) __obj.updateDynamic("posExternalAccountId")(posExternalAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LiasettingsCustomBatchRequestEntry]
  }
}

