package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditTemplateCellFocused event.
  */
trait ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the currently processed column.
    * Value: A <see cref="ASPxClientTreeListColumn" /> object that is the client-side column object.
    */
  var column: ASPxClientTreeListColumn
  /**
    * Gets or sets a value specifying whether the event was handled.
    * Value: true if the event was handled and default processing should not occur; false if the event should be handled using default processing.
    */
  var handled: scala.Boolean
}

object ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs {
  @scala.inline
  def apply(column: ASPxClientTreeListColumn, handled: scala.Boolean): ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs = {
    val __obj = js.Dynamic.literal(column = column, handled = handled)
  
    __obj.asInstanceOf[ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs]
  }
}

