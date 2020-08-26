package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceIdExpr extends js.Object {
  var dataSource: js.UndefOr[
    js.Array[_] | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions
  ] = js.native
  var keyExpr: js.UndefOr[String | js.Function] = js.native
  var resourceIdExpr: js.UndefOr[String | js.Function] = js.native
  var taskIdExpr: js.UndefOr[String | js.Function] = js.native
}

object ResourceIdExpr {
  @scala.inline
  def apply(): ResourceIdExpr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceIdExpr]
  }
  @scala.inline
  implicit class ResourceIdExprOps[Self <: ResourceIdExpr] (val x: Self) extends AnyVal {
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
    def setDataSourceVarargs(value: js.Any*): Self = this.set("dataSource", js.Array(value :_*))
    @scala.inline
    def setDataSource(value: js.Array[_] | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setKeyExpr(value: String | js.Function): Self = this.set("keyExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyExpr: Self = this.set("keyExpr", js.undefined)
    @scala.inline
    def setResourceIdExpr(value: String | js.Function): Self = this.set("resourceIdExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceIdExpr: Self = this.set("resourceIdExpr", js.undefined)
    @scala.inline
    def setTaskIdExpr(value: String | js.Function): Self = this.set("taskIdExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskIdExpr: Self = this.set("taskIdExpr", js.undefined)
  }
  
}

