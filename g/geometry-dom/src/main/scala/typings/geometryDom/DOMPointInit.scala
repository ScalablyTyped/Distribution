package typings.geometryDom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMPointInit extends StObject {
  
  /**
    * w coordinate: 1
    */
  var w: js.UndefOr[Double] = js.undefined
  
  /**
    * x coordinate: 0
    */
  var x: Double
  
  /**
    * y coordinate: 0
    */
  var y: Double
  
  /**
    * z coordinate: 0
    */
  var z: js.UndefOr[Double] = js.undefined
}
object DOMPointInit {
  
  inline def apply(x: Double, y: Double): DOMPointInit = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMPointInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DOMPointInit] (val x: Self) extends AnyVal {
    
    inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
