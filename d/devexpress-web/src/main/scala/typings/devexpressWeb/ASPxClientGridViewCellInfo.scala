package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information on a grid cell.
  */
@js.native
trait ASPxClientGridViewCellInfo extends js.Object {
  /**
    * Gets the data column that contains the cell currently being processed.
    */
  var column: ASPxClientGridViewColumn = js.native
  /**
    * Gets the row's key.
    */
  var key: js.Any = js.native
  /**
    * Gets the visible index of the row that contains the cell currently being processed.
    */
  var rowVisibleIndex: Double = js.native
}

object ASPxClientGridViewCellInfo {
  @scala.inline
  def apply(column: ASPxClientGridViewColumn, key: js.Any, rowVisibleIndex: Double): ASPxClientGridViewCellInfo = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowVisibleIndex = rowVisibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewCellInfo]
  }
  @scala.inline
  implicit class ASPxClientGridViewCellInfoOps[Self <: ASPxClientGridViewCellInfo] (val x: Self) extends AnyVal {
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
    def setColumn(value: ASPxClientGridViewColumn): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: js.Any): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowVisibleIndex(value: Double): Self = this.set("rowVisibleIndex", value.asInstanceOf[js.Any])
  }
  
}

