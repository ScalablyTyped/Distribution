package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.BatchEditNodeValidating event.
  */
trait ASPxClientTreeListBatchEditNodeValidatingEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the node's key value.
    */
  var nodeKey: String
  
  /**
    * Provides validation information of a validated node.
    */
  var validationInfo: Any
}
object ASPxClientTreeListBatchEditNodeValidatingEventArgs {
  
  inline def apply(nodeKey: String, validationInfo: Any): ASPxClientTreeListBatchEditNodeValidatingEventArgs = {
    val __obj = js.Dynamic.literal(nodeKey = nodeKey.asInstanceOf[js.Any], validationInfo = validationInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListBatchEditNodeValidatingEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientTreeListBatchEditNodeValidatingEventArgs] (val x: Self) extends AnyVal {
    
    inline def setNodeKey(value: String): Self = StObject.set(x, "nodeKey", value.asInstanceOf[js.Any])
    
    inline def setValidationInfo(value: Any): Self = StObject.set(x, "validationInfo", value.asInstanceOf[js.Any])
  }
}
