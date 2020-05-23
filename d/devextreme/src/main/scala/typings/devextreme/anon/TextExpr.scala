package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextExpr extends js.Object {
  var dataSource: js.UndefOr[
    js.Array[_] | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions
  ] = js.undefined
  var keyExpr: js.UndefOr[String | js.Function] = js.undefined
  var textExpr: js.UndefOr[String | js.Function] = js.undefined
}

object TextExpr {
  @scala.inline
  def apply(
    dataSource: js.Array[_] | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions = null,
    keyExpr: String | js.Function = null,
    textExpr: String | js.Function = null
  ): TextExpr = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (keyExpr != null) __obj.updateDynamic("keyExpr")(keyExpr.asInstanceOf[js.Any])
    if (textExpr != null) __obj.updateDynamic("textExpr")(textExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextExpr]
  }
}

