package typings.fancybox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FancyBoxThumbPos
  extends StObject
     with FancyBoxGetFitPosResults {
  
  var scaleX: js.UndefOr[Double] = js.undefined
  
  var scaleY: js.UndefOr[Double] = js.undefined
}
object FancyBoxThumbPos {
  
  inline def apply(): FancyBoxThumbPos = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FancyBoxThumbPos]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FancyBoxThumbPos] (val x: Self) extends AnyVal {
    
    inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    inline def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
  }
}
