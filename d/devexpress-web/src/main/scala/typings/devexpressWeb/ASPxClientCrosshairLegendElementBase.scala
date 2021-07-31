package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The base class for elements the Crosshair Cursor displays in the legend.
  */
trait ASPxClientCrosshairLegendElementBase extends StObject {
  
  /**
    * Provides access to the crosshair axis label element to custom draw the crosshair.
    */
  var AxisLabelElement: ASPxClientCrosshairAxisLabelElement
  
  /**
    * Returns the Crosshair Cursor's line element to custom draw the crosshair.
    */
  var LineElement: ASPxClientCrosshairLineElement
  
  /**
    * Returns the series or indicator point for which the Crosshair Cursor creates this element.
    */
  var Point: ASPxClientSeriesPoint
  
  /**
    * Returns the value that specifies whether the crosshair legend element is visible.
    */
  var visible: Boolean
}
object ASPxClientCrosshairLegendElementBase {
  
  @scala.inline
  def apply(
    AxisLabelElement: ASPxClientCrosshairAxisLabelElement,
    LineElement: ASPxClientCrosshairLineElement,
    Point: ASPxClientSeriesPoint,
    visible: Boolean
  ): ASPxClientCrosshairLegendElementBase = {
    val __obj = js.Dynamic.literal(AxisLabelElement = AxisLabelElement.asInstanceOf[js.Any], LineElement = LineElement.asInstanceOf[js.Any], Point = Point.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCrosshairLegendElementBase]
  }
  
  @scala.inline
  implicit class ASPxClientCrosshairLegendElementBaseMutableBuilder[Self <: ASPxClientCrosshairLegendElementBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxisLabelElement(value: ASPxClientCrosshairAxisLabelElement): Self = StObject.set(x, "AxisLabelElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineElement(value: ASPxClientCrosshairLineElement): Self = StObject.set(x, "LineElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: ASPxClientSeriesPoint): Self = StObject.set(x, "Point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
