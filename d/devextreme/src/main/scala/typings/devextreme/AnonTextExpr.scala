package typings.devextreme

import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTextExpr extends js.Object {
  var dataSource: js.UndefOr[js.Array[_] | DataSource | DataSourceOptions] = js.undefined
  var keyExpr: js.UndefOr[String | js.Function] = js.undefined
  var textExpr: js.UndefOr[String | js.Function] = js.undefined
}

object AnonTextExpr {
  @scala.inline
  def apply(
    dataSource: js.Array[_] | DataSource | DataSourceOptions = null,
    keyExpr: String | js.Function = null,
    textExpr: String | js.Function = null
  ): AnonTextExpr = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (keyExpr != null) __obj.updateDynamic("keyExpr")(keyExpr.asInstanceOf[js.Any])
    if (textExpr != null) __obj.updateDynamic("textExpr")(textExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTextExpr]
  }
}

