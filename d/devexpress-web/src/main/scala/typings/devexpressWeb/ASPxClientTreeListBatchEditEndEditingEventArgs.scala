package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.BatchEditEndEditing event.
  */
@js.native
trait ASPxClientTreeListBatchEditEndEditingEventArgs extends ASPxClientCancelEventArgs {
  
  /**
    * Gets the processed node's key value.
    */
  var nodeKey: String = js.native
  
  /**
    * Gets the value of the processed cell.
    */
  var nodeValues: js.Any = js.native
}
object ASPxClientTreeListBatchEditEndEditingEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, nodeKey: String, nodeValues: js.Any): ASPxClientTreeListBatchEditEndEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any], nodeValues = nodeValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListBatchEditEndEditingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientTreeListBatchEditEndEditingEventArgsMutableBuilder[Self <: ASPxClientTreeListBatchEditEndEditingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeKey(value: String): Self = StObject.set(x, "nodeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeValues(value: js.Any): Self = StObject.set(x, "nodeValues", value.asInstanceOf[js.Any])
  }
}
