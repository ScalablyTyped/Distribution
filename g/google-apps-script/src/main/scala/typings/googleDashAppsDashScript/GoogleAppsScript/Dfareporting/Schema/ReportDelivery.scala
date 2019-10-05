package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportDelivery extends js.Object {
  var emailOwner: js.UndefOr[Boolean] = js.undefined
  var emailOwnerDeliveryType: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var recipients: js.UndefOr[js.Array[Recipient]] = js.undefined
}

object ReportDelivery {
  @scala.inline
  def apply(
    emailOwner: js.UndefOr[Boolean] = js.undefined,
    emailOwnerDeliveryType: String = null,
    message: String = null,
    recipients: js.Array[Recipient] = null
  ): ReportDelivery = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(emailOwner)) __obj.updateDynamic("emailOwner")(emailOwner)
    if (emailOwnerDeliveryType != null) __obj.updateDynamic("emailOwnerDeliveryType")(emailOwnerDeliveryType)
    if (message != null) __obj.updateDynamic("message")(message)
    if (recipients != null) __obj.updateDynamic("recipients")(recipients)
    __obj.asInstanceOf[ReportDelivery]
  }
}

