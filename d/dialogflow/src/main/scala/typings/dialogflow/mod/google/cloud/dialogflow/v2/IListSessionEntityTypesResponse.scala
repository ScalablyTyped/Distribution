package typings.dialogflow.mod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListSessionEntityTypesResponse. */
trait IListSessionEntityTypesResponse extends js.Object {
  /** ListSessionEntityTypesResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  /** ListSessionEntityTypesResponse sessionEntityTypes */
  var sessionEntityTypes: js.UndefOr[js.Array[ISessionEntityType] | Null] = js.undefined
}

object IListSessionEntityTypesResponse {
  @scala.inline
  def apply(
    nextPageToken: js.UndefOr[Null | String] = js.undefined,
    sessionEntityTypes: js.UndefOr[Null | js.Array[ISessionEntityType]] = js.undefined
  ): IListSessionEntityTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(nextPageToken)) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(sessionEntityTypes)) __obj.updateDynamic("sessionEntityTypes")(sessionEntityTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListSessionEntityTypesResponse]
  }
}

