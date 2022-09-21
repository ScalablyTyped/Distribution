package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.BatchEditEndEditing event.
  */
@JSGlobal("ASPxClientGridViewBatchEditEndEditingEventArgs")
@js.native
open class ASPxClientGridViewBatchEditEndEditingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGridViewBatchEditEndEditingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewBatchEditEndEditingEventArgs class with specified settings.
    */
  def this(
    visibleIndex: Double,
    rowValues: Any,
    key: Any,
    focusedColumn: typings.devexpressWeb.ASPxClientGridViewColumn
  ) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the column to which the edited cell belongs.
    */
  /* CompleteClass */
  var focusedColumn: typings.devexpressWeb.ASPxClientGridViewColumn = js.native
  
  /**
    * Gets the row's key.
    */
  /* CompleteClass */
  var key: Any = js.native
  
  /**
    * Gets a hashtable that maintains information about editable cells.
    */
  /* CompleteClass */
  var rowValues: Any = js.native
  
  /**
    * Gets the visible index of the row whose cells has been edited.
    */
  /* CompleteClass */
  var visibleIndex: Double = js.native
}
