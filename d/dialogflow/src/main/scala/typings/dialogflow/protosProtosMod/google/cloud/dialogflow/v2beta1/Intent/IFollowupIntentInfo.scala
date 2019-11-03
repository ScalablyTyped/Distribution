package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent

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
    if (followupIntentName != null) __obj.updateDynamic("followupIntentName")(followupIntentName)
    if (parentFollowupIntentName != null) __obj.updateDynamic("parentFollowupIntentName")(parentFollowupIntentName)
    __obj.asInstanceOf[IFollowupIntentInfo]
  }
}

