package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrgChart
  extends StObject
     with ChartBase {
  
  def collapse(row: Double, collapsed: Boolean): Unit = js.native
  
  def draw(data: DataTable, options: OrgChartOptions): Unit = js.native
  def draw(data: DataView, options: OrgChartOptions): Unit = js.native
  
  def getChildrenIndexes(row: Double): js.Array[Double] = js.native
  
  def getCollapsedNodes(): js.Array[Double] = js.native
}
