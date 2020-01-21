package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTableCell extends js.Object {
  var v: js.UndefOr[js.Any] = js.native
}

object SchemaTableCell {
  @scala.inline
  def apply(v: js.Any = null): SchemaTableCell = {
    val __obj = js.Dynamic.literal()
    if (v != null) __obj.updateDynamic("v")(v.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTableCell]
  }
}

