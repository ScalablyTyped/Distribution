package typings.gapiDotClientDotSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delete extends js.Object {
  /** Required. The primary keys of the rows within table to delete. */
  var keySet: js.UndefOr[KeySet] = js.undefined
  /** Required. The table whose rows will be deleted. */
  var table: js.UndefOr[String] = js.undefined
}

object Delete {
  @scala.inline
  def apply(keySet: KeySet = null, table: String = null): Delete = {
    val __obj = js.Dynamic.literal()
    if (keySet != null) __obj.updateDynamic("keySet")(keySet)
    if (table != null) __obj.updateDynamic("table")(table)
    __obj.asInstanceOf[Delete]
  }
}

