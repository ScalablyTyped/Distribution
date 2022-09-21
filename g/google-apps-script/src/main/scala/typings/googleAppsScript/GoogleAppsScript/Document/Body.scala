package typings.googleAppsScript.GoogleAppsScript.Document

import typings.googleAppsScript.GoogleAppsScript.Base.BlobSource
import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An element representing a document body. The Body may contain ListItem, Paragraph, Table, and TableOfContents elements. For more information on document
  * structure, see the guide to extending
  * Google Docs.
  *
  * The Body typically contains the full document contents except for the HeaderSection, FooterSection, and any FootnoteSection elements.
  *
  *     var doc = DocumentApp.getActiveDocument();
  *     var body = doc.getBody();
  *
  *     // Append a paragraph and a page break to the document body section directly.
  *     body.appendParagraph("A paragraph.");
  *     body.appendPageBreak();
  */
@js.native
trait Body
  extends StObject
     with Element {
  
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
  
  def editAsText(): Text = js.native
  
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  
  def findText(searchPattern: String): RangeElement = js.native
  def findText(searchPattern: String, from: RangeElement): RangeElement = js.native
  
  def getChild(childIndex: Integer): Element = js.native
  
  def getChildIndex(child: Element): Integer = js.native
  
  /** @deprecated DO NOT USE */ def getFootnotes(): js.Array[Footnote] = js.native
  
  def getHeadingAttributes(paragraphHeading: ParagraphHeading): Any = js.native
  
  def getImages(): js.Array[InlineImage] = js.native
  
  /** @deprecated DO NOT USE */ def getLinkUrl(): String = js.native
  
  def getListItems(): js.Array[ListItem] = js.native
  
  def getMarginBottom(): Double = js.native
  
  def getMarginLeft(): Double = js.native
  
  def getMarginRight(): Double = js.native
  
  def getMarginTop(): Double = js.native
  
  def getNumChildren(): Integer = js.native
  
  def getPageHeight(): Double = js.native
  
  def getPageWidth(): Double = js.native
  
  def getParagraphs(): js.Array[Paragraph] = js.native
  
  def getTables(): js.Array[Table] = js.native
  
  def getText(): String = js.native
  
  def getTextAlignment(): TextAlignment = js.native
  
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
  
  def removeChild(child: Element): Body = js.native
  
  def replaceText(searchPattern: String, replacement: String): Element = js.native
  
  def setHeadingAttributes(paragraphHeading: ParagraphHeading, attributes: Any): Body = js.native
  
  /** @deprecated DO NOT USE */ def setLinkUrl(url: String): Body = js.native
  
  def setMarginBottom(marginBottom: Double): Body = js.native
  
  def setMarginLeft(marginLeft: Double): Body = js.native
  
  def setMarginRight(marginRight: Double): Body = js.native
  
  def setMarginTop(marginTop: Double): Body = js.native
  
  def setPageHeight(pageHeight: Double): Body = js.native
  
  def setPageWidth(pageWidth: Double): Body = js.native
  
  def setText(text: String): Body = js.native
  
  def setTextAlignment(textAlignment: TextAlignment): Body = js.native
}
