package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.FocusedCellChanging event.
  */
@JSGlobal("ASPxClientTreeListFocusedCellChangingEventArgs")
@js.native
class ASPxClientTreeListFocusedCellChangingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientTreeListFocusedCellChangingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientTreeListFocusedCellChangingEventArgs class.
    * @param cellInfo An ASPxClientTreeListCellInfo object providing information about the focused cell.
    */
  def this(cellInfo: typings.devexpressWeb.ASPxClientTreeListCellInfo) = this()
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Provides information on a cell currently being focused.
    */
  /* CompleteClass */
  var cellInfo: typings.devexpressWeb.ASPxClientTreeListCellInfo = js.native
}
