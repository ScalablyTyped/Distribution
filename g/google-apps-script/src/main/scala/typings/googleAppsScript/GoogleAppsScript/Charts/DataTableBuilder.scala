package typings.googleAppsScript.GoogleAppsScript.Charts

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder of DataTable objects. Building a data table consists of first specifying its columns, and
  * then adding its rows, one at a time. Example:
  *
  *     var data = Charts.newDataTable()
  *         .addColumn(Charts.ColumnType.STRING, "Month")
  *         .addColumn(Charts.ColumnType.NUMBER, "In Store")
  *         .addColumn(Charts.ColumnType.NUMBER, "Online")
  *         .addRow(["January", 10, 1])
  *         .addRow(["February", 12, 1])
  *         .addRow(["March", 20, 2])
  *         .addRow(["April", 25, 3])
  *         .addRow(["May", 30, 4])
  *         .build();
  */
trait DataTableBuilder extends StObject {
  
  def addColumn(`type`: ColumnType, label: String): DataTableBuilder
  
  def addRow(values: js.Array[Any]): DataTableBuilder
  
  def build(): DataTable
  
  def setValue(row: Integer, column: Integer, value: Any): DataTableBuilder
}
object DataTableBuilder {
  
  inline def apply(
    addColumn: (ColumnType, String) => DataTableBuilder,
    addRow: js.Array[Any] => DataTableBuilder,
    build: () => DataTable,
    setValue: (Integer, Integer, Any) => DataTableBuilder
  ): DataTableBuilder = {
    val __obj = js.Dynamic.literal(addColumn = js.Any.fromFunction2(addColumn), addRow = js.Any.fromFunction1(addRow), build = js.Any.fromFunction0(build), setValue = js.Any.fromFunction3(setValue))
    __obj.asInstanceOf[DataTableBuilder]
  }
  
  extension [Self <: DataTableBuilder](x: Self) {
    
    inline def setAddColumn(value: (ColumnType, String) => DataTableBuilder): Self = StObject.set(x, "addColumn", js.Any.fromFunction2(value))
    
    inline def setAddRow(value: js.Array[Any] => DataTableBuilder): Self = StObject.set(x, "addRow", js.Any.fromFunction1(value))
    
    inline def setBuild(value: () => DataTable): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    inline def setSetValue(value: (Integer, Integer, Any) => DataTableBuilder): Self = StObject.set(x, "setValue", js.Any.fromFunction3(value))
  }
}
