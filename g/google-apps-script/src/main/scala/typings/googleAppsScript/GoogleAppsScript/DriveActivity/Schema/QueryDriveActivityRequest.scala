package typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryDriveActivityRequest extends js.Object {
  var ancestorName: js.UndefOr[String] = js.undefined
  var consolidationStrategy: js.UndefOr[ConsolidationStrategy] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var itemName: js.UndefOr[String] = js.undefined
  var pageSize: js.UndefOr[Double] = js.undefined
  var pageToken: js.UndefOr[String] = js.undefined
}

object QueryDriveActivityRequest {
  @scala.inline
  def apply(
    ancestorName: String = null,
    consolidationStrategy: ConsolidationStrategy = null,
    filter: String = null,
    itemName: String = null,
    pageSize: js.UndefOr[Double] = js.undefined,
    pageToken: String = null
  ): QueryDriveActivityRequest = {
    val __obj = js.Dynamic.literal()
    if (ancestorName != null) __obj.updateDynamic("ancestorName")(ancestorName.asInstanceOf[js.Any])
    if (consolidationStrategy != null) __obj.updateDynamic("consolidationStrategy")(consolidationStrategy.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (itemName != null) __obj.updateDynamic("itemName")(itemName.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDriveActivityRequest]
  }
}

