package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.BatchEditNodeInserting event.
  */
@JSGlobal("ASPxClientTreeListBatchEditNodeInsertingEventArgs")
@js.native
open class ASPxClientTreeListBatchEditNodeInsertingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientTreeListBatchEditNodeInsertingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientTreeListBatchEditNodeInsertingEventArgs class.
    * @param nodeKey A String value that identifies the processed node.
    * @param parentNodeKey A String value that identifies the processed node's parent node.
    */
  def this(nodeKey: String, parentNodeKey: String) = this()
  
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
    * Gets the parent node key.
    */
  /* CompleteClass */
  var parentNodeKey: String = js.native
}
