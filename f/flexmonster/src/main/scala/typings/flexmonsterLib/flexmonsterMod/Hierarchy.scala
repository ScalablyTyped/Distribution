package typings
package flexmonsterLib.flexmonsterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hierarchy extends js.Object {
  var caption: js.UndefOr[java.lang.String] = js.undefined
  var dimensionName: js.UndefOr[java.lang.String] = js.undefined
  var filter: js.UndefOr[Filter] = js.undefined
  var sortName: js.UndefOr[java.lang.String] = js.undefined
  var sortOrder: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var uniqueName: js.UndefOr[java.lang.String] = js.undefined
}

object Hierarchy {
  @scala.inline
  def apply(
    caption: java.lang.String = null,
    dimensionName: java.lang.String = null,
    filter: Filter = null,
    sortName: java.lang.String = null,
    sortOrder: js.Array[java.lang.String] = null,
    uniqueName: java.lang.String = null
  ): Hierarchy = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (dimensionName != null) __obj.updateDynamic("dimensionName")(dimensionName)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (sortName != null) __obj.updateDynamic("sortName")(sortName)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder)
    if (uniqueName != null) __obj.updateDynamic("uniqueName")(uniqueName)
    __obj.asInstanceOf[Hierarchy]
  }
}

