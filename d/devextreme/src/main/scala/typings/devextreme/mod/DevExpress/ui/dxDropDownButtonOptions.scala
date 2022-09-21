package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.common.ButtonStyle
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSource.DataSourceLike
import typings.devextreme.mod.DevExpress.ui.dxDropDownButton.ButtonClickEvent
import typings.devextreme.mod.DevExpress.ui.dxDropDownButton.Item
import typings.devextreme.mod.DevExpress.ui.dxDropDownButton.ItemClickEvent
import typings.devextreme.mod.DevExpress.ui.dxDropDownButton.SelectionChangedEvent
import typings.devextreme.mod.DevExpress.ui.dxPopup.Properties
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxDropDownButtonOptions
  extends StObject
     with WidgetOptions[dxDropDownButton] {
  
  /**
    * Provides data for the drop-down menu.
    */
  var dataSource: js.UndefOr[(DataSourceLike[Item | Any, Any]) | Null] = js.undefined
  
  /**
    * Specifies whether to wait until the drop-down menu is opened the first time to render its content.
    */
  var deferRendering: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the data field whose values should be displayed in the drop-down menu.
    */
  var displayExpr: js.UndefOr[String | (js.Function1[/* itemData */ Any, String])] = js.undefined
  
  /**
    * Specifies custom content for the drop-down field.
    */
  var dropDownContentTemplate: js.UndefOr[
    template | (js.Function2[
      /* data */ (js.Array[String | Double | Any]) | (DataSource[Any, Any]), 
      /* contentElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Configures the drop-down field.
    */
  var dropDownOptions: js.UndefOr[Properties] = js.undefined
  
  /**
    * Specifies the button&apos;s icon.
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a custom template for drop-down menu items.
    */
  var itemTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ Any, 
      /* itemIndex */ Double, 
      /* itemElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Provides drop-down menu items.
    */
  var items: js.UndefOr[js.Array[Item | Any]] = js.undefined
  
  /**
    * Specifies which data field provides keys used to distinguish between the selected drop-down menu items.
    */
  var keyExpr: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the text or HTML markup displayed in the drop-down menu when it does not contain any items.
    */
  var noDataText: js.UndefOr[String] = js.undefined
  
  /**
    * A function that is executed when the button is clicked or tapped. If splitButton is true, this function is executed for the action button only.
    */
  var onButtonClick: js.UndefOr[(js.Function1[/* e */ ButtonClickEvent, Unit]) | String] = js.undefined
  
  /**
    * A function that is executed when a drop-down menu item is clicked.
    */
  var onItemClick: js.UndefOr[(js.Function1[/* e */ ItemClickEvent, Unit]) | String] = js.undefined
  
  /**
    * A function that is executed when an item is selected or selection is canceled. In effect when useSelectMode is true.
    */
  var onSelectionChanged: js.UndefOr[(js.Function1[/* e */ SelectionChangedEvent, Unit]) | String] = js.undefined
  
  /**
    * Specifies whether the drop-down menu is opened.
    */
  var opened: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Contains the selected item&apos;s data. Available when useSelectMode is true.
    */
  var selectedItem: js.UndefOr[String | Double | Any] = js.undefined
  
  /**
    * Contains the selected item&apos;s key and allows you to specify the initially selected item. Applies when useSelectMode is true.
    */
  var selectedItemKey: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Specifies whether the arrow icon should be displayed.
    */
  var showArrowIcon: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to split the button in two: one executes an action, the other opens and closes the drop-down menu.
    */
  var splitButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies how the button is styled.
    */
  var stylingMode: js.UndefOr[ButtonStyle] = js.undefined
  
  /**
    * Specifies the button&apos;s text. Applies only if useSelectMode is false.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the widget uses item&apos;s text a title attribute.
    */
  var useItemTextAsTitle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the UI component stores the selected drop-down menu item.
    */
  var useSelectMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether text that exceeds the drop-down list width should be wrapped.
    */
  var wrapItemText: js.UndefOr[Boolean] = js.undefined
}
object dxDropDownButtonOptions {
  
  inline def apply(): dxDropDownButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDropDownButtonOptions]
  }
  
  extension [Self <: dxDropDownButtonOptions](x: Self) {
    
    inline def setDataSource(value: DataSourceLike[Item | Any, Any]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceNull: Self = StObject.set(x, "dataSource", null)
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: (Item | Any)*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setDeferRendering(value: Boolean): Self = StObject.set(x, "deferRendering", value.asInstanceOf[js.Any])
    
    inline def setDeferRenderingUndefined: Self = StObject.set(x, "deferRendering", js.undefined)
    
    inline def setDisplayExpr(value: String | (js.Function1[/* itemData */ Any, String])): Self = StObject.set(x, "displayExpr", value.asInstanceOf[js.Any])
    
    inline def setDisplayExprFunction1(value: /* itemData */ Any => String): Self = StObject.set(x, "displayExpr", js.Any.fromFunction1(value))
    
    inline def setDisplayExprUndefined: Self = StObject.set(x, "displayExpr", js.undefined)
    
    inline def setDropDownContentTemplate(
      value: template | (js.Function2[
          /* data */ (js.Array[String | Double | Any]) | (DataSource[Any, Any]), 
          /* contentElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "dropDownContentTemplate", value.asInstanceOf[js.Any])
    
    inline def setDropDownContentTemplateFunction2(
      value: (/* data */ (js.Array[String | Double | Any]) | (DataSource[Any, Any]), /* contentElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "dropDownContentTemplate", js.Any.fromFunction2(value))
    
    inline def setDropDownContentTemplateUndefined: Self = StObject.set(x, "dropDownContentTemplate", js.undefined)
    
    inline def setDropDownOptions(value: Properties): Self = StObject.set(x, "dropDownOptions", value.asInstanceOf[js.Any])
    
    inline def setDropDownOptionsUndefined: Self = StObject.set(x, "dropDownOptions", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setItemTemplate(
      value: template | (js.Function3[
          /* itemData */ Any, 
          /* itemIndex */ Double, 
          /* itemElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "itemTemplate", value.asInstanceOf[js.Any])
    
    inline def setItemTemplateFunction3(
      value: (/* itemData */ Any, /* itemIndex */ Double, /* itemElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "itemTemplate", js.Any.fromFunction3(value))
    
    inline def setItemTemplateUndefined: Self = StObject.set(x, "itemTemplate", js.undefined)
    
    inline def setItems(value: js.Array[Item | Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: (Item | Any)*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKeyExpr(value: String): Self = StObject.set(x, "keyExpr", value.asInstanceOf[js.Any])
    
    inline def setKeyExprUndefined: Self = StObject.set(x, "keyExpr", js.undefined)
    
    inline def setNoDataText(value: String): Self = StObject.set(x, "noDataText", value.asInstanceOf[js.Any])
    
    inline def setNoDataTextUndefined: Self = StObject.set(x, "noDataText", js.undefined)
    
    inline def setOnButtonClick(value: (js.Function1[/* e */ ButtonClickEvent, Unit]) | String): Self = StObject.set(x, "onButtonClick", value.asInstanceOf[js.Any])
    
    inline def setOnButtonClickFunction1(value: /* e */ ButtonClickEvent => Unit): Self = StObject.set(x, "onButtonClick", js.Any.fromFunction1(value))
    
    inline def setOnButtonClickUndefined: Self = StObject.set(x, "onButtonClick", js.undefined)
    
    inline def setOnItemClick(value: (js.Function1[/* e */ ItemClickEvent, Unit]) | String): Self = StObject.set(x, "onItemClick", value.asInstanceOf[js.Any])
    
    inline def setOnItemClickFunction1(value: /* e */ ItemClickEvent => Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction1(value))
    
    inline def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
    
    inline def setOnSelectionChanged(value: (js.Function1[/* e */ SelectionChangedEvent, Unit]) | String): Self = StObject.set(x, "onSelectionChanged", value.asInstanceOf[js.Any])
    
    inline def setOnSelectionChangedFunction1(value: /* e */ SelectionChangedEvent => Unit): Self = StObject.set(x, "onSelectionChanged", js.Any.fromFunction1(value))
    
    inline def setOnSelectionChangedUndefined: Self = StObject.set(x, "onSelectionChanged", js.undefined)
    
    inline def setOpened(value: Boolean): Self = StObject.set(x, "opened", value.asInstanceOf[js.Any])
    
    inline def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
    
    inline def setSelectedItem(value: String | Double | Any): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemKey(value: String | Double): Self = StObject.set(x, "selectedItemKey", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemKeyUndefined: Self = StObject.set(x, "selectedItemKey", js.undefined)
    
    inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
    
    inline def setShowArrowIcon(value: Boolean): Self = StObject.set(x, "showArrowIcon", value.asInstanceOf[js.Any])
    
    inline def setShowArrowIconUndefined: Self = StObject.set(x, "showArrowIcon", js.undefined)
    
    inline def setSplitButton(value: Boolean): Self = StObject.set(x, "splitButton", value.asInstanceOf[js.Any])
    
    inline def setSplitButtonUndefined: Self = StObject.set(x, "splitButton", js.undefined)
    
    inline def setStylingMode(value: ButtonStyle): Self = StObject.set(x, "stylingMode", value.asInstanceOf[js.Any])
    
    inline def setStylingModeUndefined: Self = StObject.set(x, "stylingMode", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setUseItemTextAsTitle(value: Boolean): Self = StObject.set(x, "useItemTextAsTitle", value.asInstanceOf[js.Any])
    
    inline def setUseItemTextAsTitleUndefined: Self = StObject.set(x, "useItemTextAsTitle", js.undefined)
    
    inline def setUseSelectMode(value: Boolean): Self = StObject.set(x, "useSelectMode", value.asInstanceOf[js.Any])
    
    inline def setUseSelectModeUndefined: Self = StObject.set(x, "useSelectMode", js.undefined)
    
    inline def setWrapItemText(value: Boolean): Self = StObject.set(x, "wrapItemText", value.asInstanceOf[js.Any])
    
    inline def setWrapItemTextUndefined: Self = StObject.set(x, "wrapItemText", js.undefined)
  }
}
