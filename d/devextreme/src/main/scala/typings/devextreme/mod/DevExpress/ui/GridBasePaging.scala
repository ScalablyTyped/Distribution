package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridBasePaging extends js.Object {
  /** @name GridBase.Options.paging.enabled */
  var enabled: js.UndefOr[Boolean] = js.native
  /** @name GridBase.Options.paging.pageIndex */
  var pageIndex: js.UndefOr[Double] = js.native
  /** @name GridBase.Options.paging.pageSize */
  var pageSize: js.UndefOr[Double] = js.native
}

object GridBasePaging {
  @scala.inline
  def apply(): GridBasePaging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridBasePaging]
  }
  @scala.inline
  implicit class GridBasePagingOps[Self <: GridBasePaging] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setPageIndex(value: Double): Self = this.set("pageIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageIndex: Self = this.set("pageIndex", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
  }
  
}

