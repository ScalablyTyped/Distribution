package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.BatchEditTemplateCellFocused event.
  */
trait ASPxClientGridViewBatchEditTemplateCellFocusedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the currently processed column.
    */
  var column: ASPxClientGridViewColumn
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  var handled: Boolean
}

object ASPxClientGridViewBatchEditTemplateCellFocusedEventArgs {
  @scala.inline
  def apply(column: ASPxClientGridViewColumn, handled: Boolean): ASPxClientGridViewBatchEditTemplateCellFocusedEventArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewBatchEditTemplateCellFocusedEventArgs]
  }
}

