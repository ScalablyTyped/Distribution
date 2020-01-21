package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmergeTableCellsRequest extends js.Object {
  var objectId: js.UndefOr[String] = js.undefined
  var tableRange: js.UndefOr[TableRange] = js.undefined
}

object UnmergeTableCellsRequest {
  @scala.inline
  def apply(objectId: String = null, tableRange: TableRange = null): UnmergeTableCellsRequest = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (tableRange != null) __obj.updateDynamic("tableRange")(tableRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmergeTableCellsRequest]
  }
}

