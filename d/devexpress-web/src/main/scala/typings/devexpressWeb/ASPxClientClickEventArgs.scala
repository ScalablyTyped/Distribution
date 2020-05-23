package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientPivotGrid.CellClick and ASPxClientPivotGrid.CellDblClick client events.
  */
trait ASPxClientClickEventArgs extends ASPxClientEventArgs {
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
  var ColumnValue: js.Any
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
  var HtmlEvent: js.Any
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
  var RowValue: js.Any
  /**
    * Gets a row value type.
    */
  var RowValueType: String
  /**
    * Gets the processed cell's value.
    */
  var Value: js.Any
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
}

