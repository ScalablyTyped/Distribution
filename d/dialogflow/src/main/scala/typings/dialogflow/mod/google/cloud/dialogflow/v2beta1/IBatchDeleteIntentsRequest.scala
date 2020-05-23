package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

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
  def apply(
    intents: js.UndefOr[Null | js.Array[IIntent]] = js.undefined,
    parent: js.UndefOr[Null | String] = js.undefined
  ): IBatchDeleteIntentsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(intents)) __obj.updateDynamic("intents")(intents.asInstanceOf[js.Any])
    if (!js.isUndefined(parent)) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBatchDeleteIntentsRequest]
  }
}

