package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineBasicMaterialParameters
  extends StObject
     with MaterialParameters {
  
  var color: js.UndefOr[Double | String | Color] = js.undefined
  
  var linecap: js.UndefOr[String] = js.undefined
  
  var linejoin: js.UndefOr[String] = js.undefined
  
  var linewidth: js.UndefOr[Double] = js.undefined
}
object LineBasicMaterialParameters {
  
  inline def apply(): LineBasicMaterialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineBasicMaterialParameters]
  }
  
  extension [Self <: LineBasicMaterialParameters](x: Self) {
    
    inline def setColor(value: Double | String | Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLinecap(value: String): Self = StObject.set(x, "linecap", value.asInstanceOf[js.Any])
    
    inline def setLinecapUndefined: Self = StObject.set(x, "linecap", js.undefined)
    
    inline def setLinejoin(value: String): Self = StObject.set(x, "linejoin", value.asInstanceOf[js.Any])
    
    inline def setLinejoinUndefined: Self = StObject.set(x, "linejoin", js.undefined)
    
    inline def setLinewidth(value: Double): Self = StObject.set(x, "linewidth", value.asInstanceOf[js.Any])
    
    inline def setLinewidthUndefined: Self = StObject.set(x, "linewidth", js.undefined)
  }
}
