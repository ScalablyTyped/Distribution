package typings.devextreme.anon

import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.fixed
import typings.devextreme.devextremeStrings.high
import typings.devextreme.devextremeStrings.low
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.percent
import typings.devextreme.devextremeStrings.stdDeviation
import typings.devextreme.devextremeStrings.stdError
import typings.devextreme.devextremeStrings.variance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeLength extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var displayMode: js.UndefOr[auto | high | low | none] = js.undefined
  
  var edgeLength: js.UndefOr[Double] = js.undefined
  
  var highValueField: js.UndefOr[String] = js.undefined
  
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  var lowValueField: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[fixed | percent | stdDeviation | stdError | variance] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object EdgeLength {
  
  inline def apply(): EdgeLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeLength]
  }
  
  extension [Self <: EdgeLength](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisplayMode(value: auto | high | low | none): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
    
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
    
    inline def setType(value: fixed | percent | stdDeviation | stdError | variance): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
