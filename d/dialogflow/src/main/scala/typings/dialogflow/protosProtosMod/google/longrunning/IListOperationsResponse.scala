package typings.dialogflow.protosProtosMod.google.longrunning

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
  def apply(nextPageToken: String = null, operations: js.Array[IOperation] = null): IListOperationsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListOperationsResponse]
  }
}

