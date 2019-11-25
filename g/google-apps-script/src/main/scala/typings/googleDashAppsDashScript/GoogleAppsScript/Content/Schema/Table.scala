package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Table extends js.Object {
  var columnHeaders: js.UndefOr[Headers] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var rowHeaders: js.UndefOr[Headers] = js.undefined
  var rows: js.UndefOr[js.Array[Row]] = js.undefined
}

object Table {
  @scala.inline
  def apply(
    columnHeaders: Headers = null,
    name: String = null,
    rowHeaders: Headers = null,
    rows: js.Array[Row] = null
  ): Table = {
    val __obj = js.Dynamic.literal()
    if (columnHeaders != null) __obj.updateDynamic("columnHeaders")(columnHeaders.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rowHeaders != null) __obj.updateDynamic("rowHeaders")(rowHeaders.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
}

