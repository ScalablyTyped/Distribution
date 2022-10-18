package typings.dxf

import typings.dxf.layersMod.Layer
import typings.dxf.stylesMod.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handlersTablesMod {
  
  trait DXFTable extends StObject {
    
    var layers: js.Array[Layer]
    
    var styles: js.Array[Style]
  }
  object DXFTable {
    
    inline def apply(layers: js.Array[Layer], styles: js.Array[Style]): DXFTable = {
      val __obj = js.Dynamic.literal(layers = layers.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[DXFTable]
    }
    
    extension [Self <: DXFTable](x: Self) {
      
      inline def setLayers(value: js.Array[Layer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersVarargs(value: Layer*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setStyles(value: js.Array[Style]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesVarargs(value: Style*): Self = StObject.set(x, "styles", js.Array(value*))
    }
  }
}
