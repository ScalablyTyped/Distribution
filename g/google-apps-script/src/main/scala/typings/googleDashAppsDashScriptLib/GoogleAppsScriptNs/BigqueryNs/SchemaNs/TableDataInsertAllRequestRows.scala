package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableDataInsertAllRequestRows extends js.Object {
  var insertId: js.UndefOr[java.lang.String] = js.undefined
  var json: js.UndefOr[js.Object] = js.undefined
}

object TableDataInsertAllRequestRows {
  @scala.inline
  def apply(insertId: java.lang.String = null, json: js.Object = null): TableDataInsertAllRequestRows = {
    val __obj = js.Dynamic.literal()
    if (insertId != null) __obj.updateDynamic("insertId")(insertId)
    if (json != null) __obj.updateDynamic("json")(json)
    __obj.asInstanceOf[TableDataInsertAllRequestRows]
  }
}

