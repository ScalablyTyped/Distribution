package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.BatchEditTemplateCellFocused event.
  */
@JSGlobal("ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs")
@js.native
class ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs class.
    * @param column An ASPxClientTreeListColumn object specifying the column.
    */
  def this(column: typings.devexpressWeb.ASPxClientTreeListColumn) = this()
  
  /**
    * Gets the currently processed column.
    */
  /* CompleteClass */
  var column: typings.devexpressWeb.ASPxClientTreeListColumn = js.native
  
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  /* CompleteClass */
  var handled: Boolean = js.native
}
