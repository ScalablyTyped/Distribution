package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.BatchEditEndEditing event.
  */
@JSGlobal("ASPxClientTreeListBatchEditEndEditingEventArgs")
@js.native
open class ASPxClientTreeListBatchEditEndEditingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientTreeListBatchEditEndEditingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientTreeListBatchEditEndEditingEventArgs class with specified settings.
    */
  def this(nodeKey: String, nodeValues: Any, focusedColumn: typings.devexpressWeb.ASPxClientTreeListColumn) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the column to which the edited cell belongs.
    */
  /* CompleteClass */
  var focusedColumn: typings.devexpressWeb.ASPxClientTreeListColumn = js.native
  
  /**
    * Gets the processed node's key value.
    */
  /* CompleteClass */
  var nodeKey: String = js.native
  
  /**
    * Gets the value of the processed cell.
    */
  /* CompleteClass */
  var nodeValues: Any = js.native
}
