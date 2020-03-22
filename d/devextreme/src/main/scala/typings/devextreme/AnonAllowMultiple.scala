package typings.devextreme

import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowMultiple extends js.Object {
  var allowMultiple: js.UndefOr[Boolean] = js.undefined
  var colorExpr: js.UndefOr[String] = js.undefined
  var dataSource: js.UndefOr[String | js.Array[_] | DataSource | DataSourceOptions] = js.undefined
  var displayExpr: js.UndefOr[String | (js.Function1[/* resource */ js.Any, String])] = js.undefined
  var fieldExpr: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var useColorAsDefault: js.UndefOr[Boolean] = js.undefined
  var valueExpr: js.UndefOr[String | js.Function] = js.undefined
}

object AnonAllowMultiple {
  @scala.inline
  def apply(
    allowMultiple: js.UndefOr[Boolean] = js.undefined,
    colorExpr: String = null,
    dataSource: String | js.Array[_] | DataSource | DataSourceOptions = null,
    displayExpr: String | (js.Function1[/* resource */ js.Any, String]) = null,
    fieldExpr: String = null,
    label: String = null,
    useColorAsDefault: js.UndefOr[Boolean] = js.undefined,
    valueExpr: String | js.Function = null
  ): AnonAllowMultiple = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMultiple)) __obj.updateDynamic("allowMultiple")(allowMultiple.asInstanceOf[js.Any])
    if (colorExpr != null) __obj.updateDynamic("colorExpr")(colorExpr.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (displayExpr != null) __obj.updateDynamic("displayExpr")(displayExpr.asInstanceOf[js.Any])
    if (fieldExpr != null) __obj.updateDynamic("fieldExpr")(fieldExpr.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(useColorAsDefault)) __obj.updateDynamic("useColorAsDefault")(useColorAsDefault.asInstanceOf[js.Any])
    if (valueExpr != null) __obj.updateDynamic("valueExpr")(valueExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowMultiple]
  }
}

