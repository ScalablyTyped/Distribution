package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientPivotGrid.CellClick and ASPxClientPivotGrid.CellDblClick client events.
  */
@JSGlobal("ASPxClientClickEventArgs")
@js.native
open class ASPxClientClickEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientClickEventArgs {
  /**
    * Initializes a new instance of the ASPxClientClickEventArgs class.
    * @param value An object that represents the processed cell's value. This value is assigned to the ASPxClientClickEventArgs.Value property.
    * @param columnIndex An integer value that identifies a column. This value is assigned to the ASPxClientClickEventArgs.ColumnIndex property.
    * @param rowIndex An integer value that identifies a row. This value is assigned to the ASPxClientClickEventArgs.RowIndex property.
    * @param columnValue An object that represents a column field value. This value is assigned to the ASPxClientClickEventArgs.ColumnValue property.
    * @param rowValue An object that represents a row field value. This value is assigned to the ASPxClientClickEventArgs.RowValue property.
    * @param columnFieldName A String value that represents a column field name. This value is assigned to the ASPxClientClickEventArgs.ColumnFieldName property.
    * @param rowFieldName A String value that represents a row field name. This value is assigned to the ASPxClientClickEventArgs.RowFieldName property.
    * @param columnValueType A String value that represents a column value type. This value is assigned to the ASPxClientClickEventArgs.ColumnValueType property.
    * @param rowValueType A String value that represents a row value type. This value is assigned to the ASPxClientClickEventArgs.RowValueType property.
    * @param dataIndex An integer value that identifies the data field by its index. This value is assigned to the ASPxClientClickEventArgs.DataIndex property.
    */
  def this(
    value: Any,
    columnIndex: Double,
    rowIndex: Double,
    columnValue: Any,
    rowValue: Any,
    columnFieldName: String,
    rowFieldName: String,
    columnValueType: String,
    rowValueType: String,
    dataIndex: Double
  ) = this()
  
  /**
    * Gets a column field name.
    */
  /* CompleteClass */
  var ColumnFieldName: String = js.native
  
  /**
    * Gets the index of a column that owns the processed cell.
    */
  /* CompleteClass */
  var ColumnIndex: Double = js.native
  
  /**
    * Gets a column field value.
    */
  /* CompleteClass */
  var ColumnValue: Any = js.native
  
  /**
    * Gets a column value type.
    */
  /* CompleteClass */
  var ColumnValueType: String = js.native
  
  /**
    * Gets the index of the data field which corresponds to the clicked summary value.
    */
  /* CompleteClass */
  var DataIndex: Double = js.native
  
  /**
    * Provides access to the parameters associated with the ASPxClientPivotGrid.CellClick and ASPxClientPivotGrid.CellDblClick events.
    */
  /* CompleteClass */
  var HtmlEvent: Any = js.native
  
  /**
    * Gets a row field name.
    */
  /* CompleteClass */
  var RowFieldName: String = js.native
  
  /**
    * Gets the index of a row that owns the processed cell.
    */
  /* CompleteClass */
  var RowIndex: Double = js.native
  
  /**
    * Gets a row field value.
    */
  /* CompleteClass */
  var RowValue: Any = js.native
  
  /**
    * Gets a row value type.
    */
  /* CompleteClass */
  var RowValueType: String = js.native
  
  /**
    * Gets the processed cell's value.
    */
  /* CompleteClass */
  var Value: Any = js.native
}
