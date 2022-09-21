package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineDashedMaterialParameters
  extends StObject
     with MaterialParameters {
  
  var color: js.UndefOr[Double | String | Color] = js.undefined
  
  var dashSize: js.UndefOr[Double] = js.undefined
  
  var gapSize: js.UndefOr[Double] = js.undefined
  
  var linewidth: js.UndefOr[Double] = js.undefined
  
  var scale: js.UndefOr[Double] = js.undefined
}
object LineDashedMaterialParameters {
  
  inline def apply(): LineDashedMaterialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineDashedMaterialParameters]
  }
  
  extension [Self <: LineDashedMaterialParameters](x: Self) {
    
    inline def setColor(value: Double | String | Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDashSize(value: Double): Self = StObject.set(x, "dashSize", value.asInstanceOf[js.Any])
    
    inline def setDashSizeUndefined: Self = StObject.set(x, "dashSize", js.undefined)
    
    inline def setGapSize(value: Double): Self = StObject.set(x, "gapSize", value.asInstanceOf[js.Any])
    
    inline def setGapSizeUndefined: Self = StObject.set(x, "gapSize", js.undefined)
    
    inline def setLinewidth(value: Double): Self = StObject.set(x, "linewidth", value.asInstanceOf[js.Any])
    
    inline def setLinewidthUndefined: Self = StObject.set(x, "linewidth", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
