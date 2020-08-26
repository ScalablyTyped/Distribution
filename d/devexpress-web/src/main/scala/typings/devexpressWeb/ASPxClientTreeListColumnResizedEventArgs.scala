package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.ColumnResized event.
  */
@js.native
trait ASPxClientTreeListColumnResizedEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the processed client column.
    */
  var column: ASPxClientTreeListColumn = js.native
}

object ASPxClientTreeListColumnResizedEventArgs {
  @scala.inline
  def apply(column: ASPxClientTreeListColumn, processOnServer: Boolean): ASPxClientTreeListColumnResizedEventArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListColumnResizedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientTreeListColumnResizedEventArgsOps[Self <: ASPxClientTreeListColumnResizedEventArgs] (val x: Self) extends AnyVal {
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
  }
  
}

