package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A batch entry encoding a single non-batch accounts request.
  */
@js.native
trait Schema$AccountsCustomBatchRequestEntry extends js.Object {
  /**
    * The account to create or update. Only defined if the method is insert or
    * update.
    */
  var account: js.UndefOr[Schema$Account] = js.native
  /**
    * The ID of the targeted account. Only defined if the method is not insert.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * An entry ID, unique within the batch request.
    */
  var batchId: js.UndefOr[Double] = js.native
  /**
    * Whether the account should be deleted if the account has offers. Only
    * applicable if the method is delete.
    */
  var force: js.UndefOr[Boolean] = js.native
  /**
    * Details about the link request.
    */
  var linkRequest: js.UndefOr[Schema$AccountsCustomBatchRequestEntryLinkRequest] = js.native
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String] = js.native
  /**
    * The method of the batch entry.
    */
  var method: js.UndefOr[String] = js.native
  /**
    * Only applicable if the method is claimwebsite. Indicates whether or not
    * to take the claim from another account in case there is a conflict.
    */
  var overwrite: js.UndefOr[Boolean] = js.native
}

object Schema$AccountsCustomBatchRequestEntry {
  @scala.inline
  def apply(
    account: Schema$Account = null,
    accountId: String = null,
    batchId: Int | Double = null,
    force: js.UndefOr[Boolean] = js.undefined,
    linkRequest: Schema$AccountsCustomBatchRequestEntryLinkRequest = null,
    merchantId: String = null,
    method: String = null,
    overwrite: js.UndefOr[Boolean] = js.undefined
  ): Schema$AccountsCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (linkRequest != null) __obj.updateDynamic("linkRequest")(linkRequest.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AccountsCustomBatchRequestEntry]
  }
}

