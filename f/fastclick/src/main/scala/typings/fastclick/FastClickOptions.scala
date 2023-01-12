package typings.fastclick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FastClickOptions extends StObject {
  
  var tapDelay: js.UndefOr[Double] = js.undefined
  
  var touchBoundary: js.UndefOr[Double] = js.undefined
}
object FastClickOptions {
  
  inline def apply(): FastClickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FastClickOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FastClickOptions] (val x: Self) extends AnyVal {
    
    inline def setTapDelay(value: Double): Self = StObject.set(x, "tapDelay", value.asInstanceOf[js.Any])
    
    inline def setTapDelayUndefined: Self = StObject.set(x, "tapDelay", js.undefined)
    
    inline def setTouchBoundary(value: Double): Self = StObject.set(x, "touchBoundary", value.asInstanceOf[js.Any])
    
    inline def setTouchBoundaryUndefined: Self = StObject.set(x, "touchBoundary", js.undefined)
  }
}
