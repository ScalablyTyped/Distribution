package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditTemplateCellFocused event.
  */
@JSGlobal("ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs")
@js.native
class ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs class with the specified row.
    * @param row An ASPxClientVerticalGridRow object that is the processed grid row. This value is assigned to the ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs.row property.
    */
  def this(row: typings.devexpressWeb.ASPxClientVerticalGridRow) = this()
  
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  /* CompleteClass */
  var handled: Boolean = js.native
  
  /**
    * Gets the currently processed row.
    */
  /* CompleteClass */
  var row: typings.devexpressWeb.ASPxClientVerticalGridRow = js.native
}
