package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocumentNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.BlobSource
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Body extends js.Object {
  def appendHorizontalRule(): HorizontalRule = js.native
  def appendImage(image: BlobSource): InlineImage = js.native
  def appendImage(image: InlineImage): InlineImage = js.native
  def appendListItem(listItem: ListItem): ListItem = js.native
  def appendListItem(text: String): ListItem = js.native
  def appendPageBreak(): PageBreak = js.native
  def appendPageBreak(pageBreak: PageBreak): PageBreak = js.native
  def appendParagraph(paragraph: Paragraph): Paragraph = js.native
  def appendParagraph(text: String): Paragraph = js.native
  def appendTable(): Table = js.native
  def appendTable(cells: js.Array[js.Array[String]]): Table = js.native
  def appendTable(table: Table): Table = js.native
  def clear(): Body = js.native
  def copy(): Body = js.native
  def editAsText(): Text = js.native
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  def findText(searchPattern: String): RangeElement = js.native
  def findText(searchPattern: String, from: RangeElement): RangeElement = js.native
  def getAttributes(): js.Any = js.native
  def getChild(childIndex: Integer): Element = js.native
  def getChildIndex(child: Element): Integer = js.native
  def getFootnotes(): js.Array[Footnote] = js.native
  def getHeadingAttributes(paragraphHeading: ParagraphHeading): js.Any = js.native
  def getImages(): js.Array[InlineImage] = js.native
  def getLinkUrl(): String = js.native
  def getListItems(): js.Array[ListItem] = js.native
  def getMarginBottom(): Double = js.native
  def getMarginLeft(): Double = js.native
  def getMarginRight(): Double = js.native
  def getMarginTop(): Double = js.native
  def getNextSibling(): Element = js.native
  def getNumChildren(): Integer = js.native
  def getPageHeight(): Double = js.native
  def getPageWidth(): Double = js.native
  def getParagraphs(): js.Array[Paragraph] = js.native
  def getParent(): ContainerElement = js.native
  def getPreviousSibling(): Element = js.native
  def getTables(): js.Array[Table] = js.native
  def getText(): String = js.native
  def getTextAlignment(): TextAlignment = js.native
  def getType(): ElementType = js.native
  def insertHorizontalRule(childIndex: Integer): HorizontalRule = js.native
  def insertImage(childIndex: Integer, image: BlobSource): InlineImage = js.native
  def insertImage(childIndex: Integer, image: InlineImage): InlineImage = js.native
  def insertListItem(childIndex: Integer, listItem: ListItem): ListItem = js.native
  def insertListItem(childIndex: Integer, text: String): ListItem = js.native
  def insertPageBreak(childIndex: Integer): PageBreak = js.native
  def insertPageBreak(childIndex: Integer, pageBreak: PageBreak): PageBreak = js.native
  def insertParagraph(childIndex: Integer, paragraph: Paragraph): Paragraph = js.native
  def insertParagraph(childIndex: Integer, text: String): Paragraph = js.native
  def insertTable(childIndex: Integer): Table = js.native
  def insertTable(childIndex: Integer, cells: js.Array[js.Array[String]]): Table = js.native
  def insertTable(childIndex: Integer, table: Table): Table = js.native
  def isAtDocumentEnd(): Boolean = js.native
  def removeChild(child: Element): Body = js.native
  def replaceText(searchPattern: String, replacement: String): Element = js.native
  def setAttributes(attributes: js.Any): Body = js.native
  def setHeadingAttributes(paragraphHeading: ParagraphHeading, attributes: js.Any): Body = js.native
  def setLinkUrl(url: String): Body = js.native
  def setMarginBottom(marginBottom: Double): Body = js.native
  def setMarginLeft(marginLeft: Double): Body = js.native
  def setMarginRight(marginRight: Double): Body = js.native
  def setMarginTop(marginTop: Double): Body = js.native
  def setPageHeight(pageHeight: Double): Body = js.native
  def setPageWidth(pageWidth: Double): Body = js.native
  def setText(text: String): Body = js.native
  def setTextAlignment(textAlignment: TextAlignment): Body = js.native
}

