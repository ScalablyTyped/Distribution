package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataExpressionMixinOptions[T] extends js.Object {
  /** Binds the widget to data. */
  var dataSource: js.UndefOr[String | (js.Array[CollectionWidgetItem | _]) | DataSource | DataSourceOptions] = js.undefined
  /** Specifies the data field whose values should be displayed. */
  var displayExpr: js.UndefOr[String | (js.Function1[/* item */ js.Any, String])] = js.undefined
  /** Specifies a custom template for items. */
  var itemTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** An array of items displayed by the widget. */
  var items: js.UndefOr[js.Array[CollectionWidgetItem | _]] = js.undefined
  /** Specifies the currently selected value. May be an object if dataSource contains objects and valueExpr is not set. */
  var value: js.UndefOr[js.Any] = js.undefined
  /** Specifies which data field provides unique values to the widget's value. */
  var valueExpr: js.UndefOr[String | (js.Function1[/* item */ js.Any, String | Double | Boolean])] = js.undefined
}

object DataExpressionMixinOptions {
  @scala.inline
  def apply[T](
    dataSource: String | (js.Array[CollectionWidgetItem | _]) | DataSource | DataSourceOptions = null,
    displayExpr: String | (js.Function1[/* item */ js.Any, String]) = null,
    itemTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    items: js.Array[CollectionWidgetItem | _] = null,
    value: js.Any = null,
    valueExpr: String | (js.Function1[/* item */ js.Any, String | Double | Boolean]) = null
  ): DataExpressionMixinOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (displayExpr != null) __obj.updateDynamic("displayExpr")(displayExpr.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(itemTemplate.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueExpr != null) __obj.updateDynamic("valueExpr")(valueExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataExpressionMixinOptions[T]]
  }
}

