package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.ColumnResizing event.
  */
trait ASPxClientTreeListColumnResizingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the processed client column.
    */
  var column: ASPxClientTreeListColumn
}

object ASPxClientTreeListColumnResizingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, column: ASPxClientTreeListColumn): ASPxClientTreeListColumnResizingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListColumnResizingEventArgs]
  }
}

