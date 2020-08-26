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
  def apply(): SchemaDropRowRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDropRowRangeRequest]
  }
  @scala.inline
  implicit class SchemaDropRowRangeRequestOps[Self <: SchemaDropRowRangeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeleteAllDataFromTable(value: Boolean): Self = this.set("deleteAllDataFromTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteAllDataFromTable: Self = this.set("deleteAllDataFromTable", js.undefined)
    @scala.inline
    def setRowKeyPrefix(value: String): Self = this.set("rowKeyPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowKeyPrefix: Self = this.set("rowKeyPrefix", js.undefined)
  }
  
}

