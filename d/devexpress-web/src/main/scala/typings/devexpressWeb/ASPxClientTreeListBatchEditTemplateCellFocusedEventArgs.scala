package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.BatchEditTemplateCellFocused event.
  */
trait ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the currently processed column.
    */
  var column: ASPxClientTreeListColumn
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  var handled: Boolean
}

object ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs {
  @scala.inline
  def apply(column: ASPxClientTreeListColumn, handled: Boolean): ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs]
  }
}

