package typings.floatingUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  mainAxis :number,   crossAxis :number}> */
trait PartialmainAxisnumbercrosCrossAxis extends StObject {
  
  var crossAxis: js.UndefOr[Double] = js.undefined
  
  var mainAxis: js.UndefOr[Double] = js.undefined
}
object PartialmainAxisnumbercrosCrossAxis {
  
  inline def apply(): PartialmainAxisnumbercrosCrossAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialmainAxisnumbercrosCrossAxis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialmainAxisnumbercrosCrossAxis] (val x: Self) extends AnyVal {
    
    inline def setCrossAxis(value: Double): Self = StObject.set(x, "crossAxis", value.asInstanceOf[js.Any])
    
    inline def setCrossAxisUndefined: Self = StObject.set(x, "crossAxis", js.undefined)
    
    inline def setMainAxis(value: Double): Self = StObject.set(x, "mainAxis", value.asInstanceOf[js.Any])
    
    inline def setMainAxisUndefined: Self = StObject.set(x, "mainAxis", js.undefined)
  }
}
