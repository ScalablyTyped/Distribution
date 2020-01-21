package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.BatchEditTemplateCellFocused event.
  */
@JSGlobal("ASPxClientGridViewBatchEditTemplateCellFocusedEventArgs")
@js.native
class ASPxClientGridViewBatchEditTemplateCellFocusedEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewBatchEditTemplateCellFocusedEventArgs class with the specified column.
    * @param column An ASPxClientGridViewColumn object that is the processed grid column. This value is assigned to the ASPxClientGridViewBatchEditTemplateCellFocusedEventArgs.column property.
    */
  def this(column: ASPxClientGridViewColumn) = this()
  /**
    * Gets the currently processed column.
    */
  var column: ASPxClientGridViewColumn = js.native
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  var handled: Boolean = js.native
}

