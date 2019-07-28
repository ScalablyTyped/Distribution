package typings.googleDotVisualization.googleNs.visualizationNs

import typings.googleDotVisualization.Anon_Max
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.DataView")
@js.native
class DataView protected () extends js.Object {
  def this(data: DataTable) = this()
  def this(data: DataView) = this()
  def getColumnId(columnIndex: Double): String = js.native
  def getColumnLabel(columnIndex: Double): String = js.native
  def getColumnPattern(columnIndex: Double): String = js.native
  def getColumnProperty(columnIndex: Double, name: String): js.Any = js.native
  def getColumnRange(columnIndex: Double): Anon_Max = js.native
  def getColumnType(columnIndex: Double): String = js.native
  def getDistinctValues(columnIndex: Double): js.Array[_] = js.native
  def getFilteredRows(filters: js.Array[DataTableCellFilter]): js.Array[Double] = js.native
  def getFormattedValue(rowIndex: Double, columnIndex: Double): String = js.native
  def getNumberOfColumns(): Double = js.native
  def getNumberOfRows(): Double = js.native
  def getProperties(rowIndex: Double, columnIndex: Double): Properties = js.native
  def getProperty(rowIndex: Double, columnIndex: Double, name: String): js.Any = js.native
  def getRowProperty(rowIndex: Double, name: String): Properties = js.native
  def getSortedRows(sortColumn: Double): js.Array[Double] = js.native
  def getSortedRows(sortColumns: js.Array[Double | SortByColumn]): js.Array[Double] = js.native
  def getSortedRows(sortColumn: SortByColumn): js.Array[Double] = js.native
  def getTableColumnIndex(viewColumnIndex: Double): Double = js.native
  def getTableProperty(name: String): js.Any = js.native
  def getTableRowIndex(viewRowIndex: Double): Double = js.native
  def getValue(rowIndex: Double, columnIndex: Double): js.Any = js.native
  def getViewColumnIndex(tableColumnIndex: Double): Double = js.native
  def getViewColumns(): js.Array[Double] = js.native
  def getViewRowIndex(tableRowIndex: Double): Double = js.native
  def getViewRows(): js.Array[Double] = js.native
  def hideColumns(columnIndexes: js.Array[Double]): Unit = js.native
  def hideRows(min: Double, max: Double): Unit = js.native
  def hideRows(rowIndexes: js.Array[Double]): Unit = js.native
  def setColumns(columnIndexes: js.Array[_ | ColumnSpec | Double]): Unit = js.native
  def setRows(min: Double, max: Double): Unit = js.native
  def setRows(rowIndexes: js.Array[Double]): Unit = js.native
  def toDataTable(): DataTable = js.native
  def toJSON(): String = js.native
}

