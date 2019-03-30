package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableDataInsertAllResponse extends js.Object {
  var insertErrors: js.UndefOr[js.Array[TableDataInsertAllResponseInsertErrors]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object TableDataInsertAllResponse {
  @scala.inline
  def apply(
    insertErrors: js.Array[TableDataInsertAllResponseInsertErrors] = null,
    kind: java.lang.String = null
  ): TableDataInsertAllResponse = {
    val __obj = js.Dynamic.literal()
    if (insertErrors != null) __obj.updateDynamic("insertErrors")(insertErrors)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[TableDataInsertAllResponse]
  }
}

