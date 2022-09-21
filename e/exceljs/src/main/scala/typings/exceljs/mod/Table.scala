package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Required<exceljs.exceljs.TableProperties> */
@js.native
trait Table extends StObject {
  
  /**
  	 * Add a new column, including column defn and values
  	 * inserts at colNumber or adds to the right
  	 */
  def addColumn(column: TableColumnProperties, values: js.Array[Any], colIndex: Double): Unit = js.native
  
  /**
  	 * Add a row of data, either insert at rowNumber or append
  	 */
  def addRow(values: js.Array[Any]): Unit = js.native
  def addRow(values: js.Array[Any], rowNumber: Double): Unit = js.native
  
  var columns: js.Array[TableColumnProperties] = js.native
  
  /**
  	 * Commit changes
  	 */
  def commit(): Unit = js.native
  
  var displayName: String = js.native
  
  /**
  	 * Get column
  	 */
  def getColumn(colIndex: Double): TableColumn = js.native
  
  var headerRow: Boolean = js.native
  
  var name: String = js.native
  
  var ref: String = js.native
  
  /**
  	 * Remove a column with data
  	 */
  def removeColumns(colIndex: Double, count: Double): Unit = js.native
  
  /**
  	 * Remove a rows of data
  	 */
  def removeRows(rowIndex: Double, count: Double): Unit = js.native
  
  var rows: js.Array[js.Array[Any]] = js.native
  
  var style: TableStyleProperties = js.native
  
  var totalsRow: Boolean = js.native
}
