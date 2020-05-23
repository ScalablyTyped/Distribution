package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCardView.BatchEditTemplateCellFocused event.
  */
trait ASPxClientCardViewBatchEditTemplateCellFocusedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the currently processed column.
    */
  var column: ASPxClientCardViewColumn
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  var handled: Boolean
}

object ASPxClientCardViewBatchEditTemplateCellFocusedEventArgs {
  @scala.inline
  def apply(column: ASPxClientCardViewColumn, handled: Boolean): ASPxClientCardViewBatchEditTemplateCellFocusedEventArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewBatchEditTemplateCellFocusedEventArgs]
  }
}

