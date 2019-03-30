package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeTableCellsRequest extends js.Object {
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  var tableRange: js.UndefOr[TableRange] = js.undefined
}

object MergeTableCellsRequest {
  @scala.inline
  def apply(objectId: java.lang.String = null, tableRange: TableRange = null): MergeTableCellsRequest = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (tableRange != null) __obj.updateDynamic("tableRange")(tableRange)
    __obj.asInstanceOf[MergeTableCellsRequest]
  }
}

