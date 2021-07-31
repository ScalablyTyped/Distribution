package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScatterChart
  extends StObject
     with CoreChartBase {
  
  def draw(data: DataTable): Unit = js.native
  def draw(data: DataTable, options: ScatterChartOptions): Unit = js.native
  def draw(data: DataView): Unit = js.native
  def draw(data: DataView, options: ScatterChartOptions): Unit = js.native
}
