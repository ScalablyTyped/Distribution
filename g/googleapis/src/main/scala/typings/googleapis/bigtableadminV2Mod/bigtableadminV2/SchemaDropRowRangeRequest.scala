package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for
  * google.bigtable.admin.v2.BigtableTableAdmin.DropRowRange
  */
@js.native
trait SchemaDropRowRangeRequest extends js.Object {
  /**
    * Delete all rows in the table. Setting this to false is a no-op.
    */
  var deleteAllDataFromTable: js.UndefOr[Boolean] = js.native
  /**
    * Delete all rows that start with this row key prefix. Prefix cannot be
    * zero length.
    */
  var rowKeyPrefix: js.UndefOr[String] = js.native
}

object SchemaDropRowRangeRequest {
  @scala.inline
  def apply(deleteAllDataFromTable: js.UndefOr[Boolean] = js.undefined, rowKeyPrefix: String = null): SchemaDropRowRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleteAllDataFromTable)) __obj.updateDynamic("deleteAllDataFromTable")(deleteAllDataFromTable.get.asInstanceOf[js.Any])
    if (rowKeyPrefix != null) __obj.updateDynamic("rowKeyPrefix")(rowKeyPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDropRowRangeRequest]
  }
}

