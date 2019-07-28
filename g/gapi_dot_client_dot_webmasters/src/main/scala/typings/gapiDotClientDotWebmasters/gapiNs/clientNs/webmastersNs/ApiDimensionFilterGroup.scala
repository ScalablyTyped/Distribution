package typings.gapiDotClientDotWebmasters.gapiNs.clientNs.webmastersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiDimensionFilterGroup extends js.Object {
  var filters: js.UndefOr[js.Array[ApiDimensionFilter]] = js.undefined
  var groupType: js.UndefOr[String] = js.undefined
}

object ApiDimensionFilterGroup {
  @scala.inline
  def apply(filters: js.Array[ApiDimensionFilter] = null, groupType: String = null): ApiDimensionFilterGroup = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (groupType != null) __obj.updateDynamic("groupType")(groupType)
    __obj.asInstanceOf[ApiDimensionFilterGroup]
  }
}

