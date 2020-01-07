package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Aggregation of items by status code as of the specified date.
  */
@js.native
trait Schema$CustomerIndexStats extends js.Object {
  /**
    * Date for which statistics were calculated.
    */
  var date: js.UndefOr[Schema$Date] = js.native
  /**
    * Number of items aggregrated by status code.
    */
  var itemCountByStatus: js.UndefOr[js.Array[Schema$ItemCountByStatus]] = js.native
}

object Schema$CustomerIndexStats {
  @scala.inline
  def apply(date: Schema$Date = null, itemCountByStatus: js.Array[Schema$ItemCountByStatus] = null): Schema$CustomerIndexStats = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (itemCountByStatus != null) __obj.updateDynamic("itemCountByStatus")(itemCountByStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CustomerIndexStats]
  }
}

