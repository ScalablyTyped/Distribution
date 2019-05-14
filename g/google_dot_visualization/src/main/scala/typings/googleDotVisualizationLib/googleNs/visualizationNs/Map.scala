package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.Map")
@js.native
class Map () extends CoreChartBase {
  def draw(data: DataTable): scala.Unit = js.native
  def draw(data: DataTable, options: MapOptions): scala.Unit = js.native
  def draw(data: DataView): scala.Unit = js.native
  def draw(data: DataView, options: MapOptions): scala.Unit = js.native
  def getAction(actionID: java.lang.String): scala.Unit = js.native
  def removeAction(actionID: scala.Double): scala.Unit = js.native
  def setAction(action: scala.Double): scala.Unit = js.native
  def setSelection(): scala.Unit = js.native
}

