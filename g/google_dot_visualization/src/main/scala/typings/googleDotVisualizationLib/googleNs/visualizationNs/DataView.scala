package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.DataView")
@js.native
class DataView protected () extends js.Object {
  def this(data: DataTable) = this()
  def this(data: DataView) = this()
  def getColumnId(columnIndex: scala.Double): java.lang.String = js.native
  def getColumnLabel(columnIndex: scala.Double): java.lang.String = js.native
  def getColumnPattern(columnIndex: scala.Double): java.lang.String = js.native
  def getColumnProperty(columnIndex: scala.Double, name: java.lang.String): js.Any = js.native
  def getColumnRange(columnIndex: scala.Double): googleDotVisualizationLib.Anon_Max = js.native
  def getColumnType(columnIndex: scala.Double): java.lang.String = js.native
  def getDistinctValues(columnIndex: scala.Double): js.Array[_] = js.native
  def getFilteredRows(filters: js.Array[DataTableCellFilter]): js.Array[scala.Double] = js.native
  def getFormattedValue(rowIndex: scala.Double, columnIndex: scala.Double): java.lang.String = js.native
  def getNumberOfColumns(): scala.Double = js.native
  def getNumberOfRows(): scala.Double = js.native
  def getProperties(rowIndex: scala.Double, columnIndex: scala.Double): Properties = js.native
  def getProperty(rowIndex: scala.Double, columnIndex: scala.Double, name: java.lang.String): js.Any = js.native
  def getRowProperty(rowIndex: scala.Double, name: java.lang.String): Properties = js.native
  def getSortedRows(sortColumn: SortByColumn): js.Array[scala.Double] = js.native
  def getSortedRows(sortColumn: scala.Double): js.Array[scala.Double] = js.native
  def getSortedRows(sortColumns: js.Array[SortByColumn | scala.Double]): js.Array[scala.Double] = js.native
  def getTableColumnIndex(viewColumnIndex: scala.Double): scala.Double = js.native
  def getTableProperty(name: java.lang.String): js.Any = js.native
  def getTableRowIndex(viewRowIndex: scala.Double): scala.Double = js.native
  def getValue(rowIndex: scala.Double, columnIndex: scala.Double): js.Any = js.native
  def getViewColumnIndex(tableColumnIndex: scala.Double): scala.Double = js.native
  def getViewColumns(): js.Array[scala.Double] = js.native
  def getViewRowIndex(tableRowIndex: scala.Double): scala.Double = js.native
  def getViewRows(): js.Array[scala.Double] = js.native
  def hideColumns(columnIndexes: js.Array[scala.Double]): scala.Unit = js.native
  def hideRows(min: scala.Double, max: scala.Double): scala.Unit = js.native
  def hideRows(rowIndexes: js.Array[scala.Double]): scala.Unit = js.native
  def setColumns(columnIndexes: js.Array[_ | ColumnSpec | scala.Double]): scala.Unit = js.native
  def setRows(min: scala.Double, max: scala.Double): scala.Unit = js.native
  def setRows(rowIndexes: js.Array[scala.Double]): scala.Unit = js.native
  def toDataTable(): DataTable = js.native
  def toJSON(): java.lang.String = js.native
}

