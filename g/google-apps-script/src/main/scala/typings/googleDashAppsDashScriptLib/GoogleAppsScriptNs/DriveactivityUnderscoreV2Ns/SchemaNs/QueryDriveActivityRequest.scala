package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveactivityUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryDriveActivityRequest extends js.Object {
  var ancestorName: js.UndefOr[java.lang.String] = js.undefined
  var consolidationStrategy: js.UndefOr[ConsolidationStrategy] = js.undefined
  var filter: js.UndefOr[java.lang.String] = js.undefined
  var itemName: js.UndefOr[java.lang.String] = js.undefined
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
}

object QueryDriveActivityRequest {
  @scala.inline
  def apply(
    ancestorName: java.lang.String = null,
    consolidationStrategy: ConsolidationStrategy = null,
    filter: java.lang.String = null,
    itemName: java.lang.String = null,
    pageSize: scala.Int | scala.Double = null,
    pageToken: java.lang.String = null
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

