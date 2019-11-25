package typings.gapiDotClientDotAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationContext extends js.Object {
  /**
    * IDs representing the geo location for this context.
    * Please refer to the
    * [geo-table.csv](https://storage.googleapis.com/adx-rtb-dictionaries/geo-table.csv)
    * file for different geo criteria IDs.
    */
  var geoCriteriaIds: js.UndefOr[js.Array[Double]] = js.undefined
}

object LocationContext {
  @scala.inline
  def apply(geoCriteriaIds: js.Array[Double] = null): LocationContext = {
    val __obj = js.Dynamic.literal()
    if (geoCriteriaIds != null) __obj.updateDynamic("geoCriteriaIds")(geoCriteriaIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationContext]
  }
}

