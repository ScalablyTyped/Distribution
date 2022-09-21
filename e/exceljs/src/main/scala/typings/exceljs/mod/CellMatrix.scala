package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellMatrix extends StObject {
  
  def addCell(addressStr: String): Unit = js.native
  
  def addCellEx(address: String): Unit = js.native
  def addCellEx(address: Location): Unit = js.native
  
  def findCell(addressStr: String): js.UndefOr[Cell] = js.native
  
  def findCellAt(sheetName: String, rowNumber: Double, colNumber: Double): js.UndefOr[Cell] = js.native
  
  def findCellEx(address: String, create: Boolean): js.UndefOr[Cell] = js.native
  def findCellEx(address: Location, create: Boolean): js.UndefOr[Cell] = js.native
  
  def findRowCell(row: js.Array[Any], address: Address, create: Boolean): js.UndefOr[Cell] = js.native
  
  def findSheet(address: String, create: Boolean): js.UndefOr[js.Array[Cell]] = js.native
  def findSheet(address: Location, create: Boolean): js.UndefOr[js.Array[Cell]] = js.native
  
  def findSheetRow(sheet: js.Array[js.Array[Cell]], address: String, create: Boolean): js.UndefOr[Row] = js.native
  def findSheetRow(sheet: js.Array[js.Array[Cell]], address: Location, create: Boolean): js.UndefOr[Row] = js.native
  
  def forEach(callback: js.Function1[/* cell */ Cell, Unit]): Unit = js.native
  
  def getCell(addressStr: String): Cell = js.native
  
  def getCellAt(sheetName: String, rowNumber: Double, colNumber: Double): Cell = js.native
  
  def getCellEx(address: String): Cell = js.native
  def getCellEx(address: Location): Cell = js.native
  
  def map[T](callback: js.Function1[/* cell */ Cell, T]): js.Array[T] = js.native
  
  def removeCellEx(address: String): Unit = js.native
  def removeCellEx(address: Location): Unit = js.native
}
