package typings.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BACKWARDCLOSEDARROW extends StObject {
  
  var BACKWARD_CLOSED_ARROW: Double
  
  var BACKWARD_OPEN_ARROW: Double
  
  var CIRCLE: Double
  
  var FORWARD_CLOSED_ARROW: Double
  
  var FORWARD_OPEN_ARROW: Double
}
object BACKWARDCLOSEDARROW {
  
  inline def apply(
    BACKWARD_CLOSED_ARROW: Double,
    BACKWARD_OPEN_ARROW: Double,
    CIRCLE: Double,
    FORWARD_CLOSED_ARROW: Double,
    FORWARD_OPEN_ARROW: Double
  ): BACKWARDCLOSEDARROW = {
    val __obj = js.Dynamic.literal(BACKWARD_CLOSED_ARROW = BACKWARD_CLOSED_ARROW.asInstanceOf[js.Any], BACKWARD_OPEN_ARROW = BACKWARD_OPEN_ARROW.asInstanceOf[js.Any], CIRCLE = CIRCLE.asInstanceOf[js.Any], FORWARD_CLOSED_ARROW = FORWARD_CLOSED_ARROW.asInstanceOf[js.Any], FORWARD_OPEN_ARROW = FORWARD_OPEN_ARROW.asInstanceOf[js.Any])
    __obj.asInstanceOf[BACKWARDCLOSEDARROW]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BACKWARDCLOSEDARROW] (val x: Self) extends AnyVal {
    
    inline def setBACKWARD_CLOSED_ARROW(value: Double): Self = StObject.set(x, "BACKWARD_CLOSED_ARROW", value.asInstanceOf[js.Any])
    
    inline def setBACKWARD_OPEN_ARROW(value: Double): Self = StObject.set(x, "BACKWARD_OPEN_ARROW", value.asInstanceOf[js.Any])
    
    inline def setCIRCLE(value: Double): Self = StObject.set(x, "CIRCLE", value.asInstanceOf[js.Any])
    
    inline def setFORWARD_CLOSED_ARROW(value: Double): Self = StObject.set(x, "FORWARD_CLOSED_ARROW", value.asInstanceOf[js.Any])
    
    inline def setFORWARD_OPEN_ARROW(value: Double): Self = StObject.set(x, "FORWARD_OPEN_ARROW", value.asInstanceOf[js.Any])
  }
}
