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
  def apply(date: SchemaDate = null, itemCountByStatus: js.Array[SchemaItemCountByStatus] = null): SchemaCustomerIndexStats = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (itemCountByStatus != null) __obj.updateDynamic("itemCountByStatus")(itemCountByStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCustomerIndexStats]
  }
}

