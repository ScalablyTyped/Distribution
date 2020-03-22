package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridBasePaging extends js.Object {
  /** Enables paging. */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies the page to be displayed using a zero-based index. */
  var pageIndex: js.UndefOr[Double] = js.undefined
  /** Specifies the page size. */
  var pageSize: js.UndefOr[Double] = js.undefined
}

object GridBasePaging {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    pageIndex: Int | Double = null,
    pageSize: Int | Double = null
  ): GridBasePaging = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (pageIndex != null) __obj.updateDynamic("pageIndex")(pageIndex.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridBasePaging]
  }
}

