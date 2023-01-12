package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleBreak extends StObject {
  
  /**
    * Along with the startValue property, limits the scale break.
    */
  var endValue: js.UndefOr[Double | js.Date | String] = js.undefined
  
  /**
    * Along with the endValue property, limits the scale break.
    */
  var startValue: js.UndefOr[Double | js.Date | String] = js.undefined
}
object ScaleBreak {
  
  inline def apply(): ScaleBreak = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleBreak]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScaleBreak] (val x: Self) extends AnyVal {
    
    inline def setEndValue(value: Double | js.Date | String): Self = StObject.set(x, "endValue", value.asInstanceOf[js.Any])
    
    inline def setEndValueUndefined: Self = StObject.set(x, "endValue", js.undefined)
    
    inline def setStartValue(value: Double | js.Date | String): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
    
    inline def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
  }
}
