package typings.dxf

import typings.dxf.dxfStrings.LAYER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layersMod {
  
  trait Layer extends StObject {
    
    var colorNumber: js.UndefOr[Double] = js.undefined
    
    var flags: js.UndefOr[Any] = js.undefined
    
    var lineTypeName: js.UndefOr[String] = js.undefined
    
    var lineWeightEnum: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var plot: js.UndefOr[Boolean] = js.undefined
    
    var `type`: LAYER
  }
  object Layer {
    
    inline def apply(): Layer = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("LAYER")
      __obj.asInstanceOf[Layer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Layer] (val x: Self) extends AnyVal {
      
      inline def setColorNumber(value: Double): Self = StObject.set(x, "colorNumber", value.asInstanceOf[js.Any])
      
      inline def setColorNumberUndefined: Self = StObject.set(x, "colorNumber", js.undefined)
      
      inline def setFlags(value: Any): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setLineTypeName(value: String): Self = StObject.set(x, "lineTypeName", value.asInstanceOf[js.Any])
      
      inline def setLineTypeNameUndefined: Self = StObject.set(x, "lineTypeName", js.undefined)
      
      inline def setLineWeightEnum(value: Double): Self = StObject.set(x, "lineWeightEnum", value.asInstanceOf[js.Any])
      
      inline def setLineWeightEnumUndefined: Self = StObject.set(x, "lineWeightEnum", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPlot(value: Boolean): Self = StObject.set(x, "plot", value.asInstanceOf[js.Any])
      
      inline def setPlotUndefined: Self = StObject.set(x, "plot", js.undefined)
      
      inline def setType(value: LAYER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
