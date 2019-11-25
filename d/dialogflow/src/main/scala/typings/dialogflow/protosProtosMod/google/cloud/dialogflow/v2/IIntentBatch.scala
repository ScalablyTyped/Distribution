package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an IntentBatch. */
trait IIntentBatch extends js.Object {
  /** IntentBatch intents */
  var intents: js.UndefOr[js.Array[IIntent] | Null] = js.undefined
}

object IIntentBatch {
  @scala.inline
  def apply(intents: js.Array[IIntent] = null): IIntentBatch = {
    val __obj = js.Dynamic.literal()
    if (intents != null) __obj.updateDynamic("intents")(intents.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIntentBatch]
  }
}

