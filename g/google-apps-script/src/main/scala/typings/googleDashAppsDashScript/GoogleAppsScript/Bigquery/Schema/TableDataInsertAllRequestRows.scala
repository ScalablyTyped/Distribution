package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableDataInsertAllRequestRows extends js.Object {
  var insertId: js.UndefOr[String] = js.undefined
  var json: js.UndefOr[js.Object] = js.undefined
}

object TableDataInsertAllRequestRows {
  @scala.inline
  def apply(insertId: String = null, json: js.Object = null): TableDataInsertAllRequestRows = {
    val __obj = js.Dynamic.literal()
    if (insertId != null) __obj.updateDynamic("insertId")(insertId.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableDataInsertAllRequestRows]
  }
}

