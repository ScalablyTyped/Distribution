package typings.googleAppsScript.GoogleAppsScript.Document

import typings.googleAppsScript.GoogleAppsScript.Base.BlobSource
import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An element representing a header section. A Document typically contains at most one HeaderSection. The HeaderSection may contain ListItem, Paragraph, and
  * Table elements. For more information on document structure, see the guide to extending Google Docs.
  */
@js.native
trait HeaderSection extends Element {
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
  def clear(): HeaderSection = js.native
  def editAsText(): Text = js.native
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  def findText(searchPattern: String): RangeElement = js.native
  def findText(searchPattern: String, from: RangeElement): RangeElement = js.native
  def getChild(childIndex: Integer): Element = js.native
  def getChildIndex(child: Element): Integer = js.native
  /** @deprecated DO NOT USE */ def getFootnotes(): js.Array[Footnote] = js.native
  def getImages(): js.Array[InlineImage] = js.native
  /** @deprecated DO NOT USE */ def getLinkUrl(): String = js.native
  def getListItems(): js.Array[ListItem] = js.native
  def getNumChildren(): Integer = js.native
  def getParagraphs(): js.Array[Paragraph] = js.native
  def getTables(): js.Array[Table] = js.native
  def getText(): String = js.native
  def getTextAlignment(): TextAlignment = js.native
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
  def removeChild(child: Element): HeaderSection = js.native
  def replaceText(searchPattern: String, replacement: String): Element = js.native
  /** @deprecated DO NOT USE */ def setLinkUrl(url: String): HeaderSection = js.native
  def setText(text: String): HeaderSection = js.native
  def setTextAlignment(textAlignment: TextAlignment): HeaderSection = js.native
}

