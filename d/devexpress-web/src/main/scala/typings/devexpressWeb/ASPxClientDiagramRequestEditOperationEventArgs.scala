package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the RequestEditOperation event.
  */
trait ASPxClientDiagramRequestEditOperationEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Specifies whether the edit operation is allowed.
    */
  var allowed: Boolean
  
  /**
    * Contains information about the processed shape or connector.
    */
  var args: Any
  
  /**
    * Identifies the operation currently being processed.
    */
  var operation: DiagramEditOperation
  
  /**
    * Identifies the reason why the event is raised.
    */
  var reason: DiagramRequestEditOperationReason
}
object ASPxClientDiagramRequestEditOperationEventArgs {
  
  inline def apply(
    allowed: Boolean,
    args: Any,
    operation: DiagramEditOperation,
    reason: DiagramRequestEditOperationReason
  ): ASPxClientDiagramRequestEditOperationEventArgs = {
    val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDiagramRequestEditOperationEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientDiagramRequestEditOperationEventArgs] (val x: Self) extends AnyVal {
    
    inline def setAllowed(value: Boolean): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
    
    inline def setArgs(value: Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: DiagramEditOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setReason(value: DiagramRequestEditOperationReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
