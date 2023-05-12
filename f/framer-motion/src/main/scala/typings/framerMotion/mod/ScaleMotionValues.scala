package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleMotionValues extends StObject {
  
  var scaleX: MotionValue_[Double]
  
  var scaleY: MotionValue_[Double]
}
object ScaleMotionValues {
  
  inline def apply(scaleX: MotionValue_[Double], scaleY: MotionValue_[Double]): ScaleMotionValues = {
    val __obj = js.Dynamic.literal(scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleMotionValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScaleMotionValues] (val x: Self) extends AnyVal {
    
    inline def setScaleX(value: MotionValue_[Double]): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleY(value: MotionValue_[Double]): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
  }
}
