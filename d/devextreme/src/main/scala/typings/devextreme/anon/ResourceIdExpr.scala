package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceIdExpr extends js.Object {
  var dataSource: js.UndefOr[
    js.Array[_] | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions
  ] = js.undefined
  var keyExpr: js.UndefOr[String | js.Function] = js.undefined
  var resourceIdExpr: js.UndefOr[String | js.Function] = js.undefined
  var taskIdExpr: js.UndefOr[String | js.Function] = js.undefined
}

object ResourceIdExpr {
  @scala.inline
  def apply(
    dataSource: js.Array[_] | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions = null,
    keyExpr: String | js.Function = null,
    resourceIdExpr: String | js.Function = null,
    taskIdExpr: String | js.Function = null
  ): ResourceIdExpr = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (keyExpr != null) __obj.updateDynamic("keyExpr")(keyExpr.asInstanceOf[js.Any])
    if (resourceIdExpr != null) __obj.updateDynamic("resourceIdExpr")(resourceIdExpr.asInstanceOf[js.Any])
    if (taskIdExpr != null) __obj.updateDynamic("taskIdExpr")(taskIdExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceIdExpr]
  }
}

