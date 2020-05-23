package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information on a cell that is being edited.
  */
trait ASPxClientVerticalGridCellInfo extends js.Object {
  /**
    * Gets the visible index of the record that contains the cell currently being processed.
    */
  var recordVisibleIndex: Double
  /**
    * Gets the row that contains the cell currently being processed.
    */
  var row: ASPxClientVerticalGridRow
}

object ASPxClientVerticalGridCellInfo {
  @scala.inline
  def apply(recordVisibleIndex: Double, row: ASPxClientVerticalGridRow): ASPxClientVerticalGridCellInfo = {
    val __obj = js.Dynamic.literal(recordVisibleIndex = recordVisibleIndex.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridCellInfo]
  }
}

