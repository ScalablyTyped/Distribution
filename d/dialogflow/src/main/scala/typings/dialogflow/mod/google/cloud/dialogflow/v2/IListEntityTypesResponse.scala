package typings.dialogflow.mod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListEntityTypesResponse. */
trait IListEntityTypesResponse extends js.Object {
  /** ListEntityTypesResponse entityTypes */
  var entityTypes: js.UndefOr[js.Array[IEntityType] | Null] = js.undefined
  /** ListEntityTypesResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}

object IListEntityTypesResponse {
  @scala.inline
  def apply(
    entityTypes: js.UndefOr[Null | js.Array[IEntityType]] = js.undefined,
    nextPageToken: js.UndefOr[Null | String] = js.undefined
  ): IListEntityTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(entityTypes)) __obj.updateDynamic("entityTypes")(entityTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(nextPageToken)) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListEntityTypesResponse]
  }
}

