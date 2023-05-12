package typings.framerMotion.anon

import typings.framerMotion.mod.MotionValue_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollX extends StObject {
  
  var scrollX: MotionValue_[Double]
  
  var scrollXProgress: MotionValue_[Double]
  
  var scrollY: MotionValue_[Double]
  
  var scrollYProgress: MotionValue_[Double]
}
object ScrollX {
  
  inline def apply(
    scrollX: MotionValue_[Double],
    scrollXProgress: MotionValue_[Double],
    scrollY: MotionValue_[Double],
    scrollYProgress: MotionValue_[Double]
  ): ScrollX = {
    val __obj = js.Dynamic.literal(scrollX = scrollX.asInstanceOf[js.Any], scrollXProgress = scrollXProgress.asInstanceOf[js.Any], scrollY = scrollY.asInstanceOf[js.Any], scrollYProgress = scrollYProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollX]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollX] (val x: Self) extends AnyVal {
    
    inline def setScrollX(value: MotionValue_[Double]): Self = StObject.set(x, "scrollX", value.asInstanceOf[js.Any])
    
    inline def setScrollXProgress(value: MotionValue_[Double]): Self = StObject.set(x, "scrollXProgress", value.asInstanceOf[js.Any])
    
    inline def setScrollY(value: MotionValue_[Double]): Self = StObject.set(x, "scrollY", value.asInstanceOf[js.Any])
    
    inline def setScrollYProgress(value: MotionValue_[Double]): Self = StObject.set(x, "scrollYProgress", value.asInstanceOf[js.Any])
  }
}
