package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeatmapConfig extends StObject {
  
  var heatmapConfig: js.UndefOr[Alpha] = js.undefined
  
  var model: js.UndefOr[typings.forgeViewer.Autodesk.Viewing.Model] = js.undefined
}
object HeatmapConfig {
  
  inline def apply(): HeatmapConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeatmapConfig]
  }
  
  extension [Self <: HeatmapConfig](x: Self) {
    
    inline def setHeatmapConfig(value: Alpha): Self = StObject.set(x, "heatmapConfig", value.asInstanceOf[js.Any])
    
    inline def setHeatmapConfigUndefined: Self = StObject.set(x, "heatmapConfig", js.undefined)
    
    inline def setModel(value: typings.forgeViewer.Autodesk.Viewing.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
