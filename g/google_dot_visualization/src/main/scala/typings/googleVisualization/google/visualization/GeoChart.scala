package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoChart
  extends StObject
     with ChartBaseRenderable {
  
  def draw(data: DataTable, options: GeoChartOptions): Unit = js.native
  def draw(data: DataView, options: GeoChartOptions): Unit = js.native
}
