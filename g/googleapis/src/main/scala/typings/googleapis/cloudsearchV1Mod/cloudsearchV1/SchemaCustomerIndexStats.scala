package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Aggregation of items by status code as of the specified date.
  */
@js.native
trait SchemaCustomerIndexStats extends js.Object {
  /**
    * Date for which statistics were calculated.
    */
  var date: js.UndefOr[SchemaDate] = js.native
  /**
    * Number of items aggregrated by status code.
    */
  var itemCountByStatus: js.UndefOr[js.Array[SchemaItemCountByStatus]] = js.native
}

object SchemaCustomerIndexStats {
  @scala.inline
  def apply(): SchemaCustomerIndexStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerIndexStats]
  }
  @scala.inline
  implicit class SchemaCustomerIndexStatsOps[Self <: SchemaCustomerIndexStats] (val x: Self) extends AnyVal {
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
    def setDate(value: SchemaDate): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setItemCountByStatusVarargs(value: SchemaItemCountByStatus*): Self = this.set("itemCountByStatus", js.Array(value :_*))
    @scala.inline
    def setItemCountByStatus(value: js.Array[SchemaItemCountByStatus]): Self = this.set("itemCountByStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemCountByStatus: Self = this.set("itemCountByStatus", js.undefined)
  }
  
}

