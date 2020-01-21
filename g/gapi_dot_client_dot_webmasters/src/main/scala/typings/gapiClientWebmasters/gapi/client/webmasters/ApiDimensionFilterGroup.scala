package typings.gapiClientWebmasters.gapi.client.webmasters

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
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (groupType != null) __obj.updateDynamic("groupType")(groupType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiDimensionFilterGroup]
  }
}

