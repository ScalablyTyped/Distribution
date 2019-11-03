package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import typings.dialogflow.protosProtosMod.google.protobuf.IFieldMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an UpdateIntentRequest. */
trait IUpdateIntentRequest extends js.Object {
  /** UpdateIntentRequest intent */
  var intent: js.UndefOr[IIntent | Null] = js.undefined
  /** UpdateIntentRequest intentView */
  var intentView: js.UndefOr[IntentView | Null] = js.undefined
  /** UpdateIntentRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  /** UpdateIntentRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.undefined
}

object IUpdateIntentRequest {
  @scala.inline
  def apply(
    intent: IIntent = null,
    intentView: IntentView = null,
    languageCode: String = null,
    updateMask: IFieldMask = null
  ): IUpdateIntentRequest = {
    val __obj = js.Dynamic.literal()
    if (intent != null) __obj.updateDynamic("intent")(intent)
    if (intentView != null) __obj.updateDynamic("intentView")(intentView)
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask)
    __obj.asInstanceOf[IUpdateIntentRequest]
  }
}

