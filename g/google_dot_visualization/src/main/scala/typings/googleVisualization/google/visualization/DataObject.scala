package typings.googleVisualization.google.visualization

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
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObject]
  }
}

