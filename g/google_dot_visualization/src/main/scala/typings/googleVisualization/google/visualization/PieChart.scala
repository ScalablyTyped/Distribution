package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PieChart
  extends StObject
     with CoreChartBase {
  
  def draw(data: DataTable, options: PieChartOptions): Unit = js.native
  def draw(data: DataView, options: PieChartOptions): Unit = js.native
}
