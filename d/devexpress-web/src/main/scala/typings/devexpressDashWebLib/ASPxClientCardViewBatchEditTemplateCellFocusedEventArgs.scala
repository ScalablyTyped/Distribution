package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditTemplateCellFocused event.
  */
trait ASPxClientCardViewBatchEditTemplateCellFocusedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the currently processed column.
    * Value: An <see cref="ASPxClientCardViewColumn" /> object that is the client-side column object.
    */
  var column: ASPxClientCardViewColumn
  /**
    * Gets or sets a value specifying whether the event was handled.
    * Value: true if the event was handled and default processing should not occur; false if the event should be handled using default processing.
    */
  var handled: scala.Boolean
}

object ASPxClientCardViewBatchEditTemplateCellFocusedEventArgs {
  @scala.inline
  def apply(column: ASPxClientCardViewColumn, handled: scala.Boolean): ASPxClientCardViewBatchEditTemplateCellFocusedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("handled")(handled)
    __obj.asInstanceOf[ASPxClientCardViewBatchEditTemplateCellFocusedEventArgs]
  }
}

