package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.BatchEditTemplateCellFocused event.
  */
@JSGlobal("ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs")
@js.native
class ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs class.
    * @param column An ASPxClientTreeListColumn object specifying the column.
    */
  def this(column: ASPxClientTreeListColumn) = this()
  /**
    * Gets the currently processed column.
    */
  var column: ASPxClientTreeListColumn = js.native
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  var handled: Boolean = js.native
}

