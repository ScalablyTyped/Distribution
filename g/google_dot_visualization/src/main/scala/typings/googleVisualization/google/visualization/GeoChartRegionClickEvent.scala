package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoChartRegionClickEvent extends StObject {
  
  var region: String
}
object GeoChartRegionClickEvent {
  
  inline def apply(region: String): GeoChartRegionClickEvent = {
    val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoChartRegionClickEvent]
  }
  
  extension [Self <: GeoChartRegionClickEvent](x: Self) {
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
  }
}
