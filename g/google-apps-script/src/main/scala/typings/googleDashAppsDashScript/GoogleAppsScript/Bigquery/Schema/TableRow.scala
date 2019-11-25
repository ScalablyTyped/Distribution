package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRow extends js.Object {
  var f: js.UndefOr[js.Array[TableCell]] = js.undefined
}

object TableRow {
  @scala.inline
  def apply(f: js.Array[TableCell] = null): TableRow = {
    val __obj = js.Dynamic.literal()
    if (f != null) __obj.updateDynamic("f")(f.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRow]
  }
}

