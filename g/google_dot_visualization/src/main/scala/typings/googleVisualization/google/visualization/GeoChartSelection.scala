package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoChartSelection extends StObject {
  
  var row: Double = js.native
}
object GeoChartSelection {
  
  @scala.inline
  def apply(row: Double): GeoChartSelection = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoChartSelection]
  }
  
  @scala.inline
  implicit class GeoChartSelectionMutableBuilder[Self <: GeoChartSelection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
