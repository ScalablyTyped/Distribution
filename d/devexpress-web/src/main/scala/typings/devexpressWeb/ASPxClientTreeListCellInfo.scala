package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information on a tree list cell.
  */
@js.native
trait ASPxClientTreeListCellInfo extends js.Object {
  /**
    * Gets the data column that contains the cell currently being processed.
    */
  var column: ASPxClientTreeListColumn = js.native
  /**
    * Gets the processed node's key value.
    */
  var nodeKey: String = js.native
}

object ASPxClientTreeListCellInfo {
  @scala.inline
  def apply(column: ASPxClientTreeListColumn, nodeKey: String): ASPxClientTreeListCellInfo = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListCellInfo]
  }
  @scala.inline
  implicit class ASPxClientTreeListCellInfoOps[Self <: ASPxClientTreeListCellInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColumn(value: ASPxClientTreeListColumn): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeKey(value: String): Self = this.set("nodeKey", value.asInstanceOf[js.Any])
  }
  
}

