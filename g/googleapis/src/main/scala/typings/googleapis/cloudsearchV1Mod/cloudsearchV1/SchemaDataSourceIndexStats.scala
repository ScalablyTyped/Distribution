package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Aggregation of items by status code as of the specified date.
  */
@js.native
trait SchemaDataSourceIndexStats extends js.Object {
  /**
    * Date for which index stats were calculated. If the date of request is not
    * the current date then stats calculated on the next day are returned.
    * Stats are calculated close to mid night in this case. If date of request
    * is current date, then real time stats are returned.
    */
  var date: js.UndefOr[SchemaDate] = js.native
  /**
    * Number of items aggregrated by status code.
    */
  var itemCountByStatus: js.UndefOr[js.Array[SchemaItemCountByStatus]] = js.native
}

object SchemaDataSourceIndexStats {
  @scala.inline
  def apply(date: SchemaDate = null, itemCountByStatus: js.Array[SchemaItemCountByStatus] = null): SchemaDataSourceIndexStats = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (itemCountByStatus != null) __obj.updateDynamic("itemCountByStatus")(itemCountByStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDataSourceIndexStats]
  }
}

