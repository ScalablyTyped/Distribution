package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocumentNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.BlobSource
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableCell extends js.Object {
  def appendHorizontalRule(): HorizontalRule = js.native
  def appendImage(image: BlobSource): InlineImage = js.native
  def appendImage(image: InlineImage): InlineImage = js.native
  def appendListItem(listItem: ListItem): ListItem = js.native
  def appendListItem(text: String): ListItem = js.native
  def appendParagraph(paragraph: Paragraph): Paragraph = js.native
  def appendParagraph(text: String): Paragraph = js.native
  def appendTable(): Table = js.native
  def appendTable(cells: js.Array[js.Array[String]]): Table = js.native
  def appendTable(table: Table): Table = js.native
  def clear(): TableCell = js.native
  def copy(): TableCell = js.native
  def editAsText(): Text = js.native
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  def findText(searchPattern: String): RangeElement = js.native
  def findText(searchPattern: String, from: RangeElement): RangeElement = js.native
  def getAttributes(): js.Object = js.native
  def getBackgroundColor(): String = js.native
  def getChild(childIndex: Integer): Element = js.native
  def getChildIndex(child: Element): Integer = js.native
  def getColSpan(): Integer = js.native
  def getLinkUrl(): String = js.native
  def getNextSibling(): Element = js.native
  def getNumChildren(): Integer = js.native
  def getPaddingBottom(): Double = js.native
  def getPaddingLeft(): Double = js.native
  def getPaddingRight(): Double = js.native
  def getPaddingTop(): Double = js.native
  def getParent(): ContainerElement = js.native
  def getParentRow(): TableRow = js.native
  def getParentTable(): Table = js.native
  def getPreviousSibling(): Element = js.native
  def getRowSpan(): Integer = js.native
  def getText(): String = js.native
  def getTextAlignment(): TextAlignment = js.native
  def getType(): ElementType = js.native
  def getVerticalAlignment(): VerticalAlignment = js.native
  def getWidth(): Double = js.native
  def insertHorizontalRule(childIndex: Integer): HorizontalRule = js.native
  def insertImage(childIndex: Integer, image: BlobSource): InlineImage = js.native
  def insertImage(childIndex: Integer, image: InlineImage): InlineImage = js.native
  def insertListItem(childIndex: Integer, listItem: ListItem): ListItem = js.native
  def insertListItem(childIndex: Integer, text: String): ListItem = js.native
  def insertParagraph(childIndex: Integer, paragraph: Paragraph): Paragraph = js.native
  def insertParagraph(childIndex: Integer, text: String): Paragraph = js.native
  def insertTable(childIndex: Integer): Table = js.native
  def insertTable(childIndex: Integer, cells: js.Array[js.Array[String]]): Table = js.native
  def insertTable(childIndex: Integer, table: Table): Table = js.native
  def isAtDocumentEnd(): Boolean = js.native
  def merge(): TableCell = js.native
  def removeChild(child: Element): TableCell = js.native
  def removeFromParent(): TableCell = js.native
  def replaceText(searchPattern: String, replacement: String): Element = js.native
  def setAttributes(attributes: js.Object): TableCell = js.native
  def setBackgroundColor(color: String): TableCell = js.native
  def setLinkUrl(url: String): TableCell = js.native
  def setPaddingBottom(paddingBottom: Double): TableCell = js.native
  def setPaddingLeft(paddingLeft: Double): TableCell = js.native
  def setPaddingRight(paddingTop: Double): TableCell = js.native
  def setPaddingTop(paddingTop: Double): TableCell = js.native
  def setText(text: String): TableCell = js.native
  def setTextAlignment(textAlignment: TextAlignment): TableCell = js.native
  def setVerticalAlignment(alignment: VerticalAlignment): TableCell = js.native
  def setWidth(width: Double): TableCell = js.native
}

