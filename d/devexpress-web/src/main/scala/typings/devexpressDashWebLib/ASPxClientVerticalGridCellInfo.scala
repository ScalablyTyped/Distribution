package typings
package devexpressDashWebLib

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
  var recordVisibleIndex: scala.Double
  /**
    * Gets the row that contains the cell currently being processed.
    * Value: An <see cref="ASPxClientVerticalGridRow" /> object that is the row which contains the processed cell.
    */
  var row: ASPxClientVerticalGridRow
}

