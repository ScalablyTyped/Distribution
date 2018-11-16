package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableRow extends js.Object {
  def appendTableCell(): TableCell = js.native
  def appendTableCell(tableCell: TableCell): TableCell = js.native
  def appendTableCell(textContents: java.lang.String): TableCell = js.native
  def clear(): TableRow = js.native
  def copy(): TableRow = js.native
  def editAsText(): Text = js.native
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  def findText(searchPattern: java.lang.String): RangeElement = js.native
  def findText(searchPattern: java.lang.String, from: RangeElement): RangeElement = js.native
  def getAttributes(): js.Object = js.native
  def getCell(cellIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): TableCell = js.native
  def getChild(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Element = js.native
  def getChildIndex(child: Element): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getLinkUrl(): java.lang.String = js.native
  def getMinimumHeight(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getNextSibling(): Element = js.native
  def getNumCells(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getNumChildren(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getParent(): ContainerElement = js.native
  def getParentTable(): Table = js.native
  def getPreviousSibling(): Element = js.native
  def getText(): java.lang.String = js.native
  def getTextAlignment(): TextAlignment = js.native
  def getType(): ElementType = js.native
  def insertTableCell(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): TableCell = js.native
  def insertTableCell(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, tableCell: TableCell): TableCell = js.native
  def insertTableCell(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, textContents: java.lang.String): TableCell = js.native
  def isAtDocumentEnd(): scala.Boolean = js.native
  def merge(): TableRow = js.native
  def removeCell(cellIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): TableCell = js.native
  def removeChild(child: Element): TableRow = js.native
  def removeFromParent(): TableRow = js.native
  def replaceText(searchPattern: java.lang.String, replacement: java.lang.String): Element = js.native
  def setAttributes(attributes: js.Object): TableRow = js.native
  def setLinkUrl(url: java.lang.String): TableRow = js.native
  def setMinimumHeight(minHeight: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): TableRow = js.native
  def setTextAlignment(textAlignment: TextAlignment): TableRow = js.native
}

