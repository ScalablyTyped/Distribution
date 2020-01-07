package typings.googleapis.buildSrcApisBigtableadminV2Mod.bigtableadmin_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for
  * google.bigtable.admin.v2.BigtableTableAdmin.DropRowRange
  */
@js.native
trait Schema$DropRowRangeRequest extends js.Object {
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

object Schema$DropRowRangeRequest {
  @scala.inline
  def apply(deleteAllDataFromTable: js.UndefOr[Boolean] = js.undefined, rowKeyPrefix: String = null): Schema$DropRowRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleteAllDataFromTable)) __obj.updateDynamic("deleteAllDataFromTable")(deleteAllDataFromTable.asInstanceOf[js.Any])
    if (rowKeyPrefix != null) __obj.updateDynamic("rowKeyPrefix")(rowKeyPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DropRowRangeRequest]
  }
}

