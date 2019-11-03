package typings.dialogflow.protosProtosMod.google.longrunning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListOperationsRequest. */
trait IListOperationsRequest extends js.Object {
  /** ListOperationsRequest filter */
  var filter: js.UndefOr[String | Null] = js.undefined
  /** ListOperationsRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** ListOperationsRequest pageSize */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  /** ListOperationsRequest pageToken */
  var pageToken: js.UndefOr[String | Null] = js.undefined
}

object IListOperationsRequest {
  @scala.inline
  def apply(
    filter: String = null,
    name: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null
  ): IListOperationsRequest = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (name != null) __obj.updateDynamic("name")(name)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    __obj.asInstanceOf[IListOperationsRequest]
  }
}

