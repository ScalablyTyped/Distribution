package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObjectRow extends js.Object {
  var c: js.Array[DataObjectCell]
  var p: js.UndefOr[js.Any] = js.undefined
}

object DataObjectRow {
  @scala.inline
  def apply(c: js.Array[DataObjectCell], p: js.Any = null): DataObjectRow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("c")(c)
    if (p != null) __obj.updateDynamic("p")(p)
    __obj.asInstanceOf[DataObjectRow]
  }
}

