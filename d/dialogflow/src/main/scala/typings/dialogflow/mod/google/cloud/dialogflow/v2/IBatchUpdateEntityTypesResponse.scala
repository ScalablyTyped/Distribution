package typings.dialogflow.mod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a BatchUpdateEntityTypesResponse. */
trait IBatchUpdateEntityTypesResponse extends js.Object {
  /** BatchUpdateEntityTypesResponse entityTypes */
  var entityTypes: js.UndefOr[js.Array[IEntityType] | Null] = js.undefined
}

object IBatchUpdateEntityTypesResponse {
  @scala.inline
  def apply(entityTypes: js.UndefOr[Null | js.Array[IEntityType]] = js.undefined): IBatchUpdateEntityTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(entityTypes)) __obj.updateDynamic("entityTypes")(entityTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBatchUpdateEntityTypesResponse]
  }
}

