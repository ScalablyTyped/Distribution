package typings.devextreme

import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyExpr extends js.Object {
  var dataSource: js.UndefOr[js.Array[_] | DataSource | DataSourceOptions] = js.undefined
  var keyExpr: js.UndefOr[String | js.Function] = js.undefined
  var predecessorIdExpr: js.UndefOr[String | js.Function] = js.undefined
  var successorIdExpr: js.UndefOr[String | js.Function] = js.undefined
  var typeExpr: js.UndefOr[String | js.Function] = js.undefined
}

object AnonKeyExpr {
  @scala.inline
  def apply(
    dataSource: js.Array[_] | DataSource | DataSourceOptions = null,
    keyExpr: String | js.Function = null,
    predecessorIdExpr: String | js.Function = null,
    successorIdExpr: String | js.Function = null,
    typeExpr: String | js.Function = null
  ): AnonKeyExpr = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (keyExpr != null) __obj.updateDynamic("keyExpr")(keyExpr.asInstanceOf[js.Any])
    if (predecessorIdExpr != null) __obj.updateDynamic("predecessorIdExpr")(predecessorIdExpr.asInstanceOf[js.Any])
    if (successorIdExpr != null) __obj.updateDynamic("successorIdExpr")(successorIdExpr.asInstanceOf[js.Any])
    if (typeExpr != null) __obj.updateDynamic("typeExpr")(typeExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeyExpr]
  }
}

