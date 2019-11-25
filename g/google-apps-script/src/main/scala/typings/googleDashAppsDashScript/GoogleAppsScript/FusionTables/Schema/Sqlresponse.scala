package typings.googleDashAppsDashScript.GoogleAppsScript.FusionTables.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sqlresponse extends js.Object {
  var columns: js.UndefOr[js.Array[String]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var rows: js.UndefOr[js.Array[js.Array[js.Object]]] = js.undefined
}

object Sqlresponse {
  @scala.inline
  def apply(columns: js.Array[String] = null, kind: String = null, rows: js.Array[js.Array[js.Object]] = null): Sqlresponse = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sqlresponse]
  }
}

