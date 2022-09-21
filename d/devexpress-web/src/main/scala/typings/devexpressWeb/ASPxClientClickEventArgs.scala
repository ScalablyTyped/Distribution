package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientPivotGrid.CellClick and ASPxClientPivotGrid.CellDblClick client events.
  */
trait ASPxClientClickEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets a column field name.
    */
  var ColumnFieldName: String
  
  /**
    * Gets the index of a column that owns the processed cell.
    */
  var ColumnIndex: Double
  
  /**
    * Gets a column field value.
    */
  var ColumnValue: Any
  
  /**
    * Gets a column value type.
    */
  var ColumnValueType: String
  
  /**
    * Gets the index of the data field which corresponds to the clicked summary value.
    */
  var DataIndex: Double
  
  /**
    * Provides access to the parameters associated with the ASPxClientPivotGrid.CellClick and ASPxClientPivotGrid.CellDblClick events.
    */
  var HtmlEvent: Any
  
  /**
    * Gets a row field name.
    */
  var RowFieldName: String
  
  /**
    * Gets the index of a row that owns the processed cell.
    */
  var RowIndex: Double
  
  /**
    * Gets a row field value.
    */
  var RowValue: Any
  
  /**
    * Gets a row value type.
    */
  var RowValueType: String
  
  /**
    * Gets the processed cell's value.
    */
  var Value: Any
}
object ASPxClientClickEventArgs {
  
  inline def apply(
    ColumnFieldName: String,
    ColumnIndex: Double,
    ColumnValue: Any,
    ColumnValueType: String,
    DataIndex: Double,
    HtmlEvent: Any,
    RowFieldName: String,
    RowIndex: Double,
    RowValue: Any,
    RowValueType: String,
    Value: Any
  ): ASPxClientClickEventArgs = {
    val __obj = js.Dynamic.literal(ColumnFieldName = ColumnFieldName.asInstanceOf[js.Any], ColumnIndex = ColumnIndex.asInstanceOf[js.Any], ColumnValue = ColumnValue.asInstanceOf[js.Any], ColumnValueType = ColumnValueType.asInstanceOf[js.Any], DataIndex = DataIndex.asInstanceOf[js.Any], HtmlEvent = HtmlEvent.asInstanceOf[js.Any], RowFieldName = RowFieldName.asInstanceOf[js.Any], RowIndex = RowIndex.asInstanceOf[js.Any], RowValue = RowValue.asInstanceOf[js.Any], RowValueType = RowValueType.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientClickEventArgs]
  }
  
  extension [Self <: ASPxClientClickEventArgs](x: Self) {
    
    inline def setColumnFieldName(value: String): Self = StObject.set(x, "ColumnFieldName", value.asInstanceOf[js.Any])
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "ColumnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnValue(value: Any): Self = StObject.set(x, "ColumnValue", value.asInstanceOf[js.Any])
    
    inline def setColumnValueType(value: String): Self = StObject.set(x, "ColumnValueType", value.asInstanceOf[js.Any])
    
    inline def setDataIndex(value: Double): Self = StObject.set(x, "DataIndex", value.asInstanceOf[js.Any])
    
    inline def setHtmlEvent(value: Any): Self = StObject.set(x, "HtmlEvent", value.asInstanceOf[js.Any])
    
    inline def setRowFieldName(value: String): Self = StObject.set(x, "RowFieldName", value.asInstanceOf[js.Any])
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "RowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowValue(value: Any): Self = StObject.set(x, "RowValue", value.asInstanceOf[js.Any])
    
    inline def setRowValueType(value: String): Self = StObject.set(x, "RowValueType", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
