package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveActivityNs.SchemaNs

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
    pageSize: Int | Double = null,
    pageToken: String = null
  ): QueryDriveActivityRequest = {
    val __obj = js.Dynamic.literal()
    if (ancestorName != null) __obj.updateDynamic("ancestorName")(ancestorName)
    if (consolidationStrategy != null) __obj.updateDynamic("consolidationStrategy")(consolidationStrategy)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (itemName != null) __obj.updateDynamic("itemName")(itemName)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    __obj.asInstanceOf[QueryDriveActivityRequest]
  }
}

