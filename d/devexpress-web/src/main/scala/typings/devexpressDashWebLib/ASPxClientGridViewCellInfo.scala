package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information on a grid cell.
  */
trait ASPxClientGridViewCellInfo extends js.Object {
  /**
    * Gets the data column that contains the cell currently being processed.
    * Value: An <see cref="ASPxClientGridViewColumn" /> object that is the data column which contains the processed cell.
    */
  var column: ASPxClientGridViewColumn
  /**
    * Gets the visible index of the row that contains the cell currently being processed.
    * Value: An <see cref="Int32" /> value that specifies the visible index of the row.
    */
  var rowVisibleIndex: scala.Double
}

