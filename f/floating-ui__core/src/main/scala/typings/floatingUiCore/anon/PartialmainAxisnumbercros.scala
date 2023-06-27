package typings.floatingUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  mainAxis :number,   crossAxis :number,   alignmentAxis :number | null}> */
trait PartialmainAxisnumbercros extends StObject {
  
  var alignmentAxis: js.UndefOr[Double | Null] = js.undefined
  
  var crossAxis: js.UndefOr[Double] = js.undefined
  
  var mainAxis: js.UndefOr[Double] = js.undefined
}
object PartialmainAxisnumbercros {
  
  inline def apply(): PartialmainAxisnumbercros = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialmainAxisnumbercros]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialmainAxisnumbercros] (val x: Self) extends AnyVal {
    
    inline def setAlignmentAxis(value: Double): Self = StObject.set(x, "alignmentAxis", value.asInstanceOf[js.Any])
    
    inline def setAlignmentAxisNull: Self = StObject.set(x, "alignmentAxis", null)
    
    inline def setAlignmentAxisUndefined: Self = StObject.set(x, "alignmentAxis", js.undefined)
    
    inline def setCrossAxis(value: Double): Self = StObject.set(x, "crossAxis", value.asInstanceOf[js.Any])
    
    inline def setCrossAxisUndefined: Self = StObject.set(x, "crossAxis", js.undefined)
    
    inline def setMainAxis(value: Double): Self = StObject.set(x, "mainAxis", value.asInstanceOf[js.Any])
    
    inline def setMainAxisUndefined: Self = StObject.set(x, "mainAxis", js.undefined)
  }
}
