package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layer extends StObject {
  
  var grouping: js.UndefOr[String] = js.undefined
  
  var layer: js.UndefOr[String] = js.undefined
}
object Layer {
  
  inline def apply(): Layer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Layer]
  }
  
  extension [Self <: Layer](x: Self) {
    
    inline def setGrouping(value: String): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
    
    inline def setGroupingUndefined: Self = StObject.set(x, "grouping", js.undefined)
    
    inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
  }
}
