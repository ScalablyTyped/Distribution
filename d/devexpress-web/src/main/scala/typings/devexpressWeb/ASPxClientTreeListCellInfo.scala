package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information on a tree list cell.
  */
trait ASPxClientTreeListCellInfo extends js.Object {
  /**
    * Gets the data column that contains the cell currently being processed.
    */
  var column: ASPxClientTreeListColumn
  /**
    * Gets the processed node's key value.
    */
  var nodeKey: String
}

object ASPxClientTreeListCellInfo {
  @scala.inline
  def apply(column: ASPxClientTreeListColumn, nodeKey: String): ASPxClientTreeListCellInfo = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListCellInfo]
  }
}

