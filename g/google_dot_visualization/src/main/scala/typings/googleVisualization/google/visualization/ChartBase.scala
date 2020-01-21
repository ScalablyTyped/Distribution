package typings.googleVisualization.google.visualization

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.ChartBase")
@js.native
abstract class ChartBase protected () extends js.Object {
  def this(element: Element) = this()
  def getContainer(): Element = js.native
  def getSelection(): js.Array[VisualizationSelectionArray] = js.native
  def setSelection(selection: js.Array[VisualizationSelectionArray]): Unit = js.native
}

