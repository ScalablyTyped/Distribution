package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableCell extends js.Object {
  def appendHorizontalRule(): HorizontalRule = js.native
  def appendImage(image: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource): InlineImage = js.native
  def appendImage(image: InlineImage): InlineImage = js.native
  def appendListItem(listItem: ListItem): ListItem = js.native
  def appendListItem(text: java.lang.String): ListItem = js.native
  def appendParagraph(paragraph: Paragraph): Paragraph = js.native
  def appendParagraph(text: java.lang.String): Paragraph = js.native
  def appendTable(): Table = js.native
  def appendTable(cells: js.Array[js.Array[java.lang.String]]): Table = js.native
  def appendTable(table: Table): Table = js.native
  def clear(): TableCell = js.native
  def copy(): TableCell = js.native
  def editAsText(): Text = js.native
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  def findText(searchPattern: java.lang.String): RangeElement = js.native
  def findText(searchPattern: java.lang.String, from: RangeElement): RangeElement = js.native
  def getAttributes(): js.Object = js.native
  def getBackgroundColor(): java.lang.String = js.native
  def getChild(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Element = js.native
  def getChildIndex(child: Element): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getColSpan(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getLinkUrl(): java.lang.String = js.native
  def getNextSibling(): Element = js.native
  def getNumChildren(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getPaddingBottom(): scala.Double = js.native
  def getPaddingLeft(): scala.Double = js.native
  def getPaddingRight(): scala.Double = js.native
  def getPaddingTop(): scala.Double = js.native
  def getParent(): ContainerElement = js.native
  def getParentRow(): TableRow = js.native
  def getParentTable(): Table = js.native
  def getPreviousSibling(): Element = js.native
  def getRowSpan(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getText(): java.lang.String = js.native
  def getTextAlignment(): TextAlignment = js.native
  def getType(): ElementType = js.native
  def getVerticalAlignment(): VerticalAlignment = js.native
  def getWidth(): scala.Double = js.native
  def insertHorizontalRule(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): HorizontalRule = js.native
  def insertImage(
    childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    image: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource
  ): InlineImage = js.native
  def insertImage(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, image: InlineImage): InlineImage = js.native
  def insertListItem(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, listItem: ListItem): ListItem = js.native
  def insertListItem(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, text: java.lang.String): ListItem = js.native
  def insertParagraph(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, paragraph: Paragraph): Paragraph = js.native
  def insertParagraph(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, text: java.lang.String): Paragraph = js.native
  def insertTable(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Table = js.native
  def insertTable(
    childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    cells: js.Array[js.Array[java.lang.String]]
  ): Table = js.native
  def insertTable(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, table: Table): Table = js.native
  def isAtDocumentEnd(): scala.Boolean = js.native
  def merge(): TableCell = js.native
  def removeChild(child: Element): TableCell = js.native
  def removeFromParent(): TableCell = js.native
  def replaceText(searchPattern: java.lang.String, replacement: java.lang.String): Element = js.native
  def setAttributes(attributes: js.Object): TableCell = js.native
  def setBackgroundColor(color: java.lang.String): TableCell = js.native
  def setLinkUrl(url: java.lang.String): TableCell = js.native
  def setPaddingBottom(paddingBottom: scala.Double): TableCell = js.native
  def setPaddingLeft(paddingLeft: scala.Double): TableCell = js.native
  def setPaddingRight(paddingTop: scala.Double): TableCell = js.native
  def setPaddingTop(paddingTop: scala.Double): TableCell = js.native
  def setText(text: java.lang.String): TableCell = js.native
  def setTextAlignment(textAlignment: TextAlignment): TableCell = js.native
  def setVerticalAlignment(alignment: VerticalAlignment): TableCell = js.native
  def setWidth(width: scala.Double): TableCell = js.native
}

