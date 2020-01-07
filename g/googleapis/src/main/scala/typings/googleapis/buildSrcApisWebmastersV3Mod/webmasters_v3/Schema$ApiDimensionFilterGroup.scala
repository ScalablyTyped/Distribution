package typings.googleapis.buildSrcApisWebmastersV3Mod.webmasters_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ApiDimensionFilterGroup extends js.Object {
  var filters: js.UndefOr[js.Array[Schema$ApiDimensionFilter]] = js.native
  var groupType: js.UndefOr[String] = js.native
}

object Schema$ApiDimensionFilterGroup {
  @scala.inline
  def apply(filters: js.Array[Schema$ApiDimensionFilter] = null, groupType: String = null): Schema$ApiDimensionFilterGroup = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (groupType != null) __obj.updateDynamic("groupType")(groupType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ApiDimensionFilterGroup]
  }
}

