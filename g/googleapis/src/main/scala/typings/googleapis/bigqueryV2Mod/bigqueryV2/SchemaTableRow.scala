package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTableRow extends js.Object {
  /**
    * Represents a single row in the result set, consisting of one or more
    * fields.
    */
  var f: js.UndefOr[js.Array[SchemaTableCell]] = js.native
}

object SchemaTableRow {
  @scala.inline
  def apply(f: js.Array[SchemaTableCell] = null): SchemaTableRow = {
    val __obj = js.Dynamic.literal()
    if (f != null) __obj.updateDynamic("f")(f.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTableRow]
  }
}

