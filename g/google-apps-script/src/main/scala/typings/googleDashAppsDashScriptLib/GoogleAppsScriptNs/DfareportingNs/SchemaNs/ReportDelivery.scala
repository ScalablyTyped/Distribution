package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportDelivery extends js.Object {
  var emailOwner: js.UndefOr[scala.Boolean] = js.undefined
  var emailOwnerDeliveryType: js.UndefOr[java.lang.String] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var recipients: js.UndefOr[js.Array[Recipient]] = js.undefined
}

object ReportDelivery {
  @scala.inline
  def apply(
    emailOwner: js.UndefOr[scala.Boolean] = js.undefined,
    emailOwnerDeliveryType: java.lang.String = null,
    message: java.lang.String = null,
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

