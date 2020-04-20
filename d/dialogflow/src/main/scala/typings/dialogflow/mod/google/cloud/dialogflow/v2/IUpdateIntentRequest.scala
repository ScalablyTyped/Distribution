package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.dialogflow.mod.google.protobuf.IFieldMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an UpdateIntentRequest. */
trait IUpdateIntentRequest extends js.Object {
  /** UpdateIntentRequest intent */
  var intent: js.UndefOr[IIntent | Null] = js.undefined
  /** UpdateIntentRequest intentView */
  var intentView: js.UndefOr[
    IntentView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.IntentView * / any */ String) | Null
  ] = js.undefined
  /** UpdateIntentRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  /** UpdateIntentRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.undefined
}

object IUpdateIntentRequest {
  @scala.inline
  def apply(
    intent: IIntent = null,
    intentView: IntentView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.IntentView * / any */ String) = null,
    languageCode: String = null,
    updateMask: IFieldMask = null
  ): IUpdateIntentRequest = {
    val __obj = js.Dynamic.literal()
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (intentView != null) __obj.updateDynamic("intentView")(intentView.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUpdateIntentRequest]
  }
}

