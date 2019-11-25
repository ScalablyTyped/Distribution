package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaDataDataTableRows extends js.Object {
  var c: js.UndefOr[js.Array[GaDataDataTableRowsC]] = js.undefined
}

object GaDataDataTableRows {
  @scala.inline
  def apply(c: js.Array[GaDataDataTableRowsC] = null): GaDataDataTableRows = {
    val __obj = js.Dynamic.literal()
    if (c != null) __obj.updateDynamic("c")(c.asInstanceOf[js.Any])
    __obj.asInstanceOf[GaDataDataTableRows]
  }
}

