package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountstatusesCustomBatchResponseEntry extends js.Object {
  var accountStatus: js.UndefOr[AccountStatus] = js.undefined
  var batchId: js.UndefOr[Double] = js.undefined
  var errors: js.UndefOr[Errors] = js.undefined
}

object AccountstatusesCustomBatchResponseEntry {
  @scala.inline
  def apply(
    accountStatus: AccountStatus = null,
    batchId: js.UndefOr[Double] = js.undefined,
    errors: Errors = null
  ): AccountstatusesCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (accountStatus != null) __obj.updateDynamic("accountStatus")(accountStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(batchId)) __obj.updateDynamic("batchId")(batchId.get.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountstatusesCustomBatchResponseEntry]
  }
}

