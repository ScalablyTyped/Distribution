package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Row extends js.Object {
  var cells: js.UndefOr[js.Array[Value]] = js.undefined
}

object Row {
  @scala.inline
  def apply(cells: js.Array[Value] = null): Row = {
    val __obj = js.Dynamic.literal()
    if (cells != null) __obj.updateDynamic("cells")(cells)
    __obj.asInstanceOf[Row]
  }
}

