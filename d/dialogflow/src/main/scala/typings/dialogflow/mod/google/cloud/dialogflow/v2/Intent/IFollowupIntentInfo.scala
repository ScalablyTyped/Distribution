package typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent

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
  def apply(followupIntentName: String = null, parentFollowupIntentName: String = null): IFollowupIntentInfo = {
    val __obj = js.Dynamic.literal()
    if (followupIntentName != null) __obj.updateDynamic("followupIntentName")(followupIntentName.asInstanceOf[js.Any])
    if (parentFollowupIntentName != null) __obj.updateDynamic("parentFollowupIntentName")(parentFollowupIntentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFollowupIntentInfo]
  }
}

