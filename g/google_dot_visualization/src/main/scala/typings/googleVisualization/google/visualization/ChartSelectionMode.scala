package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googleVisualization.googleVisualizationStrings.single
  - typings.googleVisualization.googleVisualizationStrings.multiple
*/
trait ChartSelectionMode extends js.Object

object ChartSelectionMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def multiple: typings.googleVisualization.googleVisualizationStrings.multiple = this.cast("multiple")
  @scala.inline
  def single: typings.googleVisualization.googleVisualizationStrings.single = this.cast("single")
}

