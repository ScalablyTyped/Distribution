package typings.gapiDotClientDotBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRow extends js.Object {
  /** Represents a single row in the result set, consisting of one or more fields. */
  var f: js.UndefOr[js.Array[TableCell]] = js.undefined
}

object TableRow {
  @scala.inline
  def apply(f: js.Array[TableCell] = null): TableRow = {
    val __obj = js.Dynamic.literal()
    if (f != null) __obj.updateDynamic("f")(f)
    __obj.asInstanceOf[TableRow]
  }
}

