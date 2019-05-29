package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

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
  def findText(searchPattern: java.lang.String): RangeElement = js.native
  def findText(searchPattern: java.lang.String, from: RangeElement): RangeElement = js.native
  def getAttributes(): js.Object = js.native
  def getBorderColor(): java.lang.String = js.native
  def getBorderWidth(): scala.Double = js.native
  def getCell(
    rowIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    cellIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): TableCell = js.native
  def getChild(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Element = js.native
  def getChildIndex(child: Element): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getColumnWidth(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Double = js.native
  def getLinkUrl(): java.lang.String = js.native
  def getNextSibling(): Element = js.native
  def getNumChildren(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getNumRows(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getParent(): ContainerElement = js.native
  def getPreviousSibling(): Element = js.native
  def getRow(rowIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): TableRow = js.native
  def getText(): java.lang.String = js.native
  def getTextAlignment(): TextAlignment = js.native
  def getType(): ElementType = js.native
  def insertTableRow(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): TableRow = js.native
  def insertTableRow(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, tableRow: TableRow): TableRow = js.native
  def isAtDocumentEnd(): scala.Boolean = js.native
  def removeChild(child: Element): Table = js.native
  def removeFromParent(): Table = js.native
  def removeRow(rowIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): TableRow = js.native
  def replaceText(searchPattern: java.lang.String, replacement: java.lang.String): Element = js.native
  def setAttributes(attributes: js.Object): Table = js.native
  def setBorderColor(color: java.lang.String): Table = js.native
  def setBorderWidth(width: scala.Double): Table = js.native
  def setColumnWidth(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, width: scala.Double): Table = js.native
  def setLinkUrl(url: java.lang.String): Table = js.native
  def setTextAlignment(textAlignment: TextAlignment): Table = js.native
}

