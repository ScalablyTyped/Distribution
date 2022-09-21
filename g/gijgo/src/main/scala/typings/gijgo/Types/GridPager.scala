package typings.gijgo.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//Grid
trait GridPager extends StObject {
  
  var leftControls: js.UndefOr[js.Array[Any]] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var rightControls: js.UndefOr[js.Array[Any]] = js.undefined
  
  var sizes: js.UndefOr[js.Array[Double]] = js.undefined
}
object GridPager {
  
  inline def apply(): GridPager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridPager]
  }
  
  extension [Self <: GridPager](x: Self) {
    
    inline def setLeftControls(value: js.Array[Any]): Self = StObject.set(x, "leftControls", value.asInstanceOf[js.Any])
    
    inline def setLeftControlsUndefined: Self = StObject.set(x, "leftControls", js.undefined)
    
    inline def setLeftControlsVarargs(value: Any*): Self = StObject.set(x, "leftControls", js.Array(value*))
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setRightControls(value: js.Array[Any]): Self = StObject.set(x, "rightControls", value.asInstanceOf[js.Any])
    
    inline def setRightControlsUndefined: Self = StObject.set(x, "rightControls", js.undefined)
    
    inline def setRightControlsVarargs(value: Any*): Self = StObject.set(x, "rightControls", js.Array(value*))
    
    inline def setSizes(value: js.Array[Double]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    inline def setSizesVarargs(value: Double*): Self = StObject.set(x, "sizes", js.Array(value*))
  }
}
