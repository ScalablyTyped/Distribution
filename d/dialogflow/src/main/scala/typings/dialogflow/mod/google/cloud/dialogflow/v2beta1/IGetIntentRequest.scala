package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a GetIntentRequest. */
trait IGetIntentRequest extends js.Object {
  /** GetIntentRequest intentView */
  var intentView: js.UndefOr[
    IntentView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.IntentView * / any */ String) | Null
  ] = js.undefined
  /** GetIntentRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  /** GetIntentRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object IGetIntentRequest {
  @scala.inline
  def apply(
    intentView: js.UndefOr[
      Null | IntentView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.IntentView * / any */ String)
    ] = js.undefined,
    languageCode: js.UndefOr[Null | String] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined
  ): IGetIntentRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(intentView)) __obj.updateDynamic("intentView")(intentView.asInstanceOf[js.Any])
    if (!js.isUndefined(languageCode)) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetIntentRequest]
  }
}

