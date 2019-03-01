package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortByColumn extends js.Object {
  var column: scala.Double
  var desc: scala.Boolean
}

object SortByColumn {
  @scala.inline
  def apply(column: scala.Double, desc: scala.Boolean): SortByColumn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("desc")(desc)
    __obj.asInstanceOf[SortByColumn]
  }
}

