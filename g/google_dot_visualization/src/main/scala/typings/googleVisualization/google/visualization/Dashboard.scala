package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dashboard extends StObject {
  
  def bind(controls: js.Array[ControlWrapper], charts: js.Array[ChartWrapper]): Dashboard = js.native
  def bind(controls: js.Array[ControlWrapper], charts: ChartWrapper): Dashboard = js.native
  def bind(controls: ControlWrapper, charts: js.Array[ChartWrapper]): Dashboard = js.native
  def bind(controls: ControlWrapper, charts: ChartWrapper): Dashboard = js.native
  
  def draw(data: DataTable): Unit = js.native
  def draw(data: DataView): Unit = js.native
  
  def getSelection(): js.Array[js.Object] = js.native
}
