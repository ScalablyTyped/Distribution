package typings.googleVisualization.global.google.visualization

import typings.googleVisualization.google.visualization.VisualizationSelectionArray
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.ChartBaseClearable")
@js.native
abstract class ChartBaseClearable ()
  extends typings.googleVisualization.google.visualization.ChartBaseClearable {
  /* CompleteClass */
  override def clearChart(): Unit = js.native
  /* CompleteClass */
  override def getContainer(): Element = js.native
  /* CompleteClass */
  override def getSelection(): js.Array[VisualizationSelectionArray] = js.native
  /* CompleteClass */
  override def setSelection(selection: js.Array[VisualizationSelectionArray]): Unit = js.native
}

