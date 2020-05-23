package typings.dialogflow.mod.google.cloud.dialogflow.v2

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
  def apply(intents: js.UndefOr[Null | js.Array[IIntent]] = js.undefined): IIntentBatch = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(intents)) __obj.updateDynamic("intents")(intents.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIntentBatch]
  }
}

