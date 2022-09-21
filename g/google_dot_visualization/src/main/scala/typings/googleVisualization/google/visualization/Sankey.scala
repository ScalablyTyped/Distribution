package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sankey
  extends StObject
     with ChartBaseClearable {
  
  def draw(data: DataTable, options: SankeyChartOptions): Unit = js.native
  def draw(data: DataView, options: SankeyChartOptions): Unit = js.native
}
