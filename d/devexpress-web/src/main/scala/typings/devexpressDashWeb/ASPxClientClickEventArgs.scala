package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the CellDblClick client events.
  */
trait ASPxClientClickEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a column field name.
    * Value: A String value that represents a column field name.
    */
  var ColumnFieldName: String
  /**
    * Gets the index of a column that owns the processed cell.
    * Value: An integer value that identifies a column.
    */
  var ColumnIndex: Double
  /**
    * Gets a column field value.
    * Value: An object that represents a column field value.
    */
  var ColumnValue: js.Object
  /**
    * Gets a column value type.
    * Value: A String value that represents a column value type.
    */
  var ColumnValueType: String
  /**
    * Gets the index of the data field which corresponds to the clicked summary value.
    * Value: An integer value that identifies the data field.
    */
  var DataIndex: Double
  /**
    * Provides access to the parameters associated with the CellDblClick events.
    * Value: An object that contains parameters associated with the CellDblClick events.
    */
  var HtmlEvent: js.Object
  /**
    * Gets a row field name.
    * Value: A String value that represents a row field name.
    */
  var RowFieldName: String
  /**
    * Gets the index of a row that owns the processed cell.
    * Value: An integer value that identifies a row.
    */
  var RowIndex: Double
  /**
    * Gets a row field value.
    * Value: An object that represents a row field value.
    */
  var RowValue: js.Object
  /**
    * Gets a row value type.
    * Value: A String value that represents a row value type.
    */
  var RowValueType: String
  /**
    * Gets the processed cell's value.
    * Value: An object that represents the processed cell's value.
    */
  var Value: js.Object
}

object ASPxClientClickEventArgs {
  @scala.inline
  def apply(
    ColumnFieldName: String,
    ColumnIndex: Double,
    ColumnValue: js.Object,
    ColumnValueType: String,
    DataIndex: Double,
    HtmlEvent: js.Object,
    RowFieldName: String,
    RowIndex: Double,
    RowValue: js.Object,
    RowValueType: String,
    Value: js.Object
  ): ASPxClientClickEventArgs = {
    val __obj = js.Dynamic.literal(ColumnFieldName = ColumnFieldName, ColumnIndex = ColumnIndex, ColumnValue = ColumnValue, ColumnValueType = ColumnValueType, DataIndex = DataIndex, HtmlEvent = HtmlEvent, RowFieldName = RowFieldName, RowIndex = RowIndex, RowValue = RowValue, RowValueType = RowValueType, Value = Value)
  
    __obj.asInstanceOf[ASPxClientClickEventArgs]
  }
}

