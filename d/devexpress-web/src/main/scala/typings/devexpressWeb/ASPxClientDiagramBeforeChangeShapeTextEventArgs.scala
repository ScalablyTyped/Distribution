package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about the processed shape.
  */
trait ASPxClientDiagramBeforeChangeShapeTextEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * The processed shape.
    */
  var shape: DiagramShape
}
object ASPxClientDiagramBeforeChangeShapeTextEventArgs {
  
  inline def apply(shape: DiagramShape): ASPxClientDiagramBeforeChangeShapeTextEventArgs = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDiagramBeforeChangeShapeTextEventArgs]
  }
  
  extension [Self <: ASPxClientDiagramBeforeChangeShapeTextEventArgs](x: Self) {
    
    inline def setShape(value: DiagramShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
  }
}
