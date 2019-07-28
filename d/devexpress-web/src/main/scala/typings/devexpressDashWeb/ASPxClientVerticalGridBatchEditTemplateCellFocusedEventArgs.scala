package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditTemplateCellFocused event.
  */
trait ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets a value specifying whether the event was handled.
    * Value: true if the event was handled and default processing should not occur; false if the event should be handled using default processing.
    */
  var handled: Boolean
  /**
    * Gets the currently processed row.
    * Value: A <see cref="ASPxClientVerticalGridRow" /> object that is the client-side row object.
    */
  var row: ASPxClientVerticalGridRow
}

object ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs {
  @scala.inline
  def apply(handled: Boolean, row: ASPxClientVerticalGridRow): ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled, row = row)
  
    __obj.asInstanceOf[ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs]
  }
}

