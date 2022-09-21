package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.FocusedCellChanging event.
  */
@JSGlobal("ASPxClientGridViewFocusedCellChangingEventArgs")
@js.native
open class ASPxClientGridViewFocusedCellChangingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGridViewFocusedCellChangingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewFocusedCellChangingEventArgs class with specified settings.
    * @param cellInfo A ASPxClientGridViewCellInfo object providing information about the focused cell.
    */
  def this(cellInfo: typings.devexpressWeb.ASPxClientGridViewCellInfo) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Provides information on a cell currently being focused.
    */
  /* CompleteClass */
  var cellInfo: typings.devexpressWeb.ASPxClientGridViewCellInfo = js.native
}
