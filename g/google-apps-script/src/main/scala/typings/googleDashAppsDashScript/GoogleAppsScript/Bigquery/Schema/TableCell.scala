package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCell extends js.Object {
  var v: js.UndefOr[js.Object] = js.undefined
}

object TableCell {
  @scala.inline
  def apply(v: js.Object = null): TableCell = {
    val __obj = js.Dynamic.literal()
    if (v != null) __obj.updateDynamic("v")(v)
    __obj.asInstanceOf[TableCell]
  }
}

