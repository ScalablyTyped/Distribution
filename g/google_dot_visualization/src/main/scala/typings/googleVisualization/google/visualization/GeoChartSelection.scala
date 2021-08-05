package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoChartSelection extends StObject {
  
  var row: Double
}
object GeoChartSelection {
  
  inline def apply(row: Double): GeoChartSelection = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoChartSelection]
  }
  
  extension [Self <: GeoChartSelection](x: Self) {
    
    inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
