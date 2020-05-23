package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information on a grid cell.
  */
trait ASPxClientGridViewCellInfo extends js.Object {
  /**
    * Gets the data column that contains the cell currently being processed.
    */
  var column: ASPxClientGridViewColumn
  /**
    * Gets the row's key.
    */
  var key: js.Any
  /**
    * Gets the visible index of the row that contains the cell currently being processed.
    */
  var rowVisibleIndex: Double
}

object ASPxClientGridViewCellInfo {
  @scala.inline
  def apply(column: ASPxClientGridViewColumn, key: js.Any, rowVisibleIndex: Double): ASPxClientGridViewCellInfo = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowVisibleIndex = rowVisibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewCellInfo]
  }
}

