package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchClearValuesByDataFilterRequest extends js.Object {
  /** The DataFilters used to determine which ranges to clear. */
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.undefined
}

object BatchClearValuesByDataFilterRequest {
  @scala.inline
  def apply(dataFilters: js.Array[DataFilter] = null): BatchClearValuesByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    if (dataFilters != null) __obj.updateDynamic("dataFilters")(dataFilters)
    __obj.asInstanceOf[BatchClearValuesByDataFilterRequest]
  }
}

