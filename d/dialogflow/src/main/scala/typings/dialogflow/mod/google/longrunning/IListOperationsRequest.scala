package typings.dialogflow.mod.google.longrunning

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
    filter: js.UndefOr[Null | String] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined,
    pageSize: js.UndefOr[Null | Double] = js.undefined,
    pageToken: js.UndefOr[Null | String] = js.undefined
  ): IListOperationsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(pageToken)) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListOperationsRequest]
  }
}

