package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Body extends js.Object {
  def appendHorizontalRule(): HorizontalRule = js.native
  def appendImage(image: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource): InlineImage = js.native
  def appendImage(image: InlineImage): InlineImage = js.native
  def appendListItem(listItem: ListItem): ListItem = js.native
  def appendListItem(text: java.lang.String): ListItem = js.native
  def appendPageBreak(): PageBreak = js.native
  def appendPageBreak(pageBreak: PageBreak): PageBreak = js.native
  def appendParagraph(paragraph: Paragraph): Paragraph = js.native
  def appendParagraph(text: java.lang.String): Paragraph = js.native
  def appendTable(): Table = js.native
  def appendTable(cells: js.Array[js.Array[java.lang.String]]): Table = js.native
  def appendTable(table: Table): Table = js.native
  def clear(): Body = js.native
  def copy(): Body = js.native
  def editAsText(): Text = js.native
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  def findText(searchPattern: java.lang.String): RangeElement = js.native
  def findText(searchPattern: java.lang.String, from: RangeElement): RangeElement = js.native
  def getAttributes(): js.Object = js.native
  def getChild(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Element = js.native
  def getChildIndex(child: Element): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getFootnotes(): js.Array[Footnote] = js.native
  def getHeadingAttributes(paragraphHeading: ParagraphHeading): js.Object = js.native
  def getImages(): js.Array[InlineImage] = js.native
  def getLinkUrl(): java.lang.String = js.native
  def getListItems(): js.Array[ListItem] = js.native
  def getMarginBottom(): scala.Double = js.native
  def getMarginLeft(): scala.Double = js.native
  def getMarginRight(): scala.Double = js.native
  def getMarginTop(): scala.Double = js.native
  def getNextSibling(): Element = js.native
  def getNumChildren(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getPageHeight(): scala.Double = js.native
  def getPageWidth(): scala.Double = js.native
  def getParagraphs(): js.Array[Paragraph] = js.native
  def getParent(): ContainerElement = js.native
  def getPreviousSibling(): Element = js.native
  def getTables(): js.Array[Table] = js.native
  def getText(): java.lang.String = js.native
  def getTextAlignment(): TextAlignment = js.native
  def getType(): ElementType = js.native
  def insertHorizontalRule(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): HorizontalRule = js.native
  def insertImage(
    childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    image: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource
  ): InlineImage = js.native
  def insertImage(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, image: InlineImage): InlineImage = js.native
  def insertListItem(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, listItem: ListItem): ListItem = js.native
  def insertListItem(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, text: java.lang.String): ListItem = js.native
  def insertPageBreak(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): PageBreak = js.native
  def insertPageBreak(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, pageBreak: PageBreak): PageBreak = js.native
  def insertParagraph(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, paragraph: Paragraph): Paragraph = js.native
  def insertParagraph(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, text: java.lang.String): Paragraph = js.native
  def insertTable(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Table = js.native
  def insertTable(
    childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    cells: js.Array[js.Array[java.lang.String]]
  ): Table = js.native
  def insertTable(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, table: Table): Table = js.native
  def isAtDocumentEnd(): scala.Boolean = js.native
  def removeChild(child: Element): Body = js.native
  def replaceText(searchPattern: java.lang.String, replacement: java.lang.String): Element = js.native
  def setAttributes(attributes: js.Object): Body = js.native
  def setHeadingAttributes(paragraphHeading: ParagraphHeading, attributes: js.Object): Body = js.native
  def setLinkUrl(url: java.lang.String): Body = js.native
  def setMarginBottom(marginBottom: scala.Double): Body = js.native
  def setMarginLeft(marginLeft: scala.Double): Body = js.native
  def setMarginRight(marginRight: scala.Double): Body = js.native
  def setMarginTop(marginTop: scala.Double): Body = js.native
  def setPageHeight(pageHeight: scala.Double): Body = js.native
  def setPageWidth(pageWidth: scala.Double): Body = js.native
  def setText(text: java.lang.String): Body = js.native
  def setTextAlignment(textAlignment: TextAlignment): Body = js.native
}

