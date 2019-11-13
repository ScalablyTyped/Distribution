package typings.googleDashAppsDashScript.GoogleAppsScript.Document

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An element representing a table. A Table may only contain TableRow elements. For
  * more information on document structure, see the guide to extending Google Docs.
  *
  * When creating a Table that contains a large number of rows or cells, consider building
  * it from a string array, as shown in the following example.
  *
  *     var body = DocumentApp.getActiveDocument().getBody();
  *
  *     // Create a two-dimensional array containing the cell contents.
  *     var cells = [
  *       ['Row 1, Cell 1', 'Row 1, Cell 2'],
  *       ['Row 2, Cell 1', 'Row 2, Cell 2']
  *     ];
  *
  *     // Build a table from the array.
  *     body.appendTable(cells);
  */
@js.native
trait Table extends Element {
  def appendTableRow(): TableRow = js.native
  def appendTableRow(tableRow: TableRow): TableRow = js.native
  def clear(): Table = js.native
  def editAsText(): Text = js.native
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  def findText(searchPattern: String): RangeElement = js.native
  def findText(searchPattern: String, from: RangeElement): RangeElement = js.native
  def getBorderColor(): String = js.native
  def getBorderWidth(): Double = js.native
  def getCell(rowIndex: Integer, cellIndex: Integer): TableCell = js.native
  def getChild(childIndex: Integer): Element = js.native
  def getChildIndex(child: Element): Integer = js.native
  def getColumnWidth(columnIndex: Integer): Double = js.native
  def getLinkUrl(): String = js.native
  def getNumChildren(): Integer = js.native
  def getNumRows(): Integer = js.native
  def getRow(rowIndex: Integer): TableRow = js.native
  def getText(): String = js.native
  def getTextAlignment(): TextAlignment = js.native
  def insertTableRow(childIndex: Integer): TableRow = js.native
  def insertTableRow(childIndex: Integer, tableRow: TableRow): TableRow = js.native
  def removeChild(child: Element): Table = js.native
  def removeRow(rowIndex: Integer): TableRow = js.native
  def replaceText(searchPattern: String, replacement: String): Element = js.native
  def setBorderColor(color: String): Table = js.native
  def setBorderWidth(width: Double): Table = js.native
  def setColumnWidth(columnIndex: Integer, width: Double): Table = js.native
  def setLinkUrl(url: String): Table = js.native
  def setTextAlignment(textAlignment: TextAlignment): Table = js.native
}

