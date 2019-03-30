package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeAnalyticsUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResponse extends js.Object {
  var columnHeaders: js.UndefOr[js.Array[ResultTableColumnHeader]] = js.undefined
  var errors: js.UndefOr[Errors] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var rows: js.UndefOr[js.Array[js.Array[js.Object]]] = js.undefined
}

object QueryResponse {
  @scala.inline
  def apply(
    columnHeaders: js.Array[ResultTableColumnHeader] = null,
    errors: Errors = null,
    kind: java.lang.String = null,
    rows: js.Array[js.Array[js.Object]] = null
  ): QueryResponse = {
    val __obj = js.Dynamic.literal()
    if (columnHeaders != null) __obj.updateDynamic("columnHeaders")(columnHeaders)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    __obj.asInstanceOf[QueryResponse]
  }
}

