package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientPivotGrid.CellClick and ASPxClientPivotGrid.CellDblClick client events.
  */
@JSGlobal("ASPxClientClickEventArgs")
@js.native
class ASPxClientClickEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientClickEventArgs {
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
    value: js.Any,
    columnIndex: Double,
    rowIndex: Double,
    columnValue: js.Any,
    rowValue: js.Any,
    columnFieldName: String,
    rowFieldName: String,
    columnValueType: String,
    rowValueType: String,
    dataIndex: Double
  ) = this()
}
