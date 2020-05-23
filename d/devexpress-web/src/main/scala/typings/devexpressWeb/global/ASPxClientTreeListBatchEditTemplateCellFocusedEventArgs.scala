package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.BatchEditTemplateCellFocused event.
  */
@JSGlobal("ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs")
@js.native
class ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs class.
    * @param column An ASPxClientTreeListColumn object specifying the column.
    */
  def this(column: typings.devexpressWeb.ASPxClientTreeListColumn) = this()
  /**
    * Gets the currently processed column.
    */
  /* CompleteClass */
  override var column: typings.devexpressWeb.ASPxClientTreeListColumn = js.native
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  /* CompleteClass */
  override var handled: Boolean = js.native
}

