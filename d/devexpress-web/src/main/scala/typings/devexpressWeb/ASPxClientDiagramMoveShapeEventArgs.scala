package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about the processed shape.
  */
trait ASPxClientDiagramMoveShapeEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * The new shape position (x- and y-coordinates).
    */
  var newPosition: Any
  
  /**
    * The previous shape position (x- and y-coordinates).
    */
  var oldPosition: Any
  
  /**
    * The processed shape.
    */
  var shape: DiagramShape
}
object ASPxClientDiagramMoveShapeEventArgs {
  
  inline def apply(newPosition: Any, oldPosition: Any, shape: DiagramShape): ASPxClientDiagramMoveShapeEventArgs = {
    val __obj = js.Dynamic.literal(newPosition = newPosition.asInstanceOf[js.Any], oldPosition = oldPosition.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDiagramMoveShapeEventArgs]
  }
  
  extension [Self <: ASPxClientDiagramMoveShapeEventArgs](x: Self) {
    
    inline def setNewPosition(value: Any): Self = StObject.set(x, "newPosition", value.asInstanceOf[js.Any])
    
    inline def setOldPosition(value: Any): Self = StObject.set(x, "oldPosition", value.asInstanceOf[js.Any])
    
    inline def setShape(value: DiagramShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
  }
}
