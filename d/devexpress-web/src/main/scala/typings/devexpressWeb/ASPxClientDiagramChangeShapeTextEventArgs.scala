package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about the processed shape.
  */
trait ASPxClientDiagramChangeShapeTextEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * The processed shape.
    */
  var shape: DiagramShape
  
  /**
    * The new shape text.
    */
  var text: String
}
object ASPxClientDiagramChangeShapeTextEventArgs {
  
  inline def apply(shape: DiagramShape, text: String): ASPxClientDiagramChangeShapeTextEventArgs = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDiagramChangeShapeTextEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientDiagramChangeShapeTextEventArgs] (val x: Self) extends AnyVal {
    
    inline def setShape(value: DiagramShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
