package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeMap extends ChartBaseClearable {
  def draw(data: DataTable): Unit = js.native
  def draw(data: DataTable, options: TreeMapOptions): Unit = js.native
  def draw(data: DataView): Unit = js.native
  def draw(data: DataView, options: TreeMapOptions): Unit = js.native
  def getMaxPossibleDepth(): Double = js.native
  def goUpAndDraw(): Unit = js.native
}

