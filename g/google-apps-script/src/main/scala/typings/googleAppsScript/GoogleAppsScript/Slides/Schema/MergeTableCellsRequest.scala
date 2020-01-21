package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeTableCellsRequest extends js.Object {
  var objectId: js.UndefOr[String] = js.undefined
  var tableRange: js.UndefOr[TableRange] = js.undefined
}

object MergeTableCellsRequest {
  @scala.inline
  def apply(objectId: String = null, tableRange: TableRange = null): MergeTableCellsRequest = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (tableRange != null) __obj.updateDynamic("tableRange")(tableRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeTableCellsRequest]
  }
}

