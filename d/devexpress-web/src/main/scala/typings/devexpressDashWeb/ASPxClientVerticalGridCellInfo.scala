package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information on a cell that is being edited.
  */
trait ASPxClientVerticalGridCellInfo extends js.Object {
  /**
    * Gets the visible index of the record that contains the cell currently being processed.
    * Value: An <see cref="Int32" /> value that specifies the visible index of the record.
    */
  var recordVisibleIndex: Double
  /**
    * Gets the row that contains the cell currently being processed.
    * Value: An <see cref="ASPxClientVerticalGridRow" /> object that is the row which contains the processed cell.
    */
  var row: ASPxClientVerticalGridRow
}

object ASPxClientVerticalGridCellInfo {
  @scala.inline
  def apply(recordVisibleIndex: Double, row: ASPxClientVerticalGridRow): ASPxClientVerticalGridCellInfo = {
    val __obj = js.Dynamic.literal(recordVisibleIndex = recordVisibleIndex, row = row)
  
    __obj.asInstanceOf[ASPxClientVerticalGridCellInfo]
  }
}

