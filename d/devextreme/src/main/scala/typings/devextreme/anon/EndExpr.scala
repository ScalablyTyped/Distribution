package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndExpr extends js.Object {
  var dataSource: js.UndefOr[
    js.Array[_] | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions
  ] = js.undefined
  var endExpr: js.UndefOr[String | js.Function] = js.undefined
  var keyExpr: js.UndefOr[String | js.Function] = js.undefined
  var parentIdExpr: js.UndefOr[String | js.Function] = js.undefined
  var progressExpr: js.UndefOr[String | js.Function] = js.undefined
  var startExpr: js.UndefOr[String | js.Function] = js.undefined
  var titleExpr: js.UndefOr[String | js.Function] = js.undefined
}

object EndExpr {
  @scala.inline
  def apply(
    dataSource: js.Array[_] | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions = null,
    endExpr: String | js.Function = null,
    keyExpr: String | js.Function = null,
    parentIdExpr: String | js.Function = null,
    progressExpr: String | js.Function = null,
    startExpr: String | js.Function = null,
    titleExpr: String | js.Function = null
  ): EndExpr = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (endExpr != null) __obj.updateDynamic("endExpr")(endExpr.asInstanceOf[js.Any])
    if (keyExpr != null) __obj.updateDynamic("keyExpr")(keyExpr.asInstanceOf[js.Any])
    if (parentIdExpr != null) __obj.updateDynamic("parentIdExpr")(parentIdExpr.asInstanceOf[js.Any])
    if (progressExpr != null) __obj.updateDynamic("progressExpr")(progressExpr.asInstanceOf[js.Any])
    if (startExpr != null) __obj.updateDynamic("startExpr")(startExpr.asInstanceOf[js.Any])
    if (titleExpr != null) __obj.updateDynamic("titleExpr")(titleExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndExpr]
  }
}

