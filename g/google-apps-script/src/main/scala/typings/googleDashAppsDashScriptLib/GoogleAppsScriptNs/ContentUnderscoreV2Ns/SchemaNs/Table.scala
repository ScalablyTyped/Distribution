package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Table extends js.Object {
  var columnHeaders: js.UndefOr[Headers] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var rowHeaders: js.UndefOr[Headers] = js.undefined
  var rows: js.UndefOr[js.Array[Row]] = js.undefined
}

object Table {
  @scala.inline
  def apply(
    columnHeaders: Headers = null,
    name: java.lang.String = null,
    rowHeaders: Headers = null,
    rows: js.Array[Row] = null
  ): Table = {
    val __obj = js.Dynamic.literal()
    if (columnHeaders != null) __obj.updateDynamic("columnHeaders")(columnHeaders)
    if (name != null) __obj.updateDynamic("name")(name)
    if (rowHeaders != null) __obj.updateDynamic("rowHeaders")(rowHeaders)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    __obj.asInstanceOf[Table]
  }
}

