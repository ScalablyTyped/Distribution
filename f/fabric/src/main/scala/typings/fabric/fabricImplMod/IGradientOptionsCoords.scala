package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGradientOptionsCoords extends StObject {
  
  var r1: js.UndefOr[Double] = js.undefined
  
  var r2: js.UndefOr[Double] = js.undefined
  
  var x1: js.UndefOr[Double] = js.undefined
  
  var x2: js.UndefOr[Double] = js.undefined
  
  var y1: js.UndefOr[Double] = js.undefined
  
  var y2: js.UndefOr[Double] = js.undefined
}
object IGradientOptionsCoords {
  
  inline def apply(): IGradientOptionsCoords = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGradientOptionsCoords]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGradientOptionsCoords] (val x: Self) extends AnyVal {
    
    inline def setR1(value: Double): Self = StObject.set(x, "r1", value.asInstanceOf[js.Any])
    
    inline def setR1Undefined: Self = StObject.set(x, "r1", js.undefined)
    
    inline def setR2(value: Double): Self = StObject.set(x, "r2", value.asInstanceOf[js.Any])
    
    inline def setR2Undefined: Self = StObject.set(x, "r2", js.undefined)
    
    inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
    
    inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    inline def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
    
    inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    inline def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
    
    inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    
    inline def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
  }
}
