package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a BatchDeleteEntityTypesRequest. */
trait IBatchDeleteEntityTypesRequest extends js.Object {
  /** BatchDeleteEntityTypesRequest entityTypeNames */
  var entityTypeNames: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** BatchDeleteEntityTypesRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object IBatchDeleteEntityTypesRequest {
  @scala.inline
  def apply(
    entityTypeNames: js.UndefOr[Null | js.Array[String]] = js.undefined,
    parent: js.UndefOr[Null | String] = js.undefined
  ): IBatchDeleteEntityTypesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(entityTypeNames)) __obj.updateDynamic("entityTypeNames")(entityTypeNames.asInstanceOf[js.Any])
    if (!js.isUndefined(parent)) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBatchDeleteEntityTypesRequest]
  }
}

