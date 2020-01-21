package typings.dialogflow.mod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a BatchDeleteIntentsRequest. */
trait IBatchDeleteIntentsRequest extends js.Object {
  /** BatchDeleteIntentsRequest intents */
  var intents: js.UndefOr[js.Array[IIntent] | Null] = js.undefined
  /** BatchDeleteIntentsRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object IBatchDeleteIntentsRequest {
  @scala.inline
  def apply(intents: js.Array[IIntent] = null, parent: String = null): IBatchDeleteIntentsRequest = {
    val __obj = js.Dynamic.literal()
    if (intents != null) __obj.updateDynamic("intents")(intents.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBatchDeleteIntentsRequest]
  }
}

