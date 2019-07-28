package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocumentNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table extends js.Object {
  def appendTableRow(): TableRow = js.native
  def appendTableRow(tableRow: TableRow): TableRow = js.native
  def clear(): Table = js.native
  def copy(): Table = js.native
  def editAsText(): Text = js.native
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  def findText(searchPattern: String): RangeElement = js.native
  def findText(searchPattern: String, from: RangeElement): RangeElement = js.native
  def getAttributes(): js.Object = js.native
  def getBorderColor(): String = js.native
  def getBorderWidth(): Double = js.native
  def getCell(rowIndex: Integer, cellIndex: Integer): TableCell = js.native
  def getChild(childIndex: Integer): Element = js.native
  def getChildIndex(child: Element): Integer = js.native
  def getColumnWidth(columnIndex: Integer): Double = js.native
  def getLinkUrl(): String = js.native
  def getNextSibling(): Element = js.native
  def getNumChildren(): Integer = js.native
  def getNumRows(): Integer = js.native
  def getParent(): ContainerElement = js.native
  def getPreviousSibling(): Element = js.native
  def getRow(rowIndex: Integer): TableRow = js.native
  def getText(): String = js.native
  def getTextAlignment(): TextAlignment = js.native
  def getType(): ElementType = js.native
  def insertTableRow(childIndex: Integer): TableRow = js.native
  def insertTableRow(childIndex: Integer, tableRow: TableRow): TableRow = js.native
  def isAtDocumentEnd(): Boolean = js.native
  def removeChild(child: Element): Table = js.native
  def removeFromParent(): Table = js.native
  def removeRow(rowIndex: Integer): TableRow = js.native
  def replaceText(searchPattern: String, replacement: String): Element = js.native
  def setAttributes(attributes: js.Object): Table = js.native
  def setBorderColor(color: String): Table = js.native
  def setBorderWidth(width: Double): Table = js.native
  def setColumnWidth(columnIndex: Integer, width: Double): Table = js.native
  def setLinkUrl(url: String): Table = js.native
  def setTextAlignment(textAlignment: TextAlignment): Table = js.native
}

