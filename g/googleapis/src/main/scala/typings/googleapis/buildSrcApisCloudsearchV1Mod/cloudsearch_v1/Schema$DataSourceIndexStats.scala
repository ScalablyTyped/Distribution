package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Aggregation of items by status code as of the specified date.
  */
@js.native
trait Schema$DataSourceIndexStats extends js.Object {
  /**
    * Date for which index stats were calculated. If the date of request is not
    * the current date then stats calculated on the next day are returned.
    * Stats are calculated close to mid night in this case. If date of request
    * is current date, then real time stats are returned.
    */
  var date: js.UndefOr[Schema$Date] = js.native
  /**
    * Number of items aggregrated by status code.
    */
  var itemCountByStatus: js.UndefOr[js.Array[Schema$ItemCountByStatus]] = js.native
}

object Schema$DataSourceIndexStats {
  @scala.inline
  def apply(date: Schema$Date = null, itemCountByStatus: js.Array[Schema$ItemCountByStatus] = null): Schema$DataSourceIndexStats = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (itemCountByStatus != null) __obj.updateDynamic("itemCountByStatus")(itemCountByStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DataSourceIndexStats]
  }
}

