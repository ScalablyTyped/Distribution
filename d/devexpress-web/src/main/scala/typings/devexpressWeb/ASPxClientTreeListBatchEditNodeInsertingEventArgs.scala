package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.BatchEditNodeInserting event.
  */
@js.native
trait ASPxClientTreeListBatchEditNodeInsertingEventArgs extends ASPxClientCancelEventArgs {
  
  /**
    * Gets the processed node's key value.
    */
  var nodeKey: String = js.native
  
  /**
    * Gets the parent node key.
    */
  var parentNodeKey: String = js.native
}
object ASPxClientTreeListBatchEditNodeInsertingEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, nodeKey: String, parentNodeKey: String): ASPxClientTreeListBatchEditNodeInsertingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any], parentNodeKey = parentNodeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListBatchEditNodeInsertingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientTreeListBatchEditNodeInsertingEventArgsMutableBuilder[Self <: ASPxClientTreeListBatchEditNodeInsertingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeKey(value: String): Self = StObject.set(x, "nodeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNodeKey(value: String): Self = StObject.set(x, "parentNodeKey", value.asInstanceOf[js.Any])
  }
}
