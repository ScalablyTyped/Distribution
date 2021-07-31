package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The base class for all Crosshair Cursor's elements.
  */
trait ASPxClientCrosshairElementBase extends StObject {
  
  /**
    * Returns the Crosshair Cursor's axis label element that belongs to the Crosshair element.
    */
  var AxisLabelElement: ASPxClientCrosshairAxisLabelElement
  
  /**
    * Returns the Crosshair Cursor's label element that belongs to the Crosshair element.
    */
  var LabelElement: ASPxClientCrosshairSeriesLabelElement
  
  /**
    * Returns the Crosshair Cursor's line element that belongs to the Crosshair element.
    */
  var LineElement: ASPxClientCrosshairLineElement
  
  /**
    * Returns the series or indicator point for which the Crosshair Cursor creates this element.
    */
  var Point: ASPxClientSeriesPoint
  
  /**
    * Returns a value that specifies whether the crosshair element is visible.
    */
  var visible: Boolean
}
object ASPxClientCrosshairElementBase {
  
  @scala.inline
  def apply(
    AxisLabelElement: ASPxClientCrosshairAxisLabelElement,
    LabelElement: ASPxClientCrosshairSeriesLabelElement,
    LineElement: ASPxClientCrosshairLineElement,
    Point: ASPxClientSeriesPoint,
    visible: Boolean
  ): ASPxClientCrosshairElementBase = {
    val __obj = js.Dynamic.literal(AxisLabelElement = AxisLabelElement.asInstanceOf[js.Any], LabelElement = LabelElement.asInstanceOf[js.Any], LineElement = LineElement.asInstanceOf[js.Any], Point = Point.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCrosshairElementBase]
  }
  
  @scala.inline
  implicit class ASPxClientCrosshairElementBaseMutableBuilder[Self <: ASPxClientCrosshairElementBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxisLabelElement(value: ASPxClientCrosshairAxisLabelElement): Self = StObject.set(x, "AxisLabelElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelElement(value: ASPxClientCrosshairSeriesLabelElement): Self = StObject.set(x, "LabelElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineElement(value: ASPxClientCrosshairLineElement): Self = StObject.set(x, "LineElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: ASPxClientSeriesPoint): Self = StObject.set(x, "Point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
