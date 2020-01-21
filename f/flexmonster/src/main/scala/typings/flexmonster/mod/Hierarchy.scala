package typings.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hierarchy extends js.Object {
  var caption: js.UndefOr[String] = js.undefined
  var dimensionName: js.UndefOr[String] = js.undefined
  var filter: js.UndefOr[Filter] = js.undefined
  var levels: js.UndefOr[js.Array[Level]] = js.undefined
  var sortName: js.UndefOr[String] = js.undefined
  var sortOrder: js.UndefOr[js.Array[String]] = js.undefined
  var uniqueName: js.UndefOr[String] = js.undefined
}

object Hierarchy {
  @scala.inline
  def apply(
    caption: String = null,
    dimensionName: String = null,
    filter: Filter = null,
    levels: js.Array[Level] = null,
    sortName: String = null,
    sortOrder: js.Array[String] = null,
    uniqueName: String = null
  ): Hierarchy = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (dimensionName != null) __obj.updateDynamic("dimensionName")(dimensionName.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (levels != null) __obj.updateDynamic("levels")(levels.asInstanceOf[js.Any])
    if (sortName != null) __obj.updateDynamic("sortName")(sortName.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (uniqueName != null) __obj.updateDynamic("uniqueName")(uniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hierarchy]
  }
}

