package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditTemplateCellFocused event.
  */
@JSGlobal("ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs")
@js.native
class ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs class with the specified row.
    * @param row An ASPxClientVerticalGridRow object that is the processed grid row. This value is assigned to the ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs.row property.
    */
  def this(row: ASPxClientVerticalGridRow) = this()
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  var handled: Boolean = js.native
  /**
    * Gets the currently processed row.
    */
  var row: ASPxClientVerticalGridRow = js.native
}

