package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod.DevExpress.data.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplayExpr extends js.Object {
  var allowClearing: js.UndefOr[Boolean] = js.native
  var dataSource: js.UndefOr[js.Array[_] | DataSourceOptions | Store] = js.native
  var displayExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, String])] = js.native
  var valueExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, String | Double | Boolean])] = js.native
}

object DisplayExpr {
  @scala.inline
  def apply(): DisplayExpr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayExpr]
  }
  @scala.inline
  implicit class DisplayExprOps[Self <: DisplayExpr] (val x: Self) extends AnyVal {
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
    def setAllowClearing(value: Boolean): Self = this.set("allowClearing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowClearing: Self = this.set("allowClearing", js.undefined)
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = this.set("dataSource", js.Array(value :_*))
    @scala.inline
    def setDataSource(value: js.Array[_] | DataSourceOptions | Store): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDisplayExprFunction1(value: /* data */ js.Any => String): Self = this.set("displayExpr", js.Any.fromFunction1(value))
    @scala.inline
    def setDisplayExpr(value: String | (js.Function1[/* data */ js.Any, String])): Self = this.set("displayExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayExpr: Self = this.set("displayExpr", js.undefined)
    @scala.inline
    def setValueExprFunction1(value: /* data */ js.Any => String | Double | Boolean): Self = this.set("valueExpr", js.Any.fromFunction1(value))
    @scala.inline
    def setValueExpr(value: String | (js.Function1[/* data */ js.Any, String | Double | Boolean])): Self = this.set("valueExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueExpr: Self = this.set("valueExpr", js.undefined)
  }
  
}

