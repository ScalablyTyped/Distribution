package typings.extjs.Ext.data

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResultSet extends IBase {
  /** [Config Option] (Number) */
  var count: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var loaded: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Ext.data.Model[]) */
  var records: js.UndefOr[Array] = js.native
  /** [Config Option] (Boolean) */
  var success: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var total: js.UndefOr[Double] = js.native
  /** [Property] (Number) */
  var totalRecords: js.UndefOr[Double] = js.native
}

object IResultSet {
  @scala.inline
  def apply(): IResultSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResultSet]
  }
  @scala.inline
  implicit class IResultSetOps[Self <: IResultSet] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setLoaded(value: Boolean): Self = this.set("loaded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoaded: Self = this.set("loaded", js.undefined)
    @scala.inline
    def setRecords(value: Array): Self = this.set("records", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecords: Self = this.set("records", js.undefined)
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
    @scala.inline
    def setTotalRecords(value: Double): Self = this.set("totalRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalRecords: Self = this.set("totalRecords", js.undefined)
  }
  
}

