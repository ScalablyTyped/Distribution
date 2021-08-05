package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import typings.devextreme.mod.DevExpress.ui.dxDataGridRowObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupContinuedMessage extends StObject {
  
  var column: js.UndefOr[this.type] = js.undefined
  
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  var component: js.UndefOr[dxDataGrid] = js.undefined
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var displayValue: js.UndefOr[js.Any] = js.undefined
  
  var groupContinuedMessage: js.UndefOr[String] = js.undefined
  
  var groupContinuesMessage: js.UndefOr[String] = js.undefined
  
  var row: js.UndefOr[dxDataGridRowObject] = js.undefined
  
  var rowIndex: js.UndefOr[Double] = js.undefined
  
  var summaryItems: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[js.Any] = js.undefined
}
object GroupContinuedMessage {
  
  inline def apply(): GroupContinuedMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupContinuedMessage]
  }
  
  extension [Self <: GroupContinuedMessage](x: Self) {
    
    inline def setColumn(value: GroupContinuedMessage): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setComponent(value: dxDataGrid): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDisplayValue(value: js.Any): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
    
    inline def setDisplayValueUndefined: Self = StObject.set(x, "displayValue", js.undefined)
    
    inline def setGroupContinuedMessage(value: String): Self = StObject.set(x, "groupContinuedMessage", value.asInstanceOf[js.Any])
    
    inline def setGroupContinuedMessageUndefined: Self = StObject.set(x, "groupContinuedMessage", js.undefined)
    
    inline def setGroupContinuesMessage(value: String): Self = StObject.set(x, "groupContinuesMessage", value.asInstanceOf[js.Any])
    
    inline def setGroupContinuesMessageUndefined: Self = StObject.set(x, "groupContinuesMessage", js.undefined)
    
    inline def setRow(value: dxDataGridRowObject): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    
    inline def setSummaryItems(value: js.Array[js.Any]): Self = StObject.set(x, "summaryItems", value.asInstanceOf[js.Any])
    
    inline def setSummaryItemsUndefined: Self = StObject.set(x, "summaryItems", js.undefined)
    
    inline def setSummaryItemsVarargs(value: js.Any*): Self = StObject.set(x, "summaryItems", js.Array(value :_*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
