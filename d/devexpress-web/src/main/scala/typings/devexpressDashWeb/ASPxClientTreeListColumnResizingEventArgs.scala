package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ColumnResizing event.
  */
trait ASPxClientTreeListColumnResizingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the processed client column.
    * Value: An <see cref="ASPxClientTreeListColumn" /> object that is the processed column.
    */
  var column: ASPxClientTreeListColumn
}

object ASPxClientTreeListColumnResizingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, column: ASPxClientTreeListColumn): ASPxClientTreeListColumnResizingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, column = column)
  
    __obj.asInstanceOf[ASPxClientTreeListColumnResizingEventArgs]
  }
}

