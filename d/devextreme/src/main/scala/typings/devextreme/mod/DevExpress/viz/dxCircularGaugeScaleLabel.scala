package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.viz.dxCircularGauge.CircularGaugeLabelOverlap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxCircularGaugeScaleLabel
  extends StObject
     with BaseGaugeScaleLabel {
  
  /**
    * Specifies which label to hide in case of overlapping.
    */
  var hideFirstOrLast: js.UndefOr[CircularGaugeLabelOverlap] = js.undefined
  
  /**
    * Specifies the spacing between scale labels and ticks.
    */
  var indentFromTick: js.UndefOr[Double] = js.undefined
}
object dxCircularGaugeScaleLabel {
  
  inline def apply(): dxCircularGaugeScaleLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxCircularGaugeScaleLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxCircularGaugeScaleLabel] (val x: Self) extends AnyVal {
    
    inline def setHideFirstOrLast(value: CircularGaugeLabelOverlap): Self = StObject.set(x, "hideFirstOrLast", value.asInstanceOf[js.Any])
    
    inline def setHideFirstOrLastUndefined: Self = StObject.set(x, "hideFirstOrLast", js.undefined)
    
    inline def setIndentFromTick(value: Double): Self = StObject.set(x, "indentFromTick", value.asInstanceOf[js.Any])
    
    inline def setIndentFromTickUndefined: Self = StObject.set(x, "indentFromTick", js.undefined)
  }
}
