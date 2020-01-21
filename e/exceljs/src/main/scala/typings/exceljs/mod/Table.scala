package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof exceljs.exceljs.TableProperties ]: -? exceljs.exceljs.TableProperties[P]} */ trait Table extends js.Object {
  /**
  	 * Add a new column, including column defn and values
  	 * inserts at colNumber or adds to the right
  	 */
  def addColumn(column: TableColumnProperties, values: js.Array[_], colIndex: Double): Unit
  /**
  	 * Add a row of data, either insert at rowNumber or append
  	 */
  def addRow(values: js.Array[_], rowNumber: Double): Unit
  /**
  	 * Commit changes
  	 */
  def commit(): Unit
  /**
  	 * Get column
  	 */
  def getColumn(colIndex: Double): TableColumn
  /**
  	 * Remove a column with data
  	 */
  def removeColumns(colIndex: Double, count: Double): Unit
  /**
  	 * Remove a rows of data
  	 */
  def removeRows(rowIndex: Double, count: Double): Unit
}

object Table {
  @scala.inline
  def apply(
    addColumn: (TableColumnProperties, js.Array[_], Double) => Unit,
    addRow: (js.Array[_], Double) => Unit,
    commit: () => Unit,
    getColumn: Double => TableColumn,
    removeColumns: (Double, Double) => Unit,
    removeRows: (Double, Double) => Unit
  ): Table = {
    val __obj = js.Dynamic.literal(addColumn = js.Any.fromFunction3(addColumn), addRow = js.Any.fromFunction2(addRow), commit = js.Any.fromFunction0(commit), getColumn = js.Any.fromFunction1(getColumn), removeColumns = js.Any.fromFunction2(removeColumns), removeRows = js.Any.fromFunction2(removeRows))
  
    __obj.asInstanceOf[Table]
  }
}

