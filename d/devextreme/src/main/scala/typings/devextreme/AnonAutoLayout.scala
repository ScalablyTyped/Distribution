package typings.devextreme

import typings.devextreme.devextremeStrings.layered
import typings.devextreme.devextremeStrings.off
import typings.devextreme.devextremeStrings.tree
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoLayout extends js.Object {
  var autoLayout: js.UndefOr[off | tree | layered | AnonOrientation] = js.undefined
  var childrenExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.undefined
  var containerKeyExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.undefined
  var dataSource: js.UndefOr[js.Array[_] | DataSource | DataSourceOptions] = js.undefined
  var heightExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.undefined
  var imageUrlExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.undefined
  var itemsExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.undefined
  var keyExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.undefined
  var leftExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.undefined
  var lockedExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.undefined
  var parentKeyExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.undefined
  var styleExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.undefined
  var textExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.undefined
  var textStyleExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.undefined
  var topExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.undefined
  var typeExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.undefined
  var widthExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.undefined
  var zIndexExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.undefined
}

object AnonAutoLayout {
  @scala.inline
  def apply(
    autoLayout: off | tree | layered | AnonOrientation = null,
    childrenExpr: String | (js.Function1[/* data */ js.Any, _]) = null,
    containerKeyExpr: String | (js.Function1[/* data */ js.Any, _]) = null,
    dataSource: js.Array[_] | DataSource | DataSourceOptions = null,
    heightExpr: String | (js.Function1[/* data */ js.Any, _]) = null,
    imageUrlExpr: String | (js.Function1[/* data */ js.Any, _]) = null,
    itemsExpr: String | (js.Function1[/* data */ js.Any, _]) = null,
    keyExpr: String | (js.Function1[/* data */ js.Any, _]) = null,
    leftExpr: String | (js.Function1[/* data */ js.Any, _]) = null,
    lockedExpr: String | (js.Function1[/* data */ js.Any, _]) = null,
    parentKeyExpr: String | (js.Function1[/* data */ js.Any, _]) = null,
    styleExpr: String | (js.Function1[/* data */ js.Any, _]) = null,
    textExpr: String | (js.Function1[/* data */ js.Any, _]) = null,
    textStyleExpr: String | (js.Function1[/* data */ js.Any, _]) = null,
    topExpr: String | (js.Function1[/* data */ js.Any, _]) = null,
    typeExpr: String | (js.Function1[/* data */ js.Any, _]) = null,
    widthExpr: String | (js.Function1[/* data */ js.Any, _]) = null,
    zIndexExpr: String | (js.Function1[/* data */ js.Any, _]) = null
  ): AnonAutoLayout = {
    val __obj = js.Dynamic.literal()
    if (autoLayout != null) __obj.updateDynamic("autoLayout")(autoLayout.asInstanceOf[js.Any])
    if (childrenExpr != null) __obj.updateDynamic("childrenExpr")(childrenExpr.asInstanceOf[js.Any])
    if (containerKeyExpr != null) __obj.updateDynamic("containerKeyExpr")(containerKeyExpr.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (heightExpr != null) __obj.updateDynamic("heightExpr")(heightExpr.asInstanceOf[js.Any])
    if (imageUrlExpr != null) __obj.updateDynamic("imageUrlExpr")(imageUrlExpr.asInstanceOf[js.Any])
    if (itemsExpr != null) __obj.updateDynamic("itemsExpr")(itemsExpr.asInstanceOf[js.Any])
    if (keyExpr != null) __obj.updateDynamic("keyExpr")(keyExpr.asInstanceOf[js.Any])
    if (leftExpr != null) __obj.updateDynamic("leftExpr")(leftExpr.asInstanceOf[js.Any])
    if (lockedExpr != null) __obj.updateDynamic("lockedExpr")(lockedExpr.asInstanceOf[js.Any])
    if (parentKeyExpr != null) __obj.updateDynamic("parentKeyExpr")(parentKeyExpr.asInstanceOf[js.Any])
    if (styleExpr != null) __obj.updateDynamic("styleExpr")(styleExpr.asInstanceOf[js.Any])
    if (textExpr != null) __obj.updateDynamic("textExpr")(textExpr.asInstanceOf[js.Any])
    if (textStyleExpr != null) __obj.updateDynamic("textStyleExpr")(textStyleExpr.asInstanceOf[js.Any])
    if (topExpr != null) __obj.updateDynamic("topExpr")(topExpr.asInstanceOf[js.Any])
    if (typeExpr != null) __obj.updateDynamic("typeExpr")(typeExpr.asInstanceOf[js.Any])
    if (widthExpr != null) __obj.updateDynamic("widthExpr")(widthExpr.asInstanceOf[js.Any])
    if (zIndexExpr != null) __obj.updateDynamic("zIndexExpr")(zIndexExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoLayout]
  }
}

