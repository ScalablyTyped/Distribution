package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  var cols: js.Array[DataObjectColumn]
  var p: js.Any
  var rows: js.Array[DataObjectRow]
}

object DataObject {
  @scala.inline
  def apply(cols: js.Array[DataObjectColumn], p: js.Any, rows: js.Array[DataObjectRow]): DataObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cols")(cols)
    __obj.updateDynamic("p")(p)
    __obj.updateDynamic("rows")(rows)
    __obj.asInstanceOf[DataObject]
  }
}

