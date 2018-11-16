package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.DataTable")
@js.native
class DataTable () extends js.Object {
  def this(data: js.Any) = this()
  def this(data: js.Any, version: js.Any) = this()
  def addColumn(descriptionObject: DataTableColumnDescription): scala.Double = js.native
  def addColumn(`type`: java.lang.String): scala.Double = js.native
  def addColumn(`type`: java.lang.String, label: java.lang.String): scala.Double = js.native
  def addColumn(`type`: java.lang.String, label: java.lang.String, id: java.lang.String): scala.Double = js.native
  def addRow(): scala.Double = js.native
  def addRow(cellArray: js.Array[_]): scala.Double = js.native
  def addRow(cellObject: DataObjectCell): scala.Double = js.native
  def addRows(numberOfEmptyRows: scala.Double): scala.Double = js.native
  def addRows(rows: js.Array[js.Array[_ | DataObjectCell]]): scala.Double = js.native
  def getColumnId(columnIndex: scala.Double): java.lang.String = js.native
  def getColumnLabel(columnIndex: scala.Double): java.lang.String = js.native
  def getColumnPattern(columnIndex: scala.Double): java.lang.String = js.native
  def getColumnProperties(columnIndex: scala.Double): Properties = js.native
  def getColumnProperty(columnIndex: scala.Double, name: java.lang.String): js.Any = js.native
  def getColumnRange(columnIndex: scala.Double): googleDotVisualizationLib.Anon_Max = js.native
  def getColumnRole(columnIndex: scala.Double): java.lang.String = js.native
  def getColumnType(columnIndex: scala.Double): java.lang.String = js.native
  def getDistinctValues(columnIndex: scala.Double): js.Array[_] = js.native
  def getFilteredRows(filters: js.Array[DataTableCellFilter]): js.Array[scala.Double] = js.native
  def getFormattedValue(rowIndex: scala.Double, columnIndex: scala.Double): java.lang.String = js.native
  def getNumberOfColumns(): scala.Double = js.native
  def getNumberOfRows(): scala.Double = js.native
  def getProperties(rowIndex: scala.Double, columnIndex: scala.Double): Properties = js.native
  def getProperty(rowIndex: scala.Double, columnIndex: scala.Double, name: java.lang.String): js.Any = js.native
  def getRowProperties(rowIndex: scala.Double): Properties = js.native
  def getRowProperty(rowIndex: scala.Double, name: java.lang.String): Properties = js.native
  def getSortedRows(sortColumn: SortByColumn): js.Array[scala.Double] = js.native
  def getSortedRows(sortColumn: scala.Double): js.Array[scala.Double] = js.native
  def getSortedRows(sortColumns: js.Array[SortByColumn | scala.Double]): js.Array[scala.Double] = js.native
  def getTableProperties(): Properties = js.native
  def getTableProperty(name: java.lang.String): js.Any = js.native
  def getValue(rowIndex: scala.Double, columnIndex: scala.Double): js.Any = js.native
  def insertColumn(columnIndex: scala.Double, `type`: java.lang.String): scala.Unit = js.native
  def insertColumn(columnIndex: scala.Double, `type`: java.lang.String, label: java.lang.String): scala.Unit = js.native
  def insertColumn(columnIndex: scala.Double, `type`: java.lang.String, label: java.lang.String, id: java.lang.String): scala.Unit = js.native
  def insertRows(rowIndex: scala.Double, numberOfEmptyRows: scala.Double): scala.Unit = js.native
  def insertRows(rowIndex: scala.Double, rows: js.Array[js.Array[_ | DataObjectCell]]): scala.Unit = js.native
  def removeColumn(columnIndex: scala.Double): scala.Unit = js.native
  def removeColumns(columnIndex: scala.Double, numberOfColumns: scala.Double): scala.Unit = js.native
  def removeRow(rowIndex: scala.Double): scala.Unit = js.native
  def removeRows(rowIndex: scala.Double, numberOfRows: scala.Double): scala.Unit = js.native
  def setCell(rowIndex: scala.Double, columnIndex: scala.Double): scala.Unit = js.native
  def setCell(rowIndex: scala.Double, columnIndex: scala.Double, value: js.Any): scala.Unit = js.native
  def setCell(rowIndex: scala.Double, columnIndex: scala.Double, value: js.Any, formattedValue: java.lang.String): scala.Unit = js.native
  def setCell(
    rowIndex: scala.Double,
    columnIndex: scala.Double,
    value: js.Any,
    formattedValue: java.lang.String,
    properties: Properties
  ): scala.Unit = js.native
  def setColumnLabel(columnIndex: scala.Double, label: java.lang.String): scala.Unit = js.native
  def setColumnProperties(columnIndex: scala.Double, properties: Properties): scala.Unit = js.native
  def setColumnProperty(columnIndex: scala.Double, name: java.lang.String, value: js.Any): scala.Unit = js.native
  def setFormattedValue(rowIndex: scala.Double, columnIndex: scala.Double): scala.Unit = js.native
  def setFormattedValue(rowIndex: scala.Double, columnIndex: scala.Double, formattedValue: java.lang.String): scala.Unit = js.native
  def setProperties(rowIndex: scala.Double, columnIndex: scala.Double, properties: Properties): scala.Unit = js.native
  def setProperty(rowIndex: scala.Double, columnIndex: scala.Double, name: java.lang.String, value: js.Any): scala.Unit = js.native
  def setRowProperties(rowIndex: scala.Double, properties: Properties): scala.Unit = js.native
  def setRowProperty(rowIndex: scala.Double, name: java.lang.String, value: js.Any): scala.Unit = js.native
  def setTableProperties(properties: Properties): scala.Unit = js.native
  def setTableProperty(name: java.lang.String, value: js.Any): scala.Unit = js.native
  def setValue(rowIndex: scala.Double, columnIndex: scala.Double, value: js.Any): scala.Unit = js.native
  def sort(sortColumn: SortByColumn): js.Array[scala.Double] = js.native
  def sort(sortColumn: scala.Double): js.Array[scala.Double] = js.native
  def sort(sortColumns: js.Array[SortByColumn | scala.Double]): js.Array[scala.Double] = js.native
  def toJSON(): java.lang.String = js.native
}

