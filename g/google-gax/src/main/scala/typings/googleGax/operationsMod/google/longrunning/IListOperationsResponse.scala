package typings.googleGax.operationsMod.google.longrunning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListOperationsResponse. */
trait IListOperationsResponse extends js.Object {
  /** ListOperationsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  /** ListOperationsResponse operations */
  var operations: js.UndefOr[js.Array[IOperation] | Null] = js.undefined
}

object IListOperationsResponse {
  @scala.inline
  def apply(
    nextPageToken: js.UndefOr[Null | String] = js.undefined,
    operations: js.UndefOr[Null | js.Array[IOperation]] = js.undefined
  ): IListOperationsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(nextPageToken)) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(operations)) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListOperationsResponse]
  }
}

