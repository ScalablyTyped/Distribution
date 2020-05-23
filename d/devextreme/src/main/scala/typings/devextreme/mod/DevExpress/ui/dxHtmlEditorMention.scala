package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.Id
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxHtmlEditorMention extends js.Object {
  /** @name dxHtmlEditorMention.dataSource */
  var dataSource: js.UndefOr[js.Array[String] | DataSource | DataSourceOptions] = js.undefined
  /** @name dxHtmlEditorMention.displayExpr */
  var displayExpr: js.UndefOr[String | (js.Function1[/* item */ js.Any, String])] = js.undefined
  /** @name dxHtmlEditorMention.itemTemplate */
  var itemTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** @name dxHtmlEditorMention.marker */
  var marker: js.UndefOr[String] = js.undefined
  /** @name dxHtmlEditorMention.minSearchLength */
  var minSearchLength: js.UndefOr[Double] = js.undefined
  /** @name dxHtmlEditorMention.searchExpr */
  var searchExpr: js.UndefOr[String | js.Function | (js.Array[String | js.Function])] = js.undefined
  /** @name dxHtmlEditorMention.searchTimeout */
  var searchTimeout: js.UndefOr[Double] = js.undefined
  /** @name dxHtmlEditorMention.template */
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* mentionData */ Id, /* contentElement */ dxElement, String | Element | JQuery])
  ] = js.undefined
  /** @name dxHtmlEditorMention.valueExpr */
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
    minSearchLength: js.UndefOr[Double] = js.undefined,
    searchExpr: String | js.Function | (js.Array[String | js.Function]) = null,
    searchTimeout: js.UndefOr[Double] = js.undefined,
    template: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* mentionData */ Id, /* contentElement */ dxElement, String | Element | JQuery]) = null,
    valueExpr: String | js.Function = null
  ): dxHtmlEditorMention = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (displayExpr != null) __obj.updateDynamic("displayExpr")(displayExpr.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(itemTemplate.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (!js.isUndefined(minSearchLength)) __obj.updateDynamic("minSearchLength")(minSearchLength.get.asInstanceOf[js.Any])
    if (searchExpr != null) __obj.updateDynamic("searchExpr")(searchExpr.asInstanceOf[js.Any])
    if (!js.isUndefined(searchTimeout)) __obj.updateDynamic("searchTimeout")(searchTimeout.get.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (valueExpr != null) __obj.updateDynamic("valueExpr")(valueExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxHtmlEditorMention]
  }
}

