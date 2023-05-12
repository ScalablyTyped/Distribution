package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisDelta extends StObject {
  
  var origin: Double
  
  var originPoint: Double
  
  var scale: Double
  
  var translate: Double
}
object AxisDelta {
  
  inline def apply(origin: Double, originPoint: Double, scale: Double, translate: Double): AxisDelta = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], originPoint = originPoint.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], translate = translate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisDelta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AxisDelta] (val x: Self) extends AnyVal {
    
    inline def setOrigin(value: Double): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginPoint(value: Double): Self = StObject.set(x, "originPoint", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setTranslate(value: Double): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
  }
}
