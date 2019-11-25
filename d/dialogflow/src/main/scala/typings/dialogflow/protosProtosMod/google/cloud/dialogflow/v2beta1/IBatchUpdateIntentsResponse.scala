package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

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
  def apply(intents: js.Array[IIntent] = null): IBatchUpdateIntentsResponse = {
    val __obj = js.Dynamic.literal()
    if (intents != null) __obj.updateDynamic("intents")(intents.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBatchUpdateIntentsResponse]
  }
}

