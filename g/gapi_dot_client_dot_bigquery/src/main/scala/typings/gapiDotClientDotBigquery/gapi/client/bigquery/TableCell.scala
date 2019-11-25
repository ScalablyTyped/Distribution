package typings.gapiDotClientDotBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCell extends js.Object {
  var v: js.UndefOr[js.Any] = js.undefined
}

object TableCell {
  @scala.inline
  def apply(v: js.Any = null): TableCell = {
    val __obj = js.Dynamic.literal()
    if (v != null) __obj.updateDynamic("v")(v.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCell]
  }
}

