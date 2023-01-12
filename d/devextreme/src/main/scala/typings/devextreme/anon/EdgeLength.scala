package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.common.charts.ValueErrorBarDisplayMode
import typings.devextreme.mod.DevExpress.common.charts.ValueErrorBarType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeLength extends StObject {
  
  /**
    * Specifies the color of error bars.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether error bars must be displayed in full or partially.
    */
  var displayMode: js.UndefOr[ValueErrorBarDisplayMode] = js.undefined
  
  /**
    * Specifies the length of the lines that indicate error bar edges.
    */
  var edgeLength: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the data field that provides data for high error values.
    */
  var highValueField: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the width of the error bar line.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the data field that provides data for low error values.
    */
  var lowValueField: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the opacity of error bars.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies how error bar values must be calculated.
    */
  var `type`: js.UndefOr[ValueErrorBarType] = js.undefined
  
  /**
    * Specifies the value to be used for generating error bars.
    */
  var value: js.UndefOr[Double] = js.undefined
}
object EdgeLength {
  
  inline def apply(): EdgeLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeLength]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EdgeLength] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisplayMode(value: ValueErrorBarDisplayMode): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
    
    inline def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
    
    inline def setEdgeLength(value: Double): Self = StObject.set(x, "edgeLength", value.asInstanceOf[js.Any])
    
    inline def setEdgeLengthUndefined: Self = StObject.set(x, "edgeLength", js.undefined)
    
    inline def setHighValueField(value: String): Self = StObject.set(x, "highValueField", value.asInstanceOf[js.Any])
    
    inline def setHighValueFieldUndefined: Self = StObject.set(x, "highValueField", js.undefined)
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setLowValueField(value: String): Self = StObject.set(x, "lowValueField", value.asInstanceOf[js.Any])
    
    inline def setLowValueFieldUndefined: Self = StObject.set(x, "lowValueField", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setType(value: ValueErrorBarType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
