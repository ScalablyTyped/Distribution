package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a TelephonyTransferCall. */
trait ITelephonyTransferCall extends js.Object {
  /** TelephonyTransferCall phoneNumber */
  var phoneNumber: js.UndefOr[String | Null] = js.undefined
}

object ITelephonyTransferCall {
  @scala.inline
  def apply(phoneNumber: String = null): ITelephonyTransferCall = {
    val __obj = js.Dynamic.literal()
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITelephonyTransferCall]
  }
}

