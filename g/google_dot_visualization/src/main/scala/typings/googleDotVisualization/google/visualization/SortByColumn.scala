package typings.googleDotVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortByColumn extends js.Object {
  var column: Double
  var desc: Boolean
}

object SortByColumn {
  @scala.inline
  def apply(column: Double, desc: Boolean): SortByColumn = {
    val __obj = js.Dynamic.literal(column = column, desc = desc)
  
    __obj.asInstanceOf[SortByColumn]
  }
}

