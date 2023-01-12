package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxLinearGaugeScaleLabel
  extends StObject
     with BaseGaugeScaleLabel {
  
  /**
    * Specifies the spacing between scale labels and ticks.
    */
  var indentFromTick: js.UndefOr[Double] = js.undefined
}
object dxLinearGaugeScaleLabel {
  
  inline def apply(): dxLinearGaugeScaleLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxLinearGaugeScaleLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxLinearGaugeScaleLabel] (val x: Self) extends AnyVal {
    
    inline def setIndentFromTick(value: Double): Self = StObject.set(x, "indentFromTick", value.asInstanceOf[js.Any])
    
    inline def setIndentFromTickUndefined: Self = StObject.set(x, "indentFromTick", js.undefined)
  }
}
