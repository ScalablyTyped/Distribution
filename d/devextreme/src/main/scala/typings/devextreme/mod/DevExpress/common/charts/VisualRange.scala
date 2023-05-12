package typings.devextreme.mod.DevExpress.common.charts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualRange extends StObject {
  
  /**
    * 
    */
  var endValue: js.UndefOr[Double | js.Date | String] = js.undefined
  
  /**
    * 
    */
  var length: js.UndefOr[TimeIntervalConfig] = js.undefined
  
  /**
    * 
    */
  var startValue: js.UndefOr[Double | js.Date | String] = js.undefined
}
object VisualRange {
  
  inline def apply(): VisualRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisualRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisualRange] (val x: Self) extends AnyVal {
    
    inline def setEndValue(value: Double | js.Date | String): Self = StObject.set(x, "endValue", value.asInstanceOf[js.Any])
    
    inline def setEndValueUndefined: Self = StObject.set(x, "endValue", js.undefined)
    
    inline def setLength(value: TimeIntervalConfig): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setStartValue(value: Double | js.Date | String): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
    
    inline def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
  }
}
