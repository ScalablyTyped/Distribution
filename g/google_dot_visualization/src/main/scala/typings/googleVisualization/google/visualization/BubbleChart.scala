package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BubbleChart
  extends StObject
     with CoreChartBase {
  
  def draw(data: DataTable): Unit = js.native
  def draw(data: DataTable, options: BubbleChartOptions): Unit = js.native
  def draw(data: DataView): Unit = js.native
  def draw(data: DataView, options: BubbleChartOptions): Unit = js.native
}
