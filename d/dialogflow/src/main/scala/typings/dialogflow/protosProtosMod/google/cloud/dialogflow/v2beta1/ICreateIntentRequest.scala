package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a CreateIntentRequest. */
trait ICreateIntentRequest extends js.Object {
  /** CreateIntentRequest intent */
  var intent: js.UndefOr[IIntent | Null] = js.undefined
  /** CreateIntentRequest intentView */
  var intentView: js.UndefOr[IntentView | Null] = js.undefined
  /** CreateIntentRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  /** CreateIntentRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object ICreateIntentRequest {
  @scala.inline
  def apply(
    intent: IIntent = null,
    intentView: IntentView = null,
    languageCode: String = null,
    parent: String = null
  ): ICreateIntentRequest = {
    val __obj = js.Dynamic.literal()
    if (intent != null) __obj.updateDynamic("intent")(intent)
    if (intentView != null) __obj.updateDynamic("intentView")(intentView)
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[ICreateIntentRequest]
  }
}

