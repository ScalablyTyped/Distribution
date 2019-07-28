package typings.googleDotVisualization.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.Map")
@js.native
class Map () extends CoreChartBase {
  def draw(data: DataTable): Unit = js.native
  def draw(data: DataTable, options: MapOptions): Unit = js.native
  def draw(data: DataView): Unit = js.native
  def draw(data: DataView, options: MapOptions): Unit = js.native
  def getAction(actionID: String): Unit = js.native
  def removeAction(actionID: Double): Unit = js.native
  def setAction(action: Double): Unit = js.native
  def setSelection(): Unit = js.native
}

