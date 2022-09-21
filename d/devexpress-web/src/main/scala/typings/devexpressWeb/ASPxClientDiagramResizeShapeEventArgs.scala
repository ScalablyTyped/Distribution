package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about the processed shape.
  */
trait ASPxClientDiagramResizeShapeEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * The new shape size in units.
    */
  var newSize: Any
  
  /**
    * The previous shape size in units.
    */
  var oldSize: Any
  
  /**
    * The processed shape.
    */
  var shape: DiagramShape
}
object ASPxClientDiagramResizeShapeEventArgs {
  
  inline def apply(newSize: Any, oldSize: Any, shape: DiagramShape): ASPxClientDiagramResizeShapeEventArgs = {
    val __obj = js.Dynamic.literal(newSize = newSize.asInstanceOf[js.Any], oldSize = oldSize.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDiagramResizeShapeEventArgs]
  }
  
  extension [Self <: ASPxClientDiagramResizeShapeEventArgs](x: Self) {
    
    inline def setNewSize(value: Any): Self = StObject.set(x, "newSize", value.asInstanceOf[js.Any])
    
    inline def setOldSize(value: Any): Self = StObject.set(x, "oldSize", value.asInstanceOf[js.Any])
    
    inline def setShape(value: DiagramShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
  }
}
