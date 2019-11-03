package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

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
  def apply(entityTypeNames: js.Array[String] = null, parent: String = null): IBatchDeleteEntityTypesRequest = {
    val __obj = js.Dynamic.literal()
    if (entityTypeNames != null) __obj.updateDynamic("entityTypeNames")(entityTypeNames)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[IBatchDeleteEntityTypesRequest]
  }
}

