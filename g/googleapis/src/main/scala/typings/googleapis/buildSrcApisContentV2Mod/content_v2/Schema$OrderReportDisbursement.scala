package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Order disbursement. All methods require the payment analyst role.
  */
@js.native
trait Schema$OrderReportDisbursement extends js.Object {
  /**
    * The disbursement amount.
    */
  var disbursementAmount: js.UndefOr[Schema$Price] = js.native
  /**
    * The disbursement date, in ISO 8601 format.
    */
  var disbursementCreationDate: js.UndefOr[String] = js.native
  /**
    * The date the disbursement was initiated, in ISO 8601 format.
    */
  var disbursementDate: js.UndefOr[String] = js.native
  /**
    * The ID of the disbursement.
    */
  var disbursementId: js.UndefOr[String] = js.native
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String] = js.native
}

object Schema$OrderReportDisbursement {
  @scala.inline
  def apply(
    disbursementAmount: Schema$Price = null,
    disbursementCreationDate: String = null,
    disbursementDate: String = null,
    disbursementId: String = null,
    merchantId: String = null
  ): Schema$OrderReportDisbursement = {
    val __obj = js.Dynamic.literal()
    if (disbursementAmount != null) __obj.updateDynamic("disbursementAmount")(disbursementAmount.asInstanceOf[js.Any])
    if (disbursementCreationDate != null) __obj.updateDynamic("disbursementCreationDate")(disbursementCreationDate.asInstanceOf[js.Any])
    if (disbursementDate != null) __obj.updateDynamic("disbursementDate")(disbursementDate.asInstanceOf[js.Any])
    if (disbursementId != null) __obj.updateDynamic("disbursementId")(disbursementId.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrderReportDisbursement]
  }
}

