package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridBasePaging extends js.Object {
  /** @name GridBase.Options.paging.enabled */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** @name GridBase.Options.paging.pageIndex */
  var pageIndex: js.UndefOr[Double] = js.undefined
  /** @name GridBase.Options.paging.pageSize */
  var pageSize: js.UndefOr[Double] = js.undefined
}

object GridBasePaging {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    pageIndex: js.UndefOr[Double] = js.undefined,
    pageSize: js.UndefOr[Double] = js.undefined
  ): GridBasePaging = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageIndex)) __obj.updateDynamic("pageIndex")(pageIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridBasePaging]
  }
}

