package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Columns extends js.Object {
  var columns: js.UndefOr[js.Array[String]] = js.native
  var table: js.UndefOr[String] = js.native
}

object Anon_Columns {
  @scala.inline
  def apply(columns: js.Array[String] = null, table: String = null): Anon_Columns = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Columns]
  }
}

