package typings.googleDotVisualization.google.visualization

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.ChartBase")
@js.native
class ChartBase protected () extends js.Object {
  def this(element: Element) = this()
  def clearChart(): Unit = js.native
  def getImageURI(): String = js.native
  def getSelection(): js.Array[VisualizationSelectionArray] = js.native
  def setSelection(selection: js.Array[VisualizationSelectionArray]): Unit = js.native
}

