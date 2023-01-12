package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeOutsideInfo extends StObject {
  
  /**
    * Shape bounds
    */
  var bounds: Quad
  
  /**
    * Margin shape bounds
    */
  var marginShape: js.Array[Any]
  
  /**
    * Shape coordinate details
    */
  var shape: js.Array[Any]
}
object ShapeOutsideInfo {
  
  inline def apply(bounds: Quad, marginShape: js.Array[Any], shape: js.Array[Any]): ShapeOutsideInfo = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], marginShape = marginShape.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeOutsideInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShapeOutsideInfo] (val x: Self) extends AnyVal {
    
    inline def setBounds(value: Quad): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsVarargs(value: Double*): Self = StObject.set(x, "bounds", js.Array(value*))
    
    inline def setMarginShape(value: js.Array[Any]): Self = StObject.set(x, "marginShape", value.asInstanceOf[js.Any])
    
    inline def setMarginShapeVarargs(value: Any*): Self = StObject.set(x, "marginShape", js.Array(value*))
    
    inline def setShape(value: js.Array[Any]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeVarargs(value: Any*): Self = StObject.set(x, "shape", js.Array(value*))
  }
}
