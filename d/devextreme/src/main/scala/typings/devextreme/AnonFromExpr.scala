package typings.devextreme

import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFromExpr extends js.Object {
  var dataSource: js.UndefOr[js.Array[_] | DataSource | DataSourceOptions] = js.undefined
  var fromExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.undefined
  var fromLineEndExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.undefined
  var fromPointIndexExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.undefined
  var keyExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.undefined
  var lineTypeExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.undefined
  var lockedExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.undefined
  var pointsExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.undefined
  var styleExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.undefined
  var textExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.undefined
  var textStyleExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.undefined
  var toExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.undefined
  var toLineEndExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.undefined
  var toPointIndexExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.undefined
  var zIndexExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.undefined
}

object AnonFromExpr {
  @scala.inline
  def apply(
    dataSource: js.Array[_] | DataSource | DataSourceOptions = null,
    fromExpr: String | (js.Function1[/* data */ js.Any, _]) = null,
    fromLineEndExpr: String | (js.Function1[/* data */ js.Any, _]) = null,
    fromPointIndexExpr: String | (js.Function1[/* data */ js.Any, _]) = null,
    keyExpr: String | (js.Function1[/* data */ js.Any, _]) = null,
    lineTypeExpr: String | (js.Function1[/* data */ js.Any, _]) = null,
    lockedExpr: String | (js.Function1[/* data */ js.Any, _]) = null,
    pointsExpr: String | (js.Function1[/* data */ js.Any, _]) = null,
    styleExpr: String | (js.Function1[/* data */ js.Any, _]) = null,
    textExpr: String | (js.Function1[/* data */ js.Any, _]) = null,
    textStyleExpr: String | (js.Function1[/* data */ js.Any, _]) = null,
    toExpr: String | (js.Function1[/* data */ js.Any, _]) = null,
    toLineEndExpr: String | (js.Function1[/* data */ js.Any, _]) = null,
    toPointIndexExpr: String | (js.Function1[/* data */ js.Any, _]) = null,
    zIndexExpr: String | (js.Function1[/* data */ js.Any, _]) = null
  ): AnonFromExpr = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (fromExpr != null) __obj.updateDynamic("fromExpr")(fromExpr.asInstanceOf[js.Any])
    if (fromLineEndExpr != null) __obj.updateDynamic("fromLineEndExpr")(fromLineEndExpr.asInstanceOf[js.Any])
    if (fromPointIndexExpr != null) __obj.updateDynamic("fromPointIndexExpr")(fromPointIndexExpr.asInstanceOf[js.Any])
    if (keyExpr != null) __obj.updateDynamic("keyExpr")(keyExpr.asInstanceOf[js.Any])
    if (lineTypeExpr != null) __obj.updateDynamic("lineTypeExpr")(lineTypeExpr.asInstanceOf[js.Any])
    if (lockedExpr != null) __obj.updateDynamic("lockedExpr")(lockedExpr.asInstanceOf[js.Any])
    if (pointsExpr != null) __obj.updateDynamic("pointsExpr")(pointsExpr.asInstanceOf[js.Any])
    if (styleExpr != null) __obj.updateDynamic("styleExpr")(styleExpr.asInstanceOf[js.Any])
    if (textExpr != null) __obj.updateDynamic("textExpr")(textExpr.asInstanceOf[js.Any])
    if (textStyleExpr != null) __obj.updateDynamic("textStyleExpr")(textStyleExpr.asInstanceOf[js.Any])
    if (toExpr != null) __obj.updateDynamic("toExpr")(toExpr.asInstanceOf[js.Any])
    if (toLineEndExpr != null) __obj.updateDynamic("toLineEndExpr")(toLineEndExpr.asInstanceOf[js.Any])
    if (toPointIndexExpr != null) __obj.updateDynamic("toPointIndexExpr")(toPointIndexExpr.asInstanceOf[js.Any])
    if (zIndexExpr != null) __obj.updateDynamic("zIndexExpr")(zIndexExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFromExpr]
  }
}

