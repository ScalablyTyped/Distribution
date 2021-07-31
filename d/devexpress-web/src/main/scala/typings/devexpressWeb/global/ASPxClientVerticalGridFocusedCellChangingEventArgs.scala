package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientVerticalGrid.FocusedCellChanging event.
  */
@JSGlobal("ASPxClientVerticalGridFocusedCellChangingEventArgs")
@js.native
class ASPxClientVerticalGridFocusedCellChangingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientVerticalGridFocusedCellChangingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridFocusedCellChangingEventArgs class with specified settings.
    * @param cellInfo A ASPxClientVerticalGridCellInfo object providing information about the focused cell.
    */
  def this(cellInfo: typings.devexpressWeb.ASPxClientVerticalGridCellInfo) = this()
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Provides information on a cell currently being focused.
    */
  /* CompleteClass */
  var cellInfo: typings.devexpressWeb.ASPxClientVerticalGridCellInfo = js.native
}
