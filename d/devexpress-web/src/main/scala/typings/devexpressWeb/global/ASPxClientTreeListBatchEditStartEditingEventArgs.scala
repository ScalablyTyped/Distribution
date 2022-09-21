package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.BatchEditStartEditing event.
  */
@JSGlobal("ASPxClientTreeListBatchEditStartEditingEventArgs")
@js.native
open class ASPxClientTreeListBatchEditStartEditingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientTreeListBatchEditStartEditingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientTreeListBatchEditStartEditingEventArgs class.
    * @param nodeKey A String value that identifies the processed node.
    * @param focusedColumn An ASPxClientTreeListColumn object representing the focused column.
    * @param nodeValues An object representing a data source’s field values.
    */
  def this(nodeKey: String, focusedColumn: typings.devexpressWeb.ASPxClientTreeListColumn, nodeValues: Any) = this()
  
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
    * Gets the node's key value.
    */
  /* CompleteClass */
  var nodeKey: String = js.native
  
  /**
    * Gets the value of the processed cell.
    */
  /* CompleteClass */
  var nodeValues: Any = js.native
}
