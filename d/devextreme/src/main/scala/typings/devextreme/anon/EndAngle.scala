package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndAngle extends StObject {
  
  /**
    * Specifies the end angle of the circular gauge&apos;s arc.
    */
  var endAngle: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the start angle of the circular gauge&apos;s arc.
    */
  var startAngle: js.UndefOr[Double] = js.undefined
}
object EndAngle {
  
  inline def apply(): EndAngle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndAngle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndAngle] (val x: Self) extends AnyVal {
    
    inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
  }
}
