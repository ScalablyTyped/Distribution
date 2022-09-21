package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.common.charts.LegendMarkerState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fill extends StObject {
  
  /**
    * The marker&apos;s color.
    */
  var fill: js.UndefOr[String] = js.undefined
  
  /**
    * The marker&apos;s opacity.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * The markerSize in pixels.
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * The marker&apos;s state.
    */
  var state: js.UndefOr[LegendMarkerState] = js.undefined
}
object Fill {
  
  inline def apply(): Fill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fill]
  }
  
  extension [Self <: Fill](x: Self) {
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setState(value: LegendMarkerState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
