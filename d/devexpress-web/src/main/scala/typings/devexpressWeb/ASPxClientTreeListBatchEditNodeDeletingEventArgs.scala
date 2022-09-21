package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.BatchEditNodeDeleting event.
  */
trait ASPxClientTreeListBatchEditNodeDeletingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Gets the processed node's key value.
    */
  var nodeKey: String
  
  /**
    * Gets the value of the processed cell.
    */
  var nodeValues: Any
}
object ASPxClientTreeListBatchEditNodeDeletingEventArgs {
  
  inline def apply(cancel: Boolean, nodeKey: String, nodeValues: Any): ASPxClientTreeListBatchEditNodeDeletingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any], nodeValues = nodeValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListBatchEditNodeDeletingEventArgs]
  }
  
  extension [Self <: ASPxClientTreeListBatchEditNodeDeletingEventArgs](x: Self) {
    
    inline def setNodeKey(value: String): Self = StObject.set(x, "nodeKey", value.asInstanceOf[js.Any])
    
    inline def setNodeValues(value: Any): Self = StObject.set(x, "nodeValues", value.asInstanceOf[js.Any])
  }
}
