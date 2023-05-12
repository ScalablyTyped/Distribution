package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollMeasurements extends StObject {
  
  var animationId: Double
  
  var isRoot: Boolean
  
  var offset: Point
  
  var phase: Phase
}
object ScrollMeasurements {
  
  inline def apply(animationId: Double, isRoot: Boolean, offset: Point, phase: Phase): ScrollMeasurements = {
    val __obj = js.Dynamic.literal(animationId = animationId.asInstanceOf[js.Any], isRoot = isRoot.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollMeasurements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollMeasurements] (val x: Self) extends AnyVal {
    
    inline def setAnimationId(value: Double): Self = StObject.set(x, "animationId", value.asInstanceOf[js.Any])
    
    inline def setIsRoot(value: Boolean): Self = StObject.set(x, "isRoot", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Point): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setPhase(value: Phase): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
  }
}
