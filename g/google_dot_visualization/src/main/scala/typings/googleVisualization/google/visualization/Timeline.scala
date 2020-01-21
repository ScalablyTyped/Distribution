package typings.googleVisualization.google.visualization

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.Timeline")
@js.native
class Timeline protected () extends js.Object {
  def this(element: Element) = this()
  def clearChart(): Unit = js.native
  def draw(data: DataTable): Unit = js.native
  def draw(data: DataTable, options: TimelineOptions): Unit = js.native
  def draw(data: DataView): Unit = js.native
  def draw(data: DataView, options: TimelineOptions): Unit = js.native
  def getSelection(): js.Array[VisualizationSelectionArray] = js.native
}

