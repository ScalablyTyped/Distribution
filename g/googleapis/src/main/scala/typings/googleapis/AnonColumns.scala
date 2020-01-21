package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColumns extends js.Object {
  var columns: js.UndefOr[js.Array[String]] = js.native
  var table: js.UndefOr[String] = js.native
}

object AnonColumns {
  @scala.inline
  def apply(columns: js.Array[String] = null, table: String = null): AnonColumns = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumns]
  }
}

