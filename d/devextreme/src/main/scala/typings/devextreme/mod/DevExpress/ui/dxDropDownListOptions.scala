package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ItemElementItemIndex
import typings.devextreme.anon.ModelPreviousValue
import typings.devextreme.anon.ModelSelectedItem
import typings.devextreme.devextremeStrings.contains
import typings.devextreme.devextremeStrings.startswith
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.devextreme.mod.DevExpress.ui.DataExpressionMixinOptions because var conflicts: value. Inlined dataSource, displayExpr, itemTemplate, items, valueExpr */ @js.native
trait dxDropDownListOptions[T] extends dxDropDownEditorOptions[T] {
  
  /**
    * [descr:DataExpressionMixin.Options.dataSource]
    */
  var dataSource: js.UndefOr[String | (js.Array[CollectionWidgetItem | _]) | DataSource | DataSourceOptions] = js.native
  
  /**
    * [descr:DataExpressionMixin.Options.displayExpr]
    */
  var displayExpr: js.UndefOr[String | (js.Function1[/* item */ js.Any, String])] = js.native
  
  /**
    * [descr:dxDropDownList.Options.displayValue]
    */
  var displayValue: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxDropDownList.Options.groupTemplate]
    */
  var groupTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  
  /**
    * [descr:dxDropDownList.Options.grouped]
    */
  var grouped: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:DataExpressionMixin.Options.itemTemplate]
    */
  var itemTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  
  /**
    * [descr:DataExpressionMixin.Options.items]
    */
  var items: js.UndefOr[js.Array[CollectionWidgetItem | _]] = js.native
  
  /**
    * [descr:dxDropDownList.Options.minSearchLength]
    */
  var minSearchLength: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxDropDownList.Options.noDataText]
    */
  var noDataText: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxDropDownList.Options.onItemClick]
    */
  var onItemClick: js.UndefOr[js.Function1[/* e */ ItemElementItemIndex[T], _]] = js.native
  
  /**
    * [descr:dxDropDownList.Options.onSelectionChanged]
    */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ ModelSelectedItem[T], _]] = js.native
  
  /**
    * [descr:dxDropDownList.Options.onValueChanged]
    */
  @JSName("onValueChanged")
  var onValueChanged_dxDropDownListOptions: js.UndefOr[js.Function1[/* e */ ModelPreviousValue[T], _]] = js.native
  
  /**
    * [descr:dxDropDownList.Options.searchEnabled]
    */
  var searchEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxDropDownList.Options.searchExpr]
    */
  var searchExpr: js.UndefOr[String | js.Function | (js.Array[String | js.Function])] = js.native
  
  /**
    * [descr:dxDropDownList.Options.searchMode]
    */
  var searchMode: js.UndefOr[contains | startswith] = js.native
  
  /**
    * [descr:dxDropDownList.Options.searchTimeout]
    */
  var searchTimeout: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxDropDownList.Options.selectedItem]
    */
  var selectedItem: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:dxDropDownList.Options.showDataBeforeSearch]
    */
  var showDataBeforeSearch: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:DataExpressionMixin.Options.valueExpr]
    */
  var valueExpr: js.UndefOr[String | (js.Function1[/* item */ js.Any, String | Double | Boolean])] = js.native
  
  /**
    * [descr:dxDropDownList.Options.wrapItemText]
    */
  var wrapItemText: js.UndefOr[Boolean] = js.native
}
object dxDropDownListOptions {
  
  @scala.inline
  def apply[T](): dxDropDownListOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDropDownListOptions[T]]
  }
  
  @scala.inline
  implicit class dxDropDownListOptionsOps[Self <: dxDropDownListOptions[_], T] (val x: Self with dxDropDownListOptions[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataSourceVarargs(value: (CollectionWidgetItem | js.Any)*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: String | (js.Array[CollectionWidgetItem | _]) | DataSource | DataSourceOptions): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDisplayExprFunction1(value: /* item */ js.Any => String): Self = this.set("displayExpr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisplayExpr(value: String | (js.Function1[/* item */ js.Any, String])): Self = this.set("displayExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayExpr: Self = this.set("displayExpr", js.undefined)
    
    @scala.inline
    def setDisplayValue(value: String): Self = this.set("displayValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayValue: Self = this.set("displayValue", js.undefined)
    
    @scala.inline
    def setGroupTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | Element | JQuery
    ): Self = this.set("groupTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGroupTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = this.set("groupTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupTemplate: Self = this.set("groupTemplate", js.undefined)
    
    @scala.inline
    def setGrouped(value: Boolean): Self = this.set("grouped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrouped: Self = this.set("grouped", js.undefined)
    
    @scala.inline
    def setItemTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | Element | JQuery
    ): Self = this.set("itemTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setItemTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = this.set("itemTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemTemplate: Self = this.set("itemTemplate", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: (CollectionWidgetItem | js.Any)*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[CollectionWidgetItem | _]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setMinSearchLength(value: Double): Self = this.set("minSearchLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSearchLength: Self = this.set("minSearchLength", js.undefined)
    
    @scala.inline
    def setNoDataText(value: String): Self = this.set("noDataText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoDataText: Self = this.set("noDataText", js.undefined)
    
    @scala.inline
    def setOnItemClick(value: /* e */ ItemElementItemIndex[T] => _): Self = this.set("onItemClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnItemClick: Self = this.set("onItemClick", js.undefined)
    
    @scala.inline
    def setOnSelectionChanged(value: /* e */ ModelSelectedItem[T] => _): Self = this.set("onSelectionChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelectionChanged: Self = this.set("onSelectionChanged", js.undefined)
    
    @scala.inline
    def setOnValueChanged(value: /* e */ ModelPreviousValue[T] => _): Self = this.set("onValueChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnValueChanged: Self = this.set("onValueChanged", js.undefined)
    
    @scala.inline
    def setSearchEnabled(value: Boolean): Self = this.set("searchEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchEnabled: Self = this.set("searchEnabled", js.undefined)
    
    @scala.inline
    def setSearchExprVarargs(value: (String | js.Function)*): Self = this.set("searchExpr", js.Array(value :_*))
    
    @scala.inline
    def setSearchExpr(value: String | js.Function | (js.Array[String | js.Function])): Self = this.set("searchExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchExpr: Self = this.set("searchExpr", js.undefined)
    
    @scala.inline
    def setSearchMode(value: contains | startswith): Self = this.set("searchMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchMode: Self = this.set("searchMode", js.undefined)
    
    @scala.inline
    def setSearchTimeout(value: Double): Self = this.set("searchTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchTimeout: Self = this.set("searchTimeout", js.undefined)
    
    @scala.inline
    def setSelectedItem(value: js.Any): Self = this.set("selectedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedItem: Self = this.set("selectedItem", js.undefined)
    
    @scala.inline
    def setShowDataBeforeSearch(value: Boolean): Self = this.set("showDataBeforeSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDataBeforeSearch: Self = this.set("showDataBeforeSearch", js.undefined)
    
    @scala.inline
    def setValueExprFunction1(value: /* item */ js.Any => String | Double | Boolean): Self = this.set("valueExpr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValueExpr(value: String | (js.Function1[/* item */ js.Any, String | Double | Boolean])): Self = this.set("valueExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueExpr: Self = this.set("valueExpr", js.undefined)
    
    @scala.inline
    def setWrapItemText(value: Boolean): Self = this.set("wrapItemText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapItemText: Self = this.set("wrapItemText", js.undefined)
  }
}
