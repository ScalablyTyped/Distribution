package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.BatchEditNodeRecovering event.
  */
trait ASPxClientTreeListBatchEditNodeRecoveringEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Gets the processed node's key value.
    */
  var nodeKey: String
  
  /**
    * Gets a hashtable that maintains information about recovered cells.
    */
  var nodeValues: js.Any
}
object ASPxClientTreeListBatchEditNodeRecoveringEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, nodeKey: String, nodeValues: js.Any): ASPxClientTreeListBatchEditNodeRecoveringEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any], nodeValues = nodeValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListBatchEditNodeRecoveringEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientTreeListBatchEditNodeRecoveringEventArgsMutableBuilder[Self <: ASPxClientTreeListBatchEditNodeRecoveringEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeKey(value: String): Self = StObject.set(x, "nodeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeValues(value: js.Any): Self = StObject.set(x, "nodeValues", value.asInstanceOf[js.Any])
  }
}
