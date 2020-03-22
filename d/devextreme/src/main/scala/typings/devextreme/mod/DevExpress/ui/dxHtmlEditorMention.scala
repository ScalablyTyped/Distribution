package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonId
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxHtmlEditorMention extends js.Object {
  /** Provides data for the suggestion list. */
  var dataSource: js.UndefOr[js.Array[String] | DataSource | DataSourceOptions] = js.undefined
  /** Specifies the data field whose values should be displayed in the suggestion list. */
  var displayExpr: js.UndefOr[String | (js.Function1[/* item */ js.Any, String])] = js.undefined
  /** Specifies a custom template for suggestion list items. */
  var itemTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** Specifies the prefix that a user enters to activate mentions. You can use different prefixes with different dataSources. */
  var marker: js.UndefOr[String] = js.undefined
  /** Specifies the minimum number of characters that a user should type to trigger the search. */
  var minSearchLength: js.UndefOr[Double] = js.undefined
  /** Specifies one or several data fields to search. */
  var searchExpr: js.UndefOr[String | js.Function | (js.Array[String | js.Function])] = js.undefined
  /** Specifies the delay between when a user stops typing and when the search is executed. */
  var searchTimeout: js.UndefOr[Double] = js.undefined
  /** Specifies a custom template for mentions. */
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* mentionData */ AnonId, /* contentElement */ dxElement, String | Element | JQuery])
  ] = js.undefined
  /** Specifies which data field provides unique values to the template's `id` parameter. */
  var valueExpr: js.UndefOr[String | js.Function] = js.undefined
}

object dxHtmlEditorMention {
  @scala.inline
  def apply(
    dataSource: js.Array[String] | DataSource | DataSourceOptions = null,
    displayExpr: String | (js.Function1[/* item */ js.Any, String]) = null,
    itemTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    marker: String = null,
    minSearchLength: Int | Double = null,
    searchExpr: String | js.Function | (js.Array[String | js.Function]) = null,
    searchTimeout: Int | Double = null,
    template: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* mentionData */ AnonId, /* contentElement */ dxElement, String | Element | JQuery]) = null,
    valueExpr: String | js.Function = null
  ): dxHtmlEditorMention = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (displayExpr != null) __obj.updateDynamic("displayExpr")(displayExpr.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(itemTemplate.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (minSearchLength != null) __obj.updateDynamic("minSearchLength")(minSearchLength.asInstanceOf[js.Any])
    if (searchExpr != null) __obj.updateDynamic("searchExpr")(searchExpr.asInstanceOf[js.Any])
    if (searchTimeout != null) __obj.updateDynamic("searchTimeout")(searchTimeout.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (valueExpr != null) __obj.updateDynamic("valueExpr")(valueExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxHtmlEditorMention]
  }
}

