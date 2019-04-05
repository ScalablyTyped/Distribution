package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmergeTableCellsRequest extends js.Object {
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  var tableRange: js.UndefOr[TableRange] = js.undefined
}

object UnmergeTableCellsRequest {
  @scala.inline
  def apply(objectId: java.lang.String = null, tableRange: TableRange = null): UnmergeTableCellsRequest = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (tableRange != null) __obj.updateDynamic("tableRange")(tableRange)
    __obj.asInstanceOf[UnmergeTableCellsRequest]
  }
}

