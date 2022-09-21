package typings.floatingUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrossAxis extends StObject {
  
  /**
    * Offset the limiting of the axis that runs along the side of the
    * floating element.
    */
  var crossAxis: js.UndefOr[Double] = js.undefined
  
  /**
    * Offset the limiting of the axis that runs along the alignment of the
    * floating element.
    */
  var mainAxis: js.UndefOr[Double] = js.undefined
}
object CrossAxis {
  
  inline def apply(): CrossAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrossAxis]
  }
  
  extension [Self <: CrossAxis](x: Self) {
    
    inline def setCrossAxis(value: Double): Self = StObject.set(x, "crossAxis", value.asInstanceOf[js.Any])
    
    inline def setCrossAxisUndefined: Self = StObject.set(x, "crossAxis", js.undefined)
    
    inline def setMainAxis(value: Double): Self = StObject.set(x, "mainAxis", value.asInstanceOf[js.Any])
    
    inline def setMainAxisUndefined: Self = StObject.set(x, "mainAxis", js.undefined)
  }
}
