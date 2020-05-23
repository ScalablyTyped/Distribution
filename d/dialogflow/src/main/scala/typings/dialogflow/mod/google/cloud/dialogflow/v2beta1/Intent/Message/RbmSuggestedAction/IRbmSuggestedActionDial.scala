package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a RbmSuggestedActionDial. */
trait IRbmSuggestedActionDial extends js.Object {
  /** RbmSuggestedActionDial phoneNumber */
  var phoneNumber: js.UndefOr[String | Null] = js.undefined
}

object IRbmSuggestedActionDial {
  @scala.inline
  def apply(phoneNumber: js.UndefOr[Null | String] = js.undefined): IRbmSuggestedActionDial = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(phoneNumber)) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRbmSuggestedActionDial]
  }
}

