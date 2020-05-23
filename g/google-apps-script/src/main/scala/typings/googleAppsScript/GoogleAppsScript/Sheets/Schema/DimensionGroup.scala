package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionGroup extends js.Object {
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var depth: js.UndefOr[Double] = js.undefined
  var range: js.UndefOr[DimensionRange] = js.undefined
}

object DimensionGroup {
  @scala.inline
  def apply(
    collapsed: js.UndefOr[Boolean] = js.undefined,
    depth: js.UndefOr[Double] = js.undefined,
    range: DimensionRange = null
  ): DimensionGroup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth.get.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionGroup]
  }
}

