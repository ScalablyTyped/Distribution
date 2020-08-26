package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationContext extends js.Object {
  /**
    * IDs representing the geo location for this context.
    * Please refer to the
    * [geo-table.csv](https://storage.googleapis.com/adx-rtb-dictionaries/geo-table.csv)
    * file for different geo criteria IDs.
    */
  var geoCriteriaIds: js.UndefOr[js.Array[Double]] = js.native
}

object LocationContext {
  @scala.inline
  def apply(): LocationContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationContext]
  }
  @scala.inline
  implicit class LocationContextOps[Self <: LocationContext] (val x: Self) extends AnyVal {
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
    def setGeoCriteriaIdsVarargs(value: Double*): Self = this.set("geoCriteriaIds", js.Array(value :_*))
    @scala.inline
    def setGeoCriteriaIds(value: js.Array[Double]): Self = this.set("geoCriteriaIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeoCriteriaIds: Self = this.set("geoCriteriaIds", js.undefined)
  }
  
}

