package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Arguments to delete operations.
  */
@js.native
trait Schema$Delete extends js.Object {
  /**
    * Required. The primary keys of the rows within table to delete. Delete is
    * idempotent. The transaction will succeed even if some or all rows do not
    * exist.
    */
  var keySet: js.UndefOr[Schema$KeySet] = js.native
  /**
    * Required. The table whose rows will be deleted.
    */
  var table: js.UndefOr[String] = js.native
}

object Schema$Delete {
  @scala.inline
  def apply(keySet: Schema$KeySet = null, table: String = null): Schema$Delete = {
    val __obj = js.Dynamic.literal()
    if (keySet != null) __obj.updateDynamic("keySet")(keySet.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Delete]
  }
}

