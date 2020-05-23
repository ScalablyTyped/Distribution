package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxTreeListPaging extends GridBasePaging

object dxTreeListPaging {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    pageIndex: js.UndefOr[Double] = js.undefined,
    pageSize: js.UndefOr[Double] = js.undefined
  ): dxTreeListPaging = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageIndex)) __obj.updateDynamic("pageIndex")(pageIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxTreeListPaging]
  }
}

