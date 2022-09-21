package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VizRange extends StObject {
  
  /**
    * The range&apos;s end value.
    */
  var endValue: js.UndefOr[Double | js.Date | String] = js.undefined
  
  /**
    * The range&apos;s length.
    */
  var length: js.UndefOr[VizTimeInterval] = js.undefined
  
  /**
    * The range&apos;s start value.
    */
  var startValue: js.UndefOr[Double | js.Date | String] = js.undefined
}
object VizRange {
  
  inline def apply(): VizRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VizRange]
  }
  
  extension [Self <: VizRange](x: Self) {
    
    inline def setEndValue(value: Double | js.Date | String): Self = StObject.set(x, "endValue", value.asInstanceOf[js.Any])
    
    inline def setEndValueUndefined: Self = StObject.set(x, "endValue", js.undefined)
    
    inline def setLength(value: VizTimeInterval): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setStartValue(value: Double | js.Date | String): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
    
    inline def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
  }
}
