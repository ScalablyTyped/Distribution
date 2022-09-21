package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditEndEditing event.
  */
@JSGlobal("ASPxClientVerticalGridBatchEditEndEditingEventArgs")
@js.native
open class ASPxClientVerticalGridBatchEditEndEditingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientVerticalGridBatchEditEndEditingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridBatchEditEndEditingEventArgs class with specified settings.
    */
  def this(
    visibleIndex: Double,
    recordValues: Any,
    focusedRow: typings.devexpressWeb.ASPxClientVerticalGridRow
  ) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the row to which the edited cell belongs.
    */
  /* CompleteClass */
  var focusedRow: typings.devexpressWeb.ASPxClientVerticalGridRow = js.native
  
  /**
    * Gets a hashtable that maintains information about editable cells.
    */
  /* CompleteClass */
  var recordValues: Any = js.native
  
  /**
    * Gets the visible index of the record whose cells have been edited.
    */
  /* CompleteClass */
  var visibleIndex: Double = js.native
}
