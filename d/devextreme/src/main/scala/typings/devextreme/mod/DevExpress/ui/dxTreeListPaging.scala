package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxTreeListPaging extends GridBasePaging

object dxTreeListPaging {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    pageIndex: Int | Double = null,
    pageSize: Int | Double = null
  ): dxTreeListPaging = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (pageIndex != null) __obj.updateDynamic("pageIndex")(pageIndex.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxTreeListPaging]
  }
}

