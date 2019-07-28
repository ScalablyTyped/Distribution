package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SheetsNs.SchemaNs

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
    depth: Int | Double = null,
    range: DimensionRange = null
  ): DimensionGroup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[DimensionGroup]
  }
}

