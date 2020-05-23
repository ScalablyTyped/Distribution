package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

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
    IntentView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.IntentView * / any */ String) | Null
  ] = js.undefined
  /** UpdateIntentRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  /** UpdateIntentRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.undefined
}

object IUpdateIntentRequest {
  @scala.inline
  def apply(
    intent: js.UndefOr[Null | IIntent] = js.undefined,
    intentView: js.UndefOr[
      Null | IntentView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.IntentView * / any */ String)
    ] = js.undefined,
    languageCode: js.UndefOr[Null | String] = js.undefined,
    updateMask: js.UndefOr[Null | IFieldMask] = js.undefined
  ): IUpdateIntentRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(intent)) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (!js.isUndefined(intentView)) __obj.updateDynamic("intentView")(intentView.asInstanceOf[js.Any])
    if (!js.isUndefined(languageCode)) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (!js.isUndefined(updateMask)) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUpdateIntentRequest]
  }
}

