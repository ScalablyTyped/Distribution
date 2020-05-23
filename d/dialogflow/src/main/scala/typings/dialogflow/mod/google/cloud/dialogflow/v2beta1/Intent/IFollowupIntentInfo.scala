package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a FollowupIntentInfo. */
trait IFollowupIntentInfo extends js.Object {
  /** FollowupIntentInfo followupIntentName */
  var followupIntentName: js.UndefOr[String | Null] = js.undefined
  /** FollowupIntentInfo parentFollowupIntentName */
  var parentFollowupIntentName: js.UndefOr[String | Null] = js.undefined
}

object IFollowupIntentInfo {
  @scala.inline
  def apply(
    followupIntentName: js.UndefOr[Null | String] = js.undefined,
    parentFollowupIntentName: js.UndefOr[Null | String] = js.undefined
  ): IFollowupIntentInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(followupIntentName)) __obj.updateDynamic("followupIntentName")(followupIntentName.asInstanceOf[js.Any])
    if (!js.isUndefined(parentFollowupIntentName)) __obj.updateDynamic("parentFollowupIntentName")(parentFollowupIntentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFollowupIntentInfo]
  }
}

