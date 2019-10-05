package typings.googleDashAppsDashScript.GoogleAppsScript.Document

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableRow extends js.Object {
  def appendTableCell(): TableCell = js.native
  def appendTableCell(tableCell: TableCell): TableCell = js.native
  def appendTableCell(textContents: String): TableCell = js.native
  def clear(): TableRow = js.native
  def copy(): TableRow = js.native
  def editAsText(): Text = js.native
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  def findText(searchPattern: String): RangeElement = js.native
  def findText(searchPattern: String, from: RangeElement): RangeElement = js.native
  def getAttributes(): js.Any = js.native
  def getCell(cellIndex: Integer): TableCell = js.native
  def getChild(childIndex: Integer): Element = js.native
  def getChildIndex(child: Element): Integer = js.native
  def getLinkUrl(): String = js.native
  def getMinimumHeight(): Integer = js.native
  def getNextSibling(): Element = js.native
  def getNumCells(): Integer = js.native
  def getNumChildren(): Integer = js.native
  def getParent(): ContainerElement = js.native
  def getParentTable(): Table = js.native
  def getPreviousSibling(): Element = js.native
  def getText(): String = js.native
  def getTextAlignment(): TextAlignment = js.native
  def getType(): ElementType = js.native
  def insertTableCell(childIndex: Integer): TableCell = js.native
  def insertTableCell(childIndex: Integer, tableCell: TableCell): TableCell = js.native
  def insertTableCell(childIndex: Integer, textContents: String): TableCell = js.native
  def isAtDocumentEnd(): Boolean = js.native
  def merge(): TableRow = js.native
  def removeCell(cellIndex: Integer): TableCell = js.native
  def removeChild(child: Element): TableRow = js.native
  def removeFromParent(): TableRow = js.native
  def replaceText(searchPattern: String, replacement: String): Element = js.native
  def setAttributes(attributes: js.Any): TableRow = js.native
  def setLinkUrl(url: String): TableRow = js.native
  def setMinimumHeight(minHeight: Integer): TableRow = js.native
  def setTextAlignment(textAlignment: TextAlignment): TableRow = js.native
}

