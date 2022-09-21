package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.Column
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.ColumnButtonBase
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.ColumnButtonClickEvent
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.ColumnButtonTemplateData
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.DataGridPredefinedColumnButton
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxDataGridColumnButton[TRowData, TKey]
  extends StObject
     with ColumnButtonBase {
  
  /**
    * Specifies whether the button is disabled.
    */
  var disabled: js.UndefOr[Boolean | (js.Function1[/* options */ Column[TRowData, TKey], Boolean])] = js.undefined
  
  /**
    * The name used to identify a built-in button.
    */
  var name: js.UndefOr[DataGridPredefinedColumnButton | String] = js.undefined
  
  /**
    * A function that is executed when the button is clicked or tapped.
    */
  var onClick: js.UndefOr[js.Function1[/* e */ ColumnButtonClickEvent[TRowData, TKey], Unit]] = js.undefined
  
  /**
    * Specifies a custom button template.
    */
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* cellElement */ DxElement_[HTMLElement], 
      /* cellInfo */ ColumnButtonTemplateData[TRowData, TKey], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Specifies the button&apos;s visibility.
    */
  var visible: js.UndefOr[Boolean | (js.Function1[/* options */ Column[TRowData, TKey], Boolean])] = js.undefined
}
object dxDataGridColumnButton {
  
  inline def apply[TRowData, TKey](): dxDataGridColumnButton[TRowData, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDataGridColumnButton[TRowData, TKey]]
  }
  
  extension [Self <: dxDataGridColumnButton[?, ?], TRowData, TKey](x: Self & (dxDataGridColumnButton[TRowData, TKey])) {
    
    inline def setDisabled(value: Boolean | (js.Function1[/* options */ Column[TRowData, TKey], Boolean])): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledFunction1(value: /* options */ Column[TRowData, TKey] => Boolean): Self = StObject.set(x, "disabled", js.Any.fromFunction1(value))
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setName(value: DataGridPredefinedColumnButton | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnClick(value: /* e */ ColumnButtonClickEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setTemplate(
      value: template | (js.Function2[
          /* cellElement */ DxElement_[HTMLElement], 
          /* cellInfo */ ColumnButtonTemplateData[TRowData, TKey], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateFunction2(
      value: (/* cellElement */ DxElement_[HTMLElement], /* cellInfo */ ColumnButtonTemplateData[TRowData, TKey]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "template", js.Any.fromFunction2(value))
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setVisible(value: Boolean | (js.Function1[/* options */ Column[TRowData, TKey], Boolean])): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleFunction1(value: /* options */ Column[TRowData, TKey] => Boolean): Self = StObject.set(x, "visible", js.Any.fromFunction1(value))
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
