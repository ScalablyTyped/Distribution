package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientPivotGrid.CellClick and ASPxClientPivotGrid.CellDblClick client events.
  */
@js.native
trait ASPxClientClickEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets a column field name.
    */
  var ColumnFieldName: String = js.native
  
  /**
    * Gets the index of a column that owns the processed cell.
    */
  var ColumnIndex: Double = js.native
  
  /**
    * Gets a column field value.
    */
  var ColumnValue: js.Any = js.native
  
  /**
    * Gets a column value type.
    */
  var ColumnValueType: String = js.native
  
  /**
    * Gets the index of the data field which corresponds to the clicked summary value.
    */
  var DataIndex: Double = js.native
  
  /**
    * Provides access to the parameters associated with the ASPxClientPivotGrid.CellClick and ASPxClientPivotGrid.CellDblClick events.
    */
  var HtmlEvent: js.Any = js.native
  
  /**
    * Gets a row field name.
    */
  var RowFieldName: String = js.native
  
  /**
    * Gets the index of a row that owns the processed cell.
    */
  var RowIndex: Double = js.native
  
  /**
    * Gets a row field value.
    */
  var RowValue: js.Any = js.native
  
  /**
    * Gets a row value type.
    */
  var RowValueType: String = js.native
  
  /**
    * Gets the processed cell's value.
    */
  var Value: js.Any = js.native
}
object ASPxClientClickEventArgs {
  
  @scala.inline
  def apply(
    ColumnFieldName: String,
    ColumnIndex: Double,
    ColumnValue: js.Any,
    ColumnValueType: String,
    DataIndex: Double,
    HtmlEvent: js.Any,
    RowFieldName: String,
    RowIndex: Double,
    RowValue: js.Any,
    RowValueType: String,
    Value: js.Any
  ): ASPxClientClickEventArgs = {
    val __obj = js.Dynamic.literal(ColumnFieldName = ColumnFieldName.asInstanceOf[js.Any], ColumnIndex = ColumnIndex.asInstanceOf[js.Any], ColumnValue = ColumnValue.asInstanceOf[js.Any], ColumnValueType = ColumnValueType.asInstanceOf[js.Any], DataIndex = DataIndex.asInstanceOf[js.Any], HtmlEvent = HtmlEvent.asInstanceOf[js.Any], RowFieldName = RowFieldName.asInstanceOf[js.Any], RowIndex = RowIndex.asInstanceOf[js.Any], RowValue = RowValue.asInstanceOf[js.Any], RowValueType = RowValueType.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientClickEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientClickEventArgsOps[Self <: ASPxClientClickEventArgs] (val x: Self) extends AnyVal {
    
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
    def setColumnFieldName(value: String): Self = this.set("ColumnFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndex(value: Double): Self = this.set("ColumnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnValue(value: js.Any): Self = this.set("ColumnValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnValueType(value: String): Self = this.set("ColumnValueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataIndex(value: Double): Self = this.set("DataIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlEvent(value: js.Any): Self = this.set("HtmlEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowFieldName(value: String): Self = this.set("RowFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("RowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowValue(value: js.Any): Self = this.set("RowValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowValueType(value: String): Self = this.set("RowValueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
}
