package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.BatchEditTemplateCellFocused event.
  */
@JSGlobal("ASPxClientGridViewBatchEditTemplateCellFocusedEventArgs")
@js.native
class ASPxClientGridViewBatchEditTemplateCellFocusedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGridViewBatchEditTemplateCellFocusedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewBatchEditTemplateCellFocusedEventArgs class with the specified column.
    * @param column An ASPxClientGridViewColumn object that is the processed grid column. This value is assigned to the ASPxClientGridViewBatchEditTemplateCellFocusedEventArgs.column property.
    */
  def this(column: typings.devexpressWeb.ASPxClientGridViewColumn) = this()
  
  /**
    * Gets the currently processed column.
    */
  /* CompleteClass */
  var column: typings.devexpressWeb.ASPxClientGridViewColumn = js.native
  
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  /* CompleteClass */
  var handled: Boolean = js.native
}
