package typings.dialogflow.mod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a BatchUpdateIntentsResponse. */
trait IBatchUpdateIntentsResponse extends js.Object {
  /** BatchUpdateIntentsResponse intents */
  var intents: js.UndefOr[js.Array[IIntent] | Null] = js.undefined
}

object IBatchUpdateIntentsResponse {
  @scala.inline
  def apply(intents: js.UndefOr[Null | js.Array[IIntent]] = js.undefined): IBatchUpdateIntentsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(intents)) __obj.updateDynamic("intents")(intents.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBatchUpdateIntentsResponse]
  }
}

