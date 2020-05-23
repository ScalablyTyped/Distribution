package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditTemplateCellFocused event.
  */
@JSGlobal("ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs")
@js.native
class ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs class with the specified row.
    * @param row An ASPxClientVerticalGridRow object that is the processed grid row. This value is assigned to the ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs.row property.
    */
  def this(row: typings.devexpressWeb.ASPxClientVerticalGridRow) = this()
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  /* CompleteClass */
  override var handled: Boolean = js.native
  /**
    * Gets the currently processed row.
    */
  /* CompleteClass */
  override var row: typings.devexpressWeb.ASPxClientVerticalGridRow = js.native
}

