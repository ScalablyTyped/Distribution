package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FromExpr extends js.Object {
  var dataSource: js.UndefOr[
    js.Array[_] | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions
  ] = js.native
  var fromExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var fromLineEndExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var fromPointIndexExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var keyExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var lineTypeExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var lockedExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var pointsExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var styleExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var textExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var textStyleExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var toExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var toLineEndExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var toPointIndexExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var zIndexExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
}

object FromExpr {
  @scala.inline
  def apply(): FromExpr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FromExpr]
  }
  @scala.inline
  implicit class FromExprOps[Self <: FromExpr] (val x: Self) extends AnyVal {
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
    def setFromExprFunction1(value: /* data */ js.Any => _): Self = this.set("fromExpr", js.Any.fromFunction1(value))
    @scala.inline
    def setFromExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = this.set("fromExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromExpr: Self = this.set("fromExpr", js.undefined)
    @scala.inline
    def setFromLineEndExprFunction1(value: /* data */ js.Any => _): Self = this.set("fromLineEndExpr", js.Any.fromFunction1(value))
    @scala.inline
    def setFromLineEndExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = this.set("fromLineEndExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromLineEndExpr: Self = this.set("fromLineEndExpr", js.undefined)
    @scala.inline
    def setFromPointIndexExprFunction1(value: /* data */ js.Any => _): Self = this.set("fromPointIndexExpr", js.Any.fromFunction1(value))
    @scala.inline
    def setFromPointIndexExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = this.set("fromPointIndexExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromPointIndexExpr: Self = this.set("fromPointIndexExpr", js.undefined)
    @scala.inline
    def setKeyExprFunction1(value: /* data */ js.Any => _): Self = this.set("keyExpr", js.Any.fromFunction1(value))
    @scala.inline
    def setKeyExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = this.set("keyExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyExpr: Self = this.set("keyExpr", js.undefined)
    @scala.inline
    def setLineTypeExprFunction1(value: /* data */ js.Any => _): Self = this.set("lineTypeExpr", js.Any.fromFunction1(value))
    @scala.inline
    def setLineTypeExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = this.set("lineTypeExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineTypeExpr: Self = this.set("lineTypeExpr", js.undefined)
    @scala.inline
    def setLockedExprFunction1(value: /* data */ js.Any => _): Self = this.set("lockedExpr", js.Any.fromFunction1(value))
    @scala.inline
    def setLockedExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = this.set("lockedExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockedExpr: Self = this.set("lockedExpr", js.undefined)
    @scala.inline
    def setPointsExprFunction1(value: /* data */ js.Any => _): Self = this.set("pointsExpr", js.Any.fromFunction1(value))
    @scala.inline
    def setPointsExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = this.set("pointsExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointsExpr: Self = this.set("pointsExpr", js.undefined)
    @scala.inline
    def setStyleExprFunction1(value: /* data */ js.Any => _): Self = this.set("styleExpr", js.Any.fromFunction1(value))
    @scala.inline
    def setStyleExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = this.set("styleExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleExpr: Self = this.set("styleExpr", js.undefined)
    @scala.inline
    def setTextExprFunction1(value: /* data */ js.Any => _): Self = this.set("textExpr", js.Any.fromFunction1(value))
    @scala.inline
    def setTextExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = this.set("textExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextExpr: Self = this.set("textExpr", js.undefined)
    @scala.inline
    def setTextStyleExprFunction1(value: /* data */ js.Any => _): Self = this.set("textStyleExpr", js.Any.fromFunction1(value))
    @scala.inline
    def setTextStyleExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = this.set("textStyleExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyleExpr: Self = this.set("textStyleExpr", js.undefined)
    @scala.inline
    def setToExprFunction1(value: /* data */ js.Any => _): Self = this.set("toExpr", js.Any.fromFunction1(value))
    @scala.inline
    def setToExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = this.set("toExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToExpr: Self = this.set("toExpr", js.undefined)
    @scala.inline
    def setToLineEndExprFunction1(value: /* data */ js.Any => _): Self = this.set("toLineEndExpr", js.Any.fromFunction1(value))
    @scala.inline
    def setToLineEndExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = this.set("toLineEndExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToLineEndExpr: Self = this.set("toLineEndExpr", js.undefined)
    @scala.inline
    def setToPointIndexExprFunction1(value: /* data */ js.Any => _): Self = this.set("toPointIndexExpr", js.Any.fromFunction1(value))
    @scala.inline
    def setToPointIndexExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = this.set("toPointIndexExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToPointIndexExpr: Self = this.set("toPointIndexExpr", js.undefined)
    @scala.inline
    def setZIndexExprFunction1(value: /* data */ js.Any => _): Self = this.set("zIndexExpr", js.Any.fromFunction1(value))
    @scala.inline
    def setZIndexExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = this.set("zIndexExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndexExpr: Self = this.set("zIndexExpr", js.undefined)
  }
  
}

