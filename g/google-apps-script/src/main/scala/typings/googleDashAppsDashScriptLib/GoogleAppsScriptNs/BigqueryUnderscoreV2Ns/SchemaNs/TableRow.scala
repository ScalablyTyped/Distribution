package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs

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
    if (f != null) __obj.updateDynamic("f")(f)
    __obj.asInstanceOf[TableRow]
  }
}

