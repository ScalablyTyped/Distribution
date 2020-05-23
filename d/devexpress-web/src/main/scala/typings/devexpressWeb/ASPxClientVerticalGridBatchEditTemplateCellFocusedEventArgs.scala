package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditTemplateCellFocused event.
  */
trait ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  var handled: Boolean
  /**
    * Gets the currently processed row.
    */
  var row: ASPxClientVerticalGridRow
}

object ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs {
  @scala.inline
  def apply(handled: Boolean, row: ASPxClientVerticalGridRow): ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs]
  }
}

