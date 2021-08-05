package typings.gamequery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupOptions extends StObject {
  
  var height: js.UndefOr[Double] = js.undefined
  
  var overflow: js.UndefOr[String] = js.undefined
  
  var posx: js.UndefOr[Double] = js.undefined
  
  var posy: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object GroupOptions {
  
  inline def apply(): GroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupOptions]
  }
  
  extension [Self <: GroupOptions](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setOverflow(value: String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    inline def setPosx(value: Double): Self = StObject.set(x, "posx", value.asInstanceOf[js.Any])
    
    inline def setPosxUndefined: Self = StObject.set(x, "posx", js.undefined)
    
    inline def setPosy(value: Double): Self = StObject.set(x, "posy", value.asInstanceOf[js.Any])
    
    inline def setPosyUndefined: Self = StObject.set(x, "posy", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
