package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Row extends js.Object {
  /**
    * The list of cells that constitute the row. Must have the same length as columnHeaders for two-dimensional tables, a length of 1 for one-dimensional
    * tables. Required.
    */
  var cells: js.UndefOr[js.Array[Value]] = js.undefined
}

object Row {
  @scala.inline
  def apply(cells: js.Array[Value] = null): Row = {
    val __obj = js.Dynamic.literal()
    if (cells != null) __obj.updateDynamic("cells")(cells.asInstanceOf[js.Any])
    __obj.asInstanceOf[Row]
  }
}

