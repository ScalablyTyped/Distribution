package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.BatchEditNodeDeleting event.
  */
@JSGlobal("ASPxClientTreeListBatchEditNodeDeletingEventArgs")
@js.native
open class ASPxClientTreeListBatchEditNodeDeletingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientTreeListBatchEditNodeDeletingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientTreeListBatchEditNodeDeletingEventArgs class.
    * @param nodeKey A String value that identifies the processed node.
    * @param nodeValues An object representing a data source field values.
    */
  def this(nodeKey: String, nodeValues: Any) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
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
