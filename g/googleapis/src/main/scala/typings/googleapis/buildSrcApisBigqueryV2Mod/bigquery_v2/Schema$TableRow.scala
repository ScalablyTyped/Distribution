package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TableRow extends js.Object {
  /**
    * Represents a single row in the result set, consisting of one or more
    * fields.
    */
  var f: js.UndefOr[js.Array[Schema$TableCell]] = js.native
}

object Schema$TableRow {
  @scala.inline
  def apply(f: js.Array[Schema$TableCell] = null): Schema$TableRow = {
    val __obj = js.Dynamic.literal()
    if (f != null) __obj.updateDynamic("f")(f.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TableRow]
  }
}

