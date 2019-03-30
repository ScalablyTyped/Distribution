package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableBorderRow extends js.Object {
  var tableBorderCells: js.UndefOr[js.Array[TableBorderCell]] = js.undefined
}

object TableBorderRow {
  @scala.inline
  def apply(tableBorderCells: js.Array[TableBorderCell] = null): TableBorderRow = {
    val __obj = js.Dynamic.literal()
    if (tableBorderCells != null) __obj.updateDynamic("tableBorderCells")(tableBorderCells)
    __obj.asInstanceOf[TableBorderRow]
  }
}

