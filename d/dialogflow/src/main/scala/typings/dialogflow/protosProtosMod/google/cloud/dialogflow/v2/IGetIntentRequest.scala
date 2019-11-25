package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a GetIntentRequest. */
trait IGetIntentRequest extends js.Object {
  /** GetIntentRequest intentView */
  var intentView: js.UndefOr[IntentView | Null] = js.undefined
  /** GetIntentRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  /** GetIntentRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object IGetIntentRequest {
  @scala.inline
  def apply(intentView: IntentView = null, languageCode: String = null, name: String = null): IGetIntentRequest = {
    val __obj = js.Dynamic.literal()
    if (intentView != null) __obj.updateDynamic("intentView")(intentView.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetIntentRequest]
  }
}

