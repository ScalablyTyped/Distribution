package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.common.Orientation
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.data.DataSource.DataSourceLike
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.devextreme.mod.DevExpress.ui.DataExpressionMixinOptions because var conflicts: value. Inlined dataSource, displayExpr, itemTemplate, items, valueExpr */ trait dxRadioGroupOptions
  extends StObject
     with EditorOptions[dxRadioGroup] {
  
  /**
    * Binds the UI component to data.
    */
  var dataSource: js.UndefOr[(DataSourceLike[CollectionWidgetItem | Any, Any]) | Null] = js.undefined
  
  /**
    * Specifies the data field whose values should be displayed.
    */
  var displayExpr: js.UndefOr[String | (js.Function1[/* item */ Any, String])] = js.undefined
  
  /**
    * Specifies a custom template for items.
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
    * An array of items displayed by the UI component.
    */
  var items: js.UndefOr[js.Array[CollectionWidgetItem | Any]] = js.undefined
  
  /**
    * Specifies the radio group layout.
    */
  var layout: js.UndefOr[Orientation] = js.undefined
  
  /**
    * The value to be assigned to the `name` attribute of the underlying HTML element.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies which data field provides unique values to the UI component&apos;s value.
    */
  var valueExpr: js.UndefOr[String | (js.Function1[/* item */ Any, String | Double | Boolean])] = js.undefined
}
object dxRadioGroupOptions {
  
  inline def apply(): dxRadioGroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxRadioGroupOptions]
  }
  
  extension [Self <: dxRadioGroupOptions](x: Self) {
    
    inline def setDataSource(value: DataSourceLike[CollectionWidgetItem | Any, Any]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceNull: Self = StObject.set(x, "dataSource", null)
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: (CollectionWidgetItem | Any)*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setDisplayExpr(value: String | (js.Function1[/* item */ Any, String])): Self = StObject.set(x, "displayExpr", value.asInstanceOf[js.Any])
    
    inline def setDisplayExprFunction1(value: /* item */ Any => String): Self = StObject.set(x, "displayExpr", js.Any.fromFunction1(value))
    
    inline def setDisplayExprUndefined: Self = StObject.set(x, "displayExpr", js.undefined)
    
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
    
    inline def setItems(value: js.Array[CollectionWidgetItem | Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: (CollectionWidgetItem | Any)*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLayout(value: Orientation): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValueExpr(value: String | (js.Function1[/* item */ Any, String | Double | Boolean])): Self = StObject.set(x, "valueExpr", value.asInstanceOf[js.Any])
    
    inline def setValueExprFunction1(value: /* item */ Any => String | Double | Boolean): Self = StObject.set(x, "valueExpr", js.Any.fromFunction1(value))
    
    inline def setValueExprUndefined: Self = StObject.set(x, "valueExpr", js.undefined)
  }
}
