package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The CrosshairIndicatorLegendElement class's client-side equivalent.
  */
trait ASPxClientCrosshairIndicatorLegendElement
  extends StObject
     with ASPxClientCrosshairLegendElementBase {
  
  /**
    * Returns the Indicator whose point the legend element displays.
    */
  var Indicator: ASPxClientIndicator
}
object ASPxClientCrosshairIndicatorLegendElement {
  
  inline def apply(
    AxisLabelElement: ASPxClientCrosshairAxisLabelElement,
    Indicator: ASPxClientIndicator,
    LineElement: ASPxClientCrosshairLineElement,
    Point: ASPxClientSeriesPoint,
    visible: Boolean
  ): ASPxClientCrosshairIndicatorLegendElement = {
    val __obj = js.Dynamic.literal(AxisLabelElement = AxisLabelElement.asInstanceOf[js.Any], Indicator = Indicator.asInstanceOf[js.Any], LineElement = LineElement.asInstanceOf[js.Any], Point = Point.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCrosshairIndicatorLegendElement]
  }
  
  extension [Self <: ASPxClientCrosshairIndicatorLegendElement](x: Self) {
    
    inline def setIndicator(value: ASPxClientIndicator): Self = StObject.set(x, "Indicator", value.asInstanceOf[js.Any])
  }
}
