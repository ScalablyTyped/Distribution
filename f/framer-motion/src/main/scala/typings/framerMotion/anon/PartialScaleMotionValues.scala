package typings.framerMotion.anon

import typings.framerMotion.mod.MotionValue_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<framer-motion.framer-motion.ScaleMotionValues> */
trait PartialScaleMotionValues extends StObject {
  
  var scaleX: js.UndefOr[MotionValue_[Double]] = js.undefined
  
  var scaleY: js.UndefOr[MotionValue_[Double]] = js.undefined
}
object PartialScaleMotionValues {
  
  inline def apply(): PartialScaleMotionValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScaleMotionValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialScaleMotionValues] (val x: Self) extends AnyVal {
    
    inline def setScaleX(value: MotionValue_[Double]): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    inline def setScaleY(value: MotionValue_[Double]): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    inline def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
  }
}
