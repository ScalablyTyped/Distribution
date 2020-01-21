package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCardView.BatchEditTemplateCellFocused event.
  */
@JSGlobal("ASPxClientCardViewBatchEditTemplateCellFocusedEventArgs")
@js.native
class ASPxClientCardViewBatchEditTemplateCellFocusedEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCardViewBatchEditTemplateCellFocusedEventArgs class with the specified column.
    * @param column An ASPxClientCardViewColumn object that is the processed CardView column. This value is assigned to the ASPxClientCardViewBatchEditTemplateCellFocusedEventArgs.column property.
    */
  def this(column: ASPxClientCardViewColumn) = this()
  /**
    * Gets the currently processed column.
    */
  var column: ASPxClientCardViewColumn = js.native
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  var handled: Boolean = js.native
}

